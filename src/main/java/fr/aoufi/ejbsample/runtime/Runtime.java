package fr.aoufi.ejbsample.runtime;

import fr.aoufi.ejbsample.webservice.Personne;
import fr.aoufi.ejbsample.webservice.PersonneWS;
import fr.aoufi.ejbsample.webservice.PersonneWSService;

public class Runtime {

	public static void main(String[] args) { 
		
		PersonneWSService personneWSService = new PersonneWSService();
		
		PersonneWS personneWS = personneWSService.getPersonneWSPort();
		
		Personne personne = new Personne();
		
		personne.setName("Dupont2");
		personne.setFirstname("Pierre2");
		
		personneWS.saveFromWebservice(personne);

	}

}
