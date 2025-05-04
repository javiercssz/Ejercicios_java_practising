package GestorLibros;
public class Libro
{
    private String titulo;
    private String autor;
    private int anio;
    private Estado estado;
    private static int totalReservados = 0;

    public Libro(String titulo, String autor, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.estado = Estado.DISPONIBLE;
    }

    public boolean reservar() {
        if (estado == Estado.DISPONIBLE) {
            estado = Estado.RESERVADO;
            totalReservados++;
            return true;
        }
        return false;
    }

    public String getTitulo() {
        return titulo;
    }
    //No lo he usado aun.
    public Estado getEstado() {
        return estado;
    }

    public static int getTotalReservados() {
        return totalReservados;
    }


}
