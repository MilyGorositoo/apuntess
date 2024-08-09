package operadorternario;

import java.util.Scanner;

public class operadorTernario {

    public static void main(String[] args) {

        double promedio;
        String condicionFinal;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el promedio general del alumno");
        promedio = scanner.nextDouble();

        condicionFinal = promedio >=6 ? "Aprobado" : "Desaprobado";
        System.out.println("La condicio´n final del alumno es: " + condicionFinal);



    }
}
