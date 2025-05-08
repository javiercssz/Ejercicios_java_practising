package GestionEmpresa;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Empleados> empleadosEmpresa  = new ArrayList<>();

    public void agregarEmpleado(Empleados empleados){
        empleadosEmpresa.add(empleados);
    }
    public void monstrarInformacion(){
        for(Empleados empleados : empleadosEmpresa){
            System.out.println(empleados);
        }
    }
    public void calcularSalario(){
        for (Empleados empleados : empleadosEmpresa) {
            empleados.calcularSalario(); // Calcula el salario de cada empleado
            System.out.println(empleados); // Muestra la información de cada empleado
        }
    }
    public void calcularTotalBeneficios(){
        for(Empleados empleados : empleadosEmpresa){
            empleados.calcularBeneficio();
            System.out.println(empleados);
        }
    }
    public void calcularVacaciones(){
        for(Empleados empleados : empleadosEmpresa){
            empleados.calcularVacaciones();
            System.out.println(empleados);
        }
    }
}

