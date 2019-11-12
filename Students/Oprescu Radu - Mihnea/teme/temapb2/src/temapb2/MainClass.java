package temapb2;

public class MainClass {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int s=0;
		int spartial=0;
		while(s<4000000) {
			spartial=b+a;
			if(b%2==0)
				s=s+b;
			a=b;
			b=spartial;
		}
		System.out.println(s);
	}

}
