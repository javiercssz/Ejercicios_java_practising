import java.util.*;
public class tema4_ejercicios1_NO_puntuable
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        eco(numero);
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();
        ejercicio2(numero1,numero2);
        System.out.println("introduzca un 1 para que muestre el area de un cilindro o un 2 para el volumen");
        int num = sc.nextInt();
        ejercicio3(num);
        ejercicio4();
        ejercicio5();
    }

    public static void eco(int numero)
    {
        for (int i = 0; i < numero; i++)
        {
            System.out.println("Eco ...");
        }

    }

    public static void ejercicio2(int numero1,int numero2)
    {
        if(numero1 > numero2)
        {
            int resultado = numero1 - numero2;
            System.out.println(resultado);
        }
        else
        {
            int resultado = numero2 - numero1;
            System.out.println(resultado);
        }
    }
    //No funciona esta funcion hay arreglarla
    public static double cuadrado(double numerocuadrado)
    {
        return numerocuadrado * numerocuadrado;
    }

    public static void ejercicio3(int num)
    {
        System.out.println("introduce el radio");
        Scanner sc = new Scanner(System.in);
        double radio = sc.nextDouble();

        if(num == 1)
        {
           double area = ((Math.PI) * 2) * radio;
            System.out.println("area" + area);
        }
       else if (num == 2)
       {
           System.out.println("introduce la altura");
           double numerocuadrado = sc.nextDouble();
           double volumen = (Math.PI) * (radio) * numerocuadrado * numerocuadrado ;
           System.out.println("volumen" + volumen);
       }
       else
       {
           System.out.println("error de compilacion inserte un 1 para el area o un 2 para el volumen");
       }
    }
    public static void ejercicio4()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime dos numeros para hacer el maximo comun divisor de ellos");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int maximo = 0;
        for(int n = 1; n <= num1 && n <= num2; n++)
        {
            if(num1 % n == 0 && num2 % n == 0)
            {
                 maximo = n;
            }
        }
        System.out.println("Este es el maximo como divisor de " + num1 + " y " + num2 + "    " + maximo);
    }
    public static void ejercicio5()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una letra");
        char letra = sc.next().charAt(0);
        char letraMinus = Character.toLowerCase(letra);
        boolean vocal = false;
        if(letraMinus == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u')
        {
            vocal = true;
        }
        System.out.print(vocal);
    }
    
}