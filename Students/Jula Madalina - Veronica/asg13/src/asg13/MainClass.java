package asg13;

public class MainClass {

	static int palindrom (int n)
	{
		int pal=n%10,c=n;
		n=n/10;
		while(n>0)
		{	
			pal=10*pal+n%10;
		    n=n/10;
		}
		if(c==pal)
			return 1;
		else 
			return 0;
		   
	}
	public static void main(String[] args) {
		
		int i, j,ok=1;
	    for(i=999; i>100 && ok==1; i--)
		    for(j=999; j>100 && ok==1; j--)
				if(palindrom(i*j)==1)
				{
					System.out.println("Cel mai mare palindrom este: " + i*j + " care e produsul dintre " +i +" si " +j);
					ok=0;   		
				}
	    ok=1;
	    for(i=9999; i>1000 && ok==1; i--)
		    for(j=9999; j>1000 && ok==1; j--)
				if(palindrom(i*j)==1)
				{
					System.out.println("Cel mai mare palindrom este: " + i*j + " care e produsul dintre " +i +" si " +j);
					ok=0;   		
				}
	}

}
