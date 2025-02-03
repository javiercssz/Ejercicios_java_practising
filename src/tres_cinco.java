import java.util.*;

public class tres_cinco {
    public static void main(String[] args) {
        int random1 = (int) (Math.random() * 99) + 1;
        int random2 = (int) (Math.random() * 99) + 1;
        int num;
        int resultado = random1 + random2;
        System.out.println("Bienvenido al juego de la suma, tienes que sumar " + random1 + " y " + random2);
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        while (true) {
            if (num == resultado) {
                random1 = (int) (Math.random() * 99) + 1;
                random2 = (int) (Math.random() * 99) + 1;
                resultado = random1 + random2;
                System.out.println("suma " + random1 + " y " + random2);
                num = sc.nextInt();
            } else {
                System.out.println("Has fallado el juego ha terminado");
                break;
            }
        }
    }
}

/**3.5: Desarrollar un juego que ayude a mejorar el cálculo mental de la suma. El jugador tendrá
 que introducir la solución de la suma de dos números aleatorios comprendidos entre 1 y
 100. Mientras la solución introducida sea correcta, el juego continuará. En caso contra
 rio, el programa terminará y mostrará el número de operaciones realizadas correctamente.**/
