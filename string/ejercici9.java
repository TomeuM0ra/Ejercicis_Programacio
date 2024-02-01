package string;

public class ejercici9 {
    public static void main(String[] args) {
        String text = "Mary had a little lamb,\n little lamb,\n little lamb,\n Mary had a little lamb that was as white as snow";
        String paraulaAReemplaçar = "little";
        String reemplaçament = "big big";

        String textModificat = text.replace(paraulaAReemplaçar, reemplaçament);

        System.out.println(textModificat);
    }
}
