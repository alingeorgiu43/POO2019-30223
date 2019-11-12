
public class Assignment1_3 {
	public static void main(String[] args) {
		int n= 9999;
		int max=0;
		int nr;
		int invers;
		for(int i=n; i>999; i--)
		{
			for(int j=n; j>999; j--)
			{
				nr= i*j; // inmultim nr.
				invers=0; // mereu initializez invers cu 0 ca sa ii dau refresh
				int copie= nr; // tinem nr intr-un auxiliar
				while(nr!=0)
				{
					invers= invers*10+nr%10; // numarul invers
					nr=nr/10;
				}
				if(invers == copie)
				{
					if(copie>max)
					{
						max= copie; //aflam maximul dintre toate palindroamele
					}
				}
			}
		}
		System.out.println("Palindromul cel mai mare de 4 cifre este=" + max);
	}
	// Pentru 3 cifre, programul arata palindromul cel mai mare ca fiind : 906609.
	// Pentru 4 cifre, programul arata palindormul cel mia mare ca fiind : 99000099.
		
}
