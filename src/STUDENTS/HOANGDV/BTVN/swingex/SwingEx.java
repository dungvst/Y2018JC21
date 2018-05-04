package STUDENTS.HOANGDV.BTVN.swingex;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingEx {
    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JComboBox comboBox1;
    private JButton okButton;
    private JLabel lb1;
    private JLabel lb2;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JTable table1;
    private int columsInt = 0;
    DefaultTableModel model ;

    public SwingEx() {
        init();
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num1 = textField1.getText();
                String num2 = textField2.getText();
                int type = comboBox1.getSelectedIndex();
                double result = 0;
                if (num1 == null || num2 == null) {
                    JOptionPane.showMessageDialog(null, "Input not Null");
                } else {
                    switch (type) {
                        case 0:
                            result = Double.parseDouble(num1) + Double.parseDouble(num2);
                            break;
                        case 1:
                            result = Double.parseDouble(num1) - Double.parseDouble(num2);
                            break;
                        case 2:
                            result = Double.parseDouble(num1) * Double.parseDouble(num2);
                            break;
                        case 3:
                            try {
                                result = Double.parseDouble(num1) / Double.parseDouble(num2);
                            } catch (Exception ex) {
                                JOptionPane.showMessageDialog(null, "Error: "+ex.getMessage());
                            }
                            break;
                    }
                    columsInt++;
                    model.addRow(new Object[]{columsInt,
                            num1, num2, comboBox1.getSelectedItem().toString(), result});
                }
            }
        });
    }

    private void init() {
        comboBox1.addItem("Add");
        comboBox1.addItem("Sub");
        comboBox1.addItem("Mul");
        comboBox1.addItem("Div");

        String[] titles = new String[] {"STT", "Value 1", "Value 2", "Calculation","Result"};
        Object [][] objects = new Object [][] {null, null, null, null, null};
        table1.setModel(new DefaultTableModel(objects,titles));
        model = (DefaultTableModel) table1.getModel();
        model.setRowCount(0);
    }

    public static double cal(String num1, String num2, int type) {
        if (num1 == null || num2 == null) {
            return 0;
        }
        double result = 0;
        switch (type) {
            case 0:
                result = Double.parseDouble(num1) + Double.parseDouble(num2);
                break;
            case 1:
                result = Double.parseDouble(num1) - Double.parseDouble(num2);
                break;
            case 2:
                result = Double.parseDouble(num1) * Double.parseDouble(num2);
                break;
            case 3:
                try {
                    result = Double.parseDouble(num1) / Double.parseDouble(num2);
                } catch (Exception e) {

                }

                break;
        }
        return result;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Exercise");
        frame.setContentPane(new SwingEx().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
}
