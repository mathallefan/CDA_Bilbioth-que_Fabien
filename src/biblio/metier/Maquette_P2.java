package biblio.metier;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;

public class Maquette_P2 {

	private JFrame frmEmpruntDeLivres;
	private final JLabel label = new JLabel("Bilbioth\u00E8que de la ville de Noisiel");
	private final JLabel lblNUtilisateur = new JLabel("N\u00B0 Utilisateur :");
	private final JTextField textField = new JTextField();
	private final JLabel lblNExemplaireN = new JLabel("N\u00B0 Exemplaire n\u00B01 :");
	private final JTextField textField_1 = new JTextField();
	private final JLabel lblNExemplaireN_1 = new JLabel("N\u00B0 Exemplaire n\u00B02 :");
	private final JTextField textField_2 = new JTextField();
	private final JLabel lblNExemplaireN_2 = new JLabel("N\u00B0 Exemplaire n\u00B03 :");
	private final JTextField textField_3 = new JTextField();
	private final JButton btnNewButton = new JButton("Annulation");
	private final JButton btnValidation = new JButton("Validation");
	private final JLabel lblNewLabel = new JLabel("New label");
	private final JLabel label_1 = new JLabel("New label");
	private final JLabel lblNewLabel_1 = new JLabel("New label");
	private final JLabel label_2 = new JLabel("New label");
	private final JLabel label_3 = new JLabel("New label");
	private final JPanel panel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Maquette_P2 window = new Maquette_P2();
					window.frmEmpruntDeLivres.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Maquette_P2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEmpruntDeLivres = new JFrame();
		frmEmpruntDeLivres.setTitle("Emprunt de livres pour un utilisateur");
		frmEmpruntDeLivres.setBounds(100, 100, 450, 326);
		frmEmpruntDeLivres.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEmpruntDeLivres.getContentPane().setLayout(null);
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(89, 28, 253, 20);
		
		frmEmpruntDeLivres.getContentPane().add(label);
		lblNUtilisateur.setBounds(101, 74, 96, 13);
		
		frmEmpruntDeLivres.getContentPane().add(lblNUtilisateur);
		textField.setColumns(10);
		textField.setBounds(234, 70, 96, 20);
		
		frmEmpruntDeLivres.getContentPane().add(textField);
		lblNExemplaireN.setBounds(79, 126, 96, 13);
		
		frmEmpruntDeLivres.getContentPane().add(lblNExemplaireN);
		textField_1.setColumns(10);
		textField_1.setBounds(212, 122, 96, 20);
		
		frmEmpruntDeLivres.getContentPane().add(textField_1);
		lblNExemplaireN_1.setBounds(79, 166, 96, 13);
		
		frmEmpruntDeLivres.getContentPane().add(lblNExemplaireN_1);
		textField_2.setColumns(10);
		textField_2.setBounds(212, 162, 96, 20);
		
		frmEmpruntDeLivres.getContentPane().add(textField_2);
		lblNExemplaireN_2.setBounds(79, 207, 96, 13);
		
		frmEmpruntDeLivres.getContentPane().add(lblNExemplaireN_2);
		textField_3.setColumns(10);
		textField_3.setBounds(212, 203, 96, 20);
		
		frmEmpruntDeLivres.getContentPane().add(textField_3);
		btnNewButton.setBounds(89, 253, 89, 23);
		
		frmEmpruntDeLivres.getContentPane().add(btnNewButton);
		btnValidation.setBounds(268, 253, 89, 23);
		
		frmEmpruntDeLivres.getContentPane().add(btnValidation);
		lblNewLabel.setIcon(new ImageIcon("D:\\TP_JAVA\\Swing\\books-48.png"));
		lblNewLabel.setBounds(39, 10, 53, 56);
		
		frmEmpruntDeLivres.getContentPane().add(lblNewLabel);
		label_1.setIcon(new ImageIcon("D:\\TP_JAVA\\Swing\\books-48.png"));
		label_1.setBounds(352, 10, 53, 56);
		
		frmEmpruntDeLivres.getContentPane().add(label_1);
		lblNewLabel_1.setIcon(new ImageIcon("D:\\TP_JAVA\\Swing\\barcode-reader-24.png"));
		lblNewLabel_1.setBounds(318, 117, 30, 31);
		
		frmEmpruntDeLivres.getContentPane().add(lblNewLabel_1);
		label_2.setIcon(new ImageIcon("D:\\TP_JAVA\\Swing\\barcode-reader-24.png"));
		label_2.setBounds(318, 156, 30, 31);
		
		frmEmpruntDeLivres.getContentPane().add(label_2);
		label_3.setIcon(new ImageIcon("D:\\TP_JAVA\\Swing\\barcode-reader-24.png"));
		label_3.setBounds(318, 198, 30, 31);
		
		frmEmpruntDeLivres.getContentPane().add(label_3);
		panel.setBounds(52, 104, 324, 138);
		
		frmEmpruntDeLivres.getContentPane().add(panel);
	}
}
