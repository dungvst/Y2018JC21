package DEMO.swing.first_demo;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

// Kế thừa ( extends ) Lớp JFrame của Java Swing
public class Manual extends JFrame {
    // Khai báo các Components của Chương trình
    JPanel jp = new JPanel();
    JLabel label = new JLabel("Java Swing example");
    JButton btn = new JButton("OK");

    // Viết hàm dựng để kết nối các Components vào Container
    public Manual(String title) {

        super(title);

        // Set Layout cho JPanel jp
        jp.setLayout(new FlowLayout());

        // Gắn các thành phần JButton btn, JLabel label vào JPanel pn
        jp.add(label);
        jp.add(btn);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"This is a message");
            }
        });

        // Khai báo 1 Container ctn và gắn JPanel pn vào.
        Container ctn = getContentPane();
        ctn.add(jp);
    }

    public static void main(String[] args) {
        Manual obj = new Manual("First Demo");
        obj.setSize(300, 100);
        obj.setVisible(true);//Hiển thị
        obj.setDefaultCloseOperation(EXIT_ON_CLOSE);// Click vào x để tắt.
    }

}
