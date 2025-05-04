package GestorLibros;

public class Biblioteca
{
    private String nombre;
    private Libro[] libros;
    private int contador;

    public Biblioteca(String nombre, int capacidad)
    {
        this.nombre = nombre;
        libros = new Libro[capacidad];
    }

    public void agregarLibro(Libro libro) {
        if (contador < libros.length) {
            libros[contador++] = libro;
        } else {
            System.out.println("No se pueden agregar más libros. Capacidad llena.");
        }
    }

    public Libro buscarLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro != null && libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null;
    }

    public void mostrarLibros() {
        System.out.println("\nLibros en la biblioteca '" + nombre + "':\n");
        for (Libro libro : libros) {
            if (libro != null) {
                System.out.println(libro);
            }
        }
        System.out.println();
    }
}
