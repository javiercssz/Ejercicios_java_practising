package GestionEmpresa;

public class Diseñadores extends Empleados{
    protected String herramientasDiseño;
    private int proyectosCompletados;
    private double tarifaPorProyecto;

    @Override
    protected void calcularBeneficio() {
        if(proyectosCompletados > 5 ) {
            bonoAdicional = salarioTotal * 15 / 100;
        }
        if(obtenerPromedioEvaluaciones() >= 7){
            bonoAdicional += 7 * salarioBase / 100;
        }

    }

    @Override
    protected void calcularSalario() {
        salarioTotal = salarioBase + (tarifaPorProyecto * proyectosCompletados) + bonoAdicional;
        System.out.println("tu salario es de " + salarioTotal + " euros");
    }

    @Override
    protected void calcularVacaciones() {
        vacaciones = (antiguedad / 3) * 2;
        System.out.println("sus vacaciones son de " + vacaciones + " dias");
    }

    public void setHerramientasDiseño(String herramientasDiseño) {
        this.herramientasDiseño = herramientasDiseño;
    }

    public void setProyectosCompletados(int proyectosCompletados) {
        this.proyectosCompletados = proyectosCompletados;
    }

    public void setTarifaPorProyecto(double tarifaPorProyecto) {
        this.tarifaPorProyecto = tarifaPorProyecto;
    }

    @Override
    public String toString() {
        return super.toString() + " su herramienta de diseño es " + herramientasDiseño + " y sus beneficios calculados son " + bonoAdicional + " euros" ;

    }
}
