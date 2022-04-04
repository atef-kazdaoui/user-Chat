package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Server extends JFrame {

	private JPanel contentPane;
	private JTextField name1;
	private JTextField name2;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Server frame = new Server();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Server() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		name1 = new JTextField();
		name1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createRoom();
			}
		});
		name1.setBounds(123, 80, 179, 32);
		contentPane.add(name1);
		name1.setColumns(10);
		
		name2 = new JTextField();
		name2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createRoom();
			}
		});
		name2.setBounds(123, 180, 179, 32);
		contentPane.add(name2);
		name2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("1st Username");
		lblNewLabel.setBounds(123, 41, 179, 28);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("2nd Username");
		lblNewLabel_1.setBounds(124, 144, 178, 25);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Join Chat");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createRoom();
			}
		});
		btnNewButton.setBounds(170, 227, 89, 23);
		contentPane.add(btnNewButton);
	}
	private  void createRoom() {
		String p1,p2;
		p1=name1.getText();
		p2=name2.getText();
		if(p1.equals("")|| p2.equals("")) {
			JOptionPane.showMessageDialog(null, "Merci d'entrer un nom d'utilisateur valide");
			return;
		}
		Window_1.username1=p1;
		Window_2.username2=p2;
		chatroom.createRoom();
	}
}
