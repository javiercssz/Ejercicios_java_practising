import java.util.*;
public class Main {
public static void main(String[] args) {
    System.out.println("escriba un numero");
    Scanner sc = new Scanner(System.in);
    int numero = sc.nextInt();

    if (numero<1)
    {
        System.out.println("introduzca un numero mayor que 0");
    }
    else
    {
        for(int i = 1; i <= numero; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    ejercicio1();
}

public static void ejercicio1()
    {
        int k = (4 + 1) % 5;
        System.out.println(k);
    }

}
/**Ejercicio bucles anidados
 Crea una aplicación que permita adivinar un número. La aplicación genera un número aleatorio del 1 al 100. A continuación va
 pidiendo números y va respondiendo si el número a adivinar es mayor o menor que el introducido, a demás de los intentos que te
 quedan (tienes 10 intentos para acertarlo).
 El programa termina cuando se acierta el número (además te dice en cuantos intentos lo has acertado), si se llega al limite de
 intentos te muestra el número que había generado.**/
