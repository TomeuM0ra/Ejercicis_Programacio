package bucles;
import java.util.Scanner;

public class bucle11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el ancho del rectángulo: ");
        int ancho = scanner.nextInt();

        System.out.print("Introduce la altura del rectángulo: ");
        int altura = scanner.nextInt();

        if (ancho > 0 && altura > 0) {
            for (int i = 0; i < altura; i++) {
                for (int j = 0; j < ancho; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        } else {
            System.out.println("El ancho y la altura deben ser números positivos.");
        }

        scanner.close();
    }
}
