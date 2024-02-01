package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner num= new Scanner(System.in);

        System.out.println("Escribe los grados centigrados = ");
        double Centigrados = num.nextDouble();

        double formula = ( Centigrados * 9 / 5 + 32 );

        System.out.printf("Ferenjains = %.4f%n", formula);
    }
}
