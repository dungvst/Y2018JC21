package DEMO.swing.first_demo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DragAndDrop {
    private JButton btnTest;
    private JPanel panel1;
    private JButton button2;

    public DragAndDrop() {
        super();
        btnTest.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"This is a message");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("DragAndDrop");
        frame.setContentPane(new DragAndDrop().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
