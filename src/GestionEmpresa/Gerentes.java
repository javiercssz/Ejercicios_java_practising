package GestionEmpresa;

public class Gerentes extends Empleados {
    private String departamento;
    private int empleadosSupervisados;


    @Override
    protected void calcularBeneficio() {
        if(empleadosSupervisados > 5){
            bonoAdicional = (salarioBase * 20) / 100;
        }
        if(obtenerPromedioEvaluaciones() >= 7){
            bonoAdicional += (salarioBase * 10) / 100;
        }
        System.out.println("Su beneficio es de " + bonoAdicional + " euros");
    }

    @Override
    protected void calcularSalario() {
        salarioTotal = salarioBase + bonoAdicional;
        System.out.println("Su salario es de " + salarioTotal + " euros");
    }

    @Override
    protected void calcularVacaciones() {
        vacaciones = (antiguedad / 5) * 3;
        System.out.println("sus vacaciones son de " + vacaciones + " dias");
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setEmpleadosSupervisados(int empleadosSupervisados) {
        this.empleadosSupervisados = empleadosSupervisados;
    }

    public String toString(){
        return super.toString() + " el salarioTotal es de " + salarioTotal +
                " euros " + " esta en el departamento de " + departamento +
                " y sus beneficios calculados son " + bonoAdicional + " euros";
    }
}
