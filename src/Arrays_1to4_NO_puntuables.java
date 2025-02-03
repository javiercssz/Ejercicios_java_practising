import javax.security.auth.login.AccountLockedException;
import java.util.*;
public class Arrays_1to4_NO_puntuables {
    public static void main(String[] args)
    {
        //Creamos un Scanner
        Scanner sc = new Scanner(System.in);

        //LLamamos a las funciones de los ejercicios
        Ejercicio1();
        Ejercicio2();
        Ejercicio3();
        Ejercicio4();
    }
    public static void Ejercicio1()

    {
        //Creo las variables y los objetos
        int[] arr= new int[10];
        int sumanumeros = 0;
        Random rand = new Random();

        //Hago un bucle para que se guarden numeros aleatorios entre 1 y 100 en un Array de 10 y me sume todos los numeros
        //y me los guarde en la variable sumanumeros.
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = rand.nextInt(1,100);
            System.out.println(i + "  Numero " + arr[i]);
            sumanumeros += arr[i];
        }

        //imprimiendo la variable sumanumero
        System.out.println("suma " + sumanumeros);
    }
    public static void Ejercicio2()
    {
        //creo un Array con double y creo el Scanner
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[5];

       //Solicito al usuario los numeros que quiero guardar en el Array
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println("introduce un numero");
            arr[i] = sc.nextDouble();
        }

        //Te muestro todos los numeros del Array
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }

    }
    /**Ejercicio 5.3
     Escribir una aplicación que solicite al usuario cuantos números desea introducir.
     A continuación, introducir por teclado esa cantidad de números enteros, y por ultimo, mostrarlos en orden inverso.
     **/
    public static void Ejercicio3()
    {
        System.out.println("Cuantos numeros deseas introducir");
        Scanner sc = new Scanner(System.in);
        int cantidad = sc.nextInt();
        int[] arr = new int[cantidad];
        int posicion = 0;
        for (int i = 0 ; i < cantidad; i++)
        {
            System.out.println("introduce un numero");
            int numero = sc.nextInt();
            arr[posicion] = numero;
            posicion++;
        }
        for (int i = cantidad - 1; i >= 0; i--)
        {
            System.out.println(arr[i]);
        }
    }
    /** Ejercicio 5.4
     Diseñar la función: int maximo (int t [ ] ) , que devuelva el máximo valor contenido en el array t.**/
    public static void Ejercicio4()
    {
        int maximo = Integer.MIN_VALUE;
        int numero;
        int[] arr = {4,10,2,4,2,4,222,77};

        for (int i = 0 ; i < arr.length; i++)
        {
            numero = arr[i];

            if(numero > maximo)
            {
                maximo = numero;
            }
        }
        System.out.println("Numero mas grande es " + maximo);
    }
}

