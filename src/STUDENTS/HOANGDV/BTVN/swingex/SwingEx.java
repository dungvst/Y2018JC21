package STUDENTS.HOANGDV.BTVN.swingex;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingEx {
    private JPanel panel1;
    private JTextField txtInput1;
    private JTextField txtInput2;
    private JComboBox comboBox1;
    private JButton okButton;
    private JLabel lb1;
    private JLabel lb2;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JTable table1;
    private int columsInt = 0;
    DefaultTableModel model;
    MysqlAccess mysqlAccess;

    public SwingEx() {
        init();
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    float num1 = Float.parseFloat(txtInput1.getText());
                    float num2 = Float.parseFloat(txtInput2.getText());
                    int type = comboBox1.getSelectedIndex();
                    float result = 0;

                    switch (type) {
                        case 0:
                            result = num1 + num2;
                            break;
                        case 1:
                            result = num1 - num2;
                            break;
                        case 2:
                            result = num1 * num2;
                            break;
                        case 3:
                            try {
                                result = num1 / num2;
                            } catch (Exception e1) {
                                JOptionPane.showMessageDialog(null, "Error: " + "Input 2 is incorrect!");
                                return;
                            }
                            break;
                    }
//                    columsInt++;
//                    model.addRow(new Object[]{columsInt,
//                            num1, num2, comboBox1.getSelectedItem().toString(), result});
                    try {
                        mysqlAccess.insertToDatabase(num1, num2, comboBox1.getSelectedItem().toString(), result);
                    } catch (Exception exC) {
                        exC.printStackTrace();
                    }
                    loadDatabase();
                } catch (Exception exx) {
                    JOptionPane.showMessageDialog(null, "Error: " + "Input is incorrect!");
                }
            }
        });
    }

    private void init() {
        comboBox1.addItem("Add");
        comboBox1.addItem("Sub");
        comboBox1.addItem("Mul");
        comboBox1.addItem("Div");

        String[] titles = new String[]{"STT", "Value 1", "Value 2", "Calculation", "Result"};
        Object[][] objects = new Object[][]{null, null, null, null, null};
        table1.setModel(new DefaultTableModel(objects, titles));
        model = (DefaultTableModel) table1.getModel();
        model.setRowCount(0);

        mysqlAccess = new MysqlAccess();
        loadDatabase();
    }

    private void loadDatabase() {
        try {
            mysqlAccess.fillDatabaseToTable(table1);
        } catch (Exception e) {
            e.printStackTrace();
        }
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
