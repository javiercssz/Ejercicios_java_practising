package GestorLibros;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca("La biblioteca", 10);

        System.out.println("Bienvenido al sistema de reservas de la " + biblioteca);

        while (true) {
            System.out.println("\n\tMenú");
            System.out.println("1. Agregar libro");
            System.out.println("2. Ver libros");
            System.out.println("3. Reservar libro");
            System.out.println("4. Ver total de libros reservados");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: \n");

            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();
                    System.out.print("Autor: ");
                    String autor = sc.nextLine();
                    System.out.print("Año: ");
                    int anio = sc.nextInt();
                    sc.nextLine();


                    biblioteca.agregarLibro(new Libro(titulo, autor, anio));

                    System.out.println("Libro agregado correctamente.");
                    break;

                case 2:
                    biblioteca.mostrarLibros();
                    break;

                case 3:
                    System.out.print("Nombre de la persona que reserva: ");
                    String nombrePersona = sc.nextLine();
                    Persona persona = new Persona(0, nombrePersona); // ID no usado aquí

                    System.out.print("Título del libro a reservar: ");
                    String tituloReserva = sc.nextLine();
                    Libro libro = biblioteca.buscarLibroPorTitulo(tituloReserva);

                    if (libro != null) {
                        if (libro.reservar()) {
                            System.out.println("El libro '" + tituloReserva + "' ha sido reservado por " + persona.getNombre() + ".");
                        } else {
                            System.out.println("El libro '" + tituloReserva + "' no está disponible para reservar.");
                        }
                    } else {
                        System.out.println("Libro no encontrado.");
                    }
                    break;

                case 4:
                    System.out.println("Total de libros reservados: " + Libro.getTotalReservados());
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Numero incorrecto");
                    break;
            }
        }
    }
}

