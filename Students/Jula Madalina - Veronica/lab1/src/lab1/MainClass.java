package lab1;

import java.util.Random;

public class MainClass {

	public static void main(String[] args) {
		Random rand= new Random();
		int i=rand.nextInt(10);
		System.out.println(i*2);
	}

}
