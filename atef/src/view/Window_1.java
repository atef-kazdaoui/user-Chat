package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JLabel;
import view.Window_2;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Window_1 extends JFrame {
	static String username1;
	private JPanel contentPane;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window_1 frame = new Window_1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Window_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 385, 478);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 display1 = new JTextArea();
		display1.setBounds(10, 38, 291, 304);
		contentPane.add(display1);
		
		 text1 = new JTextArea();
		text1.setBounds(10, 368, 291, 60);
		contentPane.add(text1);
		
		 send1 = new JButton("SEND");
		send1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = text1.getText();
				if (s.equals("")) {
					return;
				}
				display1.append(username1+" : "+ s +"\n");
				Window_2.sendText();
				text1.setText("");
			}
		});
		send1.setBounds(300, 369, 69, 59);
		contentPane.add(send1);
		
		 label1 = new JLabel("chat window for : "+username1);
		label1.setBounds(10, 11, 184, 14);
		contentPane.add(label1);
		
		JButton clear = new JButton("CLEAR");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display1.setText("");
			}
		});
		clear.setBounds(270, 7, 89, 23);
		contentPane.add(clear);
	}

		public static void sendText() {
			String s = Window_2.text2.getText(); 
			if(s.equals("")) {
				return;
			}
			display1.append(Window_2.username2+": "+s+"\n");
			
		}
		private javax.swing.JLabel label1;
		private static javax.swing.JTextArea display1;
		private javax.swing.JButton send1;
		public static javax.swing.JTextArea text1;
}
