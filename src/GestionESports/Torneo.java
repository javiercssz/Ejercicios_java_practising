package GestionESports;

import java.util.*;

public class Torneo {
    private String nombreTorneo;
    private HashMap<Equipo, Integer> resultados = new HashMap<>();
    private HashSet<Equipo> equiposParticipantes = new HashSet<>();

    public Torneo(String nombreTorneo) {
        this.nombreTorneo = nombreTorneo;

    }
    public Torneo(){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Torneo torneo = (Torneo) o;
        return Objects.equals(nombreTorneo, torneo.nombreTorneo) && Objects.equals(resultados, torneo.resultados) && Objects.equals(equiposParticipantes, torneo.equiposParticipantes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombreTorneo, resultados, equiposParticipantes);
    }

    public HashSet<Equipo> getEquiposParticipantes() {
        return equiposParticipantes;
    }

    public void setEquiposParticipantes(HashSet<Equipo> equiposParticipantes) {
        this.equiposParticipantes = equiposParticipantes;
    }

    public String getNombreTorneo() {
        return nombreTorneo;
    }

    public void setNombreTorneo(String nombreTorneo) {
        this.nombreTorneo = nombreTorneo;
    }

    public HashMap<Equipo, Integer> getResultados() {
        return resultados;
    }

    public void setResultados(HashMap<Equipo, Integer> resultados) {
        this.resultados = resultados;
    }

    public void aniadirEquipo(Equipo equipo)
    {
        if(equiposParticipantes.contains(equipo)){
            System.out.println("este equipo ya participa en el torneo");
        }else {
            equiposParticipantes.add(equipo);
            System.out.println(equipo.getNombreEquipo() + " añadido al torneo con exito");
        }
    }
    public void actualizarPuntosEquipo(Equipo equipo, int puntos)
    {
        resultados.put(equipo,puntos);
    }

    public Equipo  equipoGanador(){

        Equipo ganador = null;
        int maxPuntos = Integer.MIN_VALUE;

        for(Map.Entry<Equipo,Integer> entrada: resultados.entrySet()){
            Equipo equipo = entrada.getKey();
            int puntos = entrada.getValue();

            if(puntos > maxPuntos)
            {
                maxPuntos = puntos;
                ganador = equipo;
            }
        }
        return ganador;

    }
    public void mostrarRankingEquiposPorPuntos() {

        List<Map.Entry<Equipo, Integer>> listaEntradas = new ArrayList<>(resultados.entrySet());

        Collections.sort(listaEntradas, new Comparator<Map.Entry<Equipo, Integer>>() {
            @Override
            public int compare(Map.Entry<Equipo, Integer> e1, Map.Entry<Equipo, Integer> e2) {
                return e2.getValue().compareTo(e1.getValue());
            }
        });

        System.out.println("Ranking de equipos por puntos:");
        for (Map.Entry<Equipo, Integer> entrada : listaEntradas) {
            System.out.println(entrada.getKey().getNombreEquipo() + " consiguio " + entrada.getValue() + " puntos");
        }
    }
    public List<Jugador> listaJugadoresParticipantes() {
        List<Jugador> jugadores = new ArrayList<>();
        for (Equipo equipo : equiposParticipantes) {
            jugadores.addAll(equipo.getJugadores());
        }
        return jugadores;
    }


}