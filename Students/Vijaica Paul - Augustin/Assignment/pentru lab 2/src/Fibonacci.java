
public class Fibonacci {

	public static void main(String[] args) {
		int f1=0;
		int f2=1;
		int f=1;
		int s=0;
		for(int i=2;f<4000000;i++)
		{
			if(f%2==0)
				s+=f;
			f=f1+f2;
			f1=f2;
			f2=f;

			}
		System.out.println("suma primelor 4 milioane de numere pare este " +s);
	}

}
