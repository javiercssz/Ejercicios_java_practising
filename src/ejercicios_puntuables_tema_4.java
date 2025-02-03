import java.util.Random;
import java.util.Scanner;

public class ejercicios_puntuables_tema_4 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("escriba 1 volumen o 2 superficie");
        int n = sc.nextInt();
        System.out.println("cual es el radio");
        int r = sc.nextInt();
        if (n == 1)
        {
           double resultado = volumen(r);
           System.out.println("volunen " + resultado);
        }
        else if (n == 2)
        {
            double resultado = superficie(r);
            System.out.println("superficie " + resultado);
        }
        else
        {
            System.out.println("error");
        }
        System.out.println("¿cuantos numero aleatorios genero?");
        int aleatorycant = sc.nextInt();
        System.out.println("numero minimo aleatorio");
        int minimo = sc.nextInt();
        System.out.println("numero maximo aleatorio");
        int maximo = sc.nextInt();
        numaleatorio(aleatorycant,minimo,maximo);

        System.out.println("Escribe un numero y te devolvere el resultado de la suma de sus digitos");
        int numero2 = sc.nextInt();
        //Esta funcion del ejercicio 3 le escribo un numero y me escribe la suma de sus digitos
        int digitos = devolverdigitos(numero2);
        System.out.println(digitos);
    }
    public static double superficie(int r)
    {
        double superficie = ((Math.PI) * 4) * (r * r);
        return superficie;
    }
    public static  double volumen(double r)
        {
            double volumen = (4 / 3 ) * (Math.PI * (r * r * r));
            return volumen;
        }

    public static void numaleatorio(double aleatorycant, int minimo, int maximo)
    {
        for (int i = 0; i < aleatorycant; i++)
        {
            int rango = maximo - minimo;
           // Random rand = new Random();
            //double resultado = rand.nextDouble(minimo, maximo);
            double resultado = rango * (Math.random()) + minimo;
            System.out.println(resultado);
        }
    }

    public static void numaletorio(double aleatorycant)
    {
        numaleatorio(aleatorycant,0,1);
        System.out.println(aleatorycant);
    }

    public static int devolverdigitos(int numero2)
    {
        if (numero2 < 10)
        {
            return numero2;
        }
        return (numero2 % 10) + devolverdigitos(numero2 / 10);
    }
}
/**

 Ejercicio 3

 Escribe una función recursiva sumaDigitos que reciba un número entero positivo y devuelva la suma de sus dígitos.

 Ejemplo: Para el número 456, la función debería devolver 4+5+6=15.
 **/
