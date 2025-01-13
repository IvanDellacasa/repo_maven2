public class Calcolatrice 
{
	public double somma(double...addendi)
	{
		double s = 0;
		for(double addendo : addendi)
		{
			s = s + addendo;
		}
		
		return s;
	}
	
	public double sottrazione(double...sottraendi)
	{
		double s = sottraendi[0];
		for(int i = 1; i < sottraendi.length; i++)
		{
			s = s - sottraendi[i];
		}
		
		return s;
	}
	
	public double moltiplicazione(double...moltiplicandi)
	{
		double s = 1;
		for(double moltiplicando : moltiplicandi)
		{
			s = s * moltiplicando;
		}
		
		return s;
	}
	
	public double divisione(double...dividendi)
	{
		double s = dividendi[0];
		for(int i = 1; i < dividendi.length; i++)
		{
			s = s / dividendi[i];
		}
		
		return s;
	}
}
