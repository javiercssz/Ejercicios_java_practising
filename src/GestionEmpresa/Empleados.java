package GestionEmpresa;
import java.util.ArrayList;

public abstract class Empleados {
    protected String nombre;
    protected int edad;
    protected double salarioBase;
    protected int antiguedad;
    protected int vacaciones = 0;
    protected double salarioTotal;
    protected double bonoAdicional = 0;
    protected ArrayList<Evaluacion> historialDeEvaluaciones = new ArrayList<>();


    public Empleados() {
    }

    public Empleados(String nombre, int edad, double salarioBase, double salarioTotal, int antiguedad, int vacaciones,
                     ArrayList<Evaluacion> historialDeEvaluaciones) {
        this.nombre = nombre;
        this.edad = edad;
        this.salarioBase = salarioBase;
        this.salarioTotal = salarioTotal;
        this.antiguedad = antiguedad;
        this.vacaciones = vacaciones;
        this.historialDeEvaluaciones = historialDeEvaluaciones;
    }

    protected abstract void  calcularSalario();

    protected abstract void calcularBeneficio();

    protected abstract void calcularVacaciones();


    public void agregarEvaluacion(Evaluacion evaluacion)
    {
        historialDeEvaluaciones.add(evaluacion);
    }
    public double obtenerPromedioEvaluaciones(){
        if(historialDeEvaluaciones.isEmpty()){
            return 0;
        }
        int suma = 0;

        for (Evaluacion e : historialDeEvaluaciones) {
            suma += e.getPuntaje();
        }
        return suma / (double) historialDeEvaluaciones.size();
    }

    @Override
    public String toString() {
        return " El empleado: " + nombre + " tiene " + edad + " años " + " y su salarioBase es " + salarioBase;
    }
}
