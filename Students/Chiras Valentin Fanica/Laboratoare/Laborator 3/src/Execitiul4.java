
public class Execitiul4 {
	public  double Sanse()
 {
	 int n = 49;
	 int k = 4;
	 double p = 1.0;
	 for(int i= k ; i>0;i--)
	 {	 
		 p=p*n/i;
		 n--;
	 }
	 return 1.0/p;	 
 }
	public static void main(String[] args) {
		
		Execitiul4 Mein=new Execitiul4();
		System.out.println(Mein.Sanse());
	}

}
