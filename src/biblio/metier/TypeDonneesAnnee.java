package biblio.metier;

import java.util.Calendar;

public class TypeDonneesAnnee {

	
	///pas mis en place ne fonctionne pas tout mis dans livre : A CORRIGER !
	
	private int anneeParution;
	
	public void ClassAnneeParution(int annee){
	if (annee >0 && annee <= Calendar.getInstance().get(Calendar.YEAR))
		this.anneeParution = annee;
	else if (annee <0)
		{this.anneeParution = 0; 
		throw new IllegalArgumentException("Saisie erronée : la date de parution doit être une date > 0 !");}
	else
		{this.anneeParution = 0;
		throw new IllegalArgumentException("Saisie erronée : la date de parution doit être une date inférieure ou égale à l'année en cours !");}
	}
	
}
