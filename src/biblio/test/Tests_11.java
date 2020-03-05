package biblio.test;

import java.text.ParseException;
import java.util.Date;

import Dao.AdherentDao;
import Dao.EmployeDao;
import Dao.ExemplaireDao;
import biblio.metier.EmpruntEnCours;
import biblio.metier.biblioException;

public class Tests_11 {
	
	public static void main(String[] args) throws ParseException, biblioException {

	System.out.println("Demande de deux exemplaires leur id");
	ExemplaireDao exdao = new ExemplaireDao();
	System.out.println(exdao.findByKey(10));
	System.out.println(exdao.findByKey(20));

	System.out.println("Demande adhérent par son id");
	System.out.println();
	AdherentDao addao = new AdherentDao();
	System.out.println(addao.findByKey(10));
	
	System.out.println("Demande employé par son id");
	System.out.println();
	EmployeDao epdao = new EmployeDao();
	System.out.println(epdao.findByKey(100));

	System.out.println("création emprunt pour un Adherent");
	EmpruntEnCours EmpruntEnCours10 = new EmpruntEnCours(addao.findByKey(10), exdao.findByKey(10), new Date());
	addao.findByKey(10).addEmpruntEnCours(EmpruntEnCours10);
	System.out.println(EmpruntEnCours10);
	System.out.println();

	System.out.println("création emprunt pour un Employe");
	EmpruntEnCours EmpruntEnCours20 = new EmpruntEnCours(epdao.findByKey(100), exdao.findByKey(20), new Date());
	epdao.findByKey(100).addEmpruntEnCours(EmpruntEnCours20);
	System.out.println(EmpruntEnCours20);
	System.out.println();
	
	
	}
}
