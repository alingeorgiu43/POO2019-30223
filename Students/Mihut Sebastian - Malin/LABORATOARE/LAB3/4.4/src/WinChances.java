
public class WinChances {

	public static void main(String[] args) {
		double rez=1;
		for(int i=0;i<6;i++)
			rez = rez*((6.0-i)/(49.0-i));
		System.out.println(rez);
	}
}
