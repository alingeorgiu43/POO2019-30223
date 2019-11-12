public class Palindrom {

	public static void main(String[] args) {
int i,j ,x,x1,inv;
int f1=-1,f2=-1;
int maximp=0;
 for(i=100;i<=999;i++)
	 for(j=100;j<=999;j++)
	 {
		 x=i*j;
	   x1=x;
	   inv=0;
	   while(x>0)
	   {
	     inv=10*inv+x%10;
	     x=x/10;
	   }
	   if(x1==inv && x1>maximp) {
		   maximp=x1;
		   f1=i;
		   f2=j;
	   } 
	 }

 System.out.print("Produsul dintre "+f1);
 System.out.print(" si " +f2);
 System.out.println(" este cel mai mare palindrom: "+maximp);

	}

}