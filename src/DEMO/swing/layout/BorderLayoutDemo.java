package DEMO.swing.layout;
import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.*;

public class BorderLayoutDemo extends JFrame {
    JPanel jp = new JPanel();
    JButton btnNorth = new JButton("NORTH");
    JButton btnWest = new JButton("WEST");
    JButton btnEast = new JButton("EAST");
    JButton btnSouth = new JButton("SOUTH");
    JButton btnCenter = new JButton("CENTER");

    public BorderLayoutDemo(String title) {
        super(title);
        jp.setLayout(new BorderLayout());
        jp.add(btnNorth, BorderLayout.NORTH);
        jp.add(btnWest, BorderLayout.WEST);
        jp.add(btnEast, BorderLayout.EAST);
        jp.add(btnCenter, BorderLayout.CENTER);
        jp.add(btnSouth, BorderLayout.SOUTH);
        Container ctn = getContentPane();
        ctn.add(jp);
    }
}
