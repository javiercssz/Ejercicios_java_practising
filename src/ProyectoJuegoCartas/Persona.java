package ProyectoJuegoCartas;

import java.util.ArrayList;

 public class Persona {
     private boolean estaPlantado = false;
     private String nickname;
     private ArrayList<Carta> mano = new ArrayList<>();

     public Persona(String nickname){
         this.nickname = nickname;
     }
    public void recibirCarta(Carta c){
        mano.add(c);
    }
    public void mostrarMano(){   // Esto es solo para pruebas en consola. La mano se devolvera y se mostrará graficamente.
        for (Carta carta : mano){
            System.out.println(carta);
        }
    }

     public ArrayList<Carta> getMano() {
         return mano;
     }

     public int puntosTotales(){
       int lenght = mano.size();
       int puntosTotales = 0;

       for(int i = 0; i < lenght; i++){
           puntosTotales += mano.get(i).valorBlackjack();
       }
       return puntosTotales;
    }
     public void plantarse(){
         this.estaPlantado = true;
     }
     public boolean estaPlantado(){
         return this.estaPlantado;
     }

}
