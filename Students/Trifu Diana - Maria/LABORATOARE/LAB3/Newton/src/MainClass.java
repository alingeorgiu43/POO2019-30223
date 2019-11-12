
public class MainClass {

	public static void main(String[] args) {
		int a = 1;
		int b = 0;
		int c = -8;
		int ok = 0;
		double x1 = 3.0;
		double x2 = 0.0;
		int n = 0;
		
		x2 = x1 - ((a*x1*x1 + b*x1 + c) / (2*a*x1 + b));
		while(ok == 0)
		{
			x2 = x1 - ((a*x1*x1 + b*x1 + c) / (2*a*x1 + b));
			if((Math.abs(x2-x1)> 0.000001) && (Math.abs(x2-x1)<0.01))
				ok = 1;
			x1 = x2;
			n = n + 1;
		}
		
		System.out.println(x1);
		System.out.println(n);
	}

}
