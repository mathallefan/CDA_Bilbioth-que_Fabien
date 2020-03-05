package Dao;


import java.util.Calendar;
import java.util.GregorianCalendar;

import biblio.metier.Adherent;

public class AdherentDao{


	
		private Adherent[] AdherentDB= {
		new Adherent("Toto_nom","Toto_prenom", new GregorianCalendar(1950,Calendar.JANUARY,1).getTime(),"Homme_ad",10,"Toto_pwd","Toto-pseudo","Toto-telephone"),
		new Adherent("Tata_nom","Tata_prenom", new GregorianCalendar(1950,Calendar.JANUARY,1).getTime(),"Homme_ad",20,"Tata_pwd","Tata-pseudo","Tata-telephone"),
		new Adherent("Titi_nom","Titi_prenom", new GregorianCalendar(1950,Calendar.JANUARY,1).getTime(),"Homme_ad",30,"Titi_pwd","Titi-pseudo","Titi-telephone"),
		};
	
		
	public Adherent findByKey(int id) {
		for (Adherent adherent : AdherentDB)
			if((adherent.getIdUtilisateur()==id))return adherent;
			return null;		
	}	
			
		

	
	
}
