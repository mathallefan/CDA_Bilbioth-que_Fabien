package biblio.metier;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exemplaire {

	public static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");	
	private int idExemplaire;
	private Date dateAchat;
	private EnumStatusExemplaire status = EnumStatusExemplaire.disponible;
	private String isbn;

	
	//	Adherent emprunteur = new Adherent();
	Date dateEmprunt = new Date(0);
	

	

	Utilisateur emprunteur = new Utilisateur();
	public Exemplaire(int idExemplaire, Date dateAchat, EnumStatusExemplaire status, String isbn) {
			super();
			this.idExemplaire = idExemplaire;
			this.dateAchat = dateAchat;
			this.status = status;
			this.isbn = isbn;
		}



	
	
	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getIdExemplaire() {
		return idExemplaire;
	}


	public void setIdExemplaire(int idExemplaire) {
		this.idExemplaire = idExemplaire;
	}


	public Date getDateAchat() {
		return dateAchat;
	}


	public void setDateAchat(Date dateAchat) {
		this.dateAchat = dateAchat;
	}


	public EnumStatusExemplaire getStatus() {
		return status;
	}


	public void setStatus(EnumStatusExemplaire status) {
		this.status = status;
	}

	
	

	

		public String getDateEmprunt() {
			return (sdf.format(dateEmprunt));
		}

		public Date getDateEmpruntDate() {
			return dateEmprunt;
		}
	
	
	
	
		// methode is disponible
					public boolean isDisponible() {
						if (status == EnumStatusExemplaire.disponible)
							return true;
						else
							return false;
					}





		
	
//		//##################################   OVERRIDES   ################################################
		@Override
		public String toString() {
				  return ("\n            [N° Exemplaire] : " + idExemplaire 
						+ "\n              [date achat] : " + sdf.format(dateAchat) 
						+ "\n              [Status] : " + status
					);
		}

	
	
	
	
}
