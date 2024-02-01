package string;

public class ejercici13 {
    public static void main(String[] args) {
        String cadena = ">>>>>>com estàs?<<<<<<";

        String cadenaNeta = cadena.replace(">>>>>>", "").replace("<<<<<<", "");

        System.out.println("Cadena sense caràcters extres: " + cadenaNeta);
    }
}
