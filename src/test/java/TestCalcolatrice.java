import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;

import org.junit.jupiter.api.Test;

class TestCalcolatrice {

	@Test
	public void testSomma1() 
	{
		calcolatrice c = new calcolatrice();
		
		double res = c.somma(2,5); 
		
		Assert.assertEquals(7, res, 0);
	}
	
	@Test
	public void testSomma2() 
	{
		calcolatrice c = new calcolatrice();
		
		double res = c.somma(2,0); 
		
		Assert.assertEquals(2, res, 0);
	}
	
	@Test
	public void testSomma3() 
	{
		calcolatrice c = new calcolatrice();
		
		double res = c.somma(2,-1); 
		
		assertEquals(1, res);
	}
	
	@Test
	public void testDifferenza1() 
	{
		calcolatrice c = new calcolatrice();
		
		double res = c.differenza(5,2); 
		
		Assert.assertEquals(3, res, 0);
	}

}
