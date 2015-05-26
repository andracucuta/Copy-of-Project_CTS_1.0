package Teste;

import Clase.Money;
import junit.framework.TestCase;

public class MoneyTest  extends TestCase{

	public void testaddMoney()
	{
		Money m1,m2,m3,result;
		m1 = new Money (20,"USD");
		m2 = new Money(10, "USD");
		
		m3 = (Money) m1.addMoney(m2);
		result = new Money(30,"USD");
		m1.verificare(result);
		
		assertTrue(m3.verificare(result));
		
	}
	
	public void testaddMoney2()
	{
		Money m1,m2,m3,result;
		m1 = new Money (20,"USD");
		m2 = new Money(10, "CHF");
		
		m3 = (Money) m1.addMoney(m2);
		result = new Money(20,"USD");
		
		m1.verificare(result);
		
		assertTrue(m3.verificare(result));
		
	}
	
	public void testMultiply()
	{
		Money m1,m3,result;
		m1 = new Money(20,"USD");
		m3= (Money) m1.multiply(10);
		result = new Money(200,"USD");
		assertTrue(m3.verificare(result));
	}
	
	public void testVerificare()
	{
		Money m1,m2;
		m1=new Money(10,"USD");
		m2=new Money (20,"USD");
		
		assertFalse(m1.verificare(m2));
	}
}
