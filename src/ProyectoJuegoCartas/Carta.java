package ProyectoJuegoCartas;

public class Carta {
    private char valor;
    private String palo;

    public Carta(String palo, char valor) {
        this.palo = palo;
        this.valor = valor;
    }
    public int valorBlackjack(){
        if(valor >= '2'  && valor <= '9'){
            int valorBlack = valor - '0';
            return valorBlack;
        } else if (valor == 'J'  ||  valor == 'Q'  || valor == 'K') {
            return 10;
        }
        else if(valor == 'A'){
            return 11;
        }
        else {
            throw new IllegalArgumentException("valor de carta incorrecto " + valor);
        }
    }

}
