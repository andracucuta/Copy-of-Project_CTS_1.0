package Teste;

import org.mockito.Mockito;

import Clase.Angajat;
import Clase.AngajatSalariu;
import Interfete.IAngajat;
import junit.framework.TestCase;

public class MockTest extends TestCase {

	AngajatSalariu salAngajat = new AngajatSalariu();
	Angajat angajat = new Angajat();
	
	public void setup()
	{
		IAngajat ang = Mockito.mock(IAngajat.class);
		//when(ang.addPrima(800, 50)).thenReturn(7);
		angajat = new Angajat();
	}
	public void testSalariu()
	{
		angajat.nume="Ion";
		angajat.salariu=800;
		double salariu = salAngajat.calculazaSalariuAnlual(angajat);
		assertEquals(9600,salariu,0.0);
	
	}
	
}

