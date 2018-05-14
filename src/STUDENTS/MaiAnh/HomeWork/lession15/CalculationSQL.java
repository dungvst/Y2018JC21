package STUDENTS.MaiAnh.HomeWork.lession15;

import org.omg.CORBA.OBJ_ADAPTER;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.sql.*;




public class CalculationSQL {
    private JPanel jp1;
    private JTextField no1TextField;
    private JTextField no2TextField;
    private JComboBox calculationOption;
    private JButton calculateButton;
    private JTable resultTable;
    private JLabel no1Label;
    private JLabel resultLabel;
    private JLabel no2Label;

    private int count=0;
    private double result;
    public CalculationSQL() {
        String[] columns = new String[] {"count", "Number 1", "Number2", "Calculation", "Result"};
        DefaultTableModel model = new DefaultTableModel(null, columns);
        resultTable.setModel(model);

        Access access = new Access();


        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Double number1 = Double.parseDouble(no1TextField.getText());
                    Double number2 = Double.parseDouble(no2TextField.getText());

                    if(number2==0 && calculationOption.getSelectedItem().toString().equals("Division")){
                        JOptionPane.showMessageDialog(null, "Can not divide by 0");
                    }else{
                        switch (calculationOption.getSelectedItem().toString()){
                            case "Addition":
                                setCount(getCount()+1);
                                setResult(number1+number2);
                                break;
                            case "Subtraction":
                                setCount(getCount()+1);
                                setResult(number1-number2);
                                break;
                            case "Multiplication":
                                setCount(getCount()+1);
                                setResult(number1*number2);
                                break;
                            case "Division":
                                setCount(getCount()+1);
                                setResult(number1/number2);
                                break;
                                default: break;
                        }
                        model.addRow(new Object[] {getCount(), number1, number2, calculationOption.getSelectedItem().toString(), getResult()});

                        try{
                            access.insertData(number1, number2, calculationOption.getSelectedItem().toString(), getResult());
                        }catch (Exception e1){
                            e1.printStackTrace();
                        }

                    }
                }catch (NumberFormatException e1){
                    JOptionPane.showMessageDialog(null, "Input is not available");
                }

            }
        });
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("CalculationSQL");
        frame.setContentPane(new CalculationSQL().jp1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
