import java.util.*;
public class ejercicio1_examen{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Bienvenido a la calculadora de salario neto introduzca su salario bruto");
    double sal_bruto = sc.nextDouble();
    System.out.println(" Escriba el porcentaje que le descuentan de su salario entre 1 y 100");
    double porcentaje = sc.nextDouble();
    double descuento = (sal_bruto * porcentaje)/100;
    double sal_neto = sal_bruto - descuento;
    if (porcentaje>=1 && porcentaje<=100)
    {
        System.out.println("su salario neto es " + sal_neto);
    }
    else
    {
        System.out.println(" has introducido un porcentaje que no esta entre 1 y 100");
    }
}
}
/**Ejercicio 1: Calcular el salario neto (1.5 puntos)

 Enunciado: Escribe un programa en Java que calcule el salario neto de un empleado. El
 programa debe pedir el salario bruto y el porcentaje de impuestos a deducir. El salario neto
 se calcula restando los impuestos al salario bruto. Utiliza variables de tipo double para los
 cálculos.

 Ejemplo: Cobro 10.000€ brutos, y me quitan 20% de impuestos, me quitan en impuestos
 2000€ y por tanto mi salario neto son 8000€.**/