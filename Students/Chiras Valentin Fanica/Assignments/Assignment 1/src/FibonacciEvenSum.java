import java.util.*;
public class FibonacciEvenSum {

	public static void main(String[] args) {
	//O(n)
		int n1=1;
		int n2=1;
		int n3;
		int n;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		in.close();
		System.out.print(n1+ " " + n2);
		for (int i =2;i<n;i++)
		{	
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
	
	}

}
