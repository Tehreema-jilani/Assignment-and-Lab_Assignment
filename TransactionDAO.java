 package tms.dao;

import java.util.ArrayList;
import java.util.List;
import tms.model.Transaction;

public class TransactionDAO {
    private List<Transaction> transactions = new ArrayList<>();

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public List<Transaction> getAllTransactions() {
        return transactions;
    }

    public List<Transaction> getTransactionsByType(String type) {
        List<Transaction> result = new ArrayList<>();
        for (Transaction t : transactions) {
            if (t.getType().equalsIgnoreCase(type)) {
                result.add(t);
            }
        }
        return result;
    }
}
