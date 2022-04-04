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
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class connexion extends JFrame {

	private JPanel contentPane;
	private JTextField email;
	private JTextField motDePasse;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					connexion frame = new connexion();
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
	public connexion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		email = new JTextField();
		email.setBounds(125, 86, 178, 20);
		contentPane.add(email);
		email.setColumns(10);
		
		motDePasse = new JTextField();
		motDePasse.setBounds(125, 159, 178, 20);
		contentPane.add(motDePasse);
		motDePasse.setColumns(10);
		
		JButton btnNewButton = new JButton("connection");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				userCrud us=userCrud.getInstance();
				userEntity user = us.getUser(email.getText());
				System.out.println(user.getEmail());
				System.out.println(user.getNom());
				System.out.println(user.getPrenom());
				System.out.println(user.getPassword());
				
				if(user.getPassword().equals(motDePasse.getText())) {
					JOptionPane.showMessageDialog(null, "welcome");
					Server serv= new Server();
							serv.show();
				}else {
					System.out.println("mot de passe incorrecte");
				}
			}
		});
		btnNewButton.setBounds(335, 227, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("email");
		lblNewLabel.setBounds(10, 89, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("mot de passe");
		lblNewLabel_1.setBounds(10, 162, 46, 14);
		contentPane.add(lblNewLabel_1);
	}

}
