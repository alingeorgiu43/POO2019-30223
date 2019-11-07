import java.util.Random;
import java.util.*;

public class HelloWorld {

	static void myRandom() {
		
		int digit = 10;
		Random rand = new Random();
		int nr = rand.nextInt(digit);
		int double_nr = nr*2;
		System.out.print(double_nr);
	}
	
	static void myMathRandom() {
		double nr_random = Math.random();
		double double_nr_random = nr_random*2;
		System.out.println(nr_random);
		System.out.println(double_nr_random);
	}
	
	public static void main(String[] args) {
		System.out.print("HelloWorld");
		myRandom();
		myMathRandom();
	}

}
