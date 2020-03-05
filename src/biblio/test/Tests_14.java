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

public class Tests_14 {
	

	public static void main(String[] args) throws ParseException, biblioException {

		
try {
	DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
	AdherentDao addao = new AdherentDao();
	ExemplaireDao exdao = new ExemplaireDao();
	
	System.out.println("création emprunt pour un Adherent");
	EmpruntEnCours EmpruntEnCours10 = new EmpruntEnCours(addao.findByKey(10), exdao.findByKey(10), new Date());
	EmpruntEnCours EmpruntEnCours20 = new EmpruntEnCours(addao.findByKey(10), exdao.findByKey(20), new Date());
	EmpruntEnCours EmpruntEnCours30 = new EmpruntEnCours(addao.findByKey(10), exdao.findByKey(30), new Date());
	EmpruntEnCours EmpruntEnCours40 = new EmpruntEnCours(addao.findByKey(10), exdao.findByKey(40), new Date());
	
	System.out.println("trois emprunts");
	addao.findByKey(10).addEmpruntEnCours(EmpruntEnCours10);
	System.out.println(EmpruntEnCours10);
	System.out.println();
	addao.findByKey(10).addEmpruntEnCours(EmpruntEnCours20);
	
	addao.findByKey(10).addEmpruntEnCours(EmpruntEnCours30);
	
	System.out.println("un quatrième emprunt");
	addao.findByKey(10).addEmpruntEnCours(EmpruntEnCours40);
	
	System.out.println();

	
	
}
catch (biblioException ex) {System.out.println(ex.getMessage());}
	
	
}}
