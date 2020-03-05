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



	
	ArrayList<EmpruntEnCours> emprunt� = new ArrayList<EmpruntEnCours>();
	public ArrayList<EmpruntArchive> archiv� = new ArrayList<EmpruntArchive>();
	
	
	
	
	public ArrayList<EmpruntEnCours> findAllEmpruntEnCours() {
		return emprunt�;
	}
	
	public ArrayList<EmpruntArchive> findAllEmpruntArchive() {
		return archiv�;
	}
	
	
	public void addEmpruntEnCours(EmpruntEnCours Emprunt) throws ParseException, biblioException {
	
			if (Emprunt != null) {
				// si employ� pas de restriction
				if (Employe.getCodeMatricule() != null) {
					emprunt�.add(Emprunt);
					Emprunt.getEx().setStatus(EnumStatusExemplaire.pr�t�);
				}else 
				//else adh�rent
					if (emprunt�.size() >= Adherent.getNbMaxPret()) {throw new biblioException("Vous avez d�j� emprunt� "+Adherent.getNbMaxPret() + " EmpruntEnCours, il faut d'abord restituer un EmpruntEnCours avant d'en emprunter un nouveau !");
						}else 
							if (Emprunt.getUt().getNbRetards()> 0 ) {throw new biblioException("Vous ne pouvez pas emprunter car vous avez " + Emprunt.getUt().getNbRetards() + " livres en retard !");
						
							}else {
							emprunt�.add(Emprunt);
							//################ modifie les propri�t�s du EmpruntEnCours ########################
							Emprunt.getEx().setStatus(EnumStatusExemplaire.pr�t�);
							}
				}
	}
	
	
	


	public void removeEmpruntEnCours(EmpruntEnCours Emprunt) throws ParseException, biblioException {
		if (Emprunt != null) {
				//################ 	supprime le EmpruntEnCours � la liste ########################
				if (emprunt�.indexOf(Emprunt)<0) {throw new biblioException("le EmpruntEnCours " + Emprunt.getEx().getIsbn() + " n'a pas �t� emprunt� par " + this.getNom());
				}else {
				emprunt�.remove(Emprunt);
				//################ modifie les propri�t�s du EmpruntEnCours ########################
				Emprunt.getEx().setStatus(EnumStatusExemplaire.disponible);
				EmpruntArchive EA = new EmpruntArchive(Emprunt.getEx(),Emprunt.getDateEmprunt(),new Date(),this);
				archiv�.add(EA);
//				Emprunt.setEmprunteur(null);
				}
			}
		}
		
//
//	
//	public boolean containsExemplaire(Exemplaire Emprunt)
//	{
//		this.emprunt = Emprunt;
//		return emprunt�.indexOf(emprunt)>0;
//	}
//	
//	
	
//	public Exemplaire findExemplaireByTitre(String titre) {
//		int r = -1;
//		for (int i=0 ; i<emprunt�.size() ; i++) {
//			if (emprunt�.get(i).getTitre() == titre) {
//			r = i;	}
//			}
//		if (r != -1) return emprunt�.get(r);
//		else return null;}
		
		
	public int getNbRetards() {
		// si employ� pas de restriction
		if (Employe.getCodeMatricule() != null) {
			return 0;
		}else {
			int nb = 0;
		for (int i=0 ; i<emprunt�.size() ; i++) {
			if (isPretEnRetard(emprunt�.get(i))) nb++;
			}
		return nb;
		}
	}
	



	public boolean isConditionsPretAcceptees() {
		return (getNbRetards()==0 && emprunt�.size() < Adherent.getNbMaxPret());
	}
		
	
	
	
	
	private static boolean isPretEnRetard (EmpruntEnCours Emprunt) {
		Date dateEmprunt = Emprunt.getDateEmprunt();
		Date maintenant = new Date(); 
		long diff = maintenant.getTime() - dateEmprunt.getTime();
		long res = (diff / (1000*60*60*24));
		return res > Adherent.getNbMaxPret();
	}

	
	
	

	
	
	
	
	
	
	
	
}
