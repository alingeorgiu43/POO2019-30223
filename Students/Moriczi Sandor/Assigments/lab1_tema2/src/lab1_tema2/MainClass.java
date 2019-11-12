package lab1_tema2;
import java.math.BigInteger;
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {

		BigInteger f1= BigInteger.valueOf(1);
		BigInteger f2= BigInteger.valueOf(1);
		BigInteger f3= f1.add(f2);
		BigInteger m2= BigInteger.valueOf(2);
		BigInteger zero= BigInteger.valueOf(0);
		BigInteger sum= BigInteger.valueOf(0);
		BigInteger million= BigInteger.valueOf(4000000);
		Scanner scan= new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=2;i<=n;i++)
		{
			int comp=sum.compareTo(million);
			if(comp==1 || comp==0)
				{
				System.out.println(i);
				break;
				}
			f3=f1.add(f2);
			//System.out.println(f3);
			if(f3.mod(m2).equals(zero))
				sum=sum.add(f3);
			f1=f2;
			f2=f3;
		}
		System.out.println(sum);
		

	}
}
