package lab3pr1;
import java.util.*;

public class MainClass{
	
	public static boolean prim(int n) {
		for(int d=3;d<=n/2;d=d+2) 
			if(n%d==0) 
				return false;
		return true;	
		
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		
		for(int i=m;i<=n;i++) {
			for(int a=2;a<i;a++)
				for(int b=2;b<i;b++)
					if((i==a+b) &&(prim(a))==true &&(prim(b)==true))
						System.out.println(i + "=" + a+ "+" + b);
			
			
		}
	
		}
	
	
}