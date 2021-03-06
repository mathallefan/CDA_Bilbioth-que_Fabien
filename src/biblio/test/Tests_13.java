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

public class Tests_13 {
	

	public static void main(String[] args) throws ParseException, biblioException {

		
try {
	DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
	EmployeDao epdao = new EmployeDao();
	ExemplaireDao exdao = new ExemplaireDao();
	
	System.out.println("cr�ation emprunt pour un Employe");
	EmpruntEnCours EmpruntEnCours10 = new EmpruntEnCours(epdao.findByKey(100), exdao.findByKey(10), new Date());
	EmpruntEnCours EmpruntEnCours20 = new EmpruntEnCours(epdao.findByKey(100), exdao.findByKey(20), new Date());
	epdao.findByKey(100).addEmpruntEnCours(EmpruntEnCours10);
	System.out.println(EmpruntEnCours10);
	System.out.println();
	System.out.println("reset de la date de emprunt 10 avec + de 15 j");
	EmpruntEnCours10.setDateEmprunt(df.parse("01-01-2019"));
	epdao.findByKey(100).addEmpruntEnCours(EmpruntEnCours20);
	
	
	System.out.println();
	System.out.println(epdao.findByKey(100).getNom() + " a " + epdao.findByKey(100).findAllEmpruntEnCours().size()
			+ " EmpruntEnCours(s) : " +epdao.findByKey(100).findAllEmpruntEnCours());

	
	
	
	
}
catch (biblioException ex) {System.out.println(ex.getMessage());}
	
	
}}
