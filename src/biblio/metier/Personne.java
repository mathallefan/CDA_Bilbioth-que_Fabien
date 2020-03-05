package biblio.metier;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Personne {

	public static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private String nom,prenom,sexe;
	private Date dateNaissance;
	
	
	public Personne(String nom,String prenom, Date dateNaissance,String sexe) {
		setNom(nom);
		setPrenom(prenom);
		setDateNaissance(dateNaissance);
		setSexe(sexe);
	}
	
	
	public Personne() {}
	

	
	
	
	
	
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	
	public String getNom() {
			return nom;
		}
	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
			return prenom;
		}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
		
	
	
	
	
	@Override
	public String toString() {
		return ("nom : " + nom +" /prenom : "+ prenom+" /date de naissance : "+ sdf.format(dateNaissance) +" /sexe : "+ sexe);
	}
	
	
	
	
	
	
	
}
