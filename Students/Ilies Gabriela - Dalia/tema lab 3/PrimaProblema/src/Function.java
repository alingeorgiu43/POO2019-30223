import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Function {
String comanda;	

	public int[] adunare(int lungimeSir1, int lungimeSir2, int[] vector1, int[] vector2) 
	{
		int max;
		int min;
		if (lungimeSir1<lungimeSir2)
		{
			max=lungimeSir2;
			min=lungimeSir1;
		}
		else
		{
			max=lungimeSir1;
			min=lungimeSir2;
		}
		
		int[] suma=new int[max];
		for(int i=0; i<min; i++)
			suma[i]=vector1[i]+vector2[i];
		
		if (lungimeSir1==max)
			for(int i=min; i<max; i++)
				suma[i]=vector1[i];
		else
			for(int i=min; i<max; i++)
				suma[i]=vector2[i];
		
		return suma;
		
	}
	
	public int[] scadere(int lungimeSir1, int lungimeSir2, int[] vector1, int[] vector2) 
	{
		int max;
		int min;
		if (lungimeSir1<lungimeSir2)
		{
			max=lungimeSir2;
			min=lungimeSir1;
		}
		else
		{
			max=lungimeSir1;
			min=lungimeSir2;
		}
		
		int[] diferenta=new int[max];
		for(int i=0; i<min; i++)
			diferenta[i]=vector1[i]-vector2[i];
		
		if (lungimeSir1==max)
			for(int i=min; i<max; i++)
				diferenta[i]=vector1[i];
		else
			for(int i=min; i<max; i++)
				diferenta[i]=vector2[i];
		
		return diferenta;
	}
	
	public int[] inmultire(int lungimeSir1, int lungimeSir2, int[] vector1, int[] vector2) 
	{
		int lungime=lungimeSir1+lungimeSir2;
		
		int[] produs= new int[lungime];
		for(int i=0; i<lungimeSir1; i++)
			for (int j=0; j<lungimeSir2; j++)
				produs[i+j]=vector1[i]*vector2[j];

		return produs;
	}
	
	public int[] inmultireCuUnScalar(int lungimeSir, int[] vector, int scalar)
	{	
		int[] primulProdus=new int[lungimeSir];
		for(int i=0; i<lungimeSir; i++) 
		{
			primulProdus[i]=scalar*vector[i];
			//System.out.print(primulProdus[i]+ " ");
		}
		return primulProdus;
	
	}
	
	public int evaluarePol(int lungimeSir, int[] vector, int numar)
	{	
		int suma=vector[0];
		for(int i=1; i<lungimeSir; i++)
		{
			suma=vector[i]*numar+suma;
			numar=numar*numar;
		}
		
		return suma;
	}
	

	public static double f(double x, int[] vector)
	{
		double fx=vector[0];
		for(int i=1; i<vector.length; i++)
		{
			fx=fx+vector[i]*x;
			x=x*x;
		}
		System.out.println("fx="+fx);
		return fx;
	}
	
	public static double fDerivat(double x, int[] vector)
	{
		double fx=vector[1];
		for(int i=2; i<vector.length; i++)
		{
			fx=fx+vector[i]*x*i;
			x=x*x;
		}
		System.out.println("fDerivat="+fx);
		return fx;
	}
	
	
	public double root(int lungimeSir, int[] vector)
	{
		double x0=1;
		double x1=0;
		int ok=0;
		while (ok==0)
		{
			if (fDerivat(x0,vector)==0)
			{
				ok=1;
				x1=x0;
			}
			else
				x1=x0-(f(x0,vector)/fDerivat(x0,vector));
			
			if (Math.abs(x1-x0)<0.01 && Math.abs(x1-x0)>0.000001)
			{
				ok=1;

			}
			x0=x1;
			
		}
		return x1;
	}
	
	public void impartirePolinoame(int[]vector1, int[] vector2, int lungimeVector1, int lungimeVector2)
	{
		
		if(lungimeVector1>=lungimeVector2)
		{
			
		double[] aux=new double[100];
		for(int i=0; i<lungimeVector1; i++)
			aux[i]=vector1[i];
		
		double[] aux2=new double[100];
		for(int i=0; i<lungimeVector1; i++)
			aux2[i]=0;
		
		while(lungimeVector1>0)
		{
			double coef=aux[0]/vector2[0];
			int grad=lungimeVector1-lungimeVector2;
			
			for(int i=0; i<lungimeVector2; i++)
			{
				aux2[i]=vector2[i]*coef;
			}
	
			for(int i=0; i<lungimeVector2; i++)
				aux2[i]=aux[i]-aux2[i];
		
			lungimeVector1--;
			for(int i=0; i<=lungimeVector1; i++) 
			{
				aux[i]=aux[i+1];
				aux2[i]=aux2[i+1];
			}
			int ok=1;
			for(int i=0; i<lungimeVector1; i++)
				if(aux2[i]!=0)
					ok=0;
			
			
			for(int i=0; i<lungimeVector1; i++)
				if(aux2[i]==0 && ok==0)
					aux2[i]=aux[i];
		
			for(int i=0; i<lungimeVector1; i++)
				aux[i]=aux2[i];
			
			if (coef>0)
				System.out.print("+");
			if (coef!=0 && grad>=0)
				System.out.print(coef+ "x^" + grad);
			
			if(grad<0)
			{
				int h=lungimeVector2-1;
				System.out.print(coef + "/("+vector2[0] + "x^" + h);
				for(int i=1; i<lungimeVector2; i++)
					if (vector2[i]>0)
					{
						h=lungimeVector2-i-1;
						System.out.print("+" + vector2[i]+"x^"+ h );
					}
					else
						if(vector2[i]<0)
						{
							h=lungimeVector2-i-1;
							System.out.print(vector2[i]+"x^"+ h);
						}
							
				System.out.print(")");
			}
	
		}
		}
	}
	
	public void citirePolinom(String s) 
	{
		int nr=0;
		int p=1;
		int grad=0;
		
		int index=0;
		while(s.charAt(index)!='^')
			index++;
		index++;
		int ok=0;
		while(index<s.length() && ok==0)
			if (s.charAt(index)!='+' && s.charAt(index)!='-')
		{
			nr=nr*p+Character.getNumericValue(s.charAt(index));
			p=p*10;
			index++;
		}
			else
				ok=1;
		grad=nr;
		
		grad++;
		int[] polinom=new int[grad];
		
		nr=0;
		p=1;
		for(int i=0; i<s.length(); i++)

				if (s.charAt(i)=='^')
				{
					i++;
					int exp=0;
					int putere=1;
					ok=0;
					while(i<s.length() && ok==0)
						if( s.charAt(i)!='+' && s.charAt(i)!='-')
					{
						exp=exp*putere+Character.getNumericValue(s.charAt(i));
						putere*=10;
						i++;	
					}
						else
							ok=1;
					if (nr==0)
						polinom[exp]=1;
					else
						polinom[exp]=nr;
					nr=0; 
					p=1;
					
				}
				else
					if (s.charAt(i)!='x' && s.charAt(i)!='^' && s.charAt(i)!='+' && s.charAt(i)!='-')
					{
						nr=nr*p+Character.getNumericValue(s.charAt(i));
						p=p*10;
					}
				
		for(int i=0; i<grad; i++)
			System.out.print(polinom[i]+" ");
	}
	
}

