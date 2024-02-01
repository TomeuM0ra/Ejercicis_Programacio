package string;

public class ejercici6 {
    public static void main(String[] args) {
        String cadena = "Mary had a little lamb";
        char lletraABuscar = 'i';

        int posicio = cadena.indexOf(lletraABuscar);

        if (posicio != -1) {
            System.out.println("La posició de la lletra '" + lletraABuscar + "' és: " + posicio);
        } else {
            System.out.println("La lletra '" + lletraABuscar + "' no es troba en la cadena.");
        }
    }
}

