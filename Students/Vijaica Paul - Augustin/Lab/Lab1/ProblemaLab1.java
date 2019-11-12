import java.util.Random;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		Random rand = new Random();
		int i = rand.nextInt(n);
		int i2 = i*2;
		System.out.println(i);
		System.out.println(i2);
		
		/* Random randomGenerator = new Random();
		 * int intRandom = randomGenerator.nextInt(9);
		 * system.out.println(intRandom*2);
		 */
		
	}

}
