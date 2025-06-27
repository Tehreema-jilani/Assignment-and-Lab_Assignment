 package tms.gui;

import javax.swing.*;

public class RefundFrame extends JFrame {
    public RefundFrame() {
        setTitle("Refund / Adjustment");
        setSize(300, 200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(null);

        JLabel label = new JLabel("Enter Transaction ID:");
        label.setBounds(20, 30, 150, 25);
        add(label);

        JTextField field = new JTextField();
        field.setBounds(160, 30, 100, 25);
        add(field);

        JButton processBtn = new JButton("Process Refund");
        processBtn.setBounds(80, 80, 130, 30);
        add(processBtn);

        processBtn.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Refund processed for ID: " + field.getText());
        });
    }
}
