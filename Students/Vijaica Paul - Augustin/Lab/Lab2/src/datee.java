import java.util.Scanner;
public class datee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s; 
		Scanner in = new Scanner(System.in);
		System.out.println("Introdu un nume");			
		s = in.nextLine(); 
		System.out.println("Cum a fost ziua ta, " + s + "?\n");
		System.out.println("La ce numar te gandesti?");
		int i = in.nextInt();
		System.out.println("Numarul introdus este cumva " + i+ "? Cat de bizar!\n" );
		float f;
		System.out.println("Spune-mi un numar real: ");
		f = in.nextFloat();
		System.out.println("Numarul tau, " + f + ", este foarte impresionant!");

	}

}
