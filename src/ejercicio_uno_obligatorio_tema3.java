import java.util.*;
public class ejercicio_uno_obligatorio_tema3 {
public static void main(String[] args){
    int num_random = (int) (Math.random() * 99) + 1;
    int i = 0;
    int adivino;
    System.out.println("intente adivinar el numero secreto");
    Scanner sc = new Scanner(System.in);
    adivino = sc.nextInt();

    for( i = 1; i<=4; i++){
        if(num_random<adivino)
        {
            System.out.println("el numero es menor");
            adivino = sc.nextInt();
        }
        else if (num_random>adivino)
        {
            System.out.println("el numero es mayor");
            adivino = sc.nextInt();
        }


        else{
            i=9;
        }

    }
    if ( num_random != adivino){
        System.out.println("has perdido, el numero era " + num_random);
    }
    else
    {
        System.out.println("enhorabuena has acertado el numero");
    }

}
}
/**Crea un programa que permita al usuario adivinar un número secreto entre 1 y 100. El programa debe dar al usuario
un máximo de 5 intentos para adivinar el número correcto. Después de cada intento, el programa debe indicar si el número
ingresado es mayor o menor que el número secreto. Si el usuario acierta el número, el programa debe felicitarlo y terminar.
Si el usuario no acierta después de 5 intentos, el programa debe mostrar un mensaje indicando que ha perdido y revelar el número
        secreto.**/