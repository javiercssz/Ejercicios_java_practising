import java.util.Scanner;

public class Analisis_de_datos {
    public static void main(String[] args) {

        String[] personas = {"javi","yousef","dani","salah","raul", "martin","harold","serra","javii","manu"};
        int[] paises = {3,3,3,4,7,2,3,9,5,2};
        String[] region ={"cartagena", "cartagena", "cartagena" , "murcia" , "cartagena","cartagena","cartagena","cartagena","murcia","murcia"};
        String[] franceses = {"si","no","no", "si", "no","no","no","no","si","no"};
        boolean duplicado = false;
        boolean alguna_vez_duplicado = false;
        int sumaPaises = 0;
        int mediapaises;

            for (int i = 0; i <= personas.length - 1; i++)
            {
                System.out.println("\n\n\n //INFORMACIÓN USUARIO// \n");
                System.out.println("Nombre: " + personas[i] + " \n ¿Cuantos paises has visitado? \n   " + paises[i] +
                        "  \n ¿Que es mejor cartagena o murcia?  \n  " + region[i] + " \n ¿Te gusta francia?\n   " + franceses[i]);
            }
        System.out.println("\n\n\n");
            for (int i = 0; i <= paises.length - 1; i++)
            {
                boolean impreso_antes = false;

                for(int j = i + 1; j <= paises.length -1; j++) {
                    if (paises[i] == paises[j]) {
                        duplicado = true;
                        alguna_vez_duplicado = true;
                    }
                    else {
                        duplicado = false;
                    }
                    break;
                }

                    if (duplicado) {
                        for (int k = 0; k < i; k++) {
                            if (paises[i] == paises[k]) {
                                impreso_antes = true;
                            }
                        }
                        if (!impreso_antes)
                        {
                            System.out.println("hay más de uno que ha visitado " + paises[i] +  " países \n ");
                        }

                    }

                sumaPaises += paises[i];
            }
            if(!alguna_vez_duplicado)
            {
                System.out.println("No hay números duplicados \n ");
            }
            mediapaises = sumaPaises / paises.length;

            System.out.println("La media de los paises es " + mediapaises + ".");

    }
}
/** Demografía
 *
 * ¿Cuantos paises visita la gente de media?
 * ARRAY 1: personas almacenadas
 * ARRAY 2: ¿Cuantos paises has visitado?
 * ARRAY 3: ¿Que es mejor cartagena o murcia?
 * ARRAY 4: ¿Te gusta francia?**/
