import java.util.Arrays;
public class Arrays_obligatorios {
    public static void main(String[] args) {
        ejercicio1();
        ejercicio2();
        ejercicio3();
    }

    public static void ejercicio1() {
        int[][] espiral =//Array en espiral de izquierda a derecha y abajo
                {{1,2,3},
                {4,5,6},
                {7,8,9}};
        int[] normal = new int[espiral.length * espiral[0].length];
        int restar_cada_4_bajo = 0; //Cada 4 giros se incrementa 1 el numero que hay que restarle al length para que haga una espiral
        int columnas = -1; // columna actual
        int filas = 0; //fila actual
        int contador = 0; //contador para saber cuando se acaba

        while (contador != espiral.length * espiral[0].length) {
            //de izquierda a derecha primera fila
            for (int i = columnas + 1; i < espiral[filas].length; i++) {
                if(contador == espiral.length * espiral[0].length)
                {
                    break;
                }
                columnas = i;  //actualizo la columna actual
                normal[contador] = espiral[filas][columnas];
                contador++;
            }
            //bajando por la ultima columna
            for (int i = filas + 1; i < espiral.length - restar_cada_4_bajo; i++) {
                if(contador == espiral.length * espiral[0].length)
                {
                    break;
                }
                filas = i;    //actualizo la fila actual
                normal[contador] = espiral[filas][columnas];
                contador++;
            }
            for (int i = columnas - 1; i >= restar_cada_4_bajo; i--) {
                if(contador == espiral.length * espiral[0].length)
                {
                    break;
                }
                columnas = i;
                normal[contador] = espiral[filas][columnas];
                contador++;
            }

            restar_cada_4_bajo += 1;

            for (int i = filas - 1; i >= restar_cada_4_bajo; i--) {
                if(contador == espiral.length * espiral[0].length)
                {
                    break;
                }
                filas = i;
                normal[contador] = espiral[filas][columnas];
                contador++;
            }
        }
        System.out.println(Arrays.toString(normal));
    }
    /**Ejercicio 2: Transformar Matriz en Cero
     Descripción: Dada una matriz bidimensional, si un elemento en la matriz es 0, transforma toda su fila y columna en ceros.


     Entrada
     int[][] numeros =
     { { 1, 2, 3 },
     { 4, 0, 6 },
     { 7, 8, 9 } };
     Salida

     int[][] numeros =
     { { 1, 0, 3 },
     { 0, 0, 0 },
     { 7, 0, 9 } };**/
    public static void ejercicio2() {
        int[][] array0 =
        {{1,2,3},
        {4,0,6},
        {7,8,9}};
        boolean fuera = false;

        for (int i = 0; i < array0.length; i++)
        {
            for (int j = 0; j < array0[i].length; j++)
            {
                if(array0[i][j] == 0)
                {
                    for (int k = 0; k < array0.length; k++)
                    {
                        array0[k][j] = 0;
                    }
                    for(int z = 0; z < array0[i].length; z++)
                    {
                        array0[i][z] = 0;
                        fuera = true;
                    }
                }
                if (fuera)
                {break;}
            }
            if (fuera)
            {break;}
        }
        System.out.println(Arrays.deepToString(array0));
    }
    /**Ejercicio 3: Ordenar según Frecuencia
     Descripción: Escribe un programa que ordene un array según la frecuencia de los elementos. Si dos elementos tienen la misma frecuencia, ordénalos en orden ascendente.

     Entrada:

     int[] arr = {4, 5, 6, 5, 4, 3}
     Salida:
     {4, 4, 5, 5, 3, 6}

     **/
    public static void ejercicio3() {
        int[] arr = {4, 5, 6, 5, 4, 3}; //Array inicial
        //int [] num_veces_repetido = new int[arr.length * 2]; //array para saber cuantas veces  se ha repetido cada numero
        int i = 0;
        int posicion = 0; // numero que hay en la posicion i del array
        int reseteo_i; //resetea la variable i
        int contador_num = 1; // cuantas veces se repite un numero
        int k = 0; // le suma dos a la posiciones del array num_veces_repetido para seguir metiendole numeros en las siguientes posiciones
        int restaurar_posicion = 0; //sirve para que la variable posicion vuelva a estar igual que antes cuando es modificada
        boolean se_repite = false; //para saber si un numero en el array ya lo hemos guardo o no.
        boolean duplicado = false; // para saber si un numero esta duplicado en el array.
        int no_duplicado_contador = 0; // para saber la cantidad de numeros no estan duplicados en el array
        int [] arraydefinitivo = new int[arr.length]; //Array que se va a imprimir al final
        
//PD:  COMPROBAR LA CANTIDAD DE NUMEROS QUE HAY SIN CONTAR LAS REPETICIONES:
// LA UNICA MANERA DE HACERLO CON LO QUE HEMOS DADO ES ORDENAR EL ARRAY Y CONTAR LOS CAMBIOS DE NUMERO.

        //este for te dice si un numero esta duplicado o no para conseguir la longitud del array doble
        // (longitud del array sin contar los duplicados)
        for (int c = 0; c < arr.length; c++)
        {
           for (int a = c + 1; a < arr.length; a++)
            {
                if (arr[a] == arr[c])
                {
                    se_repite = true;
                }
            }
        }
        int[][] num_veces_repetido = new int[2][no_duplicado_contador]; //Array doble para poner los numeros(fila 0)
        // y las veces que estan reptidos(fila 1)

        while(i < arr.length)
        {
            reseteo_i = i;
            posicion = arr[i];
          // restaurar_posicion = posicion;
            //esto es un contador que cuenta la cantidad de veces que esta repetido un numero del array
            while(i + 1 < arr.length)
            {
                if (arr[i + 1] == posicion)
                {
                    contador_num++;

                }
                i++;
            }
            i = reseteo_i;

            //este while comprueba que el numero que vamos a poner en el array no este ya puesto
            while(reseteo_i > 0)
            {
                if(arr[reseteo_i - 1] == posicion)
                {
                    se_repite = true;
                }
                reseteo_i--;
            }
            if(!se_repite)
            {
                num_veces_repetido[0][i] = posicion;
                num_veces_repetido[1][i] = contador_num;
            }


            se_repite = false;
            contador_num = 1;
            i++;

       // System.out.println(Arrays.toString(num_veces_repetido));

       /** for(int a = 0; i < num_veces_repetido.length; a+=2)
        {
            for(int b = 0; b < num_veces_repetido[a + 1]; b++)
            {
                arraydefinitivo[b] = arr[b];
            }
        //si no esta puesto lo pone y avanza la k(posicion del array) a los espacios vacios
        if (!se_repite)
        {
        num_veces_repetido[k] = posicion;
        num_veces_repetido[k + 1] = contador_num;
        k += 2;
        }**/
    }
}
}
/**        Arrays.sort(arr);
 *         System.out.println(Arrays.toString(arr));**/