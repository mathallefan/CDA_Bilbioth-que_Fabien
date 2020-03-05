package biblio.metier;

import java.util.Date;

public class Employe extends Utilisateur{
	
	
	private static String codeMatricule;
	private EnumCategorieEmploye cat;

	
	public Employe(String nom, String prenom, Date dateNaissance, String sexe, int idUtilisateur, String pwd,
			String pseudo, String codeMatricule, EnumCategorieEmploye cat) {
		super(nom, prenom, dateNaissance, sexe, idUtilisateur, pwd, pseudo);
		Employe.codeMatricule = codeMatricule;
		this.cat = cat;
	}


	public Employe() 	{}

	
	public static int getNbMaxPret() {
		return 50000;
	}


	public static String getCodeMatricule() {
		return codeMatricule;
	}


	public static void setCodeMatricule(String codeMatricule) {
		Employe.codeMatricule = codeMatricule;
	}


	public EnumCategorieEmploye getCat() {
		return cat;
	}


	public void setCat(EnumCategorieEmploye cat) {
		this.cat = cat;
	}
	
	
	
	
	
}
