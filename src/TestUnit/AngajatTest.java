package TestUnit;

import Clase.Angajat;
import junit.framework.TestCase;

public class AngajatTest extends TestCase {

	Angajat ang1 = new Angajat("Mircea", "Andrei", "0754899832", "mirceaa@gmail.com", "Bucatar",1500);

	public void testVerificaEmail()
	{
		String email="mirceaa@gmail.com";
		String e=ang1.email;
		assertEquals(email, e);
	}
	
	public void testverificareFormat_corect(){
		
		ang1.nrTelefon="0723456478";
		String format=ang1.VerificareFormatNumar(ang1.nrTelefon);
		assertEquals("Vodafone",format);
	}
}