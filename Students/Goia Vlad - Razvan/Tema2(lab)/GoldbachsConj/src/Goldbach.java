import java.util.Scanner;

class Goldbach{
    
    static int isPrime(int n) {
        for(int i=2; i<=n/2; i++) 
            if(n%i == 0) {
                return 0;
            }   
        return 1;
    }
   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);       
        // Introdu 2 nr:
        int num1 = in.nextInt(); 
        int num2 = in.nextInt();       
		int[] x = new int[1000];
		int[] y = new int[1000];

		for (int i = 2; i <= 100; i++)
			for (int j = 2; j <= 100; j++)
				if (isPrime(i) == 1 && isPrime(j) == 1) 
				{
					x[i + j] = i;
					y[i + j] = j;
				}

		for (int i = num1; i <= num2; i++)
			if (i % 2 == 0)
				System.out.println(i + " = " + x[i] + " + " + y[i]);
        
    }
}