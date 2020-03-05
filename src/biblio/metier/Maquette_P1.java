package biblio.metier;

import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JPanel;

public class Maquette_P1 {

	private JFrame frmSaisieDesDonnes;
	private final JTextField textField = new JTextField();
	private final JLabel lblNewLabel = new JLabel("N\u00B0 employ\u00E9 :");
	private final JLabel lblNewLabel_1 = new JLabel("Bilbioth\u00E8que de la ville de Noisiel");
	private final JLabel lblMotDePasse = new JLabel("Mot de passe :");
	private final JTextField textField_1 = new JTextField();
	private final JButton btnNewButton = new JButton("Annulation");
	private final JButton btnValidation = new JButton("Validation");
	private final JLabel label = new JLabel("New label");
	private final JLabel label_1 = new JLabel("New label");
	private final JLabel lblNewLabel_2 = new JLabel("New label");
	private final JLabel label_2 = new JLabel("New label");
	private final JPanel panel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Maquette_P1 window = new Maquette_P1();
					window.frmSaisieDesDonnes.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Maquette_P1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		textField.setBounds(235, 110, 96, 20);
		textField.setColumns(10);
		frmSaisieDesDonnes = new JFrame();
		frmSaisieDesDonnes.setTitle("Saisie des donn\u00E9es du USER");
		frmSaisieDesDonnes.setBounds(100, 100, 473, 325);
		frmSaisieDesDonnes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSaisieDesDonnes.getContentPane().setLayout(null);
		
		frmSaisieDesDonnes.getContentPane().add(textField);
		lblNewLabel.setBounds(102, 114, 96, 13);
		
		frmSaisieDesDonnes.getContentPane().add(lblNewLabel);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(102, 28, 242, 20);
		
		frmSaisieDesDonnes.getContentPane().add(lblNewLabel_1);
		lblMotDePasse.setBounds(102, 167, 96, 13);
		
		frmSaisieDesDonnes.getContentPane().add(lblMotDePasse);
		textField_1.setColumns(10);
		textField_1.setBounds(235, 163, 96, 20);
		
		frmSaisieDesDonnes.getContentPane().add(textField_1);
		btnNewButton.setBounds(91, 232, 89, 23);
		
		frmSaisieDesDonnes.getContentPane().add(btnNewButton);
		btnValidation.setBounds(271, 232, 89, 23);
		
		frmSaisieDesDonnes.getContentPane().add(btnValidation);
		label.setIcon(new ImageIcon("D:\\TP_JAVA\\Swing\\books-48.png"));
		label.setBounds(52, 11, 53, 56);
		
		frmSaisieDesDonnes.getContentPane().add(label);
		label_1.setIcon(new ImageIcon("D:\\TP_JAVA\\Swing\\books-48.png"));
		label_1.setBounds(349, 11, 53, 56);
		
		frmSaisieDesDonnes.getContentPane().add(label_1);
		lblNewLabel_2.setIcon(new ImageIcon("D:\\TP_JAVA\\Swing\\Password-16.png"));
		lblNewLabel_2.setBounds(342, 165, 20, 17);
		
		frmSaisieDesDonnes.getContentPane().add(lblNewLabel_2);
		label_2.setIcon(new ImageIcon("D:\\TP_JAVA\\Swing\\User-16.png"));
		label_2.setBounds(341, 113, 20, 17);
		
		frmSaisieDesDonnes.getContentPane().add(label_2);
		panel.setBounds(74, 93, 314, 111);
		
		frmSaisieDesDonnes.getContentPane().add(panel);
	}
}
