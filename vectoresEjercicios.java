
/* Realizar un programa que permita cargar 15 numeros en un vector. Una vez cargados , se necesita que el programa cuente
e informe por pantalla cuantas veces se cargo el numero 3 */

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class vectoresEjercicios {
    public static void main(String[] args) {
        int vector[] = new int[15];
        Scanner teclado = new Scanner(System.in);

        //Cargar nuestro vector
        for (int i = 0; i < 15; i++) {
            System.out.println("Ingrese un numero para el vector");
            vector[i] = teclado.nextInt();
        }
        //Recorrer y contar cuantos num,eros 3 hay
        int cont = 0;
        for (int i = 0; i < 15; i++) {
            if (vector[i] == 3) {
                cont = cont + 1;

            }
        }
        System.out.println("La cantidad de numeros 3 que hay en el vector es: " + cont);


    }

    }

