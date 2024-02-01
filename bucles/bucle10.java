package bucles;
import java.util.Scanner;
public class bucle10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la amplitud del cuadrado: ");
        int amplitud = scanner.nextInt();

        if (amplitud > 0) {
            for (int i = 0; i < amplitud; i++) {
                for (int j = 0; j < amplitud; j++) {
                    if (i == 0 || i == amplitud - 1 || j == 0 || j == amplitud - 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("La amplitud debe ser un número positivo.");
        }

        scanner.close();
    }
}
