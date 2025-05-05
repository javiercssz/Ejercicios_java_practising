package GestionEmpresa;

public class Evaluacion {
    private int fecha;
    private int puntaje;

    public boolean esPositiva()
    {
        if(puntaje >= 7 )

        {
            return true;

        }
        else {return false;}
    }
}
