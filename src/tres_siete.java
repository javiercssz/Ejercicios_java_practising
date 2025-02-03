import java.util.*;
public class tres_siete {
public static void main(String[] args){
    int num = 7;
    int multiplos = 0;
    System.out.println("estos son todos los multiplos de siete antes de llegar a cien");
    while(multiplos < 100){
        multiplos = num + 7;
        num = multiplos;
        if (multiplos < 100) {
            System.out.println(multiplos);
        }
    }
}
}
/**Escribir todos los múltiplos de 7 menores que 100.**/