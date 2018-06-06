package DATN;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class F_Main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					F_Main frame = new F_Main();
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
	public F_Main() {
		setTitle("QUẢN LÝ DỰ ÁN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		JPanel panel = new JPanel();
		panel.setMinimumSize(new Dimension(10, 300));
		panel.setPreferredSize(new Dimension(10, 250));
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "CÁC CHỨC NĂNG QUẢN LÝ",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
		contentPane.add(panel, BorderLayout.NORTH);

		JButton btnNewButton = new JButton("Quản lý Khách Hàng");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				F_KhachHang a = new F_KhachHang();
				a.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				a.setVisible(true);

			}
		});

		JLabel lblNewLabel = new JLabel("Mời chọn chức năng");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JButton btnQunLD = new JButton("Quản lý Dự Án");
		btnQunLD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				F_DuAn b = new F_DuAn();
				b.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				b.setVisible(true);

			}
		});

		JButton btnQunLNhn = new JButton("Quản lý Nhân Viên");
		btnQunLNhn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				F_NhanVien c = new F_NhanVien();
				c.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				c.setVisible(true);
				;

			}
		});

		JButton btnQunLPhng = new JButton("Quản lý Phòng Ban");
		btnQunLPhng.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				F_PhongBan d = new F_PhongBan();
				d.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				d.setVisible(true);

			}
		});
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup().addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel
								.createSequentialGroup().addContainerGap().addGroup(gl_panel
										.createParallelGroup(Alignment.LEADING, false)
										.addComponent(btnQunLD, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
								.addPreferredGap(ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
										.addComponent(btnQunLNhn, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(btnQunLPhng, GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))
						.addGroup(gl_panel.createSequentialGroup().addGap(130).addComponent(lblNewLabel)))
						.addContainerGap()));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup().addGap(21).addComponent(lblNewLabel).addGap(29)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnQunLNhn, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(btnQunLPhng, GroupLayout.PREFERRED_SIZE, 52,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(btnQunLD, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))
						.addGap(27)));
		panel.setLayout(gl_panel);
	}
}
