import java.util.Random;

public class MainClass {

	public static void main(String[] args) {
		//Metoda 1-clasa Random
		Random randomGenerator = new Random();
		int randomNr = randomGenerator.nextInt(9); //acopera intervalul [0,9]
		int doubleNr = randomNr*2;
		System.out.println(doubleNr);
		
		//Metoda 2 - Math.random()
		/*
		double doubleRandom = Math.random()*10;
		int intRandom = (int)(Math.random()*10);
		int doubleNumber = intRandom*2;
		System.out.println(doubleNumber);
		*/

	}

}
