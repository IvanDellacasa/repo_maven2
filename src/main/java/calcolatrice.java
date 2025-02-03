public class calcolatrice 
{
	public double somma(double...addendi) 
	{
		double s= 0;
		for(double addendo : addendi)
		{
			if(addendo < 0)

			{

				System.out.println("val < 0");

			}

			if(addendo == 0)

			{

				System.out.println("val == 0");

			}

			if(addendo > 0)

			{

				System.out.println("val > 0");

			}

			s = s + addendo;

		}
		return s;
	}
	public double differenza (double d1, double d2) 
	{
		double diff = 0;
		diff=d1-d2;
		return diff;
	}
	public double moltiplicazione (double d1, double d2) 
	{
		double risultato = 0;
		risultato=d1*d2;
		return risultato;
	}
	public double divisione (double d1, double d2) 
	{
		if(d2 == 0) 
		{
			
		}
		double risultato = 0;
		risultato=d1/d2;
		return risultato;
	}
}
