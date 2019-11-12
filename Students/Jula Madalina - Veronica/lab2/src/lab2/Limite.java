package lab2;

public class Limite {

	public static void main(String[] args) {
		
		int maxIntVal = Integer.MAX_VALUE;
		int minIntVal = Integer.MIN_VALUE;
		
		System.out.println("Daca adaugam 1 la valoare maxima a Integer-ului obtinem:  " + (maxIntVal+1));
		System.out.println("Daca scadem 1 de la valoare minima a Integer-ului obtinem:  " + (minIntVal-1));
		
		float maxFloatVal = Float.MAX_VALUE;
		float minFloatVal = Float.MIN_VALUE;
		
		System.out.println("Daca adaugam 1 la valoare maxima a Float-ului obtinem:  " + (maxFloatVal+1));
		System.out.println("Daca scadem 1 de la valoare minima a Float-ului obtinem:  " + (minFloatVal-1));
		
		double maxDoubleVal = Double.MAX_VALUE;
		double minDoubleVal = Double.MIN_VALUE;
		
		System.out.println("Daca adaugam 1 la valoare maxima a Double-ului obtinem:  " + (maxDoubleVal+1));
		System.out.println("Daca scadem 1 de la valoare minima a Double-ului obtinem:  " + (minDoubleVal-1));
		
		
		/*Am observat ca in cazul numerelor intregi, oricat am scadea rezultatul e maximul pe care il poate lua Integer, 
		 iar daca adunam vom obtine minimul Integerului. Daca vom aduna oricat la FLoat sau Double vom obtine tot maximul
		 dar daca scadem vom obtine mereu -nr cu care am scazut.0 */
	}

}
