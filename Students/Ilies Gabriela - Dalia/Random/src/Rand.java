import java.util.Random;

public class Rand {
	public static void main(String argv[])
	{
		int n=9;
		Random rand= new Random();
		int nr =rand.nextInt(n);
		System.out.println(nr*2);
	}
}
