package GestionEmpresa;
import java.util.ArrayList;

public class Empleados {
    protected String nombre;
    protected int edad;
    protected double salario;
    protected int antiguedad;
    protected int vacaciones = 0;
    protected double salarioTotal;
    protected double bonoAdicional;
    protected ArrayList<Evaluacion> historialDeEvaluaciones = new ArrayList<>();

    public Empleados() {
    }

    public Empleados(String nombre, int edad, double salario, int antiguedad, int vacaciones) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.antiguedad = antiguedad;
        this.vacaciones = vacaciones;
    }

    protected void  calcularSalario(Empleados empleados)
    {

    }
    protected void calcularBeneficio(Empleados empleados)
    {

    }
    protected void calcularVacaciones(Empleados empleados)
    {

    }

    @Override
    public String toString()
    {
        return " El empleado: " + nombre + " tiene " + edad + " años " + " y su salario es " + salario;
    }

    public void agregarEvaluacion(Evaluacion evaluacion)
    {

    }
}
