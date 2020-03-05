package biblio.metier;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import biblio.metier.Utilisateur;

public class EmpruntArchive {

	public static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	
	Exemplaire ex;
	Date dateEmprunt;
	Date dateRestitution;
	Utilisateur ut;
	
	
	public EmpruntArchive(Exemplaire ex, Date dateEmprunt, Date dateRestitution, Utilisateur ut) {
		super();
		this.ex = ex;
		this.dateEmprunt = dateEmprunt;
		this.dateRestitution = dateRestitution;
		this.ut = ut;
	}
	
	
	public Exemplaire getEx() {
		return ex;
	}


	public void setEx(Exemplaire ex) {
		this.ex = ex;
	}


	public Utilisateur getUt() {
		return ut;
	}


	public void setUt(Utilisateur ut) {
		this.ut = ut;
	}


	


	public Date getDateEmprunt() {
		return dateEmprunt;
	}


	public void setDateEmprunt(Date dateEmprunt) {
		this.dateEmprunt = dateEmprunt;
	}


	public Date getDateRestitution() {
		return dateRestitution;
	}

	public void setDateRestitution(Date dateRestitution) {
		this.dateRestitution = dateRestitution;
	}


	@Override
	public String toString() {
		return "EmpruntArchive [ex=" + ex + ", dateEmprunt=" + sdf.format(dateEmprunt) + ", dateRestitution=" + sdf.format(dateRestitution)
				+ ", ut=" + ut + "]";
	}


//	@Override
//	public String toString() {
//		return "EmpruntArchive [dateEmprunt=" + sdf.format(dateEmprunt) + ", dateRestitution=" + sdf.format(dateRestitution) + "]";
//	}






	
	
}
