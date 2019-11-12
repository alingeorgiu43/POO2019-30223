import java.util.Scanner;
import java.math.BigInteger;
import java.lang.Math;
public class MainClass {

	public static void main(String[] args) {
		/*Scanner n= new Scanner(System.in);
		System.out.println("enter smth");
		int myint = n.nextInt();
		System.out.println("este nr " + myint);
		*/
		int a=Integer.MAX_VALUE+1;
		int b=Integer.MIN_VALUE-1;
		double d=Double.MAX_VALUE-1;
		double d2=Double.MIN_VALUE+1;
		float f1=Float.MAX_VALUE-1;
		float f2=Float.MIN_VALUE+1;
		//System.out.println(a);
		//System.out.println(b);
		//System.out.println(d);
		//System.out.println(d2);
		//System.out.println(f1);
		//System.out.println(f2);
		
		BigInteger bigint= BigInteger.valueOf(1);
		for(int i=1;i<64;i++)
		{
			BigInteger p=BigInteger.valueOf((long)Math.pow(2, i));
			bigint=bigint.add(p);
		}
		System.out.println("sunt " + bigint + " boabe");
	}

}
