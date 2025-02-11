import java.util.*;
public class cadenasDeTextoClase1 {
    public static void main(String[] args) {
        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();
        ejercicio5();
    }

    /*Ejercicio 1: Extraer y Mostrar Caracteres
Escribe un programa que reciba un String ingresado por el usuario y luego muestre cada carácter por separado.
Entrada:
Java
Salida:
J
a
v
a*/
    public static void ejercicio1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una palabra y te devólvere cada carácter por separado\n");
        String palabra = sc.nextLine(); // le pido al usuario que escriba una palabra.


        char[] silabas = palabra.toCharArray();
        System.out.println("Aqui tienes \"las silabas\"\n" + Arrays.toString(silabas));
    }

    /*Ejercicio 2: Comparación de Cadenas
     Crea un programa que pida dos cadenas de texto y verifique si son iguales (considerando mayúsculas y minúsculas) y si son iguales ignorando mayúsculas.

Entrada:

 Ingrese la primera cadena: Hola Mundo
 Ingrese la segunda cadena: hola mundo
 Salida:
 ¿Son iguales? false
 ¿Son iguales ignorando mayúsculas? true*/
    public static void ejercicio2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe dos cadenas de texto");
        String cadena1 = sc.nextLine();
        String cadena2 = sc.nextLine();

        //Comparacion de cadenas
        for (int i = 0; i < 2; i++) {
            boolean iguales = false;
            if (cadena1.equals(cadena2)) {
                iguales = true;
            }
            System.out.println(iguales);
            cadena1 = cadena1.toLowerCase();
            cadena2 = cadena2.toLowerCase();
        }

    }

    /*Ejercicio 3: Contar Vocales
 Haz un programa que cuente cuántas vocales tiene una frase ingresada por el usuario.

Entrada:
 hola
 Salida:
 Numero de vocales: 2*/
    public static void ejercicio3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("pon una frase y te dire el numero de vocales que tiene\n");
        String frase = sc.nextLine();
        char[] cadenafrase = frase.toCharArray();
        String encontrar = "aeiouAEIOU";
        int contador = 0;

        for (int i = 0; i < cadenafrase.length; i++) {

            int vocales = encontrar.indexOf(cadenafrase[i]);
            if (vocales != -1) {
                contador++;
            }

        }
        System.out.println("tiene " + contador + " vocales");

    }
    /*Ejercicio 4: Invertir una Cadena
 Escribe un programa que tome una palabra y la imprima al revés.

 Entrada:
 Hola
 Salida:
 aloH*/
    public static void ejercicio4(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un frase");
        String frase = sc.nextLine();
        char[] arrayPalabra = frase.toCharArray();
        char[] arrayAlreves = new char[arrayPalabra.length];
        int contador = 0;

        for(int i = arrayPalabra.length -1; i >= 0; i--){
                arrayAlreves[contador] = arrayPalabra[i];
                contador++;
        }
        String alreves = new String(arrayAlreves);
        System.out.println(alreves);

    }
    /*
 Ejercicio 5: Buscar una Subcadena
 Crea un programa que pregunte al usuario por una frase y una palabra, y luego verifique si la palabra está en la frase, mostrando su posición.

Entrada:

 Ingrese una frase: Me gusta programar en Java
 Ingrese la palabra a buscar: programar

 Salida:
 La palabra 'programar' está en la posición 9.
 */
    public static void ejercicio5(){
        Scanner sc = new Scanner(System.in);
        System.out.println("pon una frase y te busco la palabra que me ingreses despues");
        String frase = sc.nextLine();
        String palabra = sc.nextLine();

        if(frase.contains(palabra))
        {
            System.out.println("si esta la palabra\n");
            int posicion = frase.indexOf(palabra);
            System.out.println("Esta en la posicion " + posicion);
        }

    }
}
