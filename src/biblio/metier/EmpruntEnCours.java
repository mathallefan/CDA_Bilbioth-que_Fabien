package biblio.metier;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class EmpruntEnCours {

	public static float res;
	static boolean isPretEnRetard;
	public final int nbMaxPret = 5;
	public final static int dureeMaxPret = 15;
	public static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	
	Utilisateur ut;
	Exemplaire ex;
	Date dateEmprunt;
	
	
	
	
	public EmpruntEnCours(Utilisateur ut, Exemplaire ex, Date dateEmprunt) {
		super();
		this.ut = ut;
		this.ex = ex;
		this.dateEmprunt = dateEmprunt;
	}

	public Utilisateur getUt() {
		return ut;
	}

	public void setUt(Utilisateur ut) {
		this.ut = ut;
	}

	public Exemplaire getEx() {
		return ex;
	}

	


	public void setEx(Exemplaire ex) {
		this.ex = ex;
	}

	public Date getDateEmprunt() {
		return dateEmprunt;
	}

	public void setDateEmprunt(Date dateEmprunt) {
		this.dateEmprunt = dateEmprunt;
	}






//	ArrayList<Exemplaire> emprunté = new ArrayList<Exemplaire>();
//	
//	public ArrayList<Exemplaire> findAllExemplaires() {
//		return emprunté;
//	}
//	
//	
	

	
	private static boolean isPretEnRetard (Exemplaire Emprunt) {
		// si employé pas de restriction
		if (Employe.getCodeMatricule() != null) {
			return false;
		}else {
		Date dateEmprunt = Emprunt.getDateEmpruntDate();
		Date maintenant = new Date(); 
		long diff = maintenant.getTime() - dateEmprunt.getTime();
		res = (diff / (1000*60*60*24));
		return res > dureeMaxPret;
		}
	}

	@Override
	public String toString() {
		return "EmpruntEnCours [ut=" + ut + ", ex=" + ex + ", dateEmprunt=" + sdf.format(dateEmprunt) + "]";
	}



	
	
}
