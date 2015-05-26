package Teste;


import Clase.Manager;
import Clase.Meniu;
import Interfete.IAngajat;
import junit.framework.TestCase;

public class ManagerTest1 extends TestCase {
	
	
public void testConcatNume()
{
	IAngajat ang2 = new Manager("Tudor", "Popescu", "0734764356", 2300, "tudorp@gmail.com", "Manager");
	String result = ang2.concatenate("Tudor","Popescu");
	assertEquals("TudorPopescu", result);
}


public void testEqualsObjects()
{
	IAngajat ang1 = new Manager("Tudor", "Popescu", "0734764356", 2300, "tudorp@gmail.com", "Manager");
	IAngajat ang2 = new Manager("Tudor", "Popescu", "0734764356", 2300, "tudorp@gmail.com", "Manager");
	IAngajat ang3 = new Manager("Iuliana", "Vasile", "0734764356", 2300, "tudorp@gmail.com", "Manager");

	assertTrue(ang1.equals(ang2));
	assertFalse(ang2.equals(ang3));
}



}
