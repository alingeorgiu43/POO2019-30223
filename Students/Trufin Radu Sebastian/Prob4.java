
public class Prob4 {
	
	static int prim(int nr)
	{
	    if(nr<2)
	    return 0;
	    int d=2;
	    while(d*d<=nr)
	    {
	    if(nr%d==0)
	    return 0;
	    d++;
	    }
	    return 1;
	}
	
	static int count(int n)
	{	
		int nr = 0;
		if(prim(n*n)==1)
			nr++;
		if(prim(n*n-(n-1))==1)
			nr++;
		if(prim(n*n-2*(n-1))==1)
			nr++;
		if(prim(n*n-3*(n-1))==1)
			nr++;
		
		return nr;
	}
	
	static int diagonal(int n)
	{
		int s=0;
		for(int i=n;i>=1;i = i-2)
			s = s + count(i);
		return s;
	}
	
	static float raport(int n)
	{
		float r=diagonal(n);
		float k=2*n-1;
		return r/k;
	}
	
	static void verif()
	{
		int ok = 0;
		int n = 3;
		int p = 0;
		float q = 0;
		while(ok == 0)
		{
			System.out.println(raport(n) + " " + n);
			if(raport(n)<0.15)
			{
				p = n;
				q = raport(n);
				ok = 1;
			}
			n = n + 2;
		}
		System.out.println("Pentru lungimea " + p + " obtinem valoarea " + q);
	}
	
	
	public static void main(String[] args) {
	  verif();
	}
}
