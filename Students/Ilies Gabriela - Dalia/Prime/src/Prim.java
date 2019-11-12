import java.util.*;

public class Prim {
	public static void main(String argv[])
	{
		Scanner input = new Scanner(System.in);
		int size=input.nextInt();
		
		double diagonala=2*size-1;
		
		int numar=1;
		int contor=0;
		
		//diagonala secundara
		for(int pas=1; pas<=size-1; pas++)
		{
			numar=numar+2*pas;
			int ok=0;
			for (int divizor=2; divizor<numar/2; divizor++)
				if (numar%divizor==0)
					ok++;
			if (ok==0)
				contor++;
			System.out.print(numar + " ");
		}
		
		System.out.print("\n");
		
		//diagonala principala
		numar=1;
			
		for(int pas=1; pas<=size/2; pas++)
		{
			numar=numar+4*pas;
			int ok=0;
			for (int divizor=2; divizor<numar/2; divizor++)
				if (numar%divizor==0)
					ok++;
			if (ok==0)
				contor++;
			System.out.print(numar + " ");
			
			if (pas!=(int)size/2 && size%2==0) 
			{
				numar=numar+4*pas;
				ok=0;
				for (int divizor=2; divizor<numar/2; divizor++)
					if (numar%divizor==0)
						ok++;
				if (ok==0)
					contor++;
				System.out.print(numar + " ");
			}
			
			if (size%2==1) 
			{
				numar=numar+4*pas;
				ok=0;
				for (int divizor=2; divizor<numar/2; divizor++)
					if (numar%divizor==0)
						ok++;
				if (ok==0)
					contor++;
				System.out.print(numar + " ");
			}
		}
		
		System.out.print("\n" + (contor/diagonala)*100 + "%");
	}
}
