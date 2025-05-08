package GestionEmpresa;

public class Main {
    public static void main(String[] args){
        Empresa empresa = new Empresa();

        // Crear algunas evaluaciones
        Evaluacion evaluacion1 = new Evaluacion(2025, 8);  // Evaluación positiva
        Evaluacion evaluacion2 = new Evaluacion(2024, 6);  // Evaluación no positiva

        // Crear algunos empleados

        // Creo un programador
        Programadores programador = new Programadores();
        programador.agregarEvaluacion(evaluacion1);  // Agregar evaluaciones
        programador.agregarEvaluacion(evaluacion2);
        programador.nombre = "Juan Pérez";
        programador.edad = 30;
        programador.salarioBase = 3000;
        programador.antiguedad = 5;
        programador.setHorasTrabajadas(45);
        programador.setTarifaPorHora(20);
        programador.setLenguajeProgramacion("Java");

        // Creo un diseñador
        Diseñadores diseñador = new Diseñadores();
        diseñador.agregarEvaluacion(evaluacion1);
        diseñador.nombre = "Ana García";
        diseñador.edad = 28;
        diseñador.salarioBase = 2800;
        diseñador.antiguedad = 3;
        diseñador.setProyectosCompletados(6);
        diseñador.setTarifaPorProyecto(200);
        diseñador.setHerramientasDiseño("PowerPoint");

        // Creo un gerente
        Gerentes gerente = new Gerentes();
        gerente.agregarEvaluacion(evaluacion1);
        gerente.nombre = "Carlos López";
        gerente.edad = 40;
        gerente.salarioBase = 4000;
        gerente.antiguedad = 10;
        gerente.setEmpleadosSupervisados(6);
        gerente.setDepartamento("Telecomunicaciones");

        // Agregar empleados a la empresa
        empresa.agregarEmpleado(programador);
        empresa.agregarEmpleado(diseñador);
        empresa.agregarEmpleado(gerente);

        // Calcular salarios y mostrar información
        System.out.println("\nCalculando salarios de los empleados...");
        empresa.calcularSalario();

        // Calcular beneficios y mostrar información
        System.out.println("\nCalculando beneficios de los empleados...");
        empresa.calcularTotalBeneficios();

        // Calcular vacaciones de los empleados
        System.out.println("\nCalculando vacaciones de los empleados...");
        empresa.calcularVacaciones();


        //informacion empleados
        System.out.println("\nMonstrando información de los empleados");
        empresa.monstrarInformacion();
    }
}