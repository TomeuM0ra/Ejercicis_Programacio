package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner num= new Scanner(System.in);

        System.out.print("Escriba el valor de A  : ");
        int a = num.nextInt();

        System.out.print("Escriba el valor de B  : ");
        int b = num.nextInt();

        System.out.print("Escriba el valor de C  : ");
        int c = num.nextInt();

        System.out.print("Escriba el valor de X  : ");
        int x = num.nextInt();

        double ecuacion = ((a * x * x ) + (b * x) +c );

        System.out.print("La parabloa de Y es : " + ecuacion);
    }
}
