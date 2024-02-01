package string;

import java.util.Scanner;

public class ejercici5 {
    public static void main(String[] args) {
        Scanner num= new Scanner(System.in);

        System.out.print("Escribe los grados centigrados = ");
        String cadena = num.nextLine();


        int longitud = cadena.length();

        System.out.println("La longitud de la cadena és: " + longitud);
    }
}
