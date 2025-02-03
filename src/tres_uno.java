import java.util.*;
public class tres_uno {
    public static void main(String[] args) {
        System.out.println("Introduce un numero");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while ( num != 0){
            if(num % 2 == 0 ){
                System.out.println("el numero es par");
           }else{
                    System.out.println("el numero es impar");
               }
            if(num > 0){
                System.out.println("el numero es positivo");
            }
            if(num < 0){
                System.out.println("el numero es negativo");

            }   int resultado = num * num;
                System.out.println("el cuadro de " + num + " es " + resultado);
                num = sc.nextInt();
            }
        }
    }
