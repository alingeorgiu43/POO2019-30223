
import java.util.*;

public class Prime {
	public static void main(String argv[])
	{
		Scanner input= new Scanner(System.in);
		int m=input.nextInt();
		int n=input.nextInt();
		
		int total;
		if ((n-m)%2==1)
			total=(n-m)/2+1;
		else
			total=(n-m)/2;
		
		if (n%2==1)
			n--;
		if (m%2==1)
			m++;
		
		int ok=0;
		for(int numar=m; numar<=n; numar+=2)
		{
			int iesi=0;
			if (numar%2==0)
				for(int nrPrim1=2; nrPrim1<=numar; nrPrim1++) 
				{
					if(Prim(nrPrim1)==true)
						for(int nrPrim2=2; nrPrim2<=numar; nrPrim2++)
						{
							if (Prim(nrPrim2)==true)
								if (nrPrim2+nrPrim1==numar) 
								{
									ok++;
									iesi=1;
									//System.out.println(numar + " " + nrPrim1 + " " + nrPrim2);
								}
						if (iesi==1)
							break;
							
						}
					if (iesi==1)
						break;
				}
			
		}
		
		if (ok==total)
			System.out.print("e adevarata conjectura");
		else
			System.out.print("nu e adevarata conjectura");

		
	}
	
	
	public static boolean Prim(int n)
	{
		int c=0;
		for(int divizor=2; divizor<=n/2; divizor++)
			if (n%divizor==0)
				c++;
		if (c==0)
			return true;
		else 
			return false;
	}
}
