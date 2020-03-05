package Dao;


import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import biblio.metier.Adherent;
import biblio.metier.Employe;
import biblio.metier.EnumCategorieEmploye;

public class EmployeDao{


	
		public static Employe[] EmployeDB= {
		new Employe("Toto_nom","Toto_prenom", new GregorianCalendar(1950,Calendar.JANUARY,1).getTime(),"Homme_emp",100,"Toto_pwd","Toto-pseudo","Toto_matricule",EnumCategorieEmploye.bibliothécaire),
		new Employe("Tata_nom","Tata_prenom", new GregorianCalendar(1950,Calendar.JANUARY,1).getTime(),"Homme_emp",200,"Tata_pwd","Tata-pseudo","Tata_matricule",EnumCategorieEmploye.bibliothécaire),
		new Employe("Titi_nom","Titi_prenom", new GregorianCalendar(1950,Calendar.JANUARY,1).getTime(),"Homme_emp",300,"Titi_pwd","Titi-pseudo","Titi_matricule",EnumCategorieEmploye.bibliothécaire),
		};
	
		
		
		public static void main(String[] args) 
		{
			Arrays.stream(EmployeDB).forEach(X -> System.out.println(X.findAllEmpruntArchive()));
		}
		
		
		
		
		
	public Employe findByKey(int id) {
		for (Employe employe : EmployeDB)
			if((employe.getIdUtilisateur()==id))return employe;
			return null;		
	}	
			
		

	
	
}
