package GestionESports;

import java.util.HashMap;

public class ServicioESports {
    private HashMap<String,Equipo> equipos = new HashMap<>();
    private HashMap<String,Torneo> torneos = new HashMap<>();
    private HashMap<Jugador,Equipo> jugadoresYEquipos = new HashMap<>();
    private String nuevoNombreEquipo;

    public ServicioESports(HashMap<String, Equipo> equipos, HashMap<Jugador, Equipo> jugadoresYEquipos, String nuevoNombreEquipo, HashMap<String, Torneo> torneos) {
        this.equipos = equipos;
        this.jugadoresYEquipos = jugadoresYEquipos;
        this.nuevoNombreEquipo = nuevoNombreEquipo;
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

    public void unirEquipos(Equipo equipo1, Equipo equipo2){

    }

}
