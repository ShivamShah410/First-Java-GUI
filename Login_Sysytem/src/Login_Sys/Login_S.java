package Login_Sys;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Login_S {

	private JFrame frame;
	private JTextField usern;
	private JTextField userp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		System.out.println("Welcome to my GUI...!!");
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_S window = new Login_S();
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
	public Login_S() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(200, 200, 500, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton Login = new JButton("Login");
		Login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Login.setBounds(42, 271, 114, 40);
		frame.getContentPane().add(Login);

		JButton btnNewButton = new JButton("Reset");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				usern.setText(null);
				userp.setText(null);
			}
		});
		btnNewButton.setBounds(183, 271, 114, 40);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Cancle");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JFrame framlogin = new JFrame();
				if (JOptionPane.showConfirmDialog(framlogin, "Confirm if you want to exit", "Login Systems",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}

			}
		});
		btnNewButton_1.setBounds(323, 271, 107, 40);
		frame.getContentPane().add(btnNewButton_1);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(187, 11, 49, 14);
		frame.getContentPane().add(lblNewLabel);

		JLabel uname = new JLabel("UserName");
		uname.setBounds(56, 65, 77, 51);
		frame.getContentPane().add(uname);

		JLabel upass = new JLabel("Password");
		upass.setBounds(56, 153, 77, 40);
		frame.getContentPane().add(upass);

		usern = new JTextField();
		usern.setBounds(204, 65, 178, 40);
		frame.getContentPane().add(usern);
		usern.setColumns(10);

		userp = new JTextField();
		userp.setBounds(204, 153, 178, 40);
		frame.getContentPane().add(userp);
		userp.setColumns(10);
	}
}
