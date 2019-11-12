
public class LargestPalindrome {
	public static void main(String argv[])
	{
		int max=0;
		for(int numar1=100; numar1<=999; numar1++)
			for(int numar2=100; numar2<=999; numar2++)
			{
				int palindrom=numar1*numar2;
				int aux=palindrom;
				int ogl=0;
				while(palindrom!=0)
				{
					ogl= ogl*10+ palindrom %10;
					palindrom=palindrom/10;
				}
				if (aux==ogl)
					max=aux;
			}
		System.out.print(max+ "\n");
		
		int max2=0;
		for(int numar4=1000; numar4<=9999; numar4++)
			for(int numar3=1000; numar3<=9999; numar3++)
			{
				int pal=numar4*numar3;
				int aux2=pal;
				int ogl2=0;
				while(pal!=0)
				{
					ogl2= ogl2*10+ pal %10;
					pal=pal/10;
				}
				if (aux2==ogl2)
					max2=aux2;
			}
		System.out.print(max2);
		
	}
}
