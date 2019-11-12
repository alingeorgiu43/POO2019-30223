
public class FibonnaciEvenSum {

	public static void main(String[] args) {
		int n1=0, n2=1, nc=0;
		long sum=0;
		while(nc <= 4000000) {
			nc=n1+n2;
			if(nc % 2 == 0)
				sum = sum + nc;
			n1 = n2;
			n2 = nc;
		}
		System.out.println(sum);
		
		int n=9;
		System.out.println(fibo(n));
		System.out.println(fibo2(n));
	}
	//O(n)
	public static int fibo(int n) {
		int f[][] = new int[][] {{1,1},{1,0}};
		if(n == 0)
			return 0;
		power(f, n-1);
			return f[0][0];
	}
	
	/*functie ce inmulteste 2 matrici f si m si pune rezultatul inapoi in f[][]*/
	public static void multiply(int f[][], int m[][]) {
		int a = f[0][0]*m[0][0] + f[0][1]*m[1][0];
		int b = f[0][0]*m[0][1] + f[0][1]*m[1][1];
		int c = f[1][0]*m[0][0] + f[1][1]*m[1][0];
		int d = f[1][0]*m[0][1] + f[1][1]*m[1][1];
		
	f[0][0] = a;
	f[0][1] = b;
	f[1][0] = c;
	f[1][1] = d;
	}
	
	public static void power(int f[][], int n) {
		int i;
		int m[][] = new int[][]{{1,1},{1,0}};
		
		for(i=2; i<=n; i++)
			multiply(f,m);
	}
	//O(logn)
	public static int fibo2(int n) {
		int f[][] = new int[][] {{1,1},{1,0}};
		if(n == 0)
			return 0;
		power2(f, n-1);
			return f[0][0];
	}
	
	public static void power2(int f[][], int n) {
		if(n == 0 || n == 1)
			return;
		int m[][] = new int[][] {{1,1},{1,0}};
		power2(f,n/2);
		multiply(f,f);
		
		if(n%2 != 0)
			multiply(f,m);
	}
	
}

