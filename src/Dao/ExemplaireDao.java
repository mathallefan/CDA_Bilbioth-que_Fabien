package Dao;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import biblio.metier.EnumStatusExemplaire;
import biblio.metier.Exemplaire;

public class ExemplaireDao{


	
		private Exemplaire[] ExemplaireDB= {
		new Exemplaire(10,new GregorianCalendar(2000,Calendar.JANUARY,1).getTime(),EnumStatusExemplaire.disponible,"exemplaire10"),
		new Exemplaire(20,new GregorianCalendar(2000,Calendar.JANUARY,2).getTime(),EnumStatusExemplaire.disponible,"exemplaire20"),
		new Exemplaire(30,new GregorianCalendar(2000,Calendar.JANUARY,3).getTime(),EnumStatusExemplaire.disponible,"exemplaire30"),
		new Exemplaire(40,new GregorianCalendar(2000,Calendar.JANUARY,4).getTime(),EnumStatusExemplaire.disponible,"exemplaire40"),
		new Exemplaire(50,new GregorianCalendar(2000,Calendar.JANUARY,5).getTime(),EnumStatusExemplaire.disponible,"exemplaire50"),
		new Exemplaire(60,new GregorianCalendar(2000,Calendar.JANUARY,6).getTime(),EnumStatusExemplaire.disponible,"exemplaire60"),
		new Exemplaire(70,new GregorianCalendar(2000,Calendar.JANUARY,7).getTime(),EnumStatusExemplaire.disponible,"exemplaire70"),
		new Exemplaire(80,new GregorianCalendar(2000,Calendar.JANUARY,8).getTime(),EnumStatusExemplaire.disponible,"exemplaire80"),
		new Exemplaire(90,new GregorianCalendar(2000,Calendar.JANUARY,9).getTime(),EnumStatusExemplaire.disponible,"exemplaire90"),
		};
	
	

	
	
	public Exemplaire findByKey(int id) {
		for (Exemplaire exemplaire : ExemplaireDB)
			if((exemplaire.getIdExemplaire()==id))return exemplaire;
			return null;		
	}	
			
		

	
	
}
