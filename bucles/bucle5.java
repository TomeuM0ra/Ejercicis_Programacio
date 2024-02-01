package bucles;
import java.util.Scanner;
public class bucle5 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introduce un número para calcular su factorial (numero maximo 12(sino peta)): ");
            long numero = scanner.nextLong();
            int factorial = 1;
            int i = 1;
            if (numero < 0) {
                System.out.println("No se puede calcular el factorial de un número negativo.");
            } else {

                do {
                    factorial *= i;
                    i++;
                } while (i <= numero);

                System.out.println("El factorial de " + numero + " es " + factorial);
            }

            scanner.close();
        }
    }


