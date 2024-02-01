package bucles;
import java.util.Scanner;

public class bucle14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la altura del triángulo: ");
        int altura = scanner.nextInt();

        if (altura > 0) {
            for (int i = 1; i <= altura; i++) {

                for (int j = altura - i; j > 0; j--) {
                    System.out.print(" ");
                }

                for (int k = 1; k <= 2 * i - 1; k++) {
                    if (k == 1 || k == 2 * i - 1 || i == altura) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }

                System.out.println();
            }
        } else {
            System.out.println("La altura del triángulo debe ser un número positivo.");
        }

        scanner.close();
    }
}
