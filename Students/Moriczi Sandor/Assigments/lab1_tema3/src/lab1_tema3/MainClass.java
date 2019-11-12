package lab1_tema3;

public class MainClass {

	public static void main(String[] args) {
		long a;
		long b;
		long s=0;
		aici:
		for(int i=9999;i>=1;i--)
		{
			for(int j=9999;j>=1;j--)
			{
				a=i*j;
				b=a;
				s=0;
				while(b!=0)
				{
					int c= (int) b%10;
					s=c+s*10;
					b=b/10;
				}
				System.out.println(s+" ");
				if(a==s)
					{
					System.out.println("palindrom");
					break aici;
					}
					
			}
		}

	}

}
