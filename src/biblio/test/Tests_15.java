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

public class Tests_15 {
	

	public static void main(String[] args) throws ParseException, biblioException {

		
try {
	DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
	EmployeDao epdao = new EmployeDao();
	ExemplaireDao exdao = new ExemplaireDao();
	
	System.out.println("création emprunt pour un Employe");
	EmpruntEnCours EmpruntEnCours10 = new EmpruntEnCours(epdao.findByKey(100), exdao.findByKey(10), new Date());
	EmpruntEnCours EmpruntEnCours20 = new EmpruntEnCours(epdao.findByKey(100), exdao.findByKey(20), new Date());
	EmpruntEnCours EmpruntEnCours30 = new EmpruntEnCours(epdao.findByKey(100), exdao.findByKey(30), new Date());
	EmpruntEnCours EmpruntEnCours40 = new EmpruntEnCours(epdao.findByKey(100), exdao.findByKey(40), new Date());
	
	
	System.out.println("trois emprunts");
	epdao.findByKey(100).addEmpruntEnCours(EmpruntEnCours10);
	epdao.findByKey(100).addEmpruntEnCours(EmpruntEnCours20);
	epdao.findByKey(100).addEmpruntEnCours(EmpruntEnCours30);

	
	System.out.println("un quatrième emprunt");
	epdao.findByKey(100).addEmpruntEnCours(EmpruntEnCours40);
	System.out.println("pas de soucis");
	System.out.println();
	System.out.println(epdao.findByKey(100).getNom() + " a " + epdao.findByKey(100).findAllEmpruntEnCours().size()
			+ " EmpruntEnCours(s) : " +epdao.findByKey(100).findAllEmpruntEnCours());

	
	
	
	
}
catch (biblioException ex) {System.out.println(ex.getMessage());}
	
	
}}
