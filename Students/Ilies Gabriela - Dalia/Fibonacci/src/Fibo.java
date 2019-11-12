import java.util.*;
public class Fibo {
	public static void main(String argv[]) {
		long nr1=1;
		long nr2=1;
		long nr3=0;
		
		Scanner input = new Scanner(System.in);
		int nrTermeni =input.nextInt();
		long suma=0;
		//System.out.print("1 1 ");
		for (int contor=2; contor<nrTermeni; contor++)
		{
			nr3=nr1+nr2;
			if (nr3>4000000)
				break;
			nr1=nr2;
			nr2=nr3;
			if (nr3%2==0)
				suma=suma+nr3;
			
			//System.out.print(nr3 + " ");
		}
		System.out.println(suma);
	
		suma=0;
		long fn1=1;
		long fn2=1;
		long fn3=1;
		
		//System.out.print("\n1 1 ");
		for (int contor=2; contor<nrTermeni; contor++)
		{
			long aux1=fn1;
			long aux2=fn2;
			long aux3=fn3;
			
			fn1=aux1+aux2;
			if (fn1>4000000)
				break;
			fn2=aux1;
			fn3=aux3;
			if (fn1%2==0)
				suma=suma+fn1;
			//System.out.print(fn1 + " ");
		}
		System.out.println("\n"+suma);
		
	}
}
