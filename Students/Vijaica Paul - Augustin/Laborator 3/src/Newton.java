//import java.util.*;
public class Newton {
	 static final double EPSILON = 0.0001; 
     
	    static double func(double x) 
	    { 
	        return 3*x*x+2*x+1; 
	    } 
	      
	    static double derivata(double x) 
	    { 
	        return 2*3*x  + 2; 
	    } 
	      

	    static void newton(double x) 
	    { 
	    	int n=0;
	        double h = func(x) / derivata(x); 
	        while (Math.abs(h) >= EPSILON) 
	        { 
	            h = func(x) / derivata(x); 
	      
	            // x(n+1) = x(n) - f(x) / f'(x)  
	            x = x - h; 
	           n++;
	        } 
	      
	        System.out.print("Radacina este " 
	                + Math.round(x * 100.0) / 100.0
	                + " Numarul de iteratii este "
	        		+ n); 
	    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x0 = -20;  
        newton(x0); 
    	
	}

}
