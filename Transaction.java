 package tms.model;

public class Transaction {
    private String transactionId;
    private String type; // Refund, Adjustment, etc.
    private double amount;
    private String date;

    public Transaction(String transactionId, String type, double amount, String date) {
        this.transactionId = transactionId;
        this.type = type;
        this.amount = amount;
        this.date = date;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public String getDate() {
        return date;
    }
}
