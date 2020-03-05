package biblio.test;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;

import Dao.ExemplaireDao;
import biblio.metier.Employe;
import biblio.metier.EmpruntEnCours;
import biblio.metier.EnumStatusExemplaire;
import biblio.metier.Exemplaire;
import biblio.metier.Utilisateur;
import biblio.metier.biblioException;


public class TestExemplaire {
	

	public static void main(String[] args) throws ParseException {

try {
	DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
	Utilisateur toto = new Utilisateur(100,"pwdtoto","pseudoToto");
	toto.setNom("Toton");toto.setPrenom("Totop");toto.setDateNaissance(df.parse("10-01-2000"));toto.setSexe("Homme");
	Employe.setCodeMatricule("employe1");
	Utilisateur tata = new Utilisateur(100,"pwdtata","pseudoTata");	
	tata.setNom("tatan");tata.setPrenom("tatap");tata.setDateNaissance(df.parse("10-02-2000"));tata.setSexe("Femme");
	Utilisateur titi = new Utilisateur(100,"pwdtiti","pseudoTiti");		
	titi.setNom("titin");titi.setPrenom("titip");titi.setDateNaissance(df.parse("10-03-2000"));titi.setSexe("Homme");
	
	Exemplaire Exemplaire10 = new Exemplaire(10,df.parse("01-01-2020"),EnumStatusExemplaire.disponible,"exemplaire10");
	Exemplaire Exemplaire20 = new Exemplaire(20,df.parse("02-01-2020"),EnumStatusExemplaire.disponible,"exemplaire20");
	Exemplaire Exemplaire30 = new Exemplaire(30,df.parse("03-01-2020"),EnumStatusExemplaire.disponible,"exemplaire30");
	Exemplaire Exemplaire40 = new Exemplaire(40,df.parse("04-01-2020"),EnumStatusExemplaire.disponible,"exemplaire40");

	System.out.println();
	System.out.println(Exemplaire10);	
	
	System.out.println();	

	EmpruntEnCours EmpruntEnCours10 = new EmpruntEnCours(toto, Exemplaire10, new Date());
	EmpruntEnCours EmpruntEnCours20 = new EmpruntEnCours(toto, Exemplaire20, new Date());
	EmpruntEnCours EmpruntEnCours30 = new EmpruntEnCours(toto, Exemplaire30, new Date());
	EmpruntEnCours EmpruntEnCours40 = new EmpruntEnCours(toto, Exemplaire40, new Date());

	
	System.out.println();
	System.out.println(EmpruntEnCours10);	

	
	System.out.println("Toto emprunte : EmpruntEnCours10, EmpruntEnCours20 et EmpruntEnCours30");
	toto.addEmpruntEnCours(EmpruntEnCours10);
// option avec un livre en retard
	EmpruntEnCours10.setDateEmprunt(df.parse("01-01-2019"));
	toto.addEmpruntEnCours(EmpruntEnCours20);
	toto.addEmpruntEnCours(EmpruntEnCours30);
	System.out.println("Toto a " + toto.findAllEmpruntEnCours().size()+ " EmpruntEnCours(s) : " +toto.findAllEmpruntEnCours());

	
	System.out.println("Toto emprunte un 4ème livre !");
	toto.addEmpruntEnCours(EmpruntEnCours40);

	
	
	
	
	System.out.println();
	System.out.println();
	System.out.println("Toto restitue l'EmpruntEnCours 20");
	toto.removeEmpruntEnCours(EmpruntEnCours20);
	System.out.println("Toto a " + toto.findAllEmpruntEnCours().size()+ " EmpruntEnCours(s) : " +toto.findAllEmpruntEnCours());

	
	System.out.println();
	System.out.println();
	System.out.println("Statut de l'EmpruntEnCours20 " + EmpruntEnCours20);

	
	System.out.println();
	System.out.println();
	System.out.println("Tata emprunte l'EmpruntEnCours 20");
	tata.addEmpruntEnCours(EmpruntEnCours20);
	System.out.println("Tata a " + tata.findAllEmpruntEnCours().size()+ " EmpruntEnCours(s) : " +tata.findAllEmpruntEnCours());

	
	System.out.println();
	System.out.println();
	
	
	EmpruntEnCours10.setDateEmprunt(df.parse("01-01-2019"));
	EmpruntEnCours30.setDateEmprunt(df.parse("01-01-2019"));
	System.out.println(EmpruntEnCours10);
	//System.out.println("Toto a " + toto.findAllLivres().size()+ " livre(s) : " +toto.findAllLivres());
	System.out.println("Toto a " + toto.getNbRetards() + " livre(s) en retard ");
	
	
	
	ExemplaireDao exdao = new ExemplaireDao();
	
	System.out.println(exdao.findByKey(10));
	
	
	
	
	
}
catch (biblioException ex) {System.out.println(ex.getMessage());}
catch (IllegalArgumentException e) {
		System.out.printf("la création du EmpruntEnCours n'est pas possible :\n%s",e.getMessage() );}
}
}
