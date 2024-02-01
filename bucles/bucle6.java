package bucles;

public class bucle6 {
    public static void main(String[] args) {
        char letra = 'A';

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print("(" + letra + "," + j + ") ");
            }
            letra++;
            System.out.println();
        }
    }

}

