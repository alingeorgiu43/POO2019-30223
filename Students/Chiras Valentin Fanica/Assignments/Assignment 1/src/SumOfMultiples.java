import java.util.*;
public class SumOfMultiples {
	public static void main(String arg[])
	{
		int sum=0;
		for(int i =0 ; i <1000 ;i++)
		{
			if(i%3 ==0 || i%5==0)
				sum=sum+i;
		}
		System.out.println(sum);
		Scanner sc= new Scanner(System.in);
		int number=sc.nextInt();
		int sum2=0;
		for(int i =0;i<number;i++)
		{
			if(i%3 ==0 || i%5==0)
				sum2=sum2+i;
		}
			System.out.println(sum2);
		//Overflow n>10^5;
	
			long numberlong=sc.nextInt();
			long sum3=0;
			for(long i =0;i<numberlong;i++)
			{
				if(i%3 ==0 || i% 5==0)
					sum3=sum3+i;
			}
				sc.close();
				System.out.println(sum3);
		//Overflow n>10^10
	}
}
