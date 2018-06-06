package DATN;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Vector;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class F_NhanVien extends JFrame {

	private JPanel contentPane;
	private JTextField txtTenNhanVien;
	private JTextField txtChucVu;
	private JTextField txtNgaySinhNv;
	private JTextField txtDiachiNv;
	private JTextField txtSodienthoaiNV;
	private JTable tblDanhSach1;
	private JRadioButton rbtNuNv;
	private JRadioButton rbtKhacNv;
	private JRadioButton rbtNamnv;
	private JTextField txtTìmKiem;
	private JTextField txtMaNhanVien;
	private ButtonGroup group;
	private JButton btnThemMoiNv;
	private JButton btnSuaNv;
	private JButton btnXoaNv;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					F_NhanVien frame = new F_NhanVien();
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
		txtTenNhanVien.setText("");
		txtChucVu.setText("");
		txtDiachiNv.setText("");
		txtSodienthoaiNV.setText("");
		txtNgaySinhNv.setText("");
		group.clearSelection();
		txtMaNhanVien.setText("");
		btnSuaNv.setEnabled(false);
		btnXoaNv.setEnabled(false);
		btnThemMoiNv.setEnabled(true);

	}

	public void loadTable() {
		MysqlDataSource dataSource = new MysqlDataSource();
		dataSource.setUser("root");
		dataSource.setPassword("12345678");
		dataSource.setDatabaseName("congty");
		dataSource.setCharacterEncoding("UTF-8");
		dataSource.setServerName("localhost");
		dataSource.setPort(3306);
		dataSource.setUseSSL(true);
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn = (Connection) dataSource.getConnection();
			stmt = (Statement) conn.createStatement();
			rs = stmt.executeQuery("select * from congty.nhanvien");
			DefaultTableModel model = new DefaultTableModel(new Object[][] {},
					new String[] { "Mã Nhân Viên", "H\u1ECD T\u00EAn", "Ng\u00E0y Sinh", "\u0110\u1ECBa Ch\u1EC9",
							"Ch\u1EE9c V\u1EE5", "Gi\u1EDBi T\u00EDnh", "S\u1ED1 \u0111i\u1EC7n tho\u1EA1i" });
			while (rs.next()) {
				int maNhanVien = rs.getInt("MaNhanVien");
				String tenNhanVien = rs.getString("HoTen");
				Date ngaySinhNV = rs.getDate("NgaySinh");
				String DiaChiNV = rs.getString("DiaChi");
				String ChucVuNV = rs.getString("ChucVu");
				String gioiTinhNv = rs.getString("GioiTinh");
				String soDienThoaiNv = rs.getString("SoDienThoai");
				model.addRow(new Object[] { maNhanVien, tenNhanVien, ngaySinhNV.toString(), DiaChiNV, ChucVuNV,
						gioiTinhNv, soDienThoaiNv });

			}
			tblDanhSach1.setModel(model);

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

	public F_NhanVien() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				F_NhanVien.this.dispose();

			}
		});
		setTitle("NHÂN VIÊN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 793, 511);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		JPanel panel = new JPanel();
		panel.setMinimumSize(new Dimension(10, 300));
		panel.setPreferredSize(new Dimension(10, 250));
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Thông tin Nhân Viên",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
		contentPane.add(panel, BorderLayout.NORTH);

		JLabel lblNewLabel = new JLabel("T\u00EAn Nh\u00E2n Vi\u00EAn");

		JLabel lblNewLabel_1 = new JLabel("Ch\u1EE9c V\u1EE5");

		JLabel lblNewLabel_2 = new JLabel("\u0110\u1ECBa ch\u1EC9");

		JLabel lblNewLabel_3 = new JLabel("Ng\u00E0y Sinh");

		txtTenNhanVien = new JTextField();
		txtTenNhanVien.setColumns(10);

		txtChucVu = new JTextField();
		txtChucVu.setColumns(10);

		txtNgaySinhNv = new JTextField();
		txtNgaySinhNv.setColumns(10);

		txtDiachiNv = new JTextField();
		txtDiachiNv.setColumns(10);

		btnThemMoiNv = new JButton("Th\u00EAm M\u1EDBi");
		rbtNamnv = new JRadioButton("Nam");

		rbtNuNv = new JRadioButton("Nữ");

		rbtKhacNv = new JRadioButton("Kh\u00E1c");
		group = new ButtonGroup();
		group.add(rbtNamnv);
		group.add(rbtNuNv);
		group.add(rbtKhacNv);
		btnThemMoiNv.addActionListener(new ActionListener() {
			private int stt = 0;

			public void actionPerformed(ActionEvent e) {
				String tenNhanVien = "";
				String ngaySinhNV = "1993-04-17";
				String DiaChiNV = "";
				String ChucVuNV = "";
				String gioiTinhNv = "";
				String soDienThoaiNv = "";
				tenNhanVien = txtTenNhanVien.getText();
				ngaySinhNV = txtNgaySinhNv.getText();
				DiaChiNV = txtDiachiNv.getText();
				ChucVuNV = txtChucVu.getText();
				soDienThoaiNv = txtSodienthoaiNV.getText();

				if (rbtNamnv.isSelected()) {
					gioiTinhNv = rbtNamnv.getText();
				}
				if (rbtNuNv.isSelected()) {
					gioiTinhNv = rbtNuNv.getText();
				}
				if (rbtKhacNv.isSelected()) {
					gioiTinhNv = rbtKhacNv.getText();
				}
				if (tenNhanVien.length() == 0) {
					JOptionPane.showMessageDialog(null, "Bạn phải nhập tên nhân viên");
					txtTenNhanVien.requestFocus();
					return;
				}

				if (ngaySinhNV.length() == 0) {
					JOptionPane.showMessageDialog(null, "Bạn phải nhập ngày sinh");
					txtNgaySinhNv.requestFocus();
					return;
				}
				SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
				df.setLenient(false);
				try {
					java.util.Date date = (java.util.Date) df.parse(ngaySinhNV);
					if (date.after(new java.util.Date())) {
						JOptionPane.showMessageDialog(null, "Ngày sinh lớn hơn ngày hiện tại");
						txtNgaySinhNv.requestFocus();
						return;
					}
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Ngày sinh không hợp lệ");
					txtNgaySinhNv.requestFocus();
					return;

				}
				if (ChucVuNV.length() == 0) {
					JOptionPane.showMessageDialog(null, "Bạn phải nhập chức vụ cho nhân viên");
					txtChucVu.requestFocus();
					return;

				}
				if (DiaChiNV.length() == 0) {
					JOptionPane.showMessageDialog(null, "Bạn phải nhập địa chỉ");
					txtDiachiNv.requestFocus();
					return;

				}
				if (soDienThoaiNv.length() == 0) {
					JOptionPane.showMessageDialog(null, "Bạn phải nhập số điện thoại");
					txtSodienthoaiNV.requestFocus();
					return;

				}
				try {
					Long.parseLong(soDienThoaiNv);
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Không hợp lệ.Mời bạn nhập lại số điện thoại");
					txtSodienthoaiNV.requestFocus();
					return;

				}

				if (gioiTinhNv.length() == 0) {
					JOptionPane.showMessageDialog(null, "Chọn giới tính nhân viên");
					return;
				}

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
				try {
					conn = (Connection) dataSource.getConnection();
					stmt = (Statement) conn.createStatement();
					String sql = "insert into congty.nhanvien(HoTen,NgaySinh,DiaChi,ChucVu,GioiTinh,SoDienThoai) values('"
							+ tenNhanVien + "','" + ngaySinhNV + "','" + DiaChiNV + "','" + ChucVuNV + "','"
							+ gioiTinhNv + "','" + soDienThoaiNv + "')";
					stmt.executeUpdate(sql);

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
				setEmptyField();

			}

		});
		tblDanhSach1 = new JTable();
		tblDanhSach1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int i = tblDanhSach1.getSelectedRow();
				TableModel model = tblDanhSach1.getModel();
				txtTenNhanVien.setText(model.getValueAt(i, 1).toString());
				txtNgaySinhNv.setText(model.getValueAt(i, 2).toString());
				txtDiachiNv.setText(model.getValueAt(i, 3).toString());
				txtChucVu.setText(model.getValueAt(i, 4).toString());
				String gioiTinh = (String) tblDanhSach1.getValueAt(i, 5);
				txtSodienthoaiNV.setText(model.getValueAt(i, 6).toString());
				if (gioiTinh.trim().equals("Nam")) {
					rbtNamnv.setSelected(true);
				} else if (gioiTinh.trim().equals("Nữ")) {
					rbtNuNv.setSelected(true);
				} else {
					rbtKhacNv.setSelected(true);
				}
				int MaNhanVien = tblDanhSach1.getSelectedRow();
				txtMaNhanVien.setText(model.getValueAt(i, 0).toString());
				btnThemMoiNv.setEnabled(false);
				btnXoaNv.setEnabled(true);
				btnSuaNv.setEnabled(true);

			}
		});
		loadTable();
		JScrollPane scrollpane = new JScrollPane(tblDanhSach1);
		scrollpane.setPreferredSize(new Dimension(300, 100));
		getContentPane().add(scrollpane, BorderLayout.CENTER);
		setLocationRelativeTo(null);
		btnSuaNv = new JButton("S\u1EEDa");
		btnSuaNv.setEnabled(false);
		btnSuaNv.addActionListener(new ActionListener() {
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
				int MaNhanVien = -1;

				if (!txtMaNhanVien.getText().trim().isEmpty()) {
					MaNhanVien = Integer.parseInt(txtMaNhanVien.getText());
				}
				if (MaNhanVien == -1) {
					JOptionPane.showMessageDialog(null, "Bạn chưa chọn dữ liệu cần UPDATE");
					return;
				}
				try {
					c = (Connection) dataSource.getConnection();
					stmt = (Statement) c.createStatement();
					ps = c.prepareStatement(
							"update  nhanvien set HoTen = ? , NgaySinh = ? , DiaChi = ? , ChucVu = ? , GioiTinh = ? , SoDienThoai = ?  where MaNhanVien = ?");
					String tenNhanVien = txtTenNhanVien.getText();
					if (tenNhanVien.length() == 0) {
						JOptionPane.showMessageDialog(null, "Tên Nhân Viên đang trống");
						txtTenNhanVien.requestFocus();
						return;
					}
					ps.setString(1, tenNhanVien);
					String ngaySinhNV = txtNgaySinhNv.getText();
					if (ngaySinhNV.length() == 0) {
						JOptionPane.showMessageDialog(null, "Ngày Sinh đang trống");
						txtNgaySinhNv.requestFocus();
						return;
					}
					SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
					df.setLenient(false);
					try {
						java.util.Date date = (java.util.Date) df.parse(ngaySinhNV);
						if (date.after(new java.util.Date())) {
							JOptionPane.showMessageDialog(null, "Ngày sinh lớn hơn ngày hiện tại");
							txtNgaySinhNv.requestFocus();
							return;
						}
					} catch (Exception e1) {
						JOptionPane.showMessageDialog(null, "Ngày sinh không hợp lệ");
						txtNgaySinhNv.requestFocus();
						return;

					}
					ps.setString(2, ngaySinhNV);
					String DiaChiNV = txtDiachiNv.getText();
					if (DiaChiNV.length() == 0) {
						JOptionPane.showMessageDialog(null, "Địa Chỉ đang trống");
						txtDiachiNv.requestFocus();
						return;

					}

					ps.setString(3, DiaChiNV);
					String ChucVuNV = txtChucVu.getText();
					if (ChucVuNV.length() == 0) {
						JOptionPane.showMessageDialog(null, "Chức Vụ đang trống");
						txtChucVu.requestFocus();
						return;

					}
					ps.setString(4, ChucVuNV);
					String GioiTinh = "";
					if (rbtNamnv.isSelected()) {
						GioiTinh = rbtNamnv.getText();
					}
					if (rbtNuNv.isSelected()) {
						GioiTinh = rbtNuNv.getText();
					}
					if (rbtKhacNv.isSelected()) {
						GioiTinh = rbtKhacNv.getText();
					}
					ps.setString(5, GioiTinh);
					String soDienThoaiNv = txtSodienthoaiNV.getText();
					if (soDienThoaiNv.length() == 0) {
						JOptionPane.showMessageDialog(null, "Số Điện Thoại đang trống");
						txtSodienthoaiNV.requestFocus();
						return;

					}
					try {
						Long.parseLong(soDienThoaiNv);
					} catch (NumberFormatException ex) {
						JOptionPane.showMessageDialog(null, "Không hợp lệ.Mời bạn nhập lại số điện thoại");
						txtSodienthoaiNV.requestFocus();
						return;

					}
					ps.setString(6, soDienThoaiNv);
					ps.setInt(7, MaNhanVien);
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
				btnThemMoiNv.setEnabled(true);
			}

		});

		btnXoaNv = new JButton("X\u00F3a");
		btnXoaNv.setEnabled(false);
		btnXoaNv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = new DefaultTableModel();
				MysqlDataSource dataSource = new MysqlDataSource();
				dataSource.setUser("root");
				dataSource.setPassword("12345678");
				dataSource.setDatabaseName("congty");
				dataSource.setServerName("localhost");
				dataSource.setCharacterEncoding("UTF-8");
				dataSource.setPort(3306);
				dataSource.setUseSSL(true);
				Statement stmt = null;
				Connection c = null;
				PreparedStatement ps = null;
				int row = tblDanhSach1.getSelectedRow();
				if (row == -1) {
					JOptionPane.showMessageDialog(null, "Chọn bản ghi cần xóa");
					return;
				}
				try {
					c = (Connection) dataSource.getConnection();
					stmt = (Statement) c.createStatement();
					ps = c.prepareStatement("Delete From nhanvien where MaNhanVien = ?");
					ps.setString(1, tblDanhSach1.getValueAt(tblDanhSach1.getSelectedRow(), 0).toString());
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
				btnThemMoiNv.setEnabled(true);

			}
		});

		JLabel lblNewLabel_4 = new JLabel("Danh S\u00E1ch");

		JLabel lblNewLabel_5 = new JLabel("S\u1ED1 \u0111i\u1EC7n tho\u1EA1i");

		txtSodienthoaiNV = new JTextField();
		txtSodienthoaiNV.setColumns(10);

		JLabel lblNewLabel_7 = new JLabel("Gi\u1EDBi T\u00EDnh");

		JLabel lblNewLabel_6 = new JLabel("Tìm Kiếm");

		txtTìmKiem = new JTextField();
		txtTìmKiem.setColumns(10);

		JButton btnTim = new JButton("Tìm");
		btnTim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = new DefaultTableModel(new Object[][] {},
						new String[] { "Mã Nhân Viên", "H\u1ECD T\u00EAn", "Ng\u00E0y Sinh", "\u0110\u1ECBa Ch\u1EC9",
								"Ch\u1EE9c V\u1EE5", "Gi\u1EDBi T\u00EDnh", "S\u1ED1 \u0111i\u1EC7n tho\u1EA1i" });
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
				ResultSet rs = null;
				try {
					conn = (Connection) dataSource.getConnection();
					stmt = (Statement) conn.createStatement();
					String sql = "select * from congty.nhanvien";
					if (txtTìmKiem.getText().length() > 0) {
						sql = sql + " where HoTen like '%" + txtTìmKiem.getText() + "%'";
					}
					rs = stmt.executeQuery(sql);
					Vector data = null;
					model.setRowCount(0);
					if (rs.isBeforeFirst() == false) {
						JOptionPane.showMessageDialog(null, "Không có dữ liệu hiển thị");
						return;
					}

					while (rs.next()) {
						data = new Vector();
						data.add(rs.getInt("MaNhanVien"));
						data.add(rs.getString("HoTen"));
						data.add(rs.getDate("NgaySinh"));
						data.add(rs.getString("DiaChi"));
						data.add(rs.getString("ChucVu"));
						data.add(rs.getString("GioiTinh"));
						data.add(rs.getString("SoDienThoai"));
						model.addRow(data);

					}
					tblDanhSach1.setModel(model);

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

		JButton btnHuy = new JButton("Hủy");
		btnHuy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtTìmKiem.setText("");
				setEmptyField();
				loadTable();

			}
		});

		txtMaNhanVien = new JTextField();
		txtMaNhanVien.setVisible(false);

		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
				gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup().addGroup(gl_panel.createParallelGroup(
								Alignment.TRAILING)
								.addGroup(
										gl_panel.createSequentialGroup()
												.addComponent(txtMaNhanVien, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
												.addComponent(btnThemMoiNv).addGap(27).addComponent(btnSuaNv)
												.addGap(11))
								.addGroup(gl_panel.createSequentialGroup()
										.addGroup(gl_panel
												.createParallelGroup(Alignment.LEADING).addGroup(gl_panel
														.createSequentialGroup().addGap(10).addGroup(gl_panel
																.createParallelGroup(Alignment.LEADING)
																.addComponent(lblNewLabel_1).addComponent(lblNewLabel)))
												.addGroup(gl_panel.createSequentialGroup().addContainerGap()
														.addComponent(lblNewLabel_5)))
										.addGap(18)
										.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
												.addComponent(txtTenNhanVien).addComponent(txtChucVu)
												.addComponent(txtSodienthoaiNV, GroupLayout.DEFAULT_SIZE, 143,
														Short.MAX_VALUE))
										.addPreferredGap(ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
										.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
												.addComponent(lblNewLabel_7).addComponent(lblNewLabel_2)
												.addComponent(lblNewLabel_3))))
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel.createSequentialGroup().addGap(37).addComponent(btnXoaNv))
										.addGroup(gl_panel.createSequentialGroup()
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
														.addComponent(txtDiachiNv, GroupLayout.PREFERRED_SIZE, 185,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(txtNgaySinhNv, GroupLayout.PREFERRED_SIZE, 178,
																GroupLayout.PREFERRED_SIZE)
														.addGroup(gl_panel.createSequentialGroup()
																.addComponent(rbtNamnv).addGap(18).addComponent(rbtNuNv)
																.addGap(18).addComponent(rbtKhacNv)))))
								.addGap(21))
						.addGroup(gl_panel.createSequentialGroup().addComponent(lblNewLabel_4).addGap(174)
								.addComponent(lblNewLabel_6).addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(txtTìmKiem, GroupLayout.PREFERRED_SIZE, 195, GroupLayout.PREFERRED_SIZE)
								.addGap(10).addComponent(btnTim).addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(btnHuy).addGap(2)));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(gl_panel
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabel_3)
						.addComponent(lblNewLabel)
						.addComponent(txtTenNhanVien, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(txtNgaySinhNv, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE))
				.addGap(27)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabel_2)
						.addComponent(lblNewLabel_1)
						.addComponent(txtChucVu, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(txtDiachiNv, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE))
				.addGap(25)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtSodienthoaiNV, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_5).addComponent(lblNewLabel_7).addComponent(rbtNamnv)
						.addComponent(rbtKhacNv).addComponent(rbtNuNv))
				.addGap(18)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE).addComponent(btnThemMoiNv)
						.addComponent(btnSuaNv).addComponent(btnXoaNv).addComponent(txtMaNhanVien,
								GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
				.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabel_4)
								.addComponent(lblNewLabel_6).addComponent(txtTìmKiem, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE).addComponent(btnTim)
								.addComponent(btnHuy)))));
		panel.setLayout(gl_panel);

		setLocationRelativeTo(null);

	}
}
