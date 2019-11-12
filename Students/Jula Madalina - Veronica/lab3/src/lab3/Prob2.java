package lab3;

public class Prob2 {

	
	static final double EPSILON = 0.001; 
    
    static double func(double x, int a, int b, int c) 
    { 
        return a *x * x - x * x + b * x + c; 
    } 
      
   
    static double derivFunc(double x, int a, int b) 
    { 
        return 2 * a * x + b; 
    } 
      
    // Function to find the root 
    static void newtonRaphson(double x,int a, int b, int c) 
    { 
        double h = func(x,a,b,c) / derivFunc(x,a,b); 
        while (Math.abs(h) >= EPSILON) 
        { 
            h = func(x,a,b,c) / derivFunc(x,a,b);  
            x = x - h; 
        } 
      
        System.out.print("Valoarea radacinii este: "
                + Math.round(x * 100.0) / 100.0); 
    } 
	public static void main(String[] args) {
		double x0=10;
		int a=2, b=3, c=5;
        newtonRaphson(x0,a,b,c);

	}

}
