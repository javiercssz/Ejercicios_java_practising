package ProyectoJuegoCartas;

public class Crupier extends Persona{

    public Crupier(String nickname) {
        super(nickname);
    }

    public void pedirCarta(Mazo mazo){
        if(puntosTotales() < 17){
            Carta cartaNueva = mazo.robarCarta();
           getMano().add(cartaNueva);
        }
        else {
            for(Carta carta : getMano()){
                System.out.println(carta);
                plantarse();
            }
        }
    }
}
