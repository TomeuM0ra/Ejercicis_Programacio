package bucles;
import java.util.Scanner;
public class bucle12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el ancho del rectángulo: ");
        int ancho = scanner.nextInt();

        System.out.print("Introduce la altura del rectángulo: ");
        int altura = scanner.nextInt();

        if (ancho > 0 && altura > 0) {
            for (int i = 0; i < altura; i++) {
                for (int j = 0; j < ancho; j++) {
                    if (i == 0 || i == altura - 1 || j == 0 || j == ancho - 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("El ancho y la altura deben ser números positivos.");
        }

        scanner.close();
    }
}
