package Trabalho;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;

public class Entrega {

	private JFrame frmEntregaJ;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Entrega window = new Entrega();
					window.frmEntregaJ.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Entrega() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEntregaJ = new JFrame();
		frmEntregaJ.setTitle("Entrega já");
		frmEntregaJ.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\André Gomes\\Downloads\\entrega-rapida.png"));
		frmEntregaJ.setBounds(100, 100, 711, 418);
		frmEntregaJ.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEntregaJ.getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(135, 0, 519, 68);
		frmEntregaJ.getContentPane().add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Restaurante");
		mnNewMenu.setFont(new Font("Segoe UI", Font.BOLD, 15));
		menuBar.add(mnNewMenu);
		
		JButton btnNewButton = new JButton("FDXGDX");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cadastro telaSla = new cadastro();
				telaSla.setVisible(true);
				
			}

			
		});
		mnNewMenu.add(btnNewButton);
		
		JMenu mnNewMenu_4 = new JMenu("Farmácia");
		mnNewMenu_4.setFont(new Font("Segoe UI", Font.BOLD, 15));
		menuBar.add(mnNewMenu_4);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("New menu item");
		mnNewMenu_4.add(mntmNewMenuItem);
		
		JMenu mnNewMenu_1 = new JMenu("Mercado");
		mnNewMenu_1.setFont(new Font("Segoe UI", Font.BOLD, 15));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("New menu item");
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_2 = new JMenu("Farmácia");
		mnNewMenu_2.setFont(new Font("Segoe UI", Font.BOLD, 15));
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("New menu item");
		mnNewMenu_2.add(mntmNewMenuItem_2);
		
		JMenu mnNewMenu_3 = new JMenu("Bebidas");
		mnNewMenu_3.setFont(new Font("Segoe UI", Font.BOLD, 15));
		menuBar.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("New menu item");
		mnNewMenu_3.add(mntmNewMenuItem_3);
		
		JMenu mnNewMenu_5 = new JMenu("Shopping");
		mnNewMenu_5.setFont(new Font("Segoe UI", Font.BOLD, 15));
		menuBar.add(mnNewMenu_5);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("New menu item");
		mnNewMenu_5.add(mntmNewMenuItem_4);
		
		JLabel lblNewLabel = new JLabel("Entrega já");
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setForeground(new Color(0, 128, 64));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 21));
		lblNewLabel.setBounds(10, 11, 115, 57);
		frmEntregaJ.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\André Gomes\\Downloads\\FotoHamburguer.png"));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(61, 88, 386, 193);
		frmEntregaJ.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmEntregaJ.setVisible(false);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\André Gomes\\Downloads\\Design sem nome.jpg"));
		btnNewButton_1.setBounds(645, 342, 50, 37);
		frmEntregaJ.getContentPane().add(btnNewButton_1);
	}
}
