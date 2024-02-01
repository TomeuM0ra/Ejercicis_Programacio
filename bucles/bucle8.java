package bucles;

public class bucle8 {
    public static void main(String[] args) {
        for (int num = 1; num <= 50; num++) {
            if ( num %5 == 0){
                continue;
            }
            System.out.println(num);
        }
    }
}
