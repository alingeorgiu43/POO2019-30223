package lab4_pr1;

public class MainClass {

	public static void main(String[] args) {
		int a[] = new int[200];
		int k = 0;
		int n = 10;
		int m = 20;
		for(int i=0; i<=100; i++)
		{
			a[i] = i;
		}
		for(int i=1; i<100; i++)
			for(int j=i+1; i+j+2*i*j<100; j++)
				a[i+j+2*i*j] = 0;
		
		int nrPrime = 0;
		for(int i=0; i<100; i++)
			if(a[i] != 0)
				nrPrime++;
		
		int prime[] = new int[nrPrime];
		
		for(int i=0; i<100; i++)
		{
			if(a[i] != 0)
			{
				prime[k] = 2*a[i] + 1;
				k++;
			}
		}
		
	    for(int z = n; z<=m; z++)
		{
	    	int contor = 0;
			if(z % 2 == 0)
			{
				for(int i=0; i<nrPrime-1; i++)
				{
					for(int j=i+1; j<nrPrime; j++) 
					{
						if(z == (prime[i] + prime[j]))
						{
							contor = contor + 1;
						}
					}
				}
			}
			if(contor != 0)
				System.out.println(z + " verifica conjectura lui Goldbach");
						
		}		
	}
}
