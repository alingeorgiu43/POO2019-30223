package lab2pr3;
import java.util.Scanner;
import java.math.BigInteger;


public class MainClass {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int i;
		BigInteger a,b;
		a=BigInteger.valueOf(200);
		b=BigInteger.valueOf(300);
		//a=a.add(b);
		
		
		for(i=0;i<n;i++) {
			b=BigInteger.valueOf(Math.round(Math.pow(2, i)));
			a=a.add(b);
		}
		
		System.out.println(a);
	}

}
