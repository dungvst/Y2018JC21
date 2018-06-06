package DATN;

import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ListSelectionModel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.sound.sampled.ReverbType;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import com.sun.corba.se.spi.ior.iiop.GIOPVersion;
import com.sun.media.sound.ModelAbstractChannelMixer;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class F_KhachHang extends JFrame {

	/**
	 * 
	 */

	private JPanel contentPane;
	private JTextField txtKhachHang;
	private JTextField txtNgaySinh;
	private JTextField txtSoDienThoai;
	private JTextField txtEmail;
	private JTextField txtSoCMND;
	private JTextField txtDiaChi;
	private JTable tblDanhSach;
	private JTextField txtTimKiemKH;
	private JTextField txtMaKhachHang;
	private ButtonGroup group;
	private JButton btnSuaKH;
	private JButton btnXoa;
	private JButton btnThemMoi;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					F_KhachHang frame = new F_KhachHang();
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
	public void setEmptyField() {
		txtKhachHang.setText("");
		txtNgaySinh.setText("");
		txtEmail.setText("");
		txtSoDienThoai.setText("");
		txtSoCMND.setText("");
		txtDiaChi.setText("");
		group.clearSelection();
		txtMaKhachHang.setText("");
		btnSuaKH.setEnabled(false);
		btnXoa.setEnabled(false);
		btnThemMoi.setEnabled(true);

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
			rs = stmt.executeQuery("select * from congty.khachhang");
			DefaultTableModel model = new DefaultTableModel(new Object[][] {},
					new String[] { "Mã Khách Hàng", "T\u00EAn Kh\u00E1ch H\u00E0ng", "Ng\u00E0y Sinh", "Email",
							"S\u1ED1 \u0110i\u1EC7n Tho\u1EA1i", "S\u1ED1 CMND", "Gi\u1EDBi T\u00EDnh",
							"\u0110\u1ECBa Ch\u1EC9" });
			while (rs.next()) {
				int maKhachHang = rs.getInt("MaKhachHang");
				String tenKhachHang = rs.getString("TenKhachHang");
				Date ngaySinh = rs.getDate("NgaySinh");
				String Email = rs.getString("Email");
				String soDienThoai = rs.getString("SoDienThoai");
				String soChungMinh = rs.getString("SoChungMinh");
				String gioiTinh = rs.getString("GioiTinh");
				String DiaChi = rs.getString("DiaChi");
				model.addRow(new Object[] { maKhachHang, tenKhachHang, ngaySinh.toString(), Email, soDienThoai,
						soChungMinh, gioiTinh, DiaChi });

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

	public F_KhachHang() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				F_KhachHang.this.dispose();
			}
		});

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("KHÁCH HÀNG");
		setBounds(100, 100, 759, 491);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		JPanel panel = new JPanel();
		panel.setMinimumSize(new Dimension(10, 300));
		panel.setPreferredSize(new Dimension(10, 300));
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Thông tin Khách Hàng",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
		contentPane.add(panel, BorderLayout.NORTH);

		JLabel lblNewLabel = new JLabel("T\u00EAn Kh\u00E1ch H\u00E0ng");

		JLabel lblNewLabel_1 = new JLabel("S\u1ED1 \u0111i\u1EC7n th\u1ECDai");

		JLabel lblSinThoi = new JLabel("Email");

		JLabel lblaCh = new JLabel("\u0110\u1ECBa ch\u1EC9");

		JLabel lblNewLabel_2 = new JLabel("Ng\u00E0y Sinh");

		JLabel lblGiiTnh = new JLabel("Gi\u1EDBi T\u00EDnh");

		JLabel lblSCmnd = new JLabel("S\u1ED1 CMND");

		txtKhachHang = new JTextField();
		txtKhachHang.setColumns(10);

		txtNgaySinh = new JTextField();
		txtNgaySinh.setColumns(10);

		txtSoDienThoai = new JTextField();
		txtSoDienThoai.setColumns(10);

		txtEmail = new JTextField();
		txtEmail.setColumns(10);

		txtSoCMND = new JTextField();
		txtSoCMND.setColumns(10);

		txtDiaChi = new JTextField();
		txtDiaChi.setColumns(10);

		JRadioButton rbtNam = new JRadioButton("Nam");

		JRadioButton rbtNu = new JRadioButton("Nữ");

		JRadioButton rbtKhac = new JRadioButton("Khác");

		group = new ButtonGroup();
		group.add(rbtNam);
		group.add(rbtNu);
		group.add(rbtKhac);

		btnThemMoi = new JButton("Th\u00EAm M\u1EDBi");
		btnThemMoi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tenKhachHang = "";
				String ngaySinh = "1993-04-17";
				String Email = "";
				String DiaChi = "";
				String gioiTinh = "";
				String sdt = txtSoDienThoai.getText();
				String cmnd = txtSoCMND.getText();
				tenKhachHang = txtKhachHang.getText();
				Email = txtEmail.getText();
				DiaChi = txtDiaChi.getText();
				if (rbtNam.isSelected()) {
					gioiTinh = rbtNam.getText();
				}
				if (rbtNu.isSelected()) {
					gioiTinh = rbtNu.getText();
				}
				if (rbtKhac.isSelected()) {
					gioiTinh = rbtKhac.getText();
				}
				if (tenKhachHang.length() == 0) {
					JOptionPane.showMessageDialog(null, "Bạn phải nhập tên khách hàng");
					txtKhachHang.requestFocus();
					return;

				}

				ngaySinh = txtNgaySinh.getText();
				if (ngaySinh.length() == 0) {
					JOptionPane.showMessageDialog(null, "Bạn phải nhập ngày sinh");
					txtNgaySinh.requestFocus();
					return;
				}
				SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
				df.setLenient(false);
				try {
					java.util.Date date = (java.util.Date) df.parse(ngaySinh);
					if (date.after(new java.util.Date())) {
						JOptionPane.showMessageDialog(null, "Ngày sinh lớn hơn ngày hiện tại");
						txtNgaySinh.requestFocus();
						return;
					}
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Ngày sinh không hợp lệ");
					txtNgaySinh.requestFocus();
					return;

				}

				if (Email.length() == 0) {
					JOptionPane.showMessageDialog(null, "Bạn phải nhập Email");
					txtEmail.requestFocus();
					return;

				}

				String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
				Pattern pattern = Pattern.compile(EMAIL_PATTERN);
				if (pattern.matcher(Email).matches() == false) {
					JOptionPane.showMessageDialog(null, "Email không hợp lệ");
					txtEmail.requestFocus();
					return;
				}

				if (sdt.length() == 0) {
					JOptionPane.showMessageDialog(null, "Bạn phải nhập số điện thoại");
					txtSoDienThoai.requestFocus();
					return;

				}
				try {
					Long.parseLong(sdt);
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Không hợp lệ.Mời bạn nhập lại số điện thoại");
					txtSoDienThoai.requestFocus();
					return;

				}

				if (cmnd.length() == 0) {
					JOptionPane.showMessageDialog(null, "Bạn phải nhập số chứng minh thư");
					txtSoCMND.requestFocus();
					return;

				}
				if (cmnd.length() != 9) {
					JOptionPane.showMessageDialog(null, "Số chứng minh thư không đúng");
					txtSoCMND.requestFocus();
					return;

				}

				try {
					Long.parseLong(cmnd);
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "Không hợp lệ.Mời bạn nhập lại số chứng minh thư");
					txtSoCMND.requestFocus();
					return;

				}

				if (DiaChi.length() == 0) {
					JOptionPane.showMessageDialog(null, "Bạn phải nhập địa chỉ");
					txtDiaChi.requestFocus();
					return;

				}

				if (gioiTinh.length() == 0) {
					JOptionPane.showMessageDialog(null, "Chọn giới tính bản thân");
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
					String sql = "insert into congty.khachhang(TenKhachHang,SoDienThoai,Email,DiaChi,GioiTinh,NgaySinh,SoChungMinh) values('"
							+ tenKhachHang + "','" + sdt + "','" + Email + "','" + DiaChi + "','" + gioiTinh + "','"
							+ ngaySinh + "','" + cmnd + "')";
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
		tblDanhSach = new JTable();
		tblDanhSach.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int i = tblDanhSach.getSelectedRow();
				TableModel model = tblDanhSach.getModel();
				txtKhachHang.setText(model.getValueAt(i, 1).toString());
				txtNgaySinh.setText(model.getValueAt(i, 2).toString());
				txtEmail.setText(model.getValueAt(i, 3).toString());
				txtSoDienThoai.setText(model.getValueAt(i, 4).toString());
				txtSoCMND.setText(model.getValueAt(i, 5).toString());
				String gioiTinh = (String) tblDanhSach.getValueAt(i, 6);
				txtDiaChi.setText(model.getValueAt(i, 7).toString());

				if (gioiTinh.trim().equals("Nam")) {
					rbtNam.setSelected(true);
				} else if (gioiTinh.trim().equals("Nữ")) {
					rbtNu.setSelected(true);
				} else {
					rbtKhac.setSelected(true);
				}
				int maKhachHang = tblDanhSach.getSelectedRow();
				txtMaKhachHang.setText(model.getValueAt(i, 0).toString());
				btnThemMoi.setEnabled(false);
				btnXoa.setEnabled(true);
				btnSuaKH.setEnabled(true);
			}
		});

		loadTable();

		JScrollPane scrollpane = new JScrollPane(tblDanhSach);
		scrollpane.setPreferredSize(new Dimension(300, 100));
		getContentPane().add(scrollpane, BorderLayout.CENTER);
		setLocationRelativeTo(null);
		btnSuaKH = new JButton("S\u1EEDa");
		btnSuaKH.setEnabled(false);
		btnSuaKH.addActionListener(new ActionListener() {
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
				int maKhachHang = -1;

				if (!txtMaKhachHang.getText().trim().isEmpty()) {
					maKhachHang = Integer.parseInt(txtMaKhachHang.getText());
				}
				if (maKhachHang == -1) {
					JOptionPane.showMessageDialog(null, "Bạn chưa chọn dữ liệu cần UPDATE");
					return;
				}

				try {
					c = (Connection) dataSource.getConnection();
					stmt = (Statement) c.createStatement();
					ps = c.prepareStatement(
							"update  khachhang set TenKhachHang = ? , SoDienThoai = ? , Email = ? , DiaChi = ? , GioiTinh = ? , NgaySinh = ? , SoChungMinh = ? where MaKhachHang = ?");
					String tenKhachHang = "";
					tenKhachHang = txtKhachHang.getText();
					if (tenKhachHang.length() == 0) {
						JOptionPane.showMessageDialog(null, "Tên Khách Hàng đang trống");
						txtKhachHang.requestFocus();
						return;
					}
					ps.setString(1, tenKhachHang);

					String sdt = txtSoDienThoai.getText();
					if (sdt.length() == 0) {
						JOptionPane.showMessageDialog(null, "Số điện thoại đang trống");
						txtSoDienThoai.requestFocus();
						return;
					}
					try {
						Long.parseLong(sdt);
					} catch (NumberFormatException ex) {
						JOptionPane.showMessageDialog(null, "Không hợp lệ.Mời bạn nhập lại số điện thoại");
						txtSoDienThoai.requestFocus();
						return;

					}
					ps.setString(2, sdt);

					String Email = txtEmail.getText();
					if (Email.length() == 0) {
						JOptionPane.showMessageDialog(null, "Email đang trống");
						txtEmail.requestFocus();
						return;

					}

					String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
					Pattern pattern = Pattern.compile(EMAIL_PATTERN);
					if (pattern.matcher(Email).matches() == false) {
						JOptionPane.showMessageDialog(null, "Email không hợp lệ");
						txtEmail.requestFocus();
						return;
					}
					ps.setString(3, Email);

					String DiaChi = txtDiaChi.getText();
					if (DiaChi.length() == 0) {
						JOptionPane.showMessageDialog(null, "Địa Chỉ đang trống");
						txtDiaChi.requestFocus();
						return;
					}
					ps.setString(4, DiaChi);
					String gioiTinh = "";
					if (rbtNam.isSelected()) {
						gioiTinh = rbtNam.getText();
					}
					if (rbtNu.isSelected()) {
						gioiTinh = rbtNu.getText();
					}
					if (rbtKhac.isSelected()) {
						gioiTinh = rbtKhac.getText();
					}
					ps.setString(5, gioiTinh);
					String ngaySinh = txtNgaySinh.getText();
					if (ngaySinh.length() == 0) {
						JOptionPane.showMessageDialog(null, "Ngày Sinh đang trống");
						txtNgaySinh.requestFocus();
						return;
					}
					SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
					df.setLenient(false);
					try {
						java.util.Date date = (java.util.Date) df.parse(ngaySinh);
						if (date.after(new java.util.Date())) {
							JOptionPane.showMessageDialog(null, "Ngày sinh lớn hơn ngày hiện tại");
							txtNgaySinh.requestFocus();
							return;
						}
					} catch (Exception e1) {
						JOptionPane.showMessageDialog(null, "Ngày sinh không hợp lệ");
						txtNgaySinh.requestFocus();
						return;

					}

					ps.setString(6, ngaySinh);
					String cmnd = txtSoCMND.getText();
					if (cmnd.length() == 0) {
						JOptionPane.showMessageDialog(null, "số Chứng Minh Nhân Dân đang trống");
						txtSoCMND.requestFocus();
						return;

					}
					if (cmnd.length() != 9) {
						JOptionPane.showMessageDialog(null, "Số chứng minh thư không đúng");
						txtSoCMND.requestFocus();
						return;

					}

					try {
						Long.parseLong(cmnd);
					} catch (NumberFormatException ex) {
						JOptionPane.showMessageDialog(null, "Không hợp lệ.Mời bạn nhập lại số chứng minh thư");
						txtSoCMND.requestFocus();
						return;

					}

					ps.setString(7, cmnd);
					ps.setInt(8, maKhachHang);
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
				btnThemMoi.setEnabled(true);
			}
		});

		;

		btnXoa = new JButton("Xóa");
		btnXoa.setEnabled(false);
		btnXoa.addActionListener(new ActionListener() {
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
				int row = tblDanhSach.getSelectedRow();
				if (row == -1) {
					JOptionPane.showMessageDialog(null, "Bạn chưa chọn thông tin cần Xóa");
					return;
				}

				try {
					c = (Connection) dataSource.getConnection();
					stmt = (Statement) c.createStatement();
					ps = c.prepareStatement("Delete From khachhang where MaKhachHang = ?");
					ps.setString(1, tblDanhSach.getValueAt(tblDanhSach.getSelectedRow(), 0).toString());
					if (JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa không ?", "Thông Báo",
							JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
						ps.executeUpdate();

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
				btnThemMoi.setEnabled(true);
			}

		});

		JLabel lblDanhSch = new JLabel("Danh Sách");

		JLabel lblNewLabel_4 = new JLabel("Tìm Kiếm");

		txtTimKiemKH = new JTextField();
		txtTimKiemKH.setColumns(10);

		JButton btnTimKH = new JButton("Tìm");
		btnTimKH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = new DefaultTableModel(new Object[][] {},
						new String[] { "Mã Khách Hàng", "T\u00EAn Kh\u00E1ch H\u00E0ng", "Ng\u00E0y Sinh", "Email",
								"S\u1ED1 \u0110i\u1EC7n Tho\u1EA1i", "S\u1ED1 CMND", "Gi\u1EDBi T\u00EDnh",
								"\u0110\u1ECBa Ch\u1EC9" });
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
					String sql = "select * from congty.khachhang";
					if (txtTimKiemKH.getText().length() > 0) {
						sql = sql + " where TenKhachHang like '%" + txtTimKiemKH.getText() + "%'";
					}
					rs = stmt.executeQuery(sql);
					Vector data = null;
					model.setRowCount(0);
					if (rs.isBeforeFirst() == false) {
						JOptionPane.showMessageDialog(null, "không có dữ liệu hiển thị");
						return;
					}

					while (rs.next()) {
						data = new Vector();
						data.add(rs.getInt("MaKhachHang"));
						data.add(rs.getString("TenKhachHang"));
						data.add(rs.getDate("NgaySinh"));
						data.add(rs.getString("Email"));
						data.add(rs.getString("SoDienThoai"));
						data.add(rs.getString("SoChungMinh"));
						data.add(rs.getString("GioiTinh"));
						data.add(rs.getString("DiaChi"));
						model.addRow(data);

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
				setEmptyField();
			}
		});

		JButton btnHuyKH = new JButton("Hủy");
		btnHuyKH.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtTimKiemKH.setText("");
				setEmptyField();
				loadTable();

			}
		});

		txtMaKhachHang = new JTextField();
		txtMaKhachHang.setVisible(false);

		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
				gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(
								gl_panel.createSequentialGroup()
										.addGroup(
												gl_panel.createParallelGroup(Alignment.LEADING).addComponent(lblDanhSch)
														.addGroup(gl_panel.createSequentialGroup().addContainerGap()
																.addComponent(lblNewLabel))
														.addGroup(gl_panel.createSequentialGroup().addContainerGap()
																.addComponent(lblSCmnd))
														.addGroup(gl_panel.createSequentialGroup().addContainerGap()
																.addComponent(lblSinThoi))
														.addGroup(gl_panel.createSequentialGroup().addContainerGap()
																.addComponent(lblaCh))
														.addGroup(gl_panel.createSequentialGroup().addContainerGap()
																.addComponent(txtMaKhachHang, 0, 0, Short.MAX_VALUE)))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
												.addGroup(gl_panel.createSequentialGroup().addComponent(lblNewLabel_4)
														.addPreferredGap(ComponentPlacement.UNRELATED)
														.addComponent(txtTimKiemKH, GroupLayout.PREFERRED_SIZE, 143,
																GroupLayout.PREFERRED_SIZE)
														.addGap(18).addComponent(btnTimKH).addGap(18)
														.addComponent(btnHuyKH).addGap(83))
												.addGroup(gl_panel.createSequentialGroup().addGap(18).addGroup(gl_panel
														.createParallelGroup(Alignment.TRAILING)
														.addGroup(gl_panel.createSequentialGroup().addGroup(gl_panel
																.createParallelGroup(Alignment.LEADING)
																.addGroup(gl_panel.createSequentialGroup()
																		.addGroup(gl_panel
																				.createParallelGroup(Alignment.TRAILING)
																				.addComponent(txtEmail, 179, 206,
																						Short.MAX_VALUE)
																				.addComponent(txtSoCMND,
																						Alignment.LEADING,
																						GroupLayout.DEFAULT_SIZE, 206,
																						Short.MAX_VALUE)
																				.addComponent(txtKhachHang,
																						Alignment.LEADING,
																						GroupLayout.DEFAULT_SIZE, 206,
																						Short.MAX_VALUE))
																		.addGap(117))
																.addGroup(gl_panel.createSequentialGroup().addGap(62)
																		.addComponent(btnThemMoi).addGap(32)
																		.addComponent(btnSuaKH,
																				GroupLayout.PREFERRED_SIZE, 86,
																				GroupLayout.PREFERRED_SIZE)))
																.addPreferredGap(ComponentPlacement.RELATED)
																.addGroup(gl_panel
																		.createParallelGroup(Alignment.LEADING)
																		.addGroup(gl_panel.createSequentialGroup()
																				.addGroup(gl_panel
																						.createParallelGroup(
																								Alignment.LEADING)
																						.addComponent(lblNewLabel_2)
																						.addComponent(lblNewLabel_1)
																						.addComponent(lblGiiTnh))
																				.addGap(18)
																				.addGroup(gl_panel
																						.createParallelGroup(
																								Alignment.LEADING)
																						.addGroup(gl_panel
																								.createSequentialGroup()
																								.addComponent(rbtNam)
																								.addGap(14)
																								.addComponent(rbtNu)
																								.addPreferredGap(
																										ComponentPlacement.UNRELATED)
																								.addComponent(rbtKhac))
																						.addComponent(txtSoDienThoai,
																								164, 202,
																								Short.MAX_VALUE)
																						.addComponent(txtNgaySinh, 202,
																								202, 202)))
																		.addComponent(btnXoa,
																				GroupLayout.PREFERRED_SIZE, 83,
																				GroupLayout.PREFERRED_SIZE)))
														.addComponent(txtDiaChi, GroupLayout.DEFAULT_SIZE, 605,
																Short.MAX_VALUE))))
										.addContainerGap()));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup().addContainerGap()
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabel)
								.addComponent(txtKhachHang, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2).addComponent(txtNgaySinh, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(17)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtEmail, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lblSinThoi).addComponent(lblNewLabel_1).addComponent(txtSoDienThoai,
										GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
										.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE).addComponent(rbtKhac)
												.addComponent(rbtNu))
										.addGap(18)
										.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE).addComponent(lblaCh)
												.addComponent(txtDiaChi, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE).addComponent(lblSCmnd)
										.addComponent(txtSoCMND, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(lblGiiTnh).addComponent(rbtNam)))
						.addGap(30)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE).addComponent(btnThemMoi)
								.addComponent(btnXoa).addComponent(btnSuaKH).addComponent(txtMaKhachHang,
										GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE).addComponent(lblDanhSch)
								.addComponent(lblNewLabel_4).addComponent(txtTimKiemKH, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnTimKH).addComponent(btnHuyKH))));
		panel.setLayout(gl_panel);
		setLocationRelativeTo(null);
	}
}
