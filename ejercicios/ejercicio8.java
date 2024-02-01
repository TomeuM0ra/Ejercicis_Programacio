package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner num= new Scanner(System.in);

        System.out.println("Cuantas unidades tienes : ");
        int unidades = num.nextInt();

        int docenas = unidades / 12 ;
        int docena1 = docenas * 12 ;
        int restantes = unidades - docena1 ;
        System.out.println("Tienes " + docenas + " docenas" + " Te sobran " + restantes + " unidades restantes");
    }
}
