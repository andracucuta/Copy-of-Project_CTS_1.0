package Teste;


import Clase.Manager;
import Clase.Meniu;
import Interfete.IAngajat;
import junit.framework.TestCase;

public class ManagerTest2 extends TestCase {
	
	
public void testConcatNume()
{
	Manager ang2 = new Manager("Tudor", "Popescu", "0734764356", 2300, "tudorp@gmail.com", "Manager");
	double result = (double) ang2.addPrima(ang2.salariu, 520.0f);
	assertEquals(2820.0, result);
}





}
