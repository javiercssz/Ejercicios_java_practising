import java.util.*;
public class tres_cuatro{
public static void main(String[] args){
    int arbol;
    int etiquetas = 0;
    int numero_alto = 0;
    int etiquetaMasAlta = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduzca la altura del arbol en centimentros");
    arbol = sc.nextInt();
    System.out.println("el arbol mas alto mide " + arbol + " centimetros");
    while (arbol != -1){
        System.out.println("el arbol numero " + etiquetas + " mide " + arbol);
        etiquetas++;
        if(arbol > numero_alto)
        {
            numero_alto = arbol;
            etiquetaMasAlta = etiquetas;
        }
        arbol = sc.nextInt();
        System.out.println("el arbol "+ etiquetaMasAlta + " mas alto mide " + numero_alto + " centimetros");
    }

}
}
/**3.4: Un centro de investigación de la flora urbana necesita una aplicación que muestre cuál es
 el árbol más alto. Para ello se introducirá por teclado la altura (en centímetros) de cada
 árbol (terminando la introducción de datos cuando se utilice -1 como altura). Los árboles
 se identifican mediante etiquetas con números únicos correlativos, comenzando en O. Di
 señar una aplicación que resuelva el problema planteado.**/