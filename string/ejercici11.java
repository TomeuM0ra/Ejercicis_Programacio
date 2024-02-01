package string;

public class ejercici11 {
    public static void main(String[] args) {
        String telefon = "111-222-3333";

        String indicatiu = telefon.substring(0, 3);

        String restaNumeros = telefon.substring(4);

        System.out.println("L'indicatiu de la zona és: " + indicatiu);
        System.out.println("La resta de números són: " + restaNumeros);
    }
}

