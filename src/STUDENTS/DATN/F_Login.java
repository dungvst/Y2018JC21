package DATN;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class F_Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtTaiKhoan;
	private JPasswordField pstMatKhau;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					F_Login frame = new F_Login();
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
	public F_Login() {
		setTitle("LOGIN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblNewLabel = new JLabel("ĐĂNG NHẬP TÀI KHOẢN");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));

		JLabel lblNewLabel_1 = new JLabel("Tài Khoản");

		JLabel lblNewLabel_2 = new JLabel("Mật Khẩu");

		txtTaiKhoan = new JTextField();
		txtTaiKhoan.setColumns(10);

		JButton btnDangNhap = new JButton("Đăng Nhập");
		btnDangNhap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a;
				String b;
				a = txtTaiKhoan.getText();
				b = pstMatKhau.getText();
				if (a.length() == 0) {
					JOptionPane.showMessageDialog(null, "Bạn chưa nhập tài khoản", "Error", 2);
					return;
				}
				if (b.length() == 0) {
					JOptionPane.showMessageDialog(null, "Bạn chưa nhập mật khẩu", "Error", 2);
					return;

				}

				MysqlDataSource dataSource = new MysqlDataSource();
				dataSource.setUser("root");
				dataSource.setPassword("12345678");
				dataSource.setDatabaseName("congty");
				dataSource.setServerName("localhost");
				dataSource.setPort(3306);
				dataSource.setUseSSL(true);
				Connection conn = null;
				Statement stmt = null;
				ResultSet rs = null;
				PreparedStatement ps = null;

				try {
					conn = (Connection) dataSource.getConnection();
					stmt = (Statement) conn.createStatement();
					ps = conn.prepareStatement("select * from congty.dangnhap where TaiKhoan = ? and MatKhau = ?");
					ps.setString(1, txtTaiKhoan.getText());
					ps.setString(2, pstMatKhau.getText());
					rs = ps.executeQuery();
					if (rs.next()) {
						JOptionPane.showMessageDialog(null, "Bạn đã đăng nhập thành công", "Thông Báo", 1);
						new F_Main().setVisible(true);
						F_Login.this.dispose();

					} else {
						JOptionPane.showMessageDialog(null, "Tài Khoản hoặc Mật Khẩu không chính xác", "ERROR", 2);
						txtTaiKhoan.setText("");
						pstMatKhau.setText("");
						txtTaiKhoan.requestFocus();

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
		});

		JButton Huy = new JButton("Hủy");
		Huy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtTaiKhoan.setText("");
				pstMatKhau.setText("");
				txtTaiKhoan.requestFocus();
			}
		});

		pstMatKhau = new JPasswordField();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup().addContainerGap(109, Short.MAX_VALUE)
						.addComponent(lblNewLabel).addGap(99))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(35)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addComponent(lblNewLabel_1)
								.addComponent(lblNewLabel_2))
						.addGap(36)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(pstMatKhau, GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
								.addGroup(gl_contentPane.createSequentialGroup().addComponent(btnDangNhap)
										.addPreferredGap(ComponentPlacement.RELATED, 53, Short.MAX_VALUE).addComponent(
												Huy, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE))
								.addComponent(txtTaiKhoan, GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))
						.addGap(83)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addGap(23).addComponent(lblNewLabel).addGap(18)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabel_1)
								.addComponent(txtTaiKhoan, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addGap(28)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(lblNewLabel_2)
								.addComponent(pstMatKhau, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addGap(32).addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnDangNhap).addComponent(Huy))
						.addContainerGap(63, Short.MAX_VALUE)));
		contentPane.setLayout(gl_contentPane);
	}
}
