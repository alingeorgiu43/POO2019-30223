import java.util.Scanner;

class GoldBach{
	
    static int primSauNu(int n) {
        for(int i=2; i<=n/2; i++) 
            if(n%i == 0) {
                return 0;
            }   
        return 1;
    }
   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);       
        // Introdu 2 nr:
        System.out.println("Introdu m");
        int m = in.nextInt(); 
        System.out.println("Introdu n");
        int n = in.nextInt();
		//int[] x = new int[1000];
		//int[] y = new int[1000];

		for (int i = m; i <= n; i+=2)
			for (int j = 2; j < i-2; j++)
				if (primSauNu(j) == 1 && primSauNu(i-j) == 1) 
				{
					System.out.println(i + " = " + j + " + " + (i-j));
				}

    }
}