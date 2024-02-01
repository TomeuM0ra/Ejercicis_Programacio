package string;

public class ejercici7 {
    public static void main(String[] args) {
        String cadena = "Mary had a little lamb";
        char lletraABuscar = 'a';

        int primeraPosicio = cadena.indexOf(lletraABuscar);

        if (primeraPosicio != -1) {
            int segonaPosicio = cadena.indexOf(lletraABuscar, primeraPosicio + 1);

            if (segonaPosicio != -1) {
                System.out.println("La posició de la segona lletra '" + lletraABuscar + "' és: " + segonaPosicio);
            } else {
                System.out.println("No hi ha una segona aparició de la lletra '" + lletraABuscar + "' en la cadena.");
            }
        } else {
            System.out.println("La lletra '" + lletraABuscar + "' no es troba en la cadena.");
        }
    }
}
