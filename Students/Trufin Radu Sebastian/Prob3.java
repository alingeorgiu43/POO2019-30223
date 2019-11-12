
public class Prob3 {
	static int verifica(int n)
	{
	    int m=0;
	    if(n%10==0)
	{
	    return 0;
	}
	    while(n>0)
	{
	    m=m*10+n%10;
	    if(m==n)
	{
	    return 1;
	}
	    n = n / 10;
	    if(m==n)
	{
	    return 1;
	}
	    if(m>n)
	{
	    return 0;
	}
	}
	    return 0;
	}
	
	public static void main(String[] args) {
		int maxx = 0;
		int imax = 0;
		int jmax = 0;
			for(int i=999;i>=100;i--)
				for(int j=999;j>=100;j--)
					if(verifica(i*j)==1)
					{
						if(i*j > maxx)
							{
							   maxx = i*j;
							   imax = i;
							   jmax = j;
							}
					}
			System.out.println("Cel mai mare palindrom este : " + maxx + " si este obtinut din " + imax + " * " + jmax);
			
		maxx = 0;
		imax = 0;
		jmax = 0;
			for(int i=9999;i>=1000;i--)
					for(int j=9999;j>=1000;j--)
						if(verifica(i*j)==1)
						{
							if(i*j > maxx)
								{
								   maxx = i*j;
								   imax = i;
								   jmax = j;
								}
						}
				System.out.println("Cel mai mare palindrom este : " + maxx + " si este obtinut din " + imax + " * " + jmax);
	}
}
