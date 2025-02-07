import java.util.Arrays;
public class Arrays_obligatorios
{

    public static void main(String[] args)
    {
        // ejercicio1();
        // ejercicio2();
        ejercicio3();
    }

    public static void ejercicio1()
    {
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
        int[] arr_copia = Arrays.copyOf(arr, arr.length); // copia array inicial
        int i = 0;
        int posicion = 0; // numero que hay en la posicion i del array
        int reseteo_i; //resetea la variable i
        int num_sin_repetir_contador = 1; //cuantos numeros hay en total sin contar las repeticiones
        int contador_num = 1; // cuantas veces se repite un numero
        int contador2 = 0;
        int recorrer_array_nivel_2_contador = 0; // contador para recorrer el array de nivel dos
        boolean se_repite = false; //para saber si un numero en el array ya lo hemos guardo o no.
        int [] arraydefinitivo = new int[arr.length]; //Array que se va a imprimir al final

        // Comprueba cuantos numeros hay sin contar las repeticiones
        Arrays.sort(arr_copia);
        for(int z = 1; z < arr_copia.length; z++)
        {
            if(arr_copia[z - 1] != arr_copia[z])
            {
                num_sin_repetir_contador++;
            }
        }

        int[][] num_veces_repetido = new int[2][num_sin_repetir_contador]; //Array doble para poner
        // los numeros(fila 0)// y las veces que estan reptidos(fila 1)

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
                    num_veces_repetido[0][recorrer_array_nivel_2_contador] = posicion;
                    num_veces_repetido[1][recorrer_array_nivel_2_contador] = contador_num;

                    recorrer_array_nivel_2_contador++;
            }

            se_repite = false;
            contador_num = 1;
            i++;
    }
        //recorre y encuentra cual es el numero del array que tiene mas frecuencia y los ordena por frecuencia
        // de mayor a menor y ordena a los numeros de la misma frecuencia de menor a mayor.

            for (int z = 0; z < num_veces_repetido[0].length; z++) {
                for (int x = 0; x < num_veces_repetido[0].length - 1; x++) {
                    int copiar1;
                    int copiar2;

                        if ((num_veces_repetido[1][x + 1] == num_veces_repetido[1][x] && num_veces_repetido[0][x + 1] < num_veces_repetido[0][x]) || num_veces_repetido[1][x + 1] > num_veces_repetido[1][x]) {
                            copiar1 = num_veces_repetido[0][x + 1];
                            copiar2 = num_veces_repetido[0][x];
                            num_veces_repetido[0][x + 1] = copiar2;
                            num_veces_repetido[0][x] = copiar1;

                            copiar1 = num_veces_repetido[1][x + 1];
                            copiar2 = num_veces_repetido[1][x];
                            num_veces_repetido[1][x + 1] = copiar2;
                            num_veces_repetido[1][x] = copiar1;
                        }
                    }
            }
            int contador = 0;
            int copiarContador = 0;

            /*escribe los numeros el numero de veces que hay
             que escribirlos segun su frecuencia en el array definitivo*/
            for(int z = 0; z < arraydefinitivo.length; z++)
            {
                int frecuencia = num_veces_repetido[1][z];

                for (int x = 0; x < frecuencia; x++)
                {
                    arraydefinitivo[contador] = num_veces_repetido[0][z];
                    contador++;
                    copiarContador = contador;
                }
                contador = copiarContador;
            }
        System.out.println(Arrays.toString(arraydefinitivo));
    }
}