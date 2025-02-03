import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;

import org.junit.jupiter.api.Test;

class TestCalcolatrice
{
	calcolatrice c = new calcolatrice();
	
	@Test
	void testSomma1()
	{
		double res = c.somma(5,6);
		
		assertEquals(11, res, 0);
	}
	
	@Test
	void testSomma2()
	{
		double res = c.somma(6,6);
		
		assertEquals(12, res, 0);
	}
	
	@Test
	void testSomma3()
	{
		double res = c.somma(10,-5);
		
		assertEquals(5, res, 0);
	}
	
	
	@Test
	void testSomma4()
	{
		double res = c.somma(3.14159265358979323846,-5);
		
		assertEquals(-1.8584073464102069, res, 0);
	}
	
	@Test
	void testSomma5()
	{
		double res = c.somma(53,-1);
		
		assertEquals(52, res, 0);
	}
	
	@Test
	void testSomma6()
	{
		double res = c.somma(Double.POSITIVE_INFINITY,-1);
		
		assertEquals(Double.POSITIVE_INFINITY, res, 0);
	}
	
	@Test
	void testSomma7()
	{
		double res = c.somma(Double.MAX_VALUE,1);
		
		assertEquals(1.7976931348623157E308, res, 0);
	}
	
	@Test
	void testSomma8()
	{
		double res = c.somma(Double.MAX_VALUE,Double.MAX_VALUE);
		
		assertEquals(Double.POSITIVE_INFINITY, res, 0);
	}
	
	@Test
	void testSomma9()
	{
		double res = c.somma(Double.MAX_VALUE,0);
		
		assertEquals(Double.MAX_VALUE, res, 0);
	}
	
	@Test
	void testSottrazione1()
	{
		double res = c.differenza(5,6);
		
		assertEquals(-1, res, 0);
	}
	
	@Test
	void testSottrazione2()
	{
		double res = c.differenza(6,6);
		
		assertEquals(0, res, 0);
	}
	
	@Test
	void testSottrazione3()
	{
		double res = c.differenza(10,-5);
		
		assertEquals(15, res, 0);
	}
	
	@Test
	void testSottrazione4()
	{
		double res = c.differenza(10.5,-5);
		
		assertEquals(15.5, res, 0);
	}
	
	
	@Test
	void testMoltiplicazione1()
	{
		double res = c.moltiplicazione(10,-5);
		
		assertEquals(-50, res, 0);
	}
	
	@Test
	void testMoltiplicazione2()
	{
		double res = c.moltiplicazione(5,6);
		
		assertEquals(30, res, 0);
	}
	
	@Test
	void testMoltiplicazione3()
	{
		double res = c.moltiplicazione(6,6);
		
		assertEquals(36, res, 0);
	}
	
	@Test
	void testMoltiplicazione4()
	{
	double res = c.moltiplicazione(0,0);
	
	assertEquals(0, res, 0);
	}
	
	@Test
	void testMoltiplicazione5()
	{
		double res = c.moltiplicazione(-1,0);
		
		assertEquals(0, res, 0);
	}
	
	@Test
	void testMoltiplicazione6()
	{
		double res = c.moltiplicazione(0,-1);
		
		assertEquals(0, res, 0);
	}
	
	@Test
	void testMoltiplicazione7()
	{
		double res = c.moltiplicazione(2,1.5);
		
		assertEquals(3, res, 0);
	}
	
	
	@Test
	void testDivisione1()
	{
		double res = c.divisione(10,2);
		
		assertEquals(5, res, 0);
	}
	
	@Test
	void testDivisione2()
	{
		double res = c.divisione(342,-9);
		
		assertEquals(-38, res, 0);
	}
	
	@Test
	void testDivisione3()
	{
		double res = c.divisione(-6,-6);
		
		assertEquals(1, res, 0);
	}
	
	@Test
	void testDivisione4()
	{
		double res = c.divisione(0,-6);
		
		assertEquals(0, res, 0);
	}
	
	@Test
	void testDivisione5()
	{
		double res = c.divisione(-6,0);
		
		assertEquals(Double.NEGATIVE_INFINITY, res, 0);
	}
	
	@Test
	void testDivisione6()
	{
		double res = c.divisione(0,Double.NEGATIVE_INFINITY);
		
		assertEquals(-0, res, 0);
	}
	
	@Test
	void testDivisione7()
	{
		double res = c.divisione(Double.POSITIVE_INFINITY,Double.NEGATIVE_INFINITY);
		
		assertEquals(Double.NaN, res, 0);
	}
	
	@Test
	void testDivisione8()
	{
		double res = c.divisione(Double.POSITIVE_INFINITY,0);
		
		assertEquals(Double.POSITIVE_INFINITY, res, 0);
	}
	
	@Test
	void testDivisione9()
	{
		double res = c.divisione(3,1.5);
		
		assertEquals(2, res, 0);
	}
	
	@Test
	void testDivisione10()
	{
		double res = c.divisione(Double.MAX_VALUE,Double.MIN_NORMAL);
		
		assertEquals(Double.POSITIVE_INFINITY, res, 0);
	}
}