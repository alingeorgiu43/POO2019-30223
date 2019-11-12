package palindrom;

public class Palindrom {

	public static void main(String[] args) {
		int nr=1;
		int x=0;
		int y=0;
		int palindrom=0;
		for(int i=100;i<1000;i++) {
			for(int j=100;j<1000;j++) {
				nr=i*j;
				int invers=0;
				while( nr != 0) {
					int digit = nr % 10;
					invers = invers * 10 + digit;
					nr /= 10;
				}
				nr=i*j;
				if(nr == invers && invers>palindrom) {
					palindrom=invers;
					x=i;
					y=j;
				}
			}
		}
		System.out.println(palindrom+"="+x+"*"+y);
	}
}
