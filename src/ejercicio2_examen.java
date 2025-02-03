import java.util.*;
public class ejercicio2_examen{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("escriba el numero de dias");
    int num_dias = sc.nextInt();
    int semanas = num_dias / 7;
    int dias = num_dias % 7;
    System.out.println("son " + semanas + " semanas y " + dias + " dias");
}
}
/**Ejercicio 2: Conversión de días a semanas y días (1.5 puntos)

 Enunciado: Escribe un programa en Java que pida al usuario un número de días y luego lo
 convierta en semanas y días.

 Ejemplo: Si el usuario introduce 10 días, el programa debe mostrar que eso equivale a 1
 semana y 3 días.**/