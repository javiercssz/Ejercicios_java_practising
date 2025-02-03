import java.util.Scanner;

public class factoriales_recursividad {
    public static void main(String[] args) {
        System.out.println("Escribe un numero que quieras saber su factorial");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();

        int resultado = factorial(numero);
        System.out.println("El factorial es " + resultado);
    }
    public static int factorial(int numero) {
        if (numero == 0)
        {
            return 1;
        }
        else if (numero < 0)
        {
            System.out.println("Escriba un numero positivo");
            return 0;
        }
        else
        {
            return factorial(numero - 1) * numero;
        }
    }
}
