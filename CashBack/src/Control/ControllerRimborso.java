package Control;

import Entity.*;

public class ControllerRimborso {

	
static public Rimborso HandlerRichiestaRimborso(int Codice, String id, String password) {
	ElencoProgrammi EP= new ElencoProgrammi();
	return EP.RichiediRimborso(Codice, id, password);
		
	}

	
static public String VerificaRimborso(int Codice, String id, String password) {
	
	ElencoProgrammi EP= new ElencoProgrammi();
	return EP.VerificaRimborso(Codice, id, password);
	
	
	}

}