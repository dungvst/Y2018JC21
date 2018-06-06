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
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.RescaleOp;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;
import java.awt.FlowLayout;
import javax.swing.JSplitPane;
import javax.swing.BoxLayout;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.ScrollPaneConstants;
import java.awt.GridLayout;
import java.awt.CardLayout;
import net.miginfocom.swing.MigLayout;

public class F_DuAn extends JFrame {
	private JPanel contentPane;
	private JTable jtblDanhSach3;
	private JTextField txtDuAn;
	private JTextField txtMoTa;
	private JTable tblDanhSach3;
	private JTextField txtTimKiemDa;
	private JTextField txtMaduAn;
	private JComboBox cbbTenPhongBan;
	private JButton btnThemMoiDA;
	private JButton btnSuaDA;
	private JButton btnXoaDA;
	private JSplitPane splitPane;
	private JPanel panel_1;
	private JPanel panel_2;
	private JSplitPane splitPane_1;
	private JPanel panel_3;
	private JPanel panel_4;
	private JSplitPane splitPane_2;
	private JPanel panel_5;
	private JPanel panel_6;
	private JPanel panel;
	private JTextField txtKetThuc;
	private JTextField txtBatDau;
	private JComboBox cbbNhanVien;
	private JLabel lblNhnVin;
	private JLabel lblNgyBtu;
	private JLabel lblNgyKtThc;
	private JPanel panel_8;
	private JSplitPane splitPane_3;
	private JPanel panel_9;
	private JPanel panel_10;
	private JScrollPane scrollPane;
	private JTable tblNhanVien;
	private JButton btnSuaNhanVienDuAn;
	private JButton btnXoaNhanVienDuAn;
	private ArrayList<DTO_NhanVienDuAn> listNhanVien = new ArrayList<DTO_NhanVienDuAn>();
	private JTextField txtMaNhanVien;
	private JButton btnThemNhanVienDuAN;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					F_DuAn frame = new F_DuAn();
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
		txtDuAn.setText("");
		txtMoTa.setText("");
		txtMaduAn.setText("");
		cbbTenPhongBan.setSelectedIndex(0);
		btnSuaDA.setEnabled(false);
		btnXoaDA.setEnabled(false);
		btnThemMoiDA.setEnabled(true);
		
	}
	
	private void setEmptyNhanVienField(){
		txtMaNhanVien.setText("");
		cbbNhanVien.setSelectedIndex(0);
		txtBatDau.setText("");
		txtKetThuc.setText("");
		btnSuaNhanVienDuAn.setEnabled(false);
		btnXoaNhanVienDuAn.setEnabled(false);
		btnThemNhanVienDuAN.setEnabled(true);

	}

	public void loadNhanVien() {
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
			cbbNhanVien.addItem(new ComboItem(null, ""));
			while (rs.next()) {
				int maNhanVien = rs.getInt("MaNhanVien");
				String tenNhanVien = rs.getString("HoTen");

				cbbNhanVien.addItem(new ComboItem(String.valueOf(maNhanVien), tenNhanVien));
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

	public void loadTenPhongBan() {
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
			rs = stmt.executeQuery("select * from congty.phongban");
			cbbTenPhongBan.addItem(new ComboItem(null, ""));
			while (rs.next()) {
				int maPhongBan = rs.getInt("MaPhongBan");
				String tenPhongBan = rs.getString("TenPhongBan");

				cbbTenPhongBan.addItem(new ComboItem(String.valueOf(maPhongBan), tenPhongBan));
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
					"select t1.MaDuAn , t1.TenDuAn , t1.MoTaDuAn ,t2.TenPhongBan from duan as t1 left join phongban as t2 on t1.MaPhongBan = t2.MaPhongBan");
			DefaultTableModel model = new DefaultTableModel(new Object[][] {}, new String[] { "Mã Dự Án",
					"T\u00EAn D\u1EF1 \u00C1n", "M\u00F4 T\u1EA3 D\u1EF1 \u00C1n", "Tên Phòng Ban" });

			while (rs.next()) {
				int maDuAn = rs.getInt("MaDuAn");
				String tenDuAn = rs.getString("TenDuAn");
				String mota = rs.getString("MoTaDuAn");
				String tenPhongBan = rs.getString("TenPhongBan");
				model.addRow(new Object[] { maDuAn, tenDuAn, mota, tenPhongBan != null ? tenPhongBan : "" });

			}

			tblDanhSach3.setModel(model);

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

	public void loadDSNhanVien() {
		DefaultTableModel model = new DefaultTableModel(new Object[][] {}, new String[] { "Mã Nhân Viên",
				"Họ Tên nhân viên", "Thời gian bắt đầu", "Thời gian kết thúc tham gia" });
		SimpleDateFormat ahihi = new SimpleDateFormat("yyyy-MM-dd");
		for (DTO_NhanVienDuAn item : listNhanVien) {

			model.addRow(new Object[] { item.getMaNhanVien(), item.getHoTen(), ahihi.format(item.getThoiGianBatDau()),
					ahihi.format(item.getThoiGianKetThuc()) });
		}

		tblNhanVien.setModel(model);

	}

	public void loadDsNhanVien(int maDuAn) {
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
		PreparedStatement ps=null;
		try {
			conn = (Connection) dataSource.getConnection();
			stmt = (Statement) conn.createStatement();
			String sql="select t1.MaNhanVien , t1.HoTen , t2.ThoiGianBatDau , t2.ThoiGianKetThuc from nhanvien as t1 inner join nhanvienduan as t2 on t1.MaNhanVien = t2.MaNhanVien where t2.MaDuAn = ?";		
			ps = conn.prepareStatement(sql);
			ps.setInt(1, maDuAn);
			rs =ps.executeQuery();
			DefaultTableModel model = new DefaultTableModel(new Object[][] {}, new String[] { "Mã Nhân Viên",
					"Họ Tên nhân viên", "Thời gian bắt đầu", "Thời gian kết thúc tham gia" });

			listNhanVien.clear();
			while (rs.next()) {
				DTO_NhanVienDuAn obj = new DTO_NhanVienDuAn();
				obj.setMaNhanVien(rs.getInt("MaNhanVien")); 
				obj.setHoTen(rs.getString("HoTen"));
				obj.setThoiGianBatDau(rs.getDate("ThoiGianBatDau"));
				obj.setThoiGianKetThuc(rs.getDate("ThoiGianKetThuc"));
				listNhanVien.add(obj);
			}

			loadDSNhanVien();

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

	public F_DuAn() {
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				F_DuAn.this.dispose();

			}
		});
		setTitle("DỰ ÁN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1011, 780);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));

		splitPane = new JSplitPane();
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		contentPane.add(splitPane);

		panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Th\u00F4ng tin d\u1EF1 \u00E1n", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));
		splitPane.setLeftComponent(panel_1);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.X_AXIS));

		panel = new JPanel();
		panel_1.add(panel);

		txtMoTa = new JTextField();
		txtMoTa.setColumns(10);

		txtDuAn = new JTextField();
		txtDuAn.setColumns(10);

		cbbTenPhongBan = new JComboBox();

		JLabel lblTnPhngBan = new JLabel("Tên Phòng Ban");

		JLabel lblNewLabel_1 = new JLabel("Mô tả");

		JLabel lblNewLabel = new JLabel("Tên Dự Án");

		txtMaduAn = new JTextField();

		btnThemMoiDA = new JButton("Thêm Mới");
		btnThemMoiDA.addActionListener(new ActionListener() {
			private int stt = 0;

			public void actionPerformed(ActionEvent e) {
				String tenDuAn = "";
				String moTa = "";
				tenDuAn = txtDuAn.getText();
				moTa = txtMoTa.getText();
				if (tenDuAn.length() == 0) {
					JOptionPane.showMessageDialog(null, "Bạn phải nhập tên dự án");
					txtDuAn.requestFocus();
					return;
				}
				if (moTa.length() == 0) {
					JOptionPane.showMessageDialog(null, "Bạn phải nhập mô tả dự án");
					txtMoTa.requestFocus();
					return;
				}
				String maPhongBan = null;
				if (cbbTenPhongBan.getSelectedItem().toString().isEmpty() == false) {
					ComboItem obj = (ComboItem) cbbTenPhongBan.getSelectedItem();
					maPhongBan = obj.getValue().isEmpty() ? null : obj.getValue();
				}
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
				PreparedStatement ps = null;
				int maDuAn=0;
				try {
					conn = (Connection) dataSource.getConnection();
					stmt = (Statement) conn.createStatement();
					String sql = "insert into congty.duan(TenDuAn,MoTaDuAn,MaPhongBan) values(?,?,?) ";
					ps = conn.prepareStatement(sql, PreparedStatement.NO_GENERATED_KEYS);
					ps.setString(1, tenDuAn);
					ps.setString(2, moTa);
					ps.setString(3, maPhongBan);
					ps.executeUpdate();
					ResultSet rs=ps.getGeneratedKeys();
			        if(rs.next())
			        {
			        	maDuAn=rs.getInt(1);
			        }
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
				
				
				
				for (DTO_NhanVienDuAn item : listNhanVien) {
					try {
						conn = (Connection) dataSource.getConnection();
						stmt = (Statement) conn.createStatement();
						String sql = "insert into congty.nhanvienduan(MaNhanVien,MaDuAn,ThoiGianBatDau,ThoiGianKetThuc) values(?,?,?,?) ";
						ps = conn.prepareStatement(sql);
						ps.setInt(1, item.getMaNhanVien());
						ps.setInt(2, maDuAn);
						ps.setDate(3, new java.sql.Date(item.getThoiGianBatDau().getTime()));
						ps.setDate(4, new java.sql.Date(item.getThoiGianKetThuc().getTime()));
						ps.executeUpdate();
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
				}

				listNhanVien.clear();
				loadDSNhanVien();
				loadTable();
				setEmptyField();
			}
		});
		btnSuaDA = new JButton("Sửa");
		btnSuaDA.setEnabled(false);
		btnSuaDA.addActionListener(new ActionListener() {
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
				int MaDuAn = -1;
				String maPhongBan = null;
				if (cbbTenPhongBan.getSelectedItem().toString().isEmpty() == false) {
					ComboItem obj = (ComboItem) cbbTenPhongBan.getSelectedItem();
					maPhongBan = obj.getValue().isEmpty() ? null : obj.getValue();
				}

				if (!txtMaduAn.getText().trim().isEmpty()) {
					MaDuAn = Integer.parseInt(txtMaduAn.getText());
				}
				if (MaDuAn == -1) {
					JOptionPane.showMessageDialog(null, "Bạn chưa chọn dữ liệu cần UPDATE");
					return;
				}
				try {
					c = (Connection) dataSource.getConnection();
					stmt = (Statement) c.createStatement();
					ps = c.prepareStatement(
							"update  congty.duan set TenDuAn = ? , MoTaDuAn = ? , MaPhongBan = ? where MaDuAn = ?");
					String tenDuAn = txtDuAn.getText();
					if (tenDuAn.length() == 0) {
						JOptionPane.showMessageDialog(null, "Tên Dự Án đang trống");
						txtDuAn.requestFocus();
						return;
					}
					ps.setString(1, tenDuAn);
					String moTa = txtMoTa.getText();
					if (moTa.length() == 0) {
						JOptionPane.showMessageDialog(null, "Mô Tả Dự Án đang trống");
						txtMoTa.requestFocus();
						return;
					}
					ps.setString(2, moTa);
					ps.setString(3, maPhongBan);
					ps.setInt(4, MaDuAn);
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
				try {
					c = (Connection) dataSource.getConnection();
					stmt = (Statement) c.createStatement();
					String sql = "delete from congty.nhanvienduan where MaDuAn = ? ";
					ps = c.prepareStatement(sql);
					ps.setInt(1, MaDuAn);
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
				
				for (DTO_NhanVienDuAn item : listNhanVien) {
					try {
						c = (Connection) dataSource.getConnection();
						stmt = (Statement) c.createStatement();
						String sql = "insert into congty.nhanvienduan(MaNhanVien,MaDuAn,ThoiGianBatDau,ThoiGianKetThuc) values(?,?,?,?) ";
						ps = c.prepareStatement(sql);
						ps.setInt(1, item.getMaNhanVien());
						ps.setInt(2, MaDuAn);
						ps.setDate(3, new java.sql.Date(item.getThoiGianBatDau().getTime()));
						ps.setDate(4, new java.sql.Date(item.getThoiGianKetThuc().getTime()));
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
				}

				listNhanVien.clear();
				loadDSNhanVien();
				loadTable();
				setEmptyField();
				setEmptyNhanVienField();
				btnThemMoiDA.setEnabled(true);
			}
		});

		btnXoaDA = new JButton("Xóa");
		btnXoaDA.setEnabled(false);
		btnXoaDA.addActionListener(new ActionListener() {
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
				int row = tblDanhSach3.getSelectedRow();
				if (row == -1) {
					JOptionPane.showMessageDialog(null, "Chọn bản ghi cần xóa");
					return;
				}
				if (JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa không ?", "Thông Báo",
						JOptionPane.YES_NO_OPTION) != JOptionPane.YES_OPTION) {
					return;
				}

				try {
					c = (Connection) dataSource.getConnection();
					stmt = (Statement) c.createStatement();
					ps = c.prepareStatement("Delete From duan where MaDuAn = ?");
					ps.setString(1, tblDanhSach3.getValueAt(tblDanhSach3.getSelectedRow(), 0).toString());
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
				
				try {
					c = (Connection) dataSource.getConnection();
					stmt = (Statement) c.createStatement();
					ps = c.prepareStatement("Delete From nhanvienduan where MaDuAn = ?");
					ps.setString(1, tblDanhSach3.getValueAt(tblDanhSach3.getSelectedRow(), 0).toString());
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
				
				listNhanVien.clear();
				loadDSNhanVien();
				
				loadTable();
				setEmptyField();
				btnThemMoiDA.setEnabled(true);
			}
		});
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup().addGap(24)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING).addComponent(lblNewLabel)
								.addComponent(lblNewLabel_1).addComponent(lblTnPhngBan))
						.addGap(26)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(txtMoTa, GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
								.addComponent(cbbTenPhongBan, 0, 566, Short.MAX_VALUE)
								.addComponent(txtDuAn, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(txtMaduAn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGap(46).addComponent(btnThemMoiDA).addGap(18).addComponent(btnSuaDA)
						.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(btnXoaDA).addGap(92)));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup().addGap(21).addGroup(gl_panel
						.createParallelGroup(Alignment.TRAILING).addGroup(gl_panel.createSequentialGroup()
								.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE).addComponent(btnThemMoiDA)
										.addComponent(btnXoaDA).addComponent(btnSuaDA))
								.addGap(38))
						.addGroup(gl_panel.createSequentialGroup()
								.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabel)
										.addComponent(txtDuAn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
								.addGap(8)
								.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING).addComponent(lblNewLabel_1)
										.addComponent(txtMoTa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
										.addComponent(cbbTenPhongBan, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblTnPhngBan).addComponent(txtMaduAn, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGap(19)))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		panel.setLayout(gl_panel);
		txtMaduAn.setVisible(false);

		panel_2 = new JPanel();
		splitPane.setRightComponent(panel_2);

		splitPane_1 = new JSplitPane();
		splitPane_1.setAlignmentX(100.1f);
		splitPane_1.setOrientation(JSplitPane.VERTICAL_SPLIT);

		panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "Th\u00F4ng tin nh\u00E2n vi\u00EAn tham gia d\u1EF1 \u00E1n",
				TitledBorder.LEADING, TitledBorder.TOP, null, null));
		splitPane_1.setLeftComponent(panel_3);

		splitPane_3 = new JSplitPane();
		splitPane_3.setOrientation(JSplitPane.VERTICAL_SPLIT);

		panel_9 = new JPanel();
		splitPane_3.setLeftComponent(panel_9);

		tblNhanVien = new JTable();
		tblNhanVien.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int i = tblNhanVien.getSelectedRow();
				TableModel model = tblNhanVien.getModel();
				txtBatDau.setText(model.getValueAt(i, 2).toString());
				int MaNhanVien = tblNhanVien.getSelectedRow();
				txtKetThuc.setText(model.getValueAt(i, 3).toString());
				cbbNhanVien.setSelectedItem(new ComboItem(model.getValueAt(i, 1).toString()));
				txtMaNhanVien.setText(model.getValueAt(i, 0).toString());
				btnThemNhanVienDuAN.setEnabled(false);
				btnXoaNhanVienDuAn.setEnabled(true);
				btnSuaNhanVienDuAn.setEnabled(true);

			}
		});
		loadDSNhanVien();

		scrollPane = new JScrollPane(tblNhanVien);
		GroupLayout gl_panel_9 = new GroupLayout(panel_9);
		gl_panel_9.setHorizontalGroup(gl_panel_9.createParallelGroup(Alignment.TRAILING).addGroup(Alignment.LEADING,
				gl_panel_9.createSequentialGroup()
						.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 886, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		gl_panel_9.setVerticalGroup(gl_panel_9.createParallelGroup(Alignment.LEADING).addComponent(scrollPane,
				GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE));
		panel_9.setLayout(gl_panel_9);

		panel_10 = new JPanel();
		splitPane_3.setRightComponent(panel_10);

		txtBatDau = new JTextField();
		txtBatDau.setColumns(10);

		txtKetThuc = new JTextField();
		txtKetThuc.setColumns(10);

		cbbNhanVien = new JComboBox();
		loadNhanVien();
		lblNgyBtu = new JLabel("Ngày bắt đầu tham gia:");

		lblNgyKtThc = new JLabel("Ngày kết thúc làm dự án:");

		lblNhnVin = new JLabel("Nhân viên:");

		btnThemNhanVienDuAN = new JButton("Thêm nhân viên vào dự án");
		btnThemNhanVienDuAN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int maNhanVien = 0;
				String hoten = "";
				String ketThuc = "";
				ketThuc = txtKetThuc.getText();
				if (cbbNhanVien.getSelectedItem().toString().isEmpty() == false) {
					ComboItem obj = (ComboItem) cbbNhanVien.getSelectedItem();
					maNhanVien = obj.getValue().isEmpty() ? 0 : Integer.parseInt(obj.getValue());
					hoten = obj.getText();
				}

				String batDau = txtBatDau.getText();
				if (batDau.length() == 0) {
					JOptionPane.showMessageDialog(null, "Bạn phải nhập bắt đầu");
					txtBatDau.requestFocus();
					return;
				}
				SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
				df.setLenient(false);
				java.util.Date dtbatDau;
				try {
					dtbatDau = (java.util.Date) df.parse(batDau);
					txtBatDau.requestFocus();

				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Ngày Bắt Đầu không hợp lệ");
					txtBatDau.requestFocus();
					return;

				}

				if (ketThuc.length() == 0) {
					JOptionPane.showMessageDialog(null, "Bạn phải nhập ngày Kết Thúc");
					txtKetThuc.requestFocus();
					return;
				}
				SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd");
				df1.setLenient(false);
				java.util.Date dtKetThuc;
				try {
					dtKetThuc = (java.util.Date) df1.parse(ketThuc);
					txtKetThuc.requestFocus();
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Ngày kết thúc không hợp lệ");
					txtKetThuc.requestFocus();
					return;
				}
				if(dtbatDau.getTime() < dtKetThuc.getTime() == false)
				{
					JOptionPane.showMessageDialog(null, "Ngày bắt đầu và Ngày kết thúc không hợp lệ");
					txtBatDau.requestFocus();
					return;
				}
				if (listNhanVien.size() > 0) {
					for (int i = 0; i < listNhanVien.size(); i++) {
						DTO_NhanVienDuAn obj = listNhanVien.get(i);
						if (obj.getMaNhanVien() == maNhanVien) {
							JOptionPane.showMessageDialog(null, "Nhân viên đã tham gia dự án`");
							return;
						}
					}
				}

				DTO_NhanVienDuAn obj = new DTO_NhanVienDuAn();

				obj.setMaNhanVien(maNhanVien);
				obj.setHoTen(hoten);
				obj.setThoiGianBatDau(dtbatDau);
				obj.setThoiGianKetThuc(dtKetThuc);
				listNhanVien.add(obj);
				loadDSNhanVien();
				setEmptyNhanVienField();
			}
		});

		btnSuaNhanVienDuAn = new JButton("Thay đổi nhân viên dự án");
		btnSuaNhanVienDuAn.setEnabled(false);
		btnSuaNhanVienDuAn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int id;
				if (txtMaNhanVien.getText() == "" || txtMaNhanVien.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Chọn bản ghi cần sửa");
					return;
				}
				id = Integer.parseInt(txtMaNhanVien.getText());
				int maNhanVien = 0;
				String hoten = "";
				String ketThuc = "";
				ketThuc = txtKetThuc.getText();
				if (cbbNhanVien.getSelectedItem().toString().isEmpty() == false) {
					ComboItem obj = (ComboItem) cbbNhanVien.getSelectedItem();
					maNhanVien = obj.getValue().isEmpty() ? 0 : Integer.parseInt(obj.getValue());
					hoten = obj.getText();
				}
				String batDau = txtBatDau.getText();
				if (batDau.length() == 0) {
					JOptionPane.showMessageDialog(null, "Bạn phải nhập bắt đầu");
					txtBatDau.requestFocus();
					return;
				}
				SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
				df.setLenient(false);
				java.util.Date dtbatDau;
				try {
					dtbatDau = (java.util.Date) df.parse(batDau);
					txtBatDau.requestFocus();

				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Ngày Bắt Đầu không hợp lệ");
					txtBatDau.requestFocus();
					return;

				}

				if (ketThuc.length() == 0) {
					JOptionPane.showMessageDialog(null, "Bạn phải nhập ngày Kết Thúc");
					txtKetThuc.requestFocus();
					return;
				}
				SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd");
				df1.setLenient(false);
				java.util.Date dtKetThuc;
				try {
					dtKetThuc = (java.util.Date) df1.parse(ketThuc);
					txtKetThuc.requestFocus();
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Ngày kết thúc không hợp lệ");
					txtKetThuc.requestFocus();
					return;
				}
				if(dtbatDau.getTime() < dtKetThuc.getTime() == false)
				{
					JOptionPane.showMessageDialog(null, "Ngày bắt đầu và Ngày kết thúc không hợp lệ");
					txtBatDau.requestFocus();
					return;
				}
				if (listNhanVien.size() > 0) {
					for (int i = 0; i < listNhanVien.size(); i++) {
						DTO_NhanVienDuAn obj = listNhanVien.get(i);
						if (obj.getMaNhanVien() == maNhanVien && id != maNhanVien) {
							JOptionPane.showMessageDialog(null, "Nhân viên đã tham gia dự án`");
							return;
						}
					}
				}

				if (listNhanVien.size() > 0) {
					for (int i = 0; i < listNhanVien.size(); i++) {
						if (listNhanVien.get(i).getMaNhanVien() == id) {
							listNhanVien.get(i).setMaNhanVien(maNhanVien);
							listNhanVien.get(i).setHoTen(hoten);
							listNhanVien.get(i).setThoiGianBatDau(dtbatDau);
							listNhanVien.get(i).setThoiGianKetThuc(dtKetThuc);
							break;
						}
					}
				}
				loadDSNhanVien();
				btnThemNhanVienDuAN.setEnabled(true);
			}
		});

		btnXoaNhanVienDuAn = new JButton("Xóa nhân viên khỏi dự án");
		btnXoaNhanVienDuAn.setEnabled(false);
		btnXoaNhanVienDuAn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int row = tblNhanVien.getSelectedRow();
				if (row == -1) {
					JOptionPane.showMessageDialog(null, "Chọn bản ghi cần xóa");
					return;
				}
				int maNhanVien = (int) tblNhanVien.getValueAt(row, 0);
				if (listNhanVien.size() > 0) {
					for (int i = 0; i < listNhanVien.size(); i++) {
						DTO_NhanVienDuAn obj = listNhanVien.get(i);
						if (obj.getMaNhanVien() == maNhanVien) {
							listNhanVien.remove(obj);
							break;
						}
					}
				}

				loadDSNhanVien();
				setEmptyNhanVienField();
				btnThemNhanVienDuAN.setEnabled(true);

			}
		});
		panel_3.setLayout(new BorderLayout(0, 80));

		txtMaNhanVien = new JTextField();
		txtMaNhanVien.setVisible(false);
		;

		GroupLayout gl_panel_10 = new GroupLayout(panel_10);
		gl_panel_10
				.setHorizontalGroup(gl_panel_10.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_10
								.createSequentialGroup()
								.addGroup(gl_panel_10.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel_10
												.createSequentialGroup().addGap(21).addGroup(gl_panel_10
														.createParallelGroup(Alignment.TRAILING)
														.addGroup(gl_panel_10.createSequentialGroup()
																.addComponent(lblNhnVin).addGap(79))
														.addGroup(gl_panel_10.createSequentialGroup()
																.addComponent(lblNgyBtu).addGap(18)))
												.addGroup(gl_panel_10.createParallelGroup(Alignment.LEADING, false)
														.addComponent(txtBatDau, GroupLayout.DEFAULT_SIZE, 189,
																Short.MAX_VALUE)
														.addComponent(cbbNhanVien, 0, GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE))
												.addGap(39)
												.addGroup(gl_panel_10.createParallelGroup(Alignment.TRAILING)
														.addComponent(txtMaNhanVien, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
														.addGroup(gl_panel_10.createSequentialGroup()
																.addComponent(lblNgyKtThc).addPreferredGap(
																		ComponentPlacement.RELATED))))
										.addGroup(gl_panel_10.createSequentialGroup().addGap(99)
												.addComponent(btnThemNhanVienDuAN, GroupLayout.PREFERRED_SIZE, 210,
														GroupLayout.PREFERRED_SIZE)
												.addGap(29).addComponent(btnSuaNhanVienDuAn, GroupLayout.PREFERRED_SIZE,
														195, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_panel_10.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel_10.createSequentialGroup().addGap(18)
												.addComponent(btnXoaNhanVienDuAn))
										.addGroup(gl_panel_10.createSequentialGroup().addGap(6).addComponent(txtKetThuc,
												GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)))
								.addGap(328)));
		gl_panel_10.setVerticalGroup(gl_panel_10.createParallelGroup(Alignment.LEADING).addGroup(gl_panel_10
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_panel_10.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_10.createSequentialGroup()
								.addGroup(gl_panel_10.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNhnVin).addComponent(cbbNhanVien,
												GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
								.addGap(18)
								.addGroup(gl_panel_10.createParallelGroup(Alignment.BASELINE).addComponent(lblNgyBtu)
										.addComponent(txtBatDau, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNgyKtThc).addComponent(txtKetThuc, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_10.createSequentialGroup().addGap(5).addComponent(txtMaNhanVien,
								GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(gl_panel_10.createParallelGroup(Alignment.BASELINE).addComponent(btnThemNhanVienDuAN)
						.addComponent(btnXoaNhanVienDuAn).addComponent(btnSuaNhanVienDuAn))
				.addContainerGap()));
		panel_10.setLayout(gl_panel_10);
		panel_3.add(splitPane_3);

		panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(null, "Danh s\u00E1ch d\u1EF1 \u00E1n", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));
		splitPane_1.setRightComponent(panel_4);
		panel_4.setLayout(new BoxLayout(panel_4, BoxLayout.X_AXIS));

		splitPane_2 = new JSplitPane();
		splitPane_2.setOrientation(JSplitPane.VERTICAL_SPLIT);
		panel_4.add(splitPane_2);

		panel_5 = new JPanel();
		splitPane_2.setLeftComponent(panel_5);

		panel_8 = new JPanel();

		txtTimKiemDa = new JTextField();
		txtTimKiemDa.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Tìm Kiếm Dự Án");

		JButton btnHuyDa = new JButton("Hủy");

		JButton btnTimKiemDa = new JButton("Tìm");
		GroupLayout gl_panel_5 = new GroupLayout(panel_5);
		gl_panel_5.setHorizontalGroup(gl_panel_5.createParallelGroup(Alignment.LEADING).addComponent(panel_8,
				GroupLayout.PREFERRED_SIZE, 876, GroupLayout.PREFERRED_SIZE));
		gl_panel_5.setVerticalGroup(gl_panel_5.createParallelGroup(Alignment.LEADING).addComponent(panel_8,
				GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE));
		
		JButton btnKHDA = new JButton("Khách Hàng Dự Án");
		btnKHDA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new KhachHangDuAn().setVisible(true);
				F_DuAn.this.dispose();
				
			}
		});
		GroupLayout gl_panel_8 = new GroupLayout(panel_8);
		gl_panel_8.setHorizontalGroup(
			gl_panel_8.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_8.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_3)
					.addGap(29)
					.addComponent(txtTimKiemDa, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnTimKiemDa)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnHuyDa)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnKHDA)
					.addGap(407))
		);
		gl_panel_8.setVerticalGroup(
			gl_panel_8.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_8.createSequentialGroup()
					.addContainerGap(19, Short.MAX_VALUE)
					.addGroup(gl_panel_8.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(txtTimKiemDa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnTimKiemDa)
						.addComponent(btnHuyDa)
						.addComponent(btnKHDA)))
		);
		panel_8.setLayout(gl_panel_8);
		panel_5.setLayout(gl_panel_5);
		btnTimKiemDa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
							"select t1.MaDuAn , t1.TenDuAn , t1.MoTaDuAn , t2.TenPhongBan from duan as t1 left join phongban as t2 on t1.MaPhongBan = t2.MaPhongBan where t1.TenDuAn like '%"
									+ txtTimKiemDa.getText() + "%'");
					DefaultTableModel model = new DefaultTableModel(new Object[][] {}, new String[] { "Mã Dự Án",
							"T\u00EAn D\u1EF1 \u00C1n", "M\u00F4 T\u1EA3 D\u1EF1 \u00C1n", "Tên Phòng Ban" });
					if (rs.isBeforeFirst() == false) {
						JOptionPane.showMessageDialog(null, "không có dữ liệu hiển thị");
						return;
					}

					while (rs.next()) {
						int maDuAn = rs.getInt("MaDuAn");
						String tenDuAn = rs.getString("TenDuAn");
						String mota = rs.getString("MoTaDuAn");
						String tenPhongBan = rs.getString("TenPhongBan");
						model.addRow(new Object[] { maDuAn, tenDuAn, mota, tenPhongBan != null ? tenPhongBan : "" });

					}
					tblDanhSach3.setModel(model);

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
		btnHuyDa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtTimKiemDa.setText("");
				setEmptyField();
				setEmptyNhanVienField();
				listNhanVien.clear();
				loadDSNhanVien();
				loadTable();
			}
		});

		panel_6 = new JPanel();
		splitPane_2.setRightComponent(panel_6);
		tblDanhSach3 = new JTable();
		tblDanhSach3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int i = tblDanhSach3.getSelectedRow();
				TableModel model = tblDanhSach3.getModel();
				txtDuAn.setText(model.getValueAt(i, 1).toString());
				txtMoTa.setText(model.getValueAt(i, 2).toString());
				txtMaduAn.setText(model.getValueAt(i, 0).toString());
				cbbTenPhongBan.setSelectedItem(new ComboItem(model.getValueAt(i, 3).toString()));
				btnThemMoiDA.setEnabled(false);
				btnXoaDA.setEnabled(true);
				btnSuaDA.setEnabled(true);
				int maDuAn = Integer.parseInt(model.getValueAt(i, 0).toString());
				loadDsNhanVien(maDuAn);
				
				
			}
		});
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.X_AXIS));
		panel_6.setLayout(new BoxLayout(panel_6, BoxLayout.X_AXIS));
		JScrollPane scrollpane = new JScrollPane(tblDanhSach3);
		scrollpane.setPreferredSize(new Dimension(300, 100));
		panel_6.add(scrollpane);
		panel_2.add(splitPane_1);
		loadTable();
		loadTenPhongBan();

	}
}
