import java.util.Scanner;

public class SumaMultiplii {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		double n = 9000;
		double sumaMultiplii = 0;
		for(double i = 1; i < n; i++) {
			
			if(i%3 == 0 || i%5 == 0) {
				sumaMultiplii+=i;
			}
		}
		System.out.print("Suma multiplilor este" +sumaMultiplii);
	}

}
