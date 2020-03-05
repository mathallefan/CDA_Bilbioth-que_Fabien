package biblio.metier;

import java.util.Date;

public class Adherent extends Utilisateur{
	public static int nbMaxPret = 3;
	public final static int dureeMaxPret = 15;
	private String telephone;

	
	
	
	public Adherent(String nom, String prenom, Date dateNaissance, String sexe, int idUtilisateur, String pwd,
			String pseudo, String telephone) {
		super(nom, prenom, dateNaissance, sexe, idUtilisateur, pwd, pseudo);
		this.telephone = telephone;
	}


	public Adherent() 	{}

	
	public static int getNbMaxPret() {
		return nbMaxPret;
	}
	
	
	public String getTelephone() {
		return telephone;
	}
	
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	
}
