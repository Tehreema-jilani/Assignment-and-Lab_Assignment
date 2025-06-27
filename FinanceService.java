 package tms.service;

import java.util.List;
import tms.dao.TransactionDAO;
import tms.model.Transaction;

public class FinanceService {
    private TransactionDAO transactionDAO = new TransactionDAO();

    public void recordTransaction(String id, String type, double amount, String date) {
        Transaction transaction = new Transaction(id, type, amount, date);
        transactionDAO.addTransaction(transaction);
    }

    public List<Transaction> viewAllTransactions() {
        return transactionDAO.getAllTransactions();
    }

    public List<Transaction> getTransactionsByType(String type) {
        return transactionDAO.getTransactionsByType(type);
    }
}
