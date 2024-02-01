package clases_altre_profe;

public class a {
    public static void main(String[] args) {
        int zz = 5;
        switch (zz) {
            case 5:
                System.out.println("zz is equal to 5");
            case 6:
            case 7:
                System.out.println("zz is equal to 6 or 7");
// See that we can combine multiple cases in one block.
                break;
            default:
                System.out.println("Default covers anything not covered by a case!");
        }

    }
}
