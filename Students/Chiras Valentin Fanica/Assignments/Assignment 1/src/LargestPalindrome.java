
public class LargestPalindrome {
 static int Palindrome(int n)
 {
	 
	 int Limita_Superioara = 0;
	 for (int i = 1 ;i<=n; i++)
	 { 
		 Limita_Superioara *=10;
	 	 Limita_Superioara +=9;
	 }
	 int Limita_Inferioara = 1+ Limita_Superioara /10;
	 int Rezultat = 0;
	 for(int i = Limita_Superioara;i>=Limita_Inferioara;i--)
	 {
		 for(int j = i; j >= Limita_Inferioara; j--)
		 {
			 int a = i * j;
			 if(a < Rezultat)
				 break;
			 int numar = a;
			 int invers = 0;
			 while(numar !=0 )
			 {
				 invers=invers*10 + numar %10;
				 numar /=10;
			 }
			 if(a == invers && a > Rezultat )
				 Rezultat=a;
			}
			 
		 }
	 return Rezultat;
 }
	 
	public static void main(String[] args) {
		int n=2;
		System.out.println(Palindrome(n));
		 n=3;
		System.out.println(Palindrome(n));
		 n=4;
		System.out.println(Palindrome(n));
		
	}

}
