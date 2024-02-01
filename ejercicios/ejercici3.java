package ejercicios;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class ejercici3 {
    public static void main(String[] args) {
        Scanner num= new Scanner(System.in);

        System.out.println("Escribe el primer numero = ");
        double numero1 = num.nextDouble();

        System.out.println("Escriba el segundo numero = ");
        int numero2 = num.nextInt();

        double division= numero1 / numero2 ;

        System.out.println("La division dona = " + division);
    }
}
