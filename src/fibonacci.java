import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args)
    {
        System.out.println("Este es el resultado de la enesima sucesion de fibonacci");
        int n = 5;
        int resultado = fibonacci(n);
        System.out.println(resultado);
    }
    public static int fibonacci(int n)
    {
        if (n == 0 || n == 1)
        {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
