package Tienhm.B12.HW;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import java.beans.VetoableChangeListener;
import java.util.Vector;
import java.beans.PropertyChangeEvent;

public class Swing {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table_1;
	private JTable table;
	private JComboBox comboBox;
	private JButton btnTinhToan;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Swing window = new Swing();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Swing() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(104, 27, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(239, 27, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Input");
		lblNewLabel.setBounds(63, 30, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		int ketqua;
		comboBox = new JComboBox();
		comboBox.addItem("phep cong");
		comboBox.addItem("phep tru");
		comboBox.addItem("phep nhan");
		comboBox.addItem("phep chia");
		comboBox.setBounds(162, 74, 111, 20);
		frame.getContentPane().add(comboBox);
		
		btnTinhToan = new JButton("tinh toan");
		btnTinhToan.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			try {
				
			} catch (NumberFormatException e2) {JOptionPane.showMessageDialog(null, "ban da nhap sai, vui long nhap so");
				// TODO: handle exception
			}
			if (comboBox.getSelectedItem().equals("phep cong")){
				JOptionPane.showMessageDialog(null, "ket qua la: "+  (Integer.parseInt(textField.getText())+Integer.parseInt(textField_1.getText())));
			}
			if (comboBox.getSelectedItem().equals("phep tru")){
				JOptionPane.showMessageDialog(null, "ket qua la: "+ (Integer.parseInt(textField.getText())-Integer.parseInt(textField_1.getText())));
			}
			if (comboBox.getSelectedItem().equals("phep nhan")){
				JOptionPane.showMessageDialog(null, "ket qua la: "+ (Integer.parseInt(textField.getText())*Integer.parseInt(textField_1.getText())));
			}
			if (comboBox.getSelectedItem().equals("phep chia")){
				JOptionPane.showMessageDialog(null, "ket qua la: "+ Float.parseFloat(textField.getText())/ Float.parseFloat(textField_1.getText()));
			}
			}
		});
		btnTinhToan.setBounds(236, 105, 89, 23);
		frame.getContentPane().add(btnTinhToan);
		
		
		table_1 = new JTable();
		table_1.setBounds(92, 232, 1, 1);
		frame.getContentPane().add(table_1);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"STT", "GT1", "GT2", "ket qua"},
				{"", null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(77);
		table.getColumnModel().getColumn(0).setMinWidth(17);
		table.setBounds(63, 141, 358, 80);
		frame.getContentPane().add(table);
		
		
	}
}
