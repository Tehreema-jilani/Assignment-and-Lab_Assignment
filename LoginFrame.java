package tms.gui;

import javax.swing.*;

public class LoginFrame extends JFrame {
    public LoginFrame() {
        setTitle("Finance Officer Login");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(30, 30, 80, 25);
        add(userLabel);

        JTextField userField = new JTextField();
        userField.setBounds(120, 30, 130, 25);
        add(userField);

        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(30, 70, 80, 25);
        add(passLabel);

        JPasswordField passField = new JPasswordField();
        passField.setBounds(120, 70, 130, 25);
        add(passField);

        JButton loginBtn = new JButton("Login");
        loginBtn.setBounds(100, 110, 80, 25);
        add(loginBtn);

        loginBtn.addActionListener(e -> {
            String user = userField.getText();
            String pass = new String(passField.getPassword());

            if (user.equals("admin") && pass.equals("1234")) {
                new FinanceDashboard().setVisible(true);
                dispose(); // close login window
            } else {
                JOptionPane.showMessageDialog(this, "Invalid credentials!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
    }
}
