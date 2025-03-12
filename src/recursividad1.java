import java.util.Scanner;

 public class recursividad1{
    public static void main(String[] args) {

        // Del 1 al 100 imprimidos
        System.out.println("numeros del 1 al 100");
        int n = 0;
        int resultado = Al100(n);
        System.out.println(resultado);

        //factorial de un numero
        System.out.println("Escribe un numero y te digo su factorial");
        Scanner sc = new Scanner(System.in);
        int n2 = sc.nextInt();
        int resultado2 = factorial(n2);
        System.out.println("El factorial de  " + n2 + " es " + resultado2);

        //fibonacci devuele la posicion de la sucesion
        System.out.println("Escribe una posicion de la sucesion de fibonacci y te devolvere el numero de esa posicion");
        int posicion = sc.nextInt();
        int resultado3 = fibonacci(posicion);
        System.out.println("El numero que va en el puesto " + posicion + " es " + resultado3);
    }

    public static int Al100(int n) {
        if (n >= 100) {
            return n;
        }
        System.out.println(n);
        return Al100(n + 1);
    }
    public static int factorial(int n2) {
        if (n2 == 1)
        {
            return n2;
        }

        return n2 * factorial(n2 - 1);
    }
    public static int fibonacci(int posicion) {
        if (posicion == 0 || posicion == 1)
        {
            return posicion;
        }
        return fibonacci(posicion - 1) + fibonacci(posicion - 2);
    }
}
/*EJERCICIO:
 * Entiende el concepto de recursividad creando una función recursiva que imprima
 * números del 100 al 0.
 * DIFICULTAD EXTRA (opcional):
 * Utiliza el concepto de recursividad para:
 * - Calcular el factorial de un número concreto (la función recibe ese número).
 * - Calcular el valor de un elemento concreto (según su posición) en la
 *   sucesión de Fibonacci (la función recibe la posición).
 */