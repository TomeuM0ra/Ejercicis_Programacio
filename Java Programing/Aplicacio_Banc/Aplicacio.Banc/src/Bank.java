import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    private static Acount activeAcount;
    private static int accountClient;
    private static ArrayList<Client> clients = new ArrayList<Client>();
    private static ArrayList<Acount> acounts = new ArrayList<Acount>();
    private static Scanner scan = new Scanner(System.in);
    private static double balance = 0.0;
    private static void menu() {
        String exit = "False";
        do {
            System.out.println("1. Create Client");
            System.out.println("2. Create Acount");
            System.out.println("3. Manage Acount");
            System.out.println("4. Exit");

            System.out.println("Select an option: ");
            int opcion = scan.nextInt();
            scan.nextLine();
            switch (opcion){
                case 1:
                    createClient();
                    break;
                case 2:
                    createAcount();
                    break;
                case 3:
                    if (acounts.isEmpty()){

                        System.out.println("Create an acount first");
                    }else{
                        triarCmpte();
                        menuManageAcount();}
                    break;
                case 4:
                    exit = "True";
            }
        } while (exit.equals("False"));
    }
    private static void menuManageAcount(){
     String back = "False";
     do {
         System.out.println("1. Deposit ");
         System.out.println("2. Withdraw");
         System.out.println("3. Acount Maintenance");
         System.out.println("4. Back to Main Menu ");

         System.out.println("Select your optyion: ");

         int option = scan.nextInt();
         scan.nextLine();
         switch (option){
             case 1:
                 depositMoneyAcount();
                 break;
             case 2:
                 withdrawMoneyAcount();
                 break;
             case 3:
                 accountMaintenace();
                 break;
             case 4:
                 back = "True";
         }
     }while (back.equals("False"));
    }
    private static void createClient(){

//        System.out.print("Ingresi el nom del client: ");
//        String nom = scan.nextLine();
//        System.out.print("Ingresi el 1r llinatge: ");
//        String lastName = scan.nextLine();
//        System.out.print("Ingresi la adressa : ");
//        String adrress = scan.nextLine();
//        System.out.print("Ingresi la ciutat: ");
//        String city = scan.nextLine();
//        System.out.println("Ingresi la data naixament: ");
//        LocalDate date = LocalDate.parse(scan.nextLine());
        String nom = "Pep";
        String lastName = "Locutor";
        String adrress ="C/ Major";
        String city = "Mallorca";
        LocalDate date = LocalDate.parse("2000-11-22");
        clients.add(new Client(nom,lastName,adrress,city,date));
    }
    private static void createAcount(){
        if (clients.isEmpty()){
            System.out.println("First insert a client");
        } else {
            System.out.println("You have clients select one (name)");
            for (int i = 0; i < clients.size(); i++) {
                System.out.println(i + " "+ clients.get(i).fulName());
            }
            Client client = scan.nextLine();
            acounts.add(new Acount(client , balance));
        }
    }
    private static void accountMaintenace(){

    }
    private static void depositMoneyAcount(){

    }
    private static void withdrawMoneyAcount(){

    }
    private static void triarCmpte(){
        for (int i = 0; i < acounts.size(); i++) {
            System.out.println(i + " "+ acounts.get(i).viewAcount());
        }
        System.out.println("Select an acount: ");
        int selecio = scan.nextInt();
        scan.nextLine();
        activeAcount = cercarCompte(selecio);
    }
    private static Acount cercarCompte(int numcompte){
        Acount acount = null;
        for (int i = 0; i < acounts.size(); i++) {
            if (numcompte == acounts.get(i).getAcountNumber()) {
                acount = acounts.get(i);
                break;
            }
        }
        return acount;
    }
    public static void main(String[] args) {
       // triarCmpte();
        menu();
    }

}