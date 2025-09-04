import java.util.Scanner;

public class numeroMagico {
    public static void main(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un número");

        int num = sc.nextInt();
        int numero = num;

        int sumaDigitos = 0;


            while (numero >= 10){
                if(numero % 10 == 0){
                    numero /= 10;
                }
                if(numero != 0) {
                    sumaDigitos++;
                    numero--;
                }
            }
            int digitos = numero + sumaDigitos;

            if(num % 3 == 0 && digitos % 2 == 0)
            {
                System.out.println("el numero " + num + " es un número mágico");
            }else {
                System.out.println("el numero " + num + " no es un número mágico");
            }

    }
}
