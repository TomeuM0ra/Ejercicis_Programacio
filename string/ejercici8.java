package string;

public class ejercici8 {
    public static void main(String[] args) {
        String text = "Mary had a little lamb,\n little lamb,\n little lamb,\n Mary had a little lamb that was as white as snow";
        String paraulaABuscar = "little";

        int ultimaPosicio = text.lastIndexOf(paraulaABuscar);

        if (ultimaPosicio != -1) {
            System.out.println("La posició de l'última aparició de la paraula '" + paraulaABuscar + "' és: " + ultimaPosicio);
        } else {
            System.out.println("La paraula '" + paraulaABuscar + "' no es troba en el text.");
        }
    }
}

