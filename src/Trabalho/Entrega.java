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
		frmEntregaJ.setResizable(false);
		frmEntregaJ.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
		frmEntregaJ.setTitle("Entrega já");
		frmEntregaJ.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\André Gomes\\Downloads\\entrega-rapida.png"));
		frmEntregaJ.setBounds(100, 100, 621, 426);
		frmEntregaJ.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEntregaJ.getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(127, 0, 1193, 68);
		frmEntregaJ.getContentPane().add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Restaurante");
		mnNewMenu.setFont(new Font("Segoe UI", Font.BOLD, 15));
		menuBar.add(mnNewMenu);
		
		JButton btnNewButton = new JButton("Bode do Nó (Olinda)");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BodedoNó telaSla = new BodedoNó ();
				telaSla.setVisible(true);
				
			}

			
		});
		mnNewMenu.add(btnNewButton);
		
		JMenu mnNewMenu_1 = new JMenu("Mercado");
		mnNewMenu_1.setFont(new Font("Segoe UI", Font.BOLD, 15));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Novo Atacarejo");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NovoAtacarejo novo1=new NovoAtacarejo();
				novo1.setVisible(true);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_4 = new JMenu("Farmácia");
		mnNewMenu_4.setFont(new Font("Segoe UI", Font.BOLD, 15));
		menuBar.add(mnNewMenu_4);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Drograsil");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Drogasil novo2=new Drogasil();
				novo2.setVisible(true);
			}
		});
		mnNewMenu_4.add(mntmNewMenuItem);
		
		JMenu mnNewMenu_3 = new JMenu("Bebidas");
		mnNewMenu_3.setFont(new Font("Segoe UI", Font.BOLD, 15));
		menuBar.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Birita House");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BiritaHouse novo3=new BiritaHouse();
				novo3.setVisible(true);
			}
		});
		mnNewMenu_3.add(mntmNewMenuItem_3);
		
		JMenu mnNewMenu_2 = new JMenu("Pet");
		mnNewMenu_2.setFont(new Font("Segoe UI", Font.BOLD, 15));
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Zee now");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ZeeNow novo4=new ZeeNow();
				novo4.setVisible(true);
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_2);
		
		JMenu mnNewMenu_5 = new JMenu("Shopping");
		mnNewMenu_5.setFont(new Font("Segoe UI", Font.BOLD, 15));
		menuBar.add(mnNewMenu_5);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Ri Happy tacaruna");
		mnNewMenu_5.add(mntmNewMenuItem_4);
		
		JMenu mnNewMenu_6 = new JMenu("Início");
		mnNewMenu_6.setFont(new Font("Segoe UI", Font.BOLD, 15));
		menuBar.add(mnNewMenu_6);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Cadastro");
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cadastro novo7=new Cadastro();
				novo7.setVisible(true);
			}
		});
		mnNewMenu_6.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Fale Conosco");
		mntmNewMenuItem_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FaleConosco novo8=new FaleConosco();
				novo8.setVisible(true);
			}
		});
		mnNewMenu_6.add(mntmNewMenuItem_7);
		
		JLabel lblNewLabel = new JLabel("Entrega já");
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setForeground(new Color(0, 128, 64));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 21));
		lblNewLabel.setBounds(10, 11, 115, 57);
		frmEntregaJ.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("Saída");
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 12));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmEntregaJ.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(526, 353, 66, 26);
		frmEntregaJ.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\André Gomes\\Downloads\\Capturar caixa entrega.PNG"));
		lblNewLabel_1.setBounds(10, 79, 304, 297);
		frmEntregaJ.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\André Gomes\\Downloads\\Capturar caixa entrega2.PNG"));
		lblNewLabel_2.setBounds(324, 104, 268, 238);
		frmEntregaJ.getContentPane().add(lblNewLabel_2);
	}
}
