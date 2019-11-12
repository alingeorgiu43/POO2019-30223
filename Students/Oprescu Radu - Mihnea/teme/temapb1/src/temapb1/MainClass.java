package temapb1;
import java.util.Scanner;


public class MainClass {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int n=in.nextInt();
		int k=3;
		for(int i=4;i<=n;i++) {
			if(i%3==0 || i%5==0)
				k=k+i;
		}
		System.out.println(k);
	}

}
