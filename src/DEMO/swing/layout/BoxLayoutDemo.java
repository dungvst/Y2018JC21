package DEMO.swing.layout;

import javax.swing.*;
import java.awt.*;

public class BoxLayoutDemo extends JFrame {
    JPanel jp = new JPanel();
    JLabel label = new JLabel("BoxLayoutDemo Java Swing");
    JTextField txtf = new JTextField();
    JButton btn = new JButton("OK");

    public BoxLayoutDemo(String title) {
        super(title);
        jp.setLayout(new javax.swing.BoxLayout(jp, javax.swing.BoxLayout.Y_AXIS));
        // Y_AXIS sắp xếp theo chiều dọc
        // X_AXIS sắp xếp theo chiều ngang
        jp.add(label);
        jp.add(txtf);
        jp.add(btn);
        Container ctn = getContentPane();
        ctn.add(jp);
    }
}
