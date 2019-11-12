
public class Prob2 {
	
	static long fib_ultimate(int n)
	{
	    int i;
	    long back2=1;
	    long back1=1;
	    long next;
	    if(n==0)
	        return 0;
	    if (n==1 || n==2)
	        return 1;
	    for (i=2; i<n-1; i++)
	    {
	         next = back1+back2;
	        back2 = back1;
	        back1 = next;
	    }
	    return(back1+back2);
	}
	 public static void main(String[] args) {
		 
	 int ok=0;
	 int k=0;
	 long s=0;
	 while(ok==0)
	 {
        if(fib_ultimate(k)<=4000000)
        {
        	if(fib_ultimate(k)%2==0)
        		s = s + fib_ultimate(k);
        	k++;
        }
        else
        	ok = 1;
	 }
	 System.out.println("Suma este " + s);
}
}
