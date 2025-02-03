import java.util.*;
public class tres_dos{
public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int edad;
    int suma_edades = 0;
    float media_edades;
    int num_alumnos = 0;
    int num_mayores_de_edad = 0;
    System.out.println("escriba la edad de los alumnos");
    edad = sc.nextInt();

        while (edad >= 0){
            /** num.alumnos++ suma 1 a la variable lo hace en bucle por lo que calcula el numero de alumnos dados**/
            num_alumnos++;
            if(edad >=18){
                System.out.println("mayor de edad");
                num_mayores_de_edad++;
            }
            /**A la variable suma le vas sumando la edad en bucle, para sumarle el conjunto de edades que escribes**/
            suma_edades += edad;

            media_edades = suma_edades / num_alumnos;
            System.out.println("media " + media_edades);
            System.out.println("total alumnos " + num_alumnos + " mayores edad " + num_mayores_de_edad);
            edad = sc.nextInt();
        }
}
}