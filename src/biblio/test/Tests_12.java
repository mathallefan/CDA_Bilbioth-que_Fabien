package biblio.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import Dao.AdherentDao;
import Dao.EmployeDao;
import Dao.ExemplaireDao;
import biblio.metier.EmpruntEnCours;
import biblio.metier.biblioException;

public class Tests_12 {
	

	public static void main(String[] args) throws ParseException, biblioException {

		
try {
	DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
	AdherentDao addao = new AdherentDao();
	ExemplaireDao exdao = new ExemplaireDao();
	
	System.out.println("création emprunt pour un Adherent");
	EmpruntEnCours EmpruntEnCours10 = new EmpruntEnCours(addao.findByKey(10), exdao.findByKey(10), new Date());
	EmpruntEnCours EmpruntEnCours20 = new EmpruntEnCours(addao.findByKey(10), exdao.findByKey(20), new Date());
	addao.findByKey(10).addEmpruntEnCours(EmpruntEnCours10);
	System.out.println(EmpruntEnCours10);
	System.out.println();
	System.out.println("reset de la date de emprunt 10 avec + de 15 j");
	EmpruntEnCours10.setDateEmprunt(df.parse("01-01-2019"));
	addao.findByKey(10).addEmpruntEnCours(EmpruntEnCours20);
	
	
	System.out.println();

	
	
}
catch (biblioException ex) {System.out.println(ex.getMessage());}
	
	
}}
