package DEMO.swing.layout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FlowLayoutDemo extends JFrame{
    private JButton button1;
    private JPanel panel1;
    private JButton button2;
    private JButton button3;
    private JButton button4;

    public FlowLayoutDemo(String title) {
        super(title);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "DungVST");
            }
        });

        Container container = getContentPane();
        container.add(panel1);
    }
}
