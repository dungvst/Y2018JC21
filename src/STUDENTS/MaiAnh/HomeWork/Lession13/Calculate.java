package STUDENTS.MaiAnh.HomeWork.Lession13;

import sun.misc.FormattedFloatingDecimal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.Normalizer;
import java.util.Scanner;

public class Calculate extends JFrame{
    private JPanel Jp1;
    private JTextField textField1;
    private JTextField textField2;
    private JComboBox comboBox1;
    private JList list1;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JButton button1;

    private int a;
    private int b;
    private double result;


    public Calculate() {

        final DefaultComboBoxModel items = new DefaultComboBoxModel();
        comboBox1.addItem("Addition");
        comboBox1.addItem("Subtraction");
        comboBox1.addItem("Multiplication");
        comboBox1.addItem("Division");


        DefaultListModel model = new DefaultListModel();
        list1.setModel(model);




        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    setA(Integer.parseInt(textField1.getText()));
                    setB(Integer.parseInt(textField2.getText()));


                    if (comboBox1.getSelectedItem().equals("Addition")) {
                        setResult(a + b);
                        model.addElement("\t a + b = " + result);
                    } else if (comboBox1.getSelectedItem().equals("Subtraction")) {
                        setResult(a - b);
                        model.addElement("\t a - b = " + result);
                    } else if (comboBox1.getSelectedItem().equals("Multiplication")) {
                        setResult(a * b);
                        model.addElement("\t a x b = " + result);
                    } else {
                        try {
                            double x = (double) a;
                            double y = (double) b;
                            setResult(a / b);
                            model.addElement("\t a : b = " + result);
                        } catch (ArithmeticException ee) {
                            ee.printStackTrace();
                            model.addElement("Input is not available");
                        }
                    }
                } catch (NumberFormatException ee) {
                    ee.printStackTrace();
                    model.addElement("Input is not available");
                }
            }
        });
    }

    // setter and getter
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculate");
        frame.setContentPane(new Calculate().Jp1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
