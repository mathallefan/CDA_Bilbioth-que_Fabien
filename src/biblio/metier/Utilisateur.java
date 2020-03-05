package biblio.metier;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import biblio.metier.EmpruntArchive;

public class Utilisateur extends Personne{
	private int idUtilisateur;
	String pwd, pseudo;
	
	
	

	public Utilisateur(String nom, String prenom, Date dateNaissance, String sexe, int idUtilisateur, String pwd,
			String pseudo) {
		super(nom, prenom, dateNaissance, sexe);
		this.idUtilisateur = idUtilisateur;
		this.pwd = pwd;
		this.pseudo = pseudo;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public Utilisateur(int idUtilisateur,String pwd, String Pseudo) {}
//	public Utilisateur(String nom) {super(nom);}
	public Utilisateur() {super();}
	

	
	
	
	
	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public int getIdUtilisateur() {
		return idUtilisateur;
	}


	public void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = ++idUtilisateur;
	}


	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getPseudo() {
		return pseudo;
	}



	
	ArrayList<EmpruntEnCours> emprunté = new ArrayList<EmpruntEnCours>();
	public ArrayList<EmpruntArchive> archivé = new ArrayList<EmpruntArchive>();
	
	
	
	
	public ArrayList<EmpruntEnCours> findAllEmpruntEnCours() {
		return emprunté;
	}
	
	public ArrayList<EmpruntArchive> findAllEmpruntArchive() {
		return archivé;
	}
	
	
	public void addEmpruntEnCours(EmpruntEnCours Emprunt) throws ParseException, biblioException {
	
			if (Emprunt != null) {
				// si employé pas de restriction
				if (Employe.getCodeMatricule() != null) {
					emprunté.add(Emprunt);
					Emprunt.getEx().setStatus(EnumStatusExemplaire.prêté);
				}else 
				//else adhérent
					if (emprunté.size() >= Adherent.getNbMaxPret()) {throw new biblioException("Vous avez déjà emprunté "+Adherent.getNbMaxPret() + " EmpruntEnCours, il faut d'abord restituer un EmpruntEnCours avant d'en emprunter un nouveau !");
						}else 
							if (Emprunt.getUt().getNbRetards()> 0 ) {throw new biblioException("Vous ne pouvez pas emprunter car vous avez " + Emprunt.getUt().getNbRetards() + " livres en retard !");
						
							}else {
							emprunté.add(Emprunt);
							//################ modifie les propriétés du EmpruntEnCours ########################
							Emprunt.getEx().setStatus(EnumStatusExemplaire.prêté);
							}
				}
	}
	
	
	


	public void removeEmpruntEnCours(EmpruntEnCours Emprunt) throws ParseException, biblioException {
		if (Emprunt != null) {
				//################ 	supprime le EmpruntEnCours à la liste ########################
				if (emprunté.indexOf(Emprunt)<0) {throw new biblioException("le EmpruntEnCours " + Emprunt.getEx().getIsbn() + " n'a pas été emprunté par " + this.getNom());
				}else {
				emprunté.remove(Emprunt);
				//################ modifie les propriétés du EmpruntEnCours ########################
				Emprunt.getEx().setStatus(EnumStatusExemplaire.disponible);
				EmpruntArchive EA = new EmpruntArchive(Emprunt.getEx(),Emprunt.getDateEmprunt(),new Date(),this);
				archivé.add(EA);
//				Emprunt.setEmprunteur(null);
				}
			}
		}
		
//
//	
//	public boolean containsExemplaire(Exemplaire Emprunt)
//	{
//		this.emprunt = Emprunt;
//		return emprunté.indexOf(emprunt)>0;
//	}
//	
//	
	
//	public Exemplaire findExemplaireByTitre(String titre) {
//		int r = -1;
//		for (int i=0 ; i<emprunté.size() ; i++) {
//			if (emprunté.get(i).getTitre() == titre) {
//			r = i;	}
//			}
//		if (r != -1) return emprunté.get(r);
//		else return null;}
		
		
	public int getNbRetards() {
		// si employé pas de restriction
		if (Employe.getCodeMatricule() != null) {
			return 0;
		}else {
			int nb = 0;
		for (int i=0 ; i<emprunté.size() ; i++) {
			if (isPretEnRetard(emprunté.get(i))) nb++;
			}
		return nb;
		}
	}
	



	public boolean isConditionsPretAcceptees() {
		return (getNbRetards()==0 && emprunté.size() < Adherent.getNbMaxPret());
	}
		
	
	
	
	
	private static boolean isPretEnRetard (EmpruntEnCours Emprunt) {
		Date dateEmprunt = Emprunt.getDateEmprunt();
		Date maintenant = new Date(); 
		long diff = maintenant.getTime() - dateEmprunt.getTime();
		long res = (diff / (1000*60*60*24));
		return res > Adherent.getNbMaxPret();
	}

	
	
	

	
	
	
	
	
	
	
	
}
