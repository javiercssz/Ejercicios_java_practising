import java.util.Arrays;
public class arrays_2 {
    public static void main(String[] args) {
    ejercicio1();
    ejercicio2();
    ejercicio3();
    }
    /**1. Calcular la suma de los elementos de un array
     Enunciado: Escribe un programa que calcule la suma de todos los elementos en un array de números enteros predefinido.**/
    public static void ejercicio1() {
        int[] a1 = {2,3,4};
        int suma = 0;
            for(int i = 0; i < a1.length; i++)
            {
                suma += a1[i];
            }
        System.out.println("total " + suma);
    }
    /**2. Invertir un array
     Enunciado: Escribe un programa que invierta el orden de los elementos de un array. El array original y el invertido deben imprimirse en pantalla.
     Ejemplo de entrada:
     int[] numeros = {1, 2, 3, 4, 5};**/
    public static void ejercicio2() {
     int[] a1 = {1,2,3}; // 3 de longitud
     int[] a2 = new int[a1.length]; // 3 de longitud
        for(int i = a1.length -1; i >= 0; i--)
        {
            a2[(a1.length -1) - i] = a1[i];
        }
        System.out.println("Array normal " + Arrays.toString(a1));
        System.out.println("Array invertido " + Arrays.toString(a2));

    }
    /**3. Combinar dos arrays
     Enunciado: Escribe un programa que combine dos arrays en un único array.
     Ejemplo de entrada:
     int[] array1 = {1, 2, 3};
     int[] array2 = {4, 5, 6};**/
    public static void ejercicio3() {
        int[] a1 = {1,2,3};
        int[] a2 ={4,5,6};
        int[] a3 = new int[a1.length + a2.length];

        for(int i = 0; i < a1.length; i++)
        {
            a3[i] = a1[i];
        }
        for(int i = a1.length; i < a1.length + a2.length; i++)
        {
            a3[i] = a2[i - a1.length];
        }

        System.out.println("los dos juntos " + Arrays.toString(a3));
    }
}
