package Login_Sys;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;

public class Login_$ {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField txtPassword;
	protected JFrame frmLoginystem;
	protected Component frmLoginSystem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_$ window = new Login_$();
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
	public Login_$() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(200, 200, 500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login System");
		lblNewLabel.setBounds(200, 26, 116, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel txtUsedname = new JLabel("Usedname");
		txtUsedname.setBounds(79, 108, 59, 14);
		frame.getContentPane().add(txtUsedname);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(79, 150, 46, 14);
		frame.getContentPane().add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(182, 105, 102, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(182, 147, 102, 20);
		frame.getContentPane().add(txtPassword);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Password = txtPassword.getText();
				String Username = txtUsedname.getText();
				
				if(Password.contains("sai")&& Username.contains("one")) {
					txtPassword.setText(null);
					txtUsedname.setText(null);
				}else {
					JOptionPane.showMessageDialog(null, "Invlid Login Details","Login Error",JOptionPane.ERROR_MESSAGE);
					txtPassword.setText(null);
					txtUsedname.setText(null);
				}
			}
		});
		btnNewButton.setBounds(36, 207, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent age0) {
				txtUsedname.setText(null);
				txtPassword.setText(null);
			}
		});
		btnReset.setBounds(182, 207, 89, 23);
		frame.getContentPane().add(btnReset);
		
		JButton btnNewButton_2 = new JButton("Exit");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmLoginystem = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frmLoginSystem, "confirm if you want to exit","Login system",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
			
		}
				
			}
		});
		btnNewButton_2.setBounds(347, 207, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(25, 176, 432, 4);
		frame.getContentPane().add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(25, 51, 432, 4);
		frame.getContentPane().add(spinner_1);
	}
}
