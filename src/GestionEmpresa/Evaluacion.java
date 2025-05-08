package GestionEmpresa;

public class Evaluacion {
    private int fecha;
    private int puntaje;

    public Evaluacion(int fecha, int puntaje) {
        this.fecha = fecha;
        this.puntaje = puntaje;
    }

    public boolean esPositiva()
    {
        return puntaje >= 7;

    }

    public int getFecha(){
        return fecha;
    }

    public int getPuntaje(){
        return puntaje;
    }
}
