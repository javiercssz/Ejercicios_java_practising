import java.util.*;

public class ejercicios_tema_cinco_clase_tres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ejercicio1();
        int[] arr1 = {4,2,7,8,3};
        int[] arr2 = {1,2,3,4,5};
        int k = 3;
        ejercicio2(arr2,k);
        ejercicio3(arr1,arr2);
        RotarArrays(arr2,sc, k);
    }/**Ejercicio 1: Duplicados en un Array
     Crea un programa que encuentre los elementos duplicados en un array.
     Por ejemplo, para el array {1, 2, 3, 2, 1, 4}, el programa debe identificar 1 y 2 como duplicados.
     **/
    public static void ejercicio1(){

        int[] arr1 = {1,2,3,4,5,2,1};
        int a = Integer.MIN_VALUE;

        Arrays.sort(arr1);

        for (int i = 0; i < arr1.length; i++)
        {
            if (arr1[i] == a)
            {
                System.out.println("el " + arr1[i] + " esta duplicado\n");
            }
            a = arr1[i];
        }
    }

    /**
     Ejercicio 2: Rotación de un Array
     Escribe un método que reciba un array y un número k, y rote el array a la derecha k posiciones.
     Por ejemplo: {1, 2, 3, 4, 5} rotado 2 posiciones debe dar {4, 5, 1, 2, 3}.
**/
    public static void ejercicio2(int[] arr2, int k){

        int[] rotado = new int [arr2.length];
        int a = arr2.length - k;

        System.arraycopy(arr2,a,rotado,0,k);
        System.arraycopy(arr2,0,rotado, k , a);

        System.out.println("Este es el primer array " + Arrays.toString(arr2) +
                " y este es el Array rotado " + k + " veces " + Arrays.toString(rotado) + "\n");


    }
    /**Ejercicio 3: Intersección de Arrays
     Dado dos arrays, escribe un programa que calcule la intersección de los arrays.

     Ejemplo:
     Entrada: {1, 2, 3, 4} y {3, 4, 5, 6}
     Salida:
     Intersección: {3, 4}**/
    public static void ejercicio3(int[] arr1, int[] arr2){

        for (int i = 0; i < arr1.length; i++)
        {
            for (int j = 0; j < arr2.length; j++)
            {
                if(arr1[i] == arr2[j])
                {
                    System.out.println("el numero " + arr1[i] + " se repite en ambos arrays\n");
                }
            }
        }
    }
    public static void RotarArrays(int[] arr2, Scanner sc, int k)
    {
        int[] rotado = new int[arr2.length];

        for (int i = 0 ; i <= arr2.length -1; i++)
        {
            rotado[ (i + k) % rotado.length] = arr2[i];
        }

        System.out.println("rotado " + Arrays.toString(rotado));
    }
}
/**
 * **/

