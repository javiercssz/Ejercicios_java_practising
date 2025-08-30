import java.util.Arrays;

public class torresDeHanoiLongerWay {
    public static void main(String[] args){
       //torres de hanoi
        int[] torre1 = {1,2,3};
        int[] torre2 = new int[torre1.length];
        int[] torre3 = new int[torre1.length];

        int torre1Index = 0;
        int torre2Index = 0;
        int torre3Index = 0;

        //obtener datos para saber cuando tengo que mover los numeros
        int numeroMenorMovimiento = torre1[0];
        int numeroMayor = torre1[0];

        int[] torre1Copia = torre1.clone();

        while(!torre3.equals(torre1Copia)){

           

            /*
            for(int i = 0; i < torre1.length; i++){

                //analizo cual de los 3 arrays tiene el numero más pequeño arriba del
                // todo para despues moverlo
                if(torre1[i] > 0 && torre1[i] < numeroMenorMovimiento){ //falta analizar si el numero más pequeño esta arriba del todo
                    numeroMenorMovimiento = torre1[i];
                }
            }

            for(int i = 0; i )

             */
        }
    }
}
