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
		throw new IllegalArgumentException("Saisie erron�e : la date de parution doit �tre une date > 0 !");}
	else
		{this.anneeParution = 0;
		throw new IllegalArgumentException("Saisie erron�e : la date de parution doit �tre une date inf�rieure ou �gale � l'ann�e en cours !");}
	}
	
}
