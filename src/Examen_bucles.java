import java.util.Scanner;

public class Examen_bucles {
    public static void main(String[] args)
    {
        ejercicio1();
        ejercicio2();
    }
    public static void ejercicio1()
    {
        System.out.println("escribe dos numeros enteros positivos");
        Scanner sc1 = new Scanner(System.in);
        int inicio = sc1.nextInt();
        int fin = sc1.nextInt();

        while (inicio > fin)
        {
            System.out.println("escriba otra vez los numeros pero el primero tiene que ser menor que el segundo");

            inicio = sc1.nextInt();
            fin = sc1.nextInt();

        }
        //rango de numeros a analizar
        for (int i = inicio; i <= fin; i++)
        {
            //analiza si un numero es primo o no
          for(int j = 2; j < fin; j++)
          {

              if (inicio % j != 0)
              {

              }
              else
              {
                  System.out.println( i + " no es primo, ");
                  break;

              }
              System.out.println( i + " es primo");

          }
        }
    }
    public static void ejercicio2() {
        int numero;
        do {
            System.out.println(" 1. Convertir kilómetros a millas\n" +
                    " 2. Convertir libras a kilogramos\n" +
                    " 3. Convertir grados Celsius a Fahrenheit\n" +
                    " 4. Salir");
            Scanner sc2 = new Scanner(System.in);
            numero = sc2.nextInt();

            if (numero == 1) {
                System.out.println("cuantos kilometros");
                double kilometros = sc2.nextInt();
                System.out.print(kilometros_millas(kilometros));
                System.out.println(" millas");

            } else if (numero == 2) {
                System.out.println("cuantas libras");
                double libras = sc2.nextInt();
                System.out.print(libras_kilogramos(libras));
            } else if (numero == 3) {
                System.out.println("cuantos grados Celsius");
                double grados = sc2.nextInt();
                System.out.print(grados_celsius(grados));
                System.out.print(" fahrenheit");
            } else if (numero == 4) {
                System.out.println("saliendo");

            } else {
                System.out.println("error de compilación");
            }
        }
        while (numero != 4);
    }
    public static double kilometros_millas(double kilometros)
    {
        double resultado = kilometros * 0.621371;
        return resultado;
    }
    public static double libras_kilogramos(double libras)
    {
        double resultado3 = libras * 0.453592;
        return resultado3;
    }
    public static double grados_celsius(double grados)
    {
        double resultado1 = grados * (9 / 5) + 32;
        return resultado1;
    }
}
/**Ejercicio 1 : Cálculo de números primos en un rango (2.5 puntos)
 Escribe un programa en Java (podéis escribirlo en una única función, que se llame por ejemplo ejercicio1)
 que realice las siguientes tareas utilizando bucles:

 (0.5 pt) Solicite al usuario dos números enteros positivos, inicio y fin, que representen el rango de números a analizar.
 Valida que inicio < fin. Si no lo es, solicita los números nuevamente.

 (0.5 pt) Encuentre y muestre todos los números primos dentro del rango [inicio, fin]. Un número es primo si es mayor que
 1 y solo es divisible por 1 y por sí mismo.

 (0.5 pt) Calcule y muestre cuántos números primos hay en total dentro del rango.

 (0.5 pt) Calcule la suma de todos los números primos encontrados y muéstrala.

 (0.5 pt) Encuentre y muestre el primer número primo en el rango y el último número primo en el rango



 Ejercicio 2: Conversión de Unidades con Funciones (2.5 puntos)
 Escribe un programa en Java que realice conversiones entre diferentes unidades de medida usando funciones. El programa debe:

 Mostrar un menú al usuario con las siguientes opciones:
 1. Convertir kilómetros a millas
 2. Convertir libras a kilogramos
 3. Convertir grados Celsius a Fahrenheit
 4. Salir

 (1pt) Implementar una función separada para cada tipo de conversión, utilizando las fórmulas:

 Kilómetros a millas: millas = kilómetros x 0.621371

 Libras a kilogramos: kilogramos= libras x 0.453592

 Celsius a Fahrenheit: Fahrenheit = (Celsius × 9/5​) + 32

 (0.5pt) Solicitar los valores necesarios para cada conversión dentro del cuerpo principal del programa ( o función del ejercicio2 ) y pasarlos como parámetros a las funciones correspondientes.



 (0.5pt) Repetir el menú hasta que el usuario seleccione la opción "4. Salir".

 (0.5pt) Validar que las entradas sean válidas (por ejemplo, números positivos cuando corresponda).

 **/