import java.util.*;
public class ejercicio_tres_obligatorio_tema3 {
public static void main(String[] args){
   int din_cajero = 1000;
   int sacar_saldo = 10;
   int resultado;
    System.out.println("Bienvenido al cajero puede realizar 3 operaciones: operacion 1 retirar dinero 2 monstrar dinero 3 sacar dinero");
    Scanner sc = new Scanner(System.in);
    for (int i =1; i<=3; i++) {
        int operacion = sc.nextInt();
        if(operacion == 1) {
            System.out.println("¿Cuanto quiere retirar solo se puede retirar en multiplos de 10?");
            int multiplicar = sc.nextInt();
            resultado = multiplicar * sacar_saldo;
            din_cajero = din_cajero - resultado;
            if(din_cajero<0)
            {
                din_cajero = din_cajero + resultado;
                System.out.println("no te queda suficiente dinero en la cuenta");
            }
        }
        else if (operacion == 2)
        {
            System.out.println("tienes " + din_cajero + " euros en el banco");
        } else if (operacion == 3)
        {
            System.out.println("hasta luego");
            i = 10;
        }
        if(din_cajero >=0 && i == 1 || i == 2)
        {
            System.out.println(" que operacion desea realizar 1,2 o 3");
        }
    }
    System.out.println("este es su saldo " +din_cajero);
}
}
/**Simulador de Cajero Automático
 Diseña un programa que simule un cajero automático. El programa debe comenzar con un saldo inicial de 1000€. El usuario
 puede realizar hasta 3 operaciones, eligiendo entre retirar dinero (en múltiplos de 10) o consultar el saldo. Si el usuario
 intenta retirar más dinero del que hay disponible, el programa debe mostrar un mensaje de error. Al finalizar las 3 operaciones,
 el programa debe mostrar el saldo final.

 **/