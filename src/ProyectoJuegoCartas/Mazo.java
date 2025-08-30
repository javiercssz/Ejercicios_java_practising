package ProyectoJuegoCartas;

import java.util.ArrayList;
import java.util.Collections;

public class Mazo {
    char[] valor = {'A','2','3','4','5','6','7','8','9','J','Q','K'};
    String[] palo = {"Picas","Corazones","Treboles","Diamantes"};
    ArrayList<Carta> cartas = new ArrayList<>();
    public void crearBaraja()
    {
        for(int i = 0; i < palo.length; i++){
            for(int j = 0; j < valor.length; j++){

                Carta cartaAñadir = new Carta(palo[i],valor[j]);
                cartas.add(cartaAñadir);
            }
        }
    }
    public void barajar(){
        Collections.shuffle(cartas);
    }
    public Carta robarCarta(){
        if(cartas.isEmpty()){
            System.out.println("No quedan cartas");
            return null;
        }
        Carta cartaRobada = cartas.get(0);
        cartas.remove(0);
        return cartaRobada;
    }

}
