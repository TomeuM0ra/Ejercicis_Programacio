import java.time.LocalDateTime;

public class Transaction {
    private LocalDateTime dateTime;
    private TransactionType type;
    private double amount;
    private double finalBalance;

    public Transaction(LocalDateTime dateTime, TransactionType type, double amount, double finalBalance) {
        this.dateTime = dateTime;
        this.type = type;
        this.amount = amount;
        this.finalBalance = finalBalance;
    }
}
