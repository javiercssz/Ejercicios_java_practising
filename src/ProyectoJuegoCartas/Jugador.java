package ProyectoJuegoCartas;

public class Jugador extends Persona{

    Mazo mazo = new Mazo();

    public Jugador(String nickname) {
        super(nickname);
    }

    public void pedirCarta(){
        if(!estaPlantado()) {
            Carta nueva = mazo.robarCarta();
            recibirCarta(nueva);
        }
    }

    public void mostrarCartas(){
        for(Carta c : getMano()){
            System.out.println(c);
        }
    }




}

