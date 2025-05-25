package GestionESports;

import java.util.*;

import java.util.TreeMap;

public class Torneo implements Comparator{
    private String nombreTorneo;
    private TreeMap<Equipo, Integer> resultados = new TreeMap<>();
    private HashSet<Equipo> equiposParticipantes = new HashSet<>();

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

    public Map<> valor ordenadorPuntos()
    {
        TreeMap<Equipo,Integer> ordenarPuntos = new TreeMap<>(new Comparator<Equipo>(){
            @Override
            public int compare(Integer o1, Integer o2) {

            }   //AQUI TOY
        }
    }


    }


}