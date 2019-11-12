
public class PrimeSpiral {

	static boolean isPrime(int n) 
    {  
        if (n <= 1) return false; 
        if (n <= 3) return true; 
      
        if (n % 2 == 0 || n % 3 == 0) return false; 
      
        for (int i = 5; i * i <= n; i = i + 6) 
            if (n % i == 0 || n % (i + 2) == 0) 
            return false; 
      
        return true; 
    }
	static int countPrime(int[][] a)
	{
		int k=0;
		for(int i=0,j=0;i<a.length;i++,j++)
			//for(int j=0;j<a[0].length;j++)
			{
				if(i==j && isPrime(a[i][j]) )
					k++;
			}
		for(int i=0,j=a.length-1;i<a.length;i++,j--)
			if(i+j==a.length-1 && isPrime(a[i][j]) )
				k++;
		return k;
	}
	public static void main(String[] args) {
		int r=13295;
		int i;
		int j;
		int st=0;
		int k=(2*r+1)*(2*r+1);
		int[][]a =new int[2*r+1][2*r+1];
		while(st<=r)
		{
			i=2*r-st;
			for( j=2*r-st;j>=st;j--)
		{
			a[i][j]=k;
			k--;
		}
		j=st;
		for( i=2*r-1-st;i>=st;i--)
		{
			a[i][j]=k;
			k--;
		}
		i=st;
		for(j=1+st;j<=2*r-st;j++)
		{
			a[i][j]=k;
			k--;
		}
		j=2*r-st;
		for(i=1+st;i<=2*r-1-st;i++)
		{
			a[i][j]=k;
			k--;
		}
		st+=1;
		
		}
		/*for(int in=0;in<=2*r;in++)
		{
			for(int jn=0;jn<=2*r;jn++)
			{
				System.out.printf(a[in][jn]+ " ");
			}
			System.out.println();
		}*/
		int nr_diagonala=2*(2*r+1)-1;
		int nr_prime=countPrime(a);
		double ratio=( (double)nr_prime*100 )/(double)nr_diagonala;
		System.out.println(nr_diagonala);
		System.out.println(nr_prime);
		System.out.println(ratio);
		System.out.println("it is below 10% at side lenght of " +  (2*r+1));

	}

}
