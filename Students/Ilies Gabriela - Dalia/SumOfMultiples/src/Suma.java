import java.util.*;

public class Suma {
	public static void main(String argv[]){
		
	Scanner input = new Scanner(System.in);
	int numar=input.nextInt();
	int sum=0;
	
	for(int contor=3; contor<numar; contor++)
	{
		if (contor%3==0 || contor%5==0) 
		{
			sum=sum+contor;
		}
	}
	
	System.out.println(sum);
	//numarul care genereaza overflow pentru integer este 95936
	
/*	
	long numar=input.nextInt();
	long sum=0;
	
	for(long contor=3; contor<numar; contor++)
	{
		if (contor%3==0 || contor%5==0) 
		{
			sum=sum+contor;
		}
	}
	System.out.println(sum);*/
	//2147483648 genereaza overflow pentru numerele de tip long 
	}
}
