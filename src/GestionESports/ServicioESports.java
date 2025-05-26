package GestionESports;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class ServicioESports {
    private HashMap<String,Equipo> equipos = new HashMap<>();
    private HashMap<String,Torneo> torneos = new HashMap<>();
    private HashMap<Jugador,Equipo> jugadoresYEquipos = new HashMap<>();

    public ServicioESports(HashMap<String, Equipo> equipos, HashMap<Jugador, Equipo> jugadoresYEquipos, String nuevoNombreEquipo, HashMap<String, Torneo> torneos) {
        this.equipos = equipos;
        this.jugadoresYEquipos = jugadoresYEquipos;
        this.torneos = torneos;
    }

    public void registrarEquipos(String nombreEquipo, Equipo equipo){
        if(!equipos.containsKey(equipo.getNombreEquipo()))
        {equipos.put(nombreEquipo,equipo);}
    }
    public void registrarTorneos(String nombreTorneo, Torneo torneo){
        if(!torneos.containsKey(nombreTorneo)){
            torneos.put(nombreTorneo,torneo);
        }
    }

    public void asignarJugadorAEquipo(Jugador jugador, String nombreEquipo) {
        if (jugadoresYEquipos.containsKey(jugador)) return;
        Equipo equipo = equipos.get(nombreEquipo);
        if (equipo != null) {
            equipo.agregarJugadores(jugador);
            jugadoresYEquipos.put(jugador, equipo);
            System.out.println("Jugador añadido corractamente");
        }
        else{
            System.out.println("el equipo no existe, introduzca otro equipo o agregelo");
        }
    }

    public void intercambiarJugadores(Equipo equipo1, Jugador jugador1, Equipo equipo2, Jugador jugador2){
        if (equipo1.tieneJugador(jugador1) && equipo2.tieneJugador(jugador2)){

            equipo1.eliminarJugadores(jugador1);
            equipo2.agregarJugadores(jugador1);

            equipo2.eliminarJugadores(jugador2);
            equipo2.agregarJugadores(jugador1);

        }
    }
    public void fusionarEquipos(String nombre1, String nombre2, String nuevoNombre) {
        Equipo e1 = equipos.get(nombre1);
        Equipo e2 = equipos.get(nombre2);

        if (e1 == null || e2 == null) {
            System.out.println("Uno o ambos equipos no existen, no se puede fusionar.");
            return;
        }

        // Combinar jugadores (HashSet automáticamente evita duplicados)
        HashSet<Jugador> jugadoresCombinados = new HashSet<>(e1.getJugadores());
        jugadoresCombinados.addAll(e2.getJugadores());

        // Combinar estadísticas por torneo
        HashMap<Torneo, EstadisticaEquipo> estadisticasCombinadas = new HashMap<>(e1.getEstadisticaEquipos());
        e2.getEstadisticaEquipos().forEach((torneo, est2) -> {
            estadisticasCombinadas.merge(torneo, est2, (est1, estNueva) -> {

                est1.sumarEstadisticas(estNueva);
                return est1;
            });
        });

        Equipo nuevoEquipo = new Equipo(estadisticasCombinadas, jugadoresCombinados, nuevoNombre);

        // Actualizar mapas
        equipos.remove(nombre1);
        equipos.remove(nombre2);
        equipos.put(nuevoNombre, nuevoEquipo);

        // Actualizar asignación de jugadores
        for (Jugador jugador : jugadoresCombinados) {
            jugadoresYEquipos.put(jugador, nuevoEquipo);
        }

        System.out.println("Equipos unidos en: " + nuevoNombre);
    }



    public double calcularEdadMedia(String nombreEquipo) {
        Equipo equipo = equipos.get(nombreEquipo);
        return equipo == null || equipo.getJugadores().isEmpty() ? 0 :
                equipo.getJugadores().stream().mapToInt(Jugador::getEdad).average().orElse(0);
    }

    public List<String> consultarTorneosDeJugador(Jugador jugador) {
        List<String> lista = new ArrayList<>();
        for (Torneo t : torneos.values()) {
            if (t.listaJugadoresParticipantes().contains((CharSequence) jugador)) {
                lista.add(t.getNombreTorneo());
            }
        }
        return lista;
    }

    public List<Jugador> filtrarJugadoresPorRolEnTorneo(String nombreTorneo, String rol) {
        Torneo torneo = torneos.get(nombreTorneo);
        List<Jugador> resultado = new ArrayList<>();
        if (torneo != null) {
            for (Equipo e : torneo.getEquiposParticipantes()) {
                for (Jugador j : e.getJugadores()) {
                    if (j.getRol().equalsIgnoreCase(rol)) {
                        resultado.add(j);
                    }
                }
            }
        }
        return resultado;
    }

}
