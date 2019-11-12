import java.util.*;
public class MainClass {
	public static void main(String arg[])
	{
		System.out.println("Hello world!");
		int numere_intregi;
		float numere_reale;
		Scanner in = new Scanner(System.in);
		System.out.println("Numarul intreg:");
		numere_intregi=in.nextInt();
		System.out.println("Numarul intreg citit este " + numere_intregi);
		System.out.println("Numarul real:");
		numere_reale=in.nextFloat();
		System.out.println("Numarul real citit este " + numere_reale);
	}

}
