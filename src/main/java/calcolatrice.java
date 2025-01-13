public class calcolatrice 
{
	public double somma(double...addendi) 
	{
		double s= 0;
		for(double addendo : addendi)
		{
			
			s=s+Math.abs(addendo);
			if(addendo <0) 
			{
				System.out.println("addendo è negativo");
			}
			if(addendo ==0) 
			{
				System.out.println("addendo è zero");
			}
			if(addendo >0) 
			{
				System.out.println("addendo è positivo");
			}
			s=s+addendo;
		}
		return s;
	}
	public double differenza (double d1, double d2) 
	{
		double diff = 0;
		diff=d1-d2;
		return diff;
	}
}
