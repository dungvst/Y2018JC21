package DATN;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.SpringLayout;
import javax.swing.ButtonGroup;
import javax.swing.ComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import DEMO.xml.model.Item;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;

public class F_PhongBan extends JFrame {

	private JPanel contentPane;
	private JTable jtbbDanhSach2;
	private JTextField txtPhongBan;
	private JTable tblDanhSach2;
	private JTextField txtPB;
	private JTextField txtMaPhongBan;
	private JComboBox cbbTruongPhong;
	private JButton btnXoaPB;
	private JButton btnSuaPB;
	private JButton btnThemMoiPb;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					F_PhongBan frame = new F_PhongBan();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * 
	 */
	public void setEmptyField() {
		txtPhongBan.setText("");
		txtMaPhongBan.setText("");
		cbbTruongPhong.setSelectedIndex(0);
		btnSuaPB.setEnabled(false);
		btnXoaPB.setEnabled(false);
		btnThemMoiPb.setEnabled(true);
	}

	public void loadTruongPhong() {
		MysqlDataSource dataSource = new MysqlDataSource();
		dataSource.setUser("root");
		dataSource.setPassword("12345678");
		dataSource.setDatabaseName("congty");
		dataSource.setServerName("localhost");
		dataSource.setCharacterEncoding("UTF-8");
		dataSource.setPort(3306);
		dataSource.setUseSSL(true);
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn = (Connection) dataSource.getConnection();
			stmt = (Statement) conn.createStatement();
			rs = stmt.executeQuery("select * from congty.nhanvien");
			cbbTruongPhong.addItem(new ComboItem(null, ""));
			while (rs.next()) {
				int maNhanVien = rs.getInt("MaNhanVien");
				String tenPhongBan = rs.getString("HoTen");

				cbbTruongPhong.addItem(new ComboItem(String.valueOf(maNhanVien), tenPhongBan));
			}

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

	public void loadTable() {
		MysqlDataSource dataSource = new MysqlDataSource();
		dataSource.setUser("root");
		dataSource.setPassword("12345678");
		dataSource.setDatabaseName("congty");
		dataSource.setServerName("localhost");
		dataSource.setCharacterEncoding("UTF-8");
		dataSource.setPort(3306);
		dataSource.setUseSSL(true);
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn = (Connection) dataSource.getConnection();
			stmt = (Statement) conn.createStatement();
			rs = stmt.executeQuery(
					"select t1.MaPhongBan , t1.TenPhongBan , t2.HoTen from phongban as t1 left join nhanvien as t2 on t1.MaTruongPhong = t2.MaNhanVien");
			DefaultTableModel model = new DefaultTableModel(new Object[][] {},
					new String[] { "Mã Phòng Ban", "Tên Phòng Ban", "Tên Trưởng Phòng" });

			while (rs.next()) {
				int maPhongBan = rs.getInt("MaPhongBan");
				String phongBan = rs.getString("TenPhongBan");
				String hoten = rs.getString("HoTen");
				model.addRow(new Object[] { maPhongBan, phongBan, hoten != null ? hoten : "" });

			}

			tblDanhSach2.setModel(model);

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

	public F_PhongBan() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				F_PhongBan.this.dispose();

			}
		});
		setTitle("PHÒNG BAN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 586, 426);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		JPanel panel = new JPanel();
		panel.setMinimumSize(new Dimension(10, 300));
		panel.setPreferredSize(new Dimension(10, 200));
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Thông Tin Phòng Ban",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
		contentPane.add(panel, BorderLayout.NORTH);

		JLabel lblNewLabel = new JLabel("Tên Phòng Ban");

		txtPhongBan = new JTextField();
		txtPhongBan.setText("");
		txtPhongBan.setColumns(10);

		btnThemMoiPb = new JButton("Thêm Mới");
		btnThemMoiPb.addActionListener(new ActionListener() {
			private int stt = 0;

			public void actionPerformed(ActionEvent e) {
				String phongBan = "";

				phongBan = txtPhongBan.getText();
				if (phongBan.length() == 0) {
					JOptionPane.showMessageDialog(null, "Bạn phải nhập tên phòng ban");
					txtPhongBan.requestFocus();
					return;
				}
				String maTruongPhong = null;
				if (cbbTruongPhong.getSelectedItem().toString().isEmpty() == false) {
					ComboItem obj = (ComboItem) cbbTruongPhong.getSelectedItem();
					maTruongPhong = obj.getValue().isEmpty() ? null : obj.getValue();
				}

				MysqlDataSource dataSource = new MysqlDataSource();
				dataSource.setUser("root");
				dataSource.setPassword("12345678");
				dataSource.setDatabaseName("congty");
				dataSource.setServerName("localhost");
				dataSource.setPort(3306);
				dataSource.setCharacterEncoding("UTF-8");
				dataSource.setUseSSL(true);
				Connection conn = null;
				Statement stmt = null;
				PreparedStatement ps = null;
				try {
					conn = (Connection) dataSource.getConnection();
					stmt = (Statement) conn.createStatement();
					String sql = "insert into congty.phongban(TenPhongBan,MaTruongPhong) values(?,?)";
					ps = conn.prepareStatement(sql);

					ps.setString(1, phongBan);
					ps.setString(2, maTruongPhong);
					ps.executeUpdate();

				} catch (SQLException e1) {
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
				setEmptyField();

			}
		});
		JScrollPane scrollpane = new JScrollPane(tblDanhSach2);
		scrollpane.setPreferredSize(new Dimension(300, 100));
		getContentPane().add(scrollpane, BorderLayout.CENTER);

		tblDanhSach2 = new JTable();
		tblDanhSach2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int i = tblDanhSach2.getSelectedRow();
				TableModel model = tblDanhSach2.getModel();
				txtPhongBan.setText(model.getValueAt(i, 1).toString());
				int MaPhongBan = tblDanhSach2.getSelectedRow();
				txtMaPhongBan.setText(model.getValueAt(i, 0).toString());
				cbbTruongPhong.setSelectedItem(new ComboItem(model.getValueAt(i, 2).toString()));
				btnThemMoiPb.setEnabled(false);
				btnXoaPB.setEnabled(true);
				btnSuaPB.setEnabled(true);
			}
		});
		loadTable();
		scrollpane.setViewportView(tblDanhSach2);
		setLocationRelativeTo(null);
		btnSuaPB = new JButton("Sửa");
		btnSuaPB.setEnabled(false);
		btnSuaPB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = new DefaultTableModel();
				MysqlDataSource dataSource = new MysqlDataSource();
				dataSource.setUser("root");
				dataSource.setPassword("12345678");
				dataSource.setDatabaseName("congty");
				dataSource.setServerName("localhost");
				dataSource.setPort(3306);
				dataSource.setUseSSL(true);
				dataSource.setCharacterEncoding("UTF-8");
				Statement stmt = null;
				Connection c = null;
				PreparedStatement ps = null;
				int MaPhongBan = -1;
				String maTruongPhong = null;
				if (cbbTruongPhong.getSelectedItem().toString().isEmpty() == false) {
					ComboItem obj = (ComboItem) cbbTruongPhong.getSelectedItem();
					maTruongPhong = obj.getValue().isEmpty() ? null : obj.getValue();
				}

				if (!txtMaPhongBan.getText().trim().isEmpty()) {
					MaPhongBan = Integer.parseInt(txtMaPhongBan.getText());
				}
				if (MaPhongBan == -1) {
					JOptionPane.showMessageDialog(null, "Bạn chưa chọn dữ liệu cần UPDATE");
					return;
				}
				try {
					c = (Connection) dataSource.getConnection();
					stmt = (Statement) c.createStatement();
					ps = c.prepareStatement(
							"update  congty.phongban set TenPhongBan = ?, MaTruongPhong = ?  where MaPhongBan = ?");
					String PhongBan = txtPhongBan.getText();
					if (PhongBan.length() == 0) {
						JOptionPane.showMessageDialog(null, "Bạn phải nhập tên phòng ban");
						txtPhongBan.requestFocus();
						return;
					}
					ps.setString(1, PhongBan);
					ps.setString(2, maTruongPhong);
					ps.setInt(3, MaPhongBan);
					ps.executeUpdate();

				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} finally {
					try {
						stmt.close();
						c.close();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				}
				loadTable();
				setEmptyField();
				btnThemMoiPb.setEnabled(true);
			}
		});

		btnXoaPB = new JButton("Xóa");
		btnXoaPB.setEnabled(false);
		btnXoaPB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = new DefaultTableModel();
				MysqlDataSource dataSource = new MysqlDataSource();
				dataSource.setUser("root");
				dataSource.setPassword("12345678");
				dataSource.setDatabaseName("congty");
				dataSource.setServerName("localhost");
				dataSource.setPort(3306);
				dataSource.setUseSSL(true);
				dataSource.setCharacterEncoding("UTF-8");
				Statement stmt = null;
				Connection c = null;
				PreparedStatement ps = null;
				int row = tblDanhSach2.getSelectedRow();
				if (row == -1) {
					JOptionPane.showMessageDialog(null, "Chọn bản ghi cần xóa");
					return;
				}
				try {
					c = (Connection) dataSource.getConnection();
					stmt = (Statement) c.createStatement();
					ps = c.prepareStatement("Delete From phongban where MaPhongBan = ?");
					ps.setString(1, tblDanhSach2.getValueAt(tblDanhSach2.getSelectedRow(), 0).toString());
					if (JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa không ?", "Thông Báo",
							JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
						ps.executeUpdate();
						model.setRowCount(0);
					}

				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} finally {
					try {
						stmt.close();
						c.close();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				}
				loadTable();
				setEmptyField();
				btnThemMoiPb.setEnabled(true);

			}
		});

		JLabel lblNewLabel_1 = new JLabel("Danh Sách");

		JLabel lblNewLabel_2 = new JLabel("Tìm Kiếm Phòng Ban");

		txtPB = new JTextField();
		txtPB.setColumns(10);

		JButton btnTimPB = new JButton("Tìm");
		btnTimPB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MysqlDataSource dataSource = new MysqlDataSource();
				dataSource.setUser("root");
				dataSource.setPassword("12345678");
				dataSource.setDatabaseName("congty");
				dataSource.setServerName("localhost");
				dataSource.setPort(3306);
				dataSource.setUseSSL(true);
				Connection conn = null;
				dataSource.setCharacterEncoding("UTF-8");
				Statement stmt = null;
				ResultSet rs = null;
				try {
					conn = (Connection) dataSource.getConnection();
					stmt = (Statement) conn.createStatement();
					rs = stmt.executeQuery(
							"select t1.MaPhongBan , t1.TenPhongBan , t2.HoTen from phongban as t1 left join nhanvien as t2 on t1.MaTruongPhong = t2.MaNhanVien where t1.TenPhongBan like '%"
									+ txtPB.getText() + "%'");
					DefaultTableModel model = new DefaultTableModel(new Object[][] {},
							new String[] { "Mã Phòng Ban", "Tên Phòng Ban", "Tên Trưởng Phòng" });
					if (rs.isBeforeFirst() == false) {
						JOptionPane.showMessageDialog(null, "không có dữ liệu hiển thị");
						return;
					}
					while (rs.next()) {
						int maPhongBan = rs.getInt("MaPhongBan");
						String phongBan = rs.getString("TenPhongBan");
						String hoten = rs.getString("HoTen");
						model.addRow(new Object[] { maPhongBan, phongBan, hoten != null ? hoten : "" });
					}

					tblDanhSach2.setModel(model);

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
				setEmptyField();
			}
		});

		JButton btnHuyPb = new JButton("Hủy");
		btnHuyPb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPB.setText("");
				setEmptyField();
				loadTable();
			}
		});

		txtMaPhongBan = new JTextField();
		txtMaPhongBan.setVisible(false);

		cbbTruongPhong = new JComboBox();
		loadTruongPhong();

		JLabel lblTrngPhng = new JLabel("Trường Phòng");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(gl_panel
								.createSequentialGroup()
								.addComponent(lblNewLabel_1).addGap(97).addComponent(lblNewLabel_2).addGap(18)
								.addComponent(txtPB, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(btnTimPB).addGap(6)
								.addComponent(btnHuyPb))
								.addGroup(gl_panel.createSequentialGroup().addGroup(
										gl_panel.createParallelGroup(Alignment.LEADING).addComponent(txtMaPhongBan,
												GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addGroup(gl_panel
														.createSequentialGroup().addGroup(
																gl_panel.createParallelGroup(Alignment.LEADING)
																		.addGroup(gl_panel.createSequentialGroup()
																				.addContainerGap().addComponent(
																						lblNewLabel))
																		.addGroup(gl_panel.createSequentialGroup()
																				.addGap(23).addComponent(lblTrngPhng)))
														.addGap(18)
														.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
																.addComponent(txtPhongBan, GroupLayout.PREFERRED_SIZE,
																		169, GroupLayout.PREFERRED_SIZE)
																.addComponent(btnThemMoiPb).addComponent(cbbTruongPhong,
																		GroupLayout.PREFERRED_SIZE, 169,
																		GroupLayout.PREFERRED_SIZE))))
										.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(btnSuaPB).addGap(18)
										.addComponent(btnXoaPB)))
						.addContainerGap(103, Short.MAX_VALUE)));
		gl_panel.setVerticalGroup(
				gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup().addGap(20)
								.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE).addComponent(
										lblNewLabel).addComponent(txtPhongBan, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(gl_panel
										.createSequentialGroup()
										.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_panel.createSequentialGroup().addGap(64)
														.addComponent(txtMaPhongBan, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
												.addGroup(gl_panel.createSequentialGroup().addGap(46)
														.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
																.addComponent(btnThemMoiPb).addComponent(btnSuaPB)
																.addComponent(btnXoaPB))))
										.addPreferredGap(ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
										.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
												.addComponent(lblNewLabel_1).addComponent(lblNewLabel_2)
												.addComponent(txtPB, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(btnTimPB).addComponent(btnHuyPb)))
										.addGroup(gl_panel.createSequentialGroup()
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
														.addComponent(cbbTruongPhong, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addComponent(lblTrngPhng))
												.addContainerGap()))));
		panel.setLayout(gl_panel);

	}
}
