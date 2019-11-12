package lab;

public class Fibonacci {
	public static void main(String[] args) {
		int n1=0;
		int n2=1;
		int nr_fin=0;
		long suma=0;
		while(nr_fin <= 4000000)
		{
			nr_fin=n1+n2;
			if(nr_fin%2==0)
				suma=suma+nr_fin;
			n1=n2;
			n2=nr_fin;
		}
		System.out.println("suma este "+suma);
		
		
	}
	
	
}
