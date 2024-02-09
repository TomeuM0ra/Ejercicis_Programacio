public class Acount {
    private int acountNumber;
    private double balance;
    private Client client;
    public Acount(Client client, double balance) {
        this.client = client;
        this.balance = balance;

    }

    public int getAcountNumber() {
        return this.acountNumber;
    }

    public void setAcountNumber(int acountNumber) {
        this.acountNumber = acountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void depositMoney(double Money){
        this.balance = this.balance + Money;
        System.out.println("Deposito exitoso");
    }
    public void withdrawMoney(double Money){
        this.balance = this.balance -= Money;
        System.out.println("Retiro exitoso");
    }

    public String viewAcount(){
        String acountDatta =
                "Client Name "+ this.client+ " " + "Total Balance "+ this.balance;
        return acountDatta;
    }
}
