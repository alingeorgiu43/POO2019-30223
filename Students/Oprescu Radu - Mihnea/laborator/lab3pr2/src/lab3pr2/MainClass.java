package lab3pr2;

public class MainClass {

	static double epsilon=0.001;
		
	static double f(double x) {
		
		return x*x+5*+3;
		
	}
	static double derivata(double x) {
		
		return 2*x+5;
		
	}
	
	static void newton(double x) {
		
		double h=f(x);
		while(Math.abs(h)>=epsilon) {
			
			h=f(x)/derivata(x);
			x=x-h;
			
		}
		
		System.out.println("radacina ecuatiei este: " +Math.round(x*100.0)/100.0);
	}
	
	public static void main(String[] args) {
		double x0=-15;
		newton(x0);
		

	}

}
