import java.util.Scanner;
public class ejercicio_dos_obligatorio_tema3 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el número de niveles
        System.out.print("Ingrese el número de niveles de la pirámide (1 a 10): ");
        int niveles = scanner.nextInt();

        // Validar que el número de niveles esté en el rango permitido
        if (niveles < 1 || niveles > 10) {
            System.out.println("Por favor, ingrese un número entre 1 y 10.");
        } else {
            // Dibujar la pirámide
            for (int i = 1; i <= niveles; i++) {
                // Imprimir asteriscos en la línea actual
                for (int j = 0; j < i; j++) {
                    System.out.print("* ");
                }
                // Salto de línea después de cada nivel
                System.out.println();
            }
        }
    }
}

/**Generador de Pirámides
 Desarrolla un programa que dibuje una pirámide de asteriscos (*) basada en el número de niveles que ingrese el usuario.
 El número máximo de niveles debe ser 10. El programa debe validar que el número de niveles esté dentro del rango permitido (1 a 10).


 Ejemplo: Para el nivel igual a 4

 *
 * *
 * * *
 * * * *     **/