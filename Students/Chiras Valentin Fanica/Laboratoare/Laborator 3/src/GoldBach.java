import java.util.*;
public class GoldBach {
	public static boolean CheckPrime( int Number )
	{
		if(Number <2 || Number % 2 == 0)
			return (Number == 2);
		for( int odd = 3; odd* odd <=Number; odd +=2)
			if(Number% odd == 0)
				return false;		
		return true;	
	}
	public static void main(String arg[])
	{
		int inf,sup;
		Scanner in = new Scanner(System.in);
		System.out.println("Introduceti limita inferioara si cea superioara a domeniului");		
		inf=in.nextInt();
		sup=in.nextInt();
		in.close();
		
		int[] primeNumbers = new int[sup];
		for(int i = inf,index = 0; i <= sup; i++,index++ )
			{
			if(CheckPrime(i))
				primeNumbers[index] = i;
			}
		
		for(int i =0 ; i < primeNumbers.length;i++) 
		{
			if(primeNumbers[i]==0)
				continue;
			for(int j=i;j< primeNumbers.length;j++)
			{
				if(primeNumbers[j]==0)
					continue;
			int Suma=primeNumbers[i] + primeNumbers[j];	
			
				System.out.printf("%d = %d + %d \n",Suma,primeNumbers[i],primeNumbers[j]);
			}
			
		}
			
		
	}


}
