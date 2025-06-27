 package tms.gui;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import tms.model.Transaction;
import tms.service.FinanceService;

public class FinanceDashboard extends JFrame {
    private FinanceService financeService = new FinanceService();

    public FinanceDashboard() {
        setTitle("Finance Dashboard");
        setSize(500, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Existing buttons
        JButton viewBtn = new JButton("View All Transactions");
        JButton addBtn = new JButton("Add Transaction");

        // New buttons
        JButton defaulterBtn = new JButton("Track Defaulters");
        JButton reportBtn = new JButton("Generate Reports");
        JButton refundBtn = new JButton("Refund/Adjustment");

        // Add Transaction
        addBtn.addActionListener(e -> {
            financeService.recordTransaction("T001", "Refund", 1000.0, "2025-06-27");
            JOptionPane.showMessageDialog(this, "Transaction Added");
        });

        // View Transactions
        viewBtn.addActionListener(e -> {
            List<Transaction> list = financeService.viewAllTransactions();
            StringBuilder sb = new StringBuilder();
            for (Transaction t : list) {
                sb.append(t.getTransactionId())
                  .append(" - ").append(t.getType())
                  .append(" - ").append(t.getAmount())
                  .append(" - ").append(t.getDate())
                  .append("\n");
            }
            JOptionPane.showMessageDialog(this, sb.toString(), "Transactions", JOptionPane.INFORMATION_MESSAGE);
        });

        // New Use Case Handlers
        defaulterBtn.addActionListener(e -> new DefaulterFrame().setVisible(true));
        reportBtn.addActionListener(e -> new ReportFrame().setVisible(true));
        refundBtn.addActionListener(e -> new RefundFrame().setVisible(true));

        // Add buttons to frame
        add(addBtn);
        add(viewBtn);
        add(defaulterBtn);
        add(reportBtn);
        add(refundBtn);

        setVisible(true);
    }
}
