
public class Polinom {
	int lungime;
	int[] sir=new int[100];
	
	public void invers(int[] sir, int lungime)
	{
		for(int i=0; i<lungime/2; i++)
		{
			int aux=sir[i];
			sir[i]=sir[lungime-i-1];
			sir[lungime-i-1]=aux;
		}
	}
}
