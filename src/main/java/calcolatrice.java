
public class calcolatrice 
{
	public double somma(double...addendi) 
	{
		double s= 0;
		for(double addendo : addendi)
		{
			s=s+addendo;
		}
		return s;
	}
}
