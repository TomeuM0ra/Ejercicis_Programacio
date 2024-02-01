package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner num= new Scanner(System.in);

        System.out.println("Cuantos quarters tienes  : ");
        int quarter = num.nextInt();

        System.out.println("Cuantos dimes tienes : ");
        int dime = num.nextInt();

        System.out.println("Cuantos nickels tienes : ");
        int nickel = num.nextInt();

        System.out.println("Cuantos pennys tienes : ");
        int penny = num.nextInt();

        double suma = (quarter * 0.25) + (dime * 0.10) + (nickel * 0.05) + (penny * 0.01);

        System.out.printf("Tienes un total de : %.2f%n", suma );
    }
}
