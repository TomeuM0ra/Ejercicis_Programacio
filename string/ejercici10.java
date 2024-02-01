package string;

public class ejercici10 {
    public static void main(String[] args) {
        String text = "Mary had a little lamb,\n little lamb,\n little lamb,\n Mary had a little lamb that was as white as snow";
        String paraulaAEliminar = "little";

        String textModificat = text.replace(paraulaAEliminar, "");

        System.out.println(textModificat);
    }
}
