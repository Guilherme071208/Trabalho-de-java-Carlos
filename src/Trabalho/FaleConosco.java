package Trabalho;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;

public class FaleConosco extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textReclamação;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FaleConosco frame = new FaleConosco();
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
	public FaleConosco() {
		setTitle("Ouvidoria");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ouvidoria");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 25));
		lblNewLabel.setBounds(164, 0, 117, 50);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Fale com nossa equipe:");
		lblNewLabel_1.setFont(new Font("Arial", Font.ITALIC, 14));
		lblNewLabel_1.setBounds(18, 40, 156, 34);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Sair");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			dispose();
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 11));
		btnNewButton.setBounds(345, 238, 89, 23);
		contentPane.add(btnNewButton);
		
		textReclamação = new JTextField();
		textReclamação.setBounds(8, 85, 250, 67);
		contentPane.add(textReclamação);
		textReclamação.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Limpar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 textReclamação.setText("");
			}
		});
		btnNewButton_1.setBounds(164, 163, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(235, 76, 78, 23);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Gmail: gui.ghcb@gmail.com");
		lblNewLabel_3.setForeground(new Color(255, 128, 128));
		lblNewLabel_3.setBounds(263, 163, 391, 23);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Nº - 81 997152445");
		lblNewLabel_4.setForeground(new Color(255, 128, 128));
		lblNewLabel_4.setBounds(301, 134, 103, 14);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton_2 = new JButton("Enviar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				System.out.println("Nome:" + textReclamação.getText());
			}
			
		});
		btnNewButton_2.setBounds(18, 163, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_5 = new JLabel("Obrigado, pela colaboração!");
		lblNewLabel_5.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_5.setBounds(19, 197, 213, 38);
		contentPane.add(lblNewLabel_5);
	}
}
