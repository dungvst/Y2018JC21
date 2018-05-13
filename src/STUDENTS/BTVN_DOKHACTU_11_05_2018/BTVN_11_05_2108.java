package BTVN_DOKHACTU_11_05_2018;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import java.awt.Dimension;

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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.border.CompoundBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import com.sun.javafx.geom.Rectangle;

import javax.swing.JTabbedPane;
import javax.swing.ListSelectionModel;
import javax.swing.AbstractListModel;
import java.awt.Component;
import java.awt.Insets;
import javax.swing.ScrollPaneConstants;
import javax.swing.JLayeredPane;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;

public class BTVN_11_05_2108 extends JFrame {

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
					BTVN_11_05_2108 frame = new BTVN_11_05_2108();
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

	public void loadTable() {
		MysqlDataSource dataSource = new MysqlDataSource();
		dataSource.setUser("root");
		dataSource.setPassword("12345678");
		dataSource.setDatabaseName("tinhtoan");
		dataSource.setServerName("localhost");
		dataSource.setPort(3306);
		dataSource.setUseSSL(true);
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn = (Connection) dataSource.getConnection();
			stmt = (Statement) conn.createStatement();
			rs = stmt.executeQuery("select * from tinhtoan.maytinh");
			DefaultTableModel model = new DefaultTableModel(new Object[][] {},
					new String[] { "STT", "giá trị 1", "giá trị 2", "Phép Toán", "Kết quả" });

			int stt = 0;
			while (rs.next()) {
				stt++;
				float So1 = rs.getFloat("GiaTri1");
				float So2 = rs.getFloat("GiaTri2");
				String PhepTinh = rs.getString("PhepTinh");
				float ketqua = rs.getFloat("KetQua");
				model.addRow(new Object[] { stt, So1, So2, PhepTinh, ketqua });
			}

			tblDanhSach.setModel(model);

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}
	}

	public BTVN_11_05_2108() {

		setTitle("Tính Toán");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 623, 441);
		contentPane = new JPanel();
		contentPane.setPreferredSize(new Dimension(10, 50));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		panel.setMinimumSize(new Dimension(10, 300));
		panel.setPreferredSize(new Dimension(10, 170));
		panel.setBorder(
				new TitledBorder(UIManager.getBorder("TitledBorder.border"), "B\u00E0i T\u1EADp V\u1EC1 Nh\u00E0",
						TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
		contentPane.add(panel, BorderLayout.NORTH);

		JLabel lblNewLabel = new JLabel("Nh\u1EADp s\u1ED1");

		txtNhapSo1 = new JTextField();
		txtNhapSo1.setColumns(10);

		txtNhapSo2 = new JTextField();
		txtNhapSo2.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Ph\u00E9p T\u00EDnh");

		JComboBox cbbPT = new JComboBox();
		cbbPT.setModel(new DefaultComboBoxModel(new String[] { "Cộng", "Trừ", "Nhân", "Chia" }));

		JButton btnTinhToan = new JButton("T\u00EDnh To\u00E1n");
		btnTinhToan.setMinimumSize(new Dimension(100, 40));
		btnTinhToan.setPreferredSize(new Dimension(100, 40));
		btnTinhToan.setMargin(new Insets(2, 7, 2, 14));
		btnTinhToan.setAlignmentX(Component.RIGHT_ALIGNMENT);

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

				MysqlDataSource dataSource = new MysqlDataSource();
				dataSource.setUser("root");
				dataSource.setPassword("12345678");
				dataSource.setDatabaseName("tinhtoan");
				dataSource.setServerName("localhost");
				dataSource.setPort(3306);
				dataSource.setUseSSL(true);
				dataSource.setCharacterEncoding("UTF-8");
				Connection conn = null;
				Statement stmt = null;
				try {
					conn = (Connection) dataSource.getConnection();
					stmt = (Statement) conn.createStatement();
					stmt.executeUpdate("insert into tinhtoan.maytinh(GiaTri1,GiaTri2,PhepTinh,KetQua) values(" + so1
							+ "," + so2 + ",'" + PhepTinh + "'," + ketqua + ")");

				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} finally {
					try {
						stmt.close();
						conn.close();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				}

				loadTable();
			}

		});

		JLabel lblNewLabel_2 = new JLabel("Danh S\u00E1ch");

		JLabel label = new JLabel("");

		tblDanhSach = new JTable();
		loadTable();

		JScrollPane scrollpane = new JScrollPane(tblDanhSach);
		scrollpane.setPreferredSize(new Dimension(300, 100));
		getContentPane().add(scrollpane, BorderLayout.CENTER);
		setLocationRelativeTo(null);

		JLabel label_1 = new JLabel("Nhập số");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.TRAILING).addGroup(gl_panel
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, gl_panel
						.createSequentialGroup()
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING).addComponent(lblNewLabel)
								.addComponent(lblNewLabel_1)
								.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(cbbPT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel.createSequentialGroup()
										.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
												.addComponent(txtNhapSo2, GroupLayout.PREFERRED_SIZE, 141,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(txtNhapSo1, GroupLayout.PREFERRED_SIZE, 141,
														GroupLayout.PREFERRED_SIZE))
										.addGap(171).addComponent(label)))
						.addContainerGap(160, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup().addComponent(lblNewLabel_2)
								.addPreferredGap(ComponentPlacement.RELATED, 265, Short.MAX_VALUE)
								.addComponent(btnTinhToan, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addGap(159)))));
		gl_panel.setVerticalGroup(
				gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(
								Alignment.LEADING, gl_panel
										.createSequentialGroup().addGroup(gl_panel.createParallelGroup(
												Alignment.LEADING)
												.addGroup(gl_panel.createSequentialGroup().addGap(6)
														.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
																.addComponent(lblNewLabel).addComponent(txtNhapSo1,
																		GroupLayout.PREFERRED_SIZE,
																		GroupLayout.DEFAULT_SIZE,
																		GroupLayout.PREFERRED_SIZE)))
												.addGroup(gl_panel.createSequentialGroup().addGap(16)
														.addComponent(label)))
										.addPreferredGap(
												ComponentPlacement.UNRELATED)
										.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING).addGroup(gl_panel
												.createSequentialGroup().addGroup(gl_panel
														.createParallelGroup(Alignment.LEADING).addGroup(gl_panel
																.createSequentialGroup().addGap(31)
																.addGroup(gl_panel
																		.createParallelGroup(Alignment.BASELINE)
																		.addComponent(label_1).addComponent(
																				txtNhapSo2, GroupLayout.PREFERRED_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.PREFERRED_SIZE)))
														.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
																.addComponent(lblNewLabel_1).addComponent(cbbPT,
																		GroupLayout.PREFERRED_SIZE,
																		GroupLayout.DEFAULT_SIZE,
																		GroupLayout.PREFERRED_SIZE)))
												.addPreferredGap(ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
												.addComponent(lblNewLabel_2))
												.addGroup(gl_panel.createSequentialGroup()
														.addComponent(btnTinhToan, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addContainerGap()))));
		panel.setLayout(gl_panel);

	}
}
