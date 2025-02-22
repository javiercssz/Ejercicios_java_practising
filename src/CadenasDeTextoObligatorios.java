import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.*;

public class CadenasDeTextoObligatorios {
    public static void main(String[] args) {
        ejercicio1();
        ejercicio2();
        ejercicio3();
    }
    /*Ejercicio 1: Transformar una oración en "lenguaje hacker"
Descripción:
Dada una oración, conviértela en "lenguaje hacker", reemplazando ciertas letras con símbolos.

Reglas de conversión:
A → 4, B → 8, C → (, D → |), E → 3, G → 6, I → 1, L → |_, O → 0, S → $, T → 7, Z → 2

Ejemplo de Entrada:
Ingrese una oración: "Java es genial"

Ejemplo de Salida:
Texto en lenguaje hacker: "J4v4 3$ 6en14|_"*/
    public static void ejercicio1(){

        System.out.println("Escribe una frase");

        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();


        String fraseTraducida = frase.replaceAll("a", "4")
                .replaceAll("A","4")
                .replaceAll("b", "8")
                .replaceAll("B","8")
                .replaceAll("c","(")
                .replaceAll("C","(")
                .replaceAll("D","|)")
                .replaceAll("e","3")
                .replaceAll("E","3")
                .replaceAll("g","6")
                .replaceAll("G","6")
                .replaceAll("i","1")
                .replaceAll("I","1")
                .replaceAll("l","|_")
                .replaceAll("L","|_")
                .replaceAll("o","0")
                .replaceAll("O","0")
                .replaceAll("s","$")
                .replaceAll("S","$")
                .replaceAll("t","7")
                .replaceAll("T","7")
                .replaceAll("z","2")
                .replaceAll("Z","2");

        System.out.println(fraseTraducida);
    }
    /*
Ejercicio 2: Validar una contraseña según criterios de seguridad

Descripción:
Dada una contraseña, verifica si cumple los siguientes criterios:
Longitud mínima de 8 caracteres.
Contiene al menos una mayúscula.
Contiene al menos una minúscula.
Contiene al menos un número.
Contiene al menos un carácter especial (@, #, $, %, &, *, !).

Ejemplo de Entrada:
Ingrese una contraseña: "P@ssw0rd!"

Ejemplo de Salida:
La contraseña es segura.*/
    public static void ejercicio2(){
        Scanner sc = new Scanner(System.in);
        String contraseña = sc.next();
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[^a-zA-Z0-9]).+$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(contraseña);

        if(matcher.find())
        {
            System.out.println("La contraseña es segura");
        }
        else
        {
            System.out.println("La contraseña no es segura");
        }
    }
    /*
Ejercicio 3: Comprimir una cadena

Descripción:
Dada una cadena que contiene caracteres repetidos consecutivamente, comprímela usando el formato "carácter" + "número de repeticiones".

Ejemplo de Entrada:
Ingrese una cadena: "aaabbbbccddddd"

Ejemplo de Salida:
Cadena comprimida: "a3b4c2d5"*/
    public static void ejercicio3(){
        System.out.println("compresor de caracteres repetidos consecutivamente");

        Scanner sc = new Scanner(System.in);
        String palabra = sc.nextLine();
        char[] palabraArray = palabra.toCharArray();

        //Contador de caracteres a comprimir
        int contador = 1;
        for(int i = 1; i < palabraArray.length; i++)
        {
            if(palabraArray[i] != palabraArray[i - 1])
            {
                contador++;
            }
        }

        String compresor[][] = new String[2][contador];

        contador = 1;
        int posicion = 0;
        for(int i = 1; i < palabraArray.length ; i++)
        {
            if(palabraArray[i] != palabraArray[i - 1] || i == palabraArray.length - 1)
            {
                if(i == palabraArray.length - 1)
                {
                    contador +=1;
                }
                compresor[0][posicion] = String.valueOf(palabraArray[i - 1]);
                compresor[1][posicion] = String.valueOf(contador);
                contador = 0;
                posicion++;
            }
            contador++;
        }

        String[] comprimido = new String[compresor[0].length * compresor.length];

        posicion = 0;
        for(int i = 0; i < compresor[0].length; i++)
        {
            comprimido[posicion] = compresor[0][i];
            comprimido[posicion + 1] = compresor[1][i];
            posicion+=2;
        }

        String compreso = String.join("",comprimido);
        System.out.println(compreso);

    }
}