import java.util.*;
import java.util.Scanner;

public class cadenasDeTextoClase3 {
    public static void main(String[] args) {
        //ejercicio1();
        ejercicio2();
    }
    /*Ejercicio 1: Frecuencia de un carácter

Dada una cadena y un carácter, cuenta cuántas veces aparece dicho carácter en la cadena.

Ejemplo de Entrada
Ingrese una cadena: "programación en Java"
Ingrese un carácter: 'a'
Ejemplo de Salida

El carácter 'a' aparece 4 veces en la cadena.*/
    public static void ejercicio1(){
        System.out.println("Escribe una frase");
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();
        System.out.println("escribe el caracter que quieres que te cuente");
        char caracter = sc.next().charAt(0);
        char[] cadenaFrase = frase.toCharArray();

        int contador = 0;
        for(int i = 0; i < cadenaFrase.length; i++)
        {
            if (cadenaFrase[i] == caracter){contador++;}
        }
        System.out.println("se repite " + contador + " veces");
    }
    /*Ejercicio 2: Eliminar caracteres repetidos

Escribe un programa que elimine los caracteres duplicados de una cadena, manteniendo solo la primera aparición.
Ejemplo de Entrada
Ingrese una cadena: "programación"
Ejemplo de Salida
Cadena sin caracteres repetidos: "progaminó"*/
    public static void ejercicio2() {
        System.out.println("Escribe una frase");
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();
        char[] cadenaFrase = frase.toCharArray();

        int contador = 0;
        for (int i = 0; i < cadenaFrase.length; i++) {
            for (int j = i + 1; j < cadenaFrase.length; j++) {
                if (cadenaFrase[i] == cadenaFrase[j]) {
                    cadenaFrase[j] = '\0';
                } else {
                    contador++; // esta mal el contador, a lo mejor tambien estan mal mas cosas
                }
            }
        }

        int posicionNuevoArray = 0;
        char[] fraseFinal = null;
        for (int i = 0; i < cadenaFrase.length; i++) {
            fraseFinal = new char[contador];
            if (cadenaFrase[i] != '\0') {
                fraseFinal[posicionNuevoArray] = cadenaFrase[i];
                posicionNuevoArray++;
            }
        }
        String oracion = new String(fraseFinal);
        System.out.println(oracion);
    }
    /*
Ejercicio 3: Ordenar palabras alfabéticamente

Pide una oración al usuario y muestra las palabras ordenadas alfabéticamente.

Ejemplo de Entrada

Ingrese una oración: "Java es un lenguaje de programación"

Ejemplo de Salida

Palabras ordenadas: "Java de es lenguaje programación un"

Ejercicio 4: Formato de título

Dada una oración, convierte la primera letra de cada palabra en mayúscula.

Ejemplo de Entrada

Ingrese una oración: "java es un lenguaje de programación"

Ejemplo de Salida

Oración en formato título: "Java Es Un Lenguaje De Programación"*/
}
