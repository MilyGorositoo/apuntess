public class ejerciciosLogicos {
    public static void main(String[] args) {
//  Realizar un programa que permita el intercambio de valores entre
//  dos vaariables. Por ejemplo: si una variable numero vale 35 y una variable numero2 vale 20
//  realizar las acciones necesarias para que numero pase a valer 20 y el numero2 pase a valer 35.
//  una vez realizado el cambio, mostrar el resultado por pantalla.

        int num1 = 35;
        int num2 = 20;
        int aux;
        System.out.println(" ------ Antes ------");
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);

        aux = num2;
        num2 = num1;
        num1 = aux;

        System.out.println(" ------ Despues ------");
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);



        }
    }

