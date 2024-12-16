import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;

import org.junit.jupiter.api.Test;

class TestCalcolatrice2 {

	@Test
	public void testSomma1() 
	{
		calcolatrice c = new calcolatrice();
		
		double res = c.somma(5,6); 
		
		Assert.assertEquals(11, res, 0);
	}

	@Test
	public void testSomma2() 
	{
		calcolatrice c = new calcolatrice();
		
		double res = c.somma(6,6);
		
		Assert.assertEquals(11, res, 0);
	}
}

