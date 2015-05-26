package Teste;

import Clase.Angajat;
import Clase.AngajatSalariu;
import junit.framework.TestCase;

public class AngajatSalariuTest extends TestCase {

	AngajatSalariu salAngajat = new AngajatSalariu();
	Angajat angajat = new Angajat();
	
	public void testCalculareEvaluare()
	{
		angajat.nume="Ion";
		angajat.salariu=800;
		double prima = salAngajat.calculareEvaluare(angajat);
		assertEquals(520, prima,0.0);
	}
	
	public void testSalariu()
	{
		angajat.nume="Ion";
		angajat.salariu=800;
		double salariu = salAngajat.calculazaSalariuAnlual(angajat);
		assertEquals(9600,salariu,0.0);
	
	}
	

	
	
}
