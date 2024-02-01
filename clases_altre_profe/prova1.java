package clases_altre_profe;

import java.util.Arrays;
import java.util.Scanner;

public class prova1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("De que sitio eres : espanya o EEUU . Escribe igual : ");
        String nacionalidad = scanner.nextLine();
        System.out.print("Escribe tu edat : ");
        int edat = scanner.nextInt();

        if ((edat >=18 && nacionalidad.equals("espanya")) || ( edat >=21 && nacionalidad.equals("EEUU"))
        ){
            System.out.println("Ets major de edat ");
        } else {
            System.out.println("Ets menor de edat ");
        }
    }
}
