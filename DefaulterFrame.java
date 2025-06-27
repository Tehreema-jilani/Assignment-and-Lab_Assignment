 package tms.gui;

import javax.swing.*;

public class DefaulterFrame extends JFrame {
    public DefaulterFrame() {
        setTitle("Track Defaulters");
        setSize(300, 200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        JTextArea resultArea = new JTextArea("Sample: Defaulter: Ali, Fare: 1000\n");
        add(new JScrollPane(resultArea));
    }
}
