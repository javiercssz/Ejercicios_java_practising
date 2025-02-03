import java.util.*;
public class tres_tres{
public static void main(String[] args){
    System.out.println("bienvenido al numero secreto, tienes que intentar el numero en el que estoy pensando");
    Scanner sc = new Scanner(System.in);
    int random;
    int num = sc.nextInt();
    random =(int)(Math.random()*99) + 1;
    while(num != -1)
    {
        if(num < random)
        {
            System.out.println("el numero es mayor");
        }
        else if (num > random)
        {
            System.out.println("el numero es menor");
        }
        else
        {
            System.out.println("acertastes");
            break;
        }
        num = sc.nextInt();
    }
}
}
/**3.3: Codificar el juego «el número secreto•, que consiste en acertar un número entre 1 y 100
 (generado aleatoriamente). Para ello se introduce por teclado una serie de números, para
 los que se indica: •mayor• o «menor», según sea mayor o menor con respecto al núme
 ro secreto. El proceso termina cuando el usuario acierta o cuando se rinde (introducien
 do un -1).**/