
public class MainClass {

	public static void main(String[] args) {
		System.out.println("Hello world");
		
		// Scrieţi scurte programe pentru a testa limitele reprezentărilor. 

		Integer a = new Integer(Integer.MAX_VALUE);
		Integer b = new Integer(Integer.MIN_VALUE);
		
		System.out.println("Valoarea lui a este " + a + "; Valoarea lui b este " + b + " ; Suma lor a + b = " + (a + b));
		System.out.println("Valoarea lui a+1 este " + (a + 1) );
		System.out.println("Valoarea lui b-1 este " + (b - 1) );
		
		// Numere in virgula mobila. ( comparare )
		
		double x = 3.333333333;
		double y = 3.333333334;
		double z = 1.2222222222222222222222; // se va avisa doar 1.2222222222222223
		
		final double epsilon = 0.0001;
		
		if(x == y)
			System.out.println("Egale.");
		else
			System.out.println("Nu sunt egale.");
		
		// folosim un epsilon pentru comparatie
		if(Math.abs(x - y) < epsilon)
			System.out.println("Egale.");
		else
			System.out.println("Nu sunt egale.");
			
		System.out.println(z);
		
		double m = 1.222222222222222222222222;
		double n = 2.111111111111111111111111;
		
		System.out.println("Valoarea lui m + n este " + (m + n)); 
		// ca si in cazul anterior, se vor afisa doar primele 16 zecimale.
	}

}