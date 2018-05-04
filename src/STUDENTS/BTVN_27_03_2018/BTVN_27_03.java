package BTVN_27_03_2018;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.CompoundBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JTabbedPane;
import javax.swing.ListSelectionModel;
import javax.swing.AbstractListModel;

public class BTVN_27_03 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNhapSo1;
	private JTextField txtNhapSo2;
	private JTable table;
	private JTable tblDanhSach;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BTVN_27_03 frame = new BTVN_27_03();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */

	public BTVN_27_03() {

		setTitle("Tính Toán");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 515, 443);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		panel.setBorder(
				new TitledBorder(UIManager.getBorder("TitledBorder.border"), "B\u00E0i T\u1EADp V\u1EC1 Nh\u00E0",
						TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
		contentPane.add(panel, BorderLayout.WEST);

		JLabel lblNewLabel = new JLabel("Nh\u1EADp s\u1ED1");

		txtNhapSo1 = new JTextField();
		txtNhapSo1.setColumns(10);

		txtNhapSo2 = new JTextField();
		txtNhapSo2.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Ph\u00E9p T\u00EDnh");

		JComboBox cbbPT = new JComboBox();
		cbbPT.setModel(new DefaultComboBoxModel(new String[] {"Cộng", "Trừ", "Nhân", "Chia"}));

		JButton btnTinhToan = new JButton("T\u00EDnh To\u00E1n");

		btnTinhToan.addActionListener(new ActionListener() {
			private int stt = 0;

			public void actionPerformed(ActionEvent e) {
				float so1 = 0;
				float so2 = 0;
				float ketqua = 0;
				String PhepTinh = "";
				String So1 = txtNhapSo1.getText();
				String So2 = txtNhapSo2.getText();
				PhepTinh = cbbPT.getSelectedItem().toString();
				if (So1.length() == 0) {
					JOptionPane.showMessageDialog(null, "Bạn phải nhập số thứ nhất");
					return;

				}
				if (So2.length() == 0) {
					JOptionPane.showMessageDialog(null, "Bạn phải nhập số thứ hai");
					return;

				}
				try {
					so1 = Float.parseFloat(So1);
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Không hợp lệ.Mời bạn nhập số thứ nhất (chỉ được nhập số) ");
					return;

				}
				try {
					so2 = Float.parseFloat(So2);
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Không hợp lệ.Mời bạn nhập số thứ hai (chỉ được nhập số) ");
					return;

				}
				switch (PhepTinh) {
				case "Cộng":
					ketqua = so1 + so2;
					break;
				case "Trừ":
					ketqua = so1 - so2;
					break;
				case "Nhân":
					ketqua = so1 * so2;
					break;
				case "Chia":
					if (so2 == 0) {
						if (so1 == 0) {
							JOptionPane.showMessageDialog(null, "Không xác đinh.Mời bạn nhập lại 2 số ");
							return;
						} else {
							JOptionPane.showMessageDialog(null, "Không thể chia cho số 0.Mời bạn nhập lại số thứ hai");
							return;
						}

					} else {
						ketqua = so1 / so2;
					}

				}

				DefaultTableModel md = (DefaultTableModel) tblDanhSach.getModel();
				stt++;
				md.addRow(new Object[] { stt, So1, So2, PhepTinh, ketqua });

			}

		});

		JLabel lblNewLabel_2 = new JLabel("Danh S\u00E1ch");

		JLabel label = new JLabel("");

		tblDanhSach = new JTable();
		tblDanhSach.setModel(new DefaultTableModel(
				new Object[][] { { "STT", "GT1", "GT2", "Ph\u00E9p t\u00EDnh", "K\u1EBFt qu\u1EA3" }, },
				new String[] { "stt", "gt1", "gt2", "caculate", "result " }));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(29)
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblNewLabel_1)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblNewLabel)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtNhapSo1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtNhapSo2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(145)
									.addComponent(label))
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(34)
									.addComponent(cbbPT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(tblDanhSach, GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_2)))
					.addContainerGap())
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap(237, Short.MAX_VALUE)
					.addComponent(btnTinhToan)
					.addGap(161))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(4)
							.addComponent(lblNewLabel))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(1)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtNhapSo2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtNhapSo1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(11)
							.addComponent(label)))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(cbbPT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1))
					.addGap(33)
					.addComponent(btnTinhToan)
					.addGap(18)
					.addComponent(lblNewLabel_2)
					.addGap(18)
					.addComponent(tblDanhSach, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(53, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);

	}
}
