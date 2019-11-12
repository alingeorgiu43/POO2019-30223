package asg12;


//am gasit o formula de recurenta pt numerele pare din sirul lui Fibonacci 
//Fn = 4Fn-1 + Fn-2 , unde F1=0 si F2=2 - primele numere pare din sir 

public class MainClass {
	
    static long FibSum(long limita) 
    { 
        if (limita < 2) 
            return 0; 
    
        long f1 = 0, f2 = 2; 
        long sum = f1 + f2; 
      
       
        while (f2 <= limita) 
        { 
            
            long f3 = 4 * f2 + f1; 
      
      
            if (f3 > limita) 
                break; 
       
            f1 = f2; 
            f2 = f3; 
            sum += f2; 
        } 
      
        return(int) sum; 
    }
	    public static void main (String args[]) 
	    { 
	    	long limita = 4000000; 
	        System.out.println(FibSum(limita)); 
	    } 

}
