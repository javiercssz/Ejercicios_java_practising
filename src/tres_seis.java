import java.util.Scanner;
public class tres_seis {
public static void main(String[] args) {
        int contador = 1;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while (contador < num) {
            System.out.println(contador);
            contador++;
        }
        System.out.println(num);
    }
}
/**3.6: Escribir una aplicación para aprender a contar, que pedirá un número n y mostrará todos
los números del 1 a n.**/