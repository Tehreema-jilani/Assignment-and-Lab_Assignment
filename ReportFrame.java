 package tms.gui;

import javax.swing.*;

public class ReportFrame extends JFrame {
    public ReportFrame() {
        setTitle("Generate Financial Report");
        setSize(300, 200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        JTextArea resultArea = new JTextArea("Sample Report:\nTotal Collected: Rs 15,000\n");
        add(new JScrollPane(resultArea));
    }
}
