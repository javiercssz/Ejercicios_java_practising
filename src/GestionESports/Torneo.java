package GestionESports;

import java.util.*;

import java.util.Comparator;
import java.util.TreeMap;


public class Torneo {
    private String nombreTorneo;
    private TreeMap<Equipo, Integer> resultados = new TreeMap<>();
    private HashSet<Equipo> equiposParticipantes = new HashSet<>();

    public Torneo(String nombreTorneo) {
        this.nombreTorneo = nombreTorneo;

    }
    public Torneo(){

    }

    public void aniadirEquipo(Equipo equipo)
    {
        if(!equiposParticipantes.contains(equipo)){
            System.out.println("este equipo ya participa en el torneo");
        }else {
            equiposParticipantes.add(equipo);
        }
    }
    public void actualizarPuntosEquipo(Equipo equipo, int puntos)
    {
        resultados.put(equipo,puntos);
    }

    public String equipoGanador(){

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
        return "El equipo ganador del torneo es " + ganador + " con " + maxPuntos + " puntos.";

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
    public String listaJugadoresParticipantes() {
        String resultado = "Jugadores participantes en el torneo " + nombreTorneo + ":\n";

        for (Equipo equipo : equiposParticipantes) {
            resultado += "Equipo " + equipo.getNombreEquipo() + ":\n";

            for (Jugador jugador : equipo.getJugadores()) {
                resultado += " [ " + jugador.getNickname()  + " ] " + " (" + jugador.getRol() + ")\n";
            }
        }

        return resultado;
    }


}