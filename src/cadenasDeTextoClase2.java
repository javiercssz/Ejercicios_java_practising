import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class cadenasDeTextoClase2 {
    public static void main(String[] args){
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
       // ejercicio4();
        //ejercicio5();
        ejercicio6();
    }
   /*Ejercicio 1: Reemplazo de Palabras
Solicita al usuario una oración y reemplaza todas las ocurrencias de la palabra "Pascal" por "Java ".

Ejemplo de entrada:

Me encanta programar en Pascal. Pascal es genial.
Salida esperada:

Me encanta programar en Java. Java es genial.*/
    public static void ejercicio1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una frase");
        String cambiarPalabra = sc.nextLine();
        String palabraCambiada = cambiarPalabra.replace("pascal","java");

        System.out.println(palabraCambiada);
    }
    /*Ejercicio 2: Contar Palabras en una Frase
Escribe un programa que cuente cuántas palabras hay en una frase.

Ejemplo de entrada:

Aprender Java es divertido
Salida esperada:

Número de palabras: 4*/
    public static void ejercicio2(){
        String[] hola = {"hola"," ","mundo"," ","cruel"," "," "};

        int palabrasContador = 0;
        for(int i = 0; i < hola.length; i++)
        {

            if (!hola[i].equals(" "))
            {
                palabrasContador++;
            }
        }
        System.out.println(palabrasContador);
    }
    /*Ejercicio 3: Convertir Minúsculas a Mayúsculas y Viceversa
Solicita al usuario un texto y muestra su versión en mayúsculas y en minúsculas.

Ejemplo de entrada:

Hola Mundo
Salida esperada:

Mayúsculas: HOLA MUNDO
Minúsculas: hola mundo*/
    public static void ejercicio3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("version mayusculas y version minusculas");
        String convertir = sc.nextLine();

        String mayusculas = convertir.toUpperCase();
        String minusculas = convertir.toLowerCase();

        System.out.println("La version en mayusculas es\n" + mayusculas + "\n Su version en minusculas es\n" + minusculas);
    }
    /*Ejercicio 4: Encontrar la Palabra Más Larga en un Párrafo
Escribe un programa en Java que solicite al usuario un párrafo y determine cuál es la palabra más larga dentro de él.

Ejemplo de entrada:
Ingrese un párrafo: Java es un lenguaje de programación muy poderoso y ampliamente utilizado en el desarrollo de software.
Salida esperada:
La palabra más larga es: "programación"
*/
    public static void ejercicio4(){
        Scanner sc = new Scanner(System.in);
        String parrafo = sc.nextLine();

        String[] palabras = parrafo.split(" ");
        int comparador = 0;
         String palabraLarga = "";
         int contador = 0;
        for(int i = 0; i < palabras.length; i++)
        {
            char[] silabas = palabras[i].toCharArray();
            comparador = contador;
            contador = 0;
            for(int j = 0; j < silabas.length; j++)
            {
                if (silabas[j] != ' ' && silabas[j] != ',' && silabas[j] != ';' && silabas[j] != '.')
                {
                    contador++;
                }
            }
            if ( contador > comparador)
            {
                palabraLarga = palabras[i];
            }
        }

        System.out.println("Esta es la palabra más larga es " + palabraLarga);

    }
    /*Ejercicio 5

Realizar un programa que lea una frase del teclado y nos indique si es palíndroma, es de
cir, que la frase sea igual leyendo de izquierda a derecha, que de derecha a izquierda, sin
tener en cuenta los espacios. Un ejemplo de frase palíndroma es:

"Dábale arroz a la zorra el abad"

Las vocales con tilde hacen que los algoritmos consideren una frase palíndroma como si
no lo fuese. Por esto, supondremos que el usuario introduce la frase sin tildes.*/
    public static void ejercicio5(){
        //He creado un scanner para pedir al usuario una frase la cual la he pasado
        // a un array sin espacios y luego la he vuelto a pasar a string para poder pasarla a un array de char sin espacios.
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();
        String[] sinEspacios = frase.split(" ");
        String fraseSinEspacios = String.join("",sinEspacios);
        char[] silabas = fraseSinEspacios.toCharArray();
        boolean palindromo = false;

        int a = silabas.length;
        int i = 0;
        int j = a -1;
        while(a > i && j >= 0)
        {
            if (silabas[i] == silabas[j])
            {
                palindromo = true;
            }
            else
            {
                palindromo = false;
                break;
            }
                j--;
                i++;
            }

        System.out.println(palindromo);
        }
            /*Ejercicio 6
Un anagrama es una palabra que resulta del cambio del orden de los caracteres de otra.
Ejemplos de anagramas para la palabra roma son: amor, ramo o mora. Construir un progra­
ma que solicite al usuario dos palabras e indique si son anagramas una de otra.*/
    public static void ejercicio6(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe dos palabras y te dire si es un anagrama o no");
        String palabra1 = sc.next();
        String palabra2 = sc.next();
        char[] silaba1 = palabra1.toCharArray();
        char[] silaba2 = palabra2.toCharArray();

        for(int i = 0; i < silaba1.length; i++)
        {
            for(int j = 0; j < silaba2.length; j++)
            {

            }
        }
    }
}
