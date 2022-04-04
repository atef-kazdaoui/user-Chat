package view;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import crud.userCrud;
import entity.userEntity;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class creerCompte extends JFrame {

	private JPanel contentPane;
	private JTextField nom;
	private JTextField prenom;
	private JTextField email;
	private JTextField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					creerCompte frame = new creerCompte();
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
	public creerCompte() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		nom = new JTextField();
		nom.setBounds(156, 53, 86, 20);
		contentPane.add(nom);
		nom.setColumns(10);
		
		prenom = new JTextField();
		prenom.setBounds(156, 113, 86, 20);
		contentPane.add(prenom);
		prenom.setColumns(10);
		
		email = new JTextField();
		email.setBounds(156, 164, 86, 20);
		contentPane.add(email);
		email.setColumns(10);
		
		password = new JTextField();
		password.setBounds(156, 212, 86, 20);
		contentPane.add(password);
		password.setColumns(10);
		
		JButton btnNewButton = new JButton("creer");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("user name "+ nom.getText());
				userEntity  user = new userEntity(nom.getText(),prenom.getText(),email.getText(),password.getText());
				userCrud us=userCrud.getInstance();
				us.ajouterUSer(user);
				connexion con = new connexion();
				con.show();
			}
		});
		btnNewButton.setBounds(335, 227, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("nom");
		lblNewLabel.setBounds(61, 56, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("prenom");
		lblNewLabel_1.setBounds(61, 116, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("email");
		lblNewLabel_2.setBounds(61, 167, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("password");
		lblNewLabel_3.setBounds(61, 215, 57, 14);
		contentPane.add(lblNewLabel_3);
	}

}
