package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner num= new Scanner(System.in);

        System.out.println("Escribe tu nombre   = ");
        String nombre = num.nextLine();

        System.out.println("Escribe tu altura minion = ");
        double altura = num.nextDouble();


        System.out.println("Escribe tu edat viejo = ");
        byte edat = num.nextByte();

        edat += 2;
        altura /= 2.0;
        System.out.println("Tu nombre es = " + nombre);
        System.out.println( "Tu altura es =" + altura + " Minion");
        System.out.println("Tu edat es  = " + edat);
    }
}
