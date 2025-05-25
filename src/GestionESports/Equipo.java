package GestionESports;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class Equipo{
    private String nombreEquipo;
    private HashSet<Jugador> jugadores = new HashSet<>();
    private HashMap<Torneo,EstadisticaEquipo> EstadisticaEquipos = new HashMap<Torneo, EstadisticaEquipo>();

    public Equipo() {
    }

    public Equipo(HashMap<Torneo, EstadisticaEquipo> estadisticaEquipos, HashSet<Jugador> jugadores, String nombreEquipo) {
        EstadisticaEquipos = estadisticaEquipos;
        this.jugadores = jugadores;
        this.nombreEquipo = nombreEquipo;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public HashSet<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(HashSet<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public HashMap<Torneo, EstadisticaEquipo> getEstadisticaEquipos() {
        return EstadisticaEquipos;
    }

    public void setEstadisticaEquipos(HashMap<Torneo, EstadisticaEquipo> estadisticaEquipos) {
        EstadisticaEquipos = estadisticaEquipos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Equipo equipo = (Equipo) o;
        return Objects.equals(nombreEquipo, equipo.nombreEquipo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nombreEquipo);
    }

    public void agregarJugadores(Jugador jugador){
        jugadores.add(jugador);
    }
    public void eliminarJugadores(Jugador jugador)
    {
        jugadores.remove(jugador);
    }
    public void monstrarRolesEquipo()
    {
        for(Jugador jugador: jugadores){
            System.out.println(jugador.getRol());
        }
    }
    public void agregarEstadistica(Torneo torneo, EstadisticaEquipo est){
        EstadisticaEquipos.put(torneo,EstadisticaEquipos);
    }
    public EstadisticaEquipo  getEstadistica(Torneo torneo){
        return EstadisticaEquipos.get(torneo); //creo que me da error porque la clase torneo no esta creada
    }
    public int getTamanio(){
        int tamanio = 0;

        Iterator<Jugador> it = jugadores.iterator();

        while (it.hasNext())
        {
            it.next();
            tamanio += 1;

        }
        return tamanio;
    }
    public boolean tieneJugador(Jugador jugador){
        if(jugadores.contains(jugador)){
            return true;
        }
        return false;
    }
}
