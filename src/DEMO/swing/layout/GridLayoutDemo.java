package DEMO.swing.layout;

import javax.swing.*;
import java.awt.*;

public class GridLayoutDemo extends JFrame {
    JPanel jp = new JPanel();

    JButton b1 = new JButton("1");
    JButton b2 = new JButton("2");
    JButton b3 = new JButton("3");
    JButton b4 = new JButton("4");
    JButton b5 = new JButton("5");
    JButton b6 = new JButton("6");
    JButton b7 = new JButton("7");
    JButton b8 = new JButton("8");
    JButton b9 = new JButton("9");

    public GridLayoutDemo(String title) {

        super(title);

        jp.setLayout(new GridLayout(3, 3));

        jp.add(b1,0);
        jp.add(b3, 2);
        jp.add(b2);
        jp.add(b4);
        jp.add(b5);
        jp.add(b6);
        jp.add(b7);
        jp.add(b8);
        jp.add(b9);

        Container ctn = getContentPane();
        ctn.add(jp);
    }
}
