package lab;
import java.util.Scanner;
public class Multiplii {
	public static void main(String[] args) {
	int sum=0;
	int i;
	for(i=1;i<1000;i++)
		if(i%3==0 || i%5==0)
			sum=sum+i;
	System.out.println(sum);
	
	
	System.out.println("Introduceti numarul");
	Scanner nr=new Scanner(System.in);
	int n=nr.nextInt();
	int suma=0;
	//int nr=n;
	for(int j=1;j<n;j++)
		if(j%3==0 || j%5==0)
			suma=suma+j;

	System.out.println("suma este: "+ suma);
	}
	
}
