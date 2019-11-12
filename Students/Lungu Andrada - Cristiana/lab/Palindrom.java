package lab;

public class Palindrom {
	public static void main(String[] args) {
		int max=0;
		for(int i=1;i<=3;i++) {
			max=max*10;
			max=max+9;
		}
		int min=1+max/10;
		int nrmax=0;
		for(int i=max;i>=min;i--) {
			for(int j=i;j>=min;j--)
			{
				int n=i*j;
				if(n<nrmax)
					break;
				int number=n;
				int n1=0;
				while(number!=0) {
					n1=n1*10+number%10;
					number=number/10;
				}
				if(n==n1 && n>nrmax)
					nrmax=n;
			}
		}
		System.out.println(nrmax);
	}
}
