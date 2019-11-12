package lab3Pb5;

public class MainClass {

	public static void main(String[] args) {
		int[] numereExtrase = new int[6];
		extragereNumere(numereExtrase,6);
		System.out.println("Numerele extrase sunt: ");
		for (int i = 0; i < 6; i++) {
			System.out.print(numereExtrase[i] + " ");
		}
		System.out.println();

	}
	
	public static void extragereNumere(int[] numere, int dimensiune) {
		for (int i = 0; i < 6; i++) {
			numere[i] = (int) (Math.random() * 49) + 1;
			while (numere[i] == 0) {
				numere[i] = (int) (Math.random() * 49) + 1;
			}
		}
	}

}
