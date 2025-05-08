package GestionEmpresa;

public class Programadores extends Empleados {
    private String lenguajeProgramacion;
    private int horasTrabajadas;
    private double tarifaPorHora;

    @Override
    protected void calcularBeneficio(){
        //bono adicional 10% por mas de 40 horas trabajadas
        if (horasTrabajadas > 40) {
            bonoAdicional = salarioBase / 10;
        }
        //bono adicional del 5% si tiene una evaluacion positiva
        if (obtenerPromedioEvaluaciones() >= 7){
            bonoAdicional += salarioBase * 5 / 100;
        }
        System.out.println("tu beneficio es de " + bonoAdicional + " euros");
    }

    @Override
    protected void calcularSalario() {
        salarioTotal = salarioBase + tarifaPorHora * horasTrabajadas + bonoAdicional;
        System.out.println("tu salario es de " + salarioTotal);
    }

    @Override
    protected void calcularVacaciones() {
        vacaciones = antiguedad / 2;
        System.out.println(vacaciones + " días de vacaciones");

    }

    public void setLenguajeProgramacion(String lenguajeProgramacion) {
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public void setTarifaPorHora(double tarifaPorHora) {
        this.tarifaPorHora = tarifaPorHora;
    }

    @Override
    public String toString() {
        return super.toString() + "  su salarioTotal es " + salarioTotal  +
                " programa en " + lenguajeProgramacion + " la media de sus evaluaciones es  " + obtenerPromedioEvaluaciones() +
                " y su antiguedad es de " + antiguedad + " años";
    }
}
