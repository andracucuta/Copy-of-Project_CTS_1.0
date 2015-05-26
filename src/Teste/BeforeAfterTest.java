package Teste;

import Clase.Manager;
import Interfete.IAngajat;
import junit.framework.TestCase;

public class BeforeAfterTest extends TestCase {

	IAngajat ang1;
	

	protected void setUp() throws Exception {
		ang1 = new Manager("Tudor", "Popescu", "0734764356", 2300, "tudorp@gmail.com", "Manager");
		System.out.println("Before");
	}

	protected void tearDown() throws Exception {
		ang1=null;
		System.out.println("After");
	}
	
	public void testConcatNume()
	{

		String result = ang1.concatenate("Tudor","Popescu");
		assertEquals("TudorPopescu", result);
		System.out.println("ConcatNume");
	}


	public void testEqualsObjects()
	{
		IAngajat ang2 = new Manager("Tudor", "Popescu", "0734764356", 2300, "tudorp@gmail.com", "Manager");
		IAngajat ang3 = new Manager("Iuliana", "Vasile", "0734764356", 2300, "tudorp@gmail.com", "Manager");

		assertTrue(ang1.equals(ang2));
		assertFalse(ang2.equals(ang3));
		System.out.println("Obiecte Egale");
	}

}
