package GestionEmpresa;

public class Programadores extends Empleados {
    private String lenguajeProgramacion;
    private int horasTrabajadas;
    private double tarifaPorHora;
    Evaluacion evaluacion = new Evaluacion();

    @Override
    protected void calcularBeneficio(Empleados empleados) {
        super.calcularBeneficio(empleados);
        //bono adicional 10% por mas de 40 horas trabajadas
        if (horasTrabajadas > 40) {
            bonoAdicional = salario / 10;
        } else {
            bonoAdicional = 0;
        }
        //bono adicional del 5% si tiene una evaluacion positiva
        if (evaluacion.esPositiva()){
            bonoAdicional += salario * 5 / 100;
        }
        System.out.println("tu beneficio es de " + bonoAdicional + " euros");
    }

    @Override
    protected void calcularSalario(Empleados empleados) {
        super.calcularSalario(empleados);
        salarioTotal = salario + tarifaPorHora * horasTrabajadas + bonoAdicional;
        System.out.println("tu salario es de " + salarioTotal);
    }

    @Override
    protected void calcularVacaciones(Empleados empleados) {
        super.calcularVacaciones(empleados);
        vacaciones = antiguedad / 2;
        System.out.println(vacaciones + " días de vacaciones");

    }

    @Override
    public String toString() {
        return " El empleado: " + nombre + " tiene " + edad + " años " + " y su salario es " + salarioTotal  +
                " programa en " + lenguajeProgramacion + " su evaluaciones es  " + evaluacion.esPositiva() +
                " y su antiguedad es de " + antiguedad + " años";
    }
}
