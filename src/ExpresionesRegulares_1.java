import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpresionesRegulares_1 {
    public static void main(String[] args){
        //ejercicio1();
        //ejercicio2();
        ejercicio3();
        ejercicio4();
    }
    /*Ejercicio 1: Extracción de Números de un Texto
Enunciado:
Desarrolla un programa en Java que reciba una cadena de texto y extraiga todos los números enteros que contenga. Utiliza el método find() del objeto Matcher para localizar cada ocurrencia.

Puntos a considerar:

Imprime cada número encontrado junto con su posición de inicio y fin dentro del texto.
Asegúrate de que se detecten números que estén aislados o incrustados en medio de otras letras.
*/
    public static void ejercicio1(){
        System.out.println("numeros para buscar");

        Scanner sc = new Scanner(System.in);
        String numeros = sc.nextLine();

        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(numeros);

        while(matcher.find())
        {
            System.out.println(matcher.group());
        }
    }
    /*Ejercicio 2: Validación de Contraseñas Seguras
Enunciado:
Implementa un programa en Java que verifique si una contraseña cumple con los siguientes requisitos de seguridad mediante expresiones regulares:

Longitud entre 8 y 20 caracteres.
Al menos una letra mayúscula.
Al menos una letra minúscula.
Al menos un dígito.
Al menos un carácter especial (por ejemplo: @, #, $, %, &, etc.).
Recomiendo el uso de esta expresión regular: ?=.* [(lo queremos verificar que este una vez)] para hacer una búsqueda de la condición en cualquier posición de la cadena de texto.
Requisitos adicionales:

Solicita la contraseña al usuario y muestra un mensaje indicando si la contraseña es segura o en qué aspecto(s) falla.

*/
    public static void ejercicio2(){
        System.out.println("Escriba su contraseña");

        Scanner sc = new Scanner(System.in);
        String contraseña = sc.nextLine();


        boolean minuscula = contraseña.matches(".*[a-z].*");
        boolean mayuscula = contraseña.matches(".*[A-Z].*");
        boolean numero = contraseña.matches(".*\\d.*");
        boolean caracterEspecial = contraseña.matches(".*[@#$%^&+=!?.*].*");
        boolean rango = contraseña.length() >= 8 && contraseña.length() <= 20;

        if(minuscula && mayuscula && numero && caracterEspecial && rango)
        {
            System.out.println("La contraseña es segura");
        } else {

            if (!minuscula) {
                System.out.println("Pon alguna minuscula");
            }
            if (!mayuscula) {
                System.out.println("Pon alguna mayuscula");
            }
            if (!numero) {
                System.out.println("Pon alguna numero");
            }
            if (!rango) {
                System.out.println("Esta fuera del rango de caracteres permitido 8-20");
            }
            if (!caracterEspecial) {
                System.out.println("pon algun caracter especial");
            }
        }


    }
    /*Ejercicio 3: Reemplazo de Fechas en Formato
Enunciado:

Crea un programa en Java que, dado un texto que contenga fechas en formato "YYYY-MM-DD", utilice expresiones regulares para localizarlas y convertirlas al formato "DD/MM/YYYY".

Instrucciones:

Utiliza grupos en la expresión regular para capturar el año, mes y día.
Emplea los métodos appendReplacement() y appendTail() del objeto Matcher para construir el nuevo texto con las fechas convertidas.
Muestra en consola el texto original y el resultado tras la transformación.
*/
    public static void ejercicio3(){

    }
    /*
Ejercicio 4: Validación y Extracción de URLs
Enunciado:
Desarrolla un programa en Java que solicite al usuario una dirección URL y verifique si es válida utilizando expresiones regulares. La URL deberá cumplir con los siguientes criterios:

Debe comenzar con http:// o https://.
Puede incluir opcionalmente subdominios (como www. o cualquier otro).
Debe contener un dominio principal seguido de una extensión (por ejemplo, .com, .org, .net, etc.).
Opcionalmente puede incluir una ruta, parámetros de consulta o fragmentos.
Requisitos adicionales:

Si la URL es válida, el programa debe extraer e imprimir por separado el dominio principal y la extensión usando grupos de captura.
Si la URL no cumple con el formato esperado, se debe mostrar un mensaje indicando que la URL es inválida.
*/
    public static void ejercicio4(){

    }
}

