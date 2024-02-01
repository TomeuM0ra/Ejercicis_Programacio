package string;

import java.util.Random;
import java.util.Scanner;

public class joc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rounds = 3;

        System.out.println("Benvingut al joc de Pedra, Paper, Tisores!");

        for (int i = 0; i < rounds; i++) {
            String eleccioJugador = eleccioJugador(scanner);
            String eleccioComputadora = eleccioComputadora();
            determinarGuanyador(eleccioJugador, eleccioComputadora);
        }

        System.out.println("Gràcies per jugar!");
    }

    public static String eleccioJugador(Scanner scanner) {
        String eleccio;
        do {
            System.out.print("Tria 'pedra', 'paper' o 'tisores': ");
            eleccio = scanner.nextLine().toLowerCase();
        } while (!eleccio.equals("pedra") && !eleccio.equals("paper") && !eleccio.equals("tisores"));
        return eleccio;
    }

    public static String eleccioComputadora() {
        String[] opcions = {"pedra", "paper", "tisores"};
        Random random = new Random();
        int index = random.nextInt(opcions.length);
        String eleccio = opcions[index];
        System.out.println("La computadora ha triat: " + eleccio);
        return eleccio;
    }

    public static void determinarGuanyador(String eleccioJugador, String eleccioComputadora) {
        if (eleccioJugador.equals(eleccioComputadora)) {
            System.out.println("Empat!");
        } else if ((eleccioJugador.equals("pedra") && eleccioComputadora.equals("tisores")) ||
                (eleccioJugador.equals("paper") && eleccioComputadora.equals("pedra")) ||
                (eleccioJugador.equals("tisores") && eleccioComputadora.equals("paper"))) {
            System.out.println("Has guanyat!");
        } else {
            System.out.println("La computadora guanya!");
        }
    }
}
