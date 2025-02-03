import java.util.*;
public class tres_quince {
public static void main(String[] args){
    // pide al usuario cuantas lineas quiere en su triangulo
    System.out.println("cuantas lineas quiere para su triangulo");
    Scanner sc = new Scanner(System.in);
    int lineas = sc.nextInt();

    //crea el bucle anidado para hacer el triangulo
    if(lineas<1)
    {
        System.out.println("minimo 1 linea");
    }
    else
    {
        for(int i = 0; i <= lineas;  i++)
        {
            for(int j = lineas; j > i; j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
}
/**3.15
 Pedir por consola un número n y dibujar un triángulo rectángulo de n elementos de lado,
 utilizando para ello asteriscos(*). Por ejemplo, paran= 4:**/