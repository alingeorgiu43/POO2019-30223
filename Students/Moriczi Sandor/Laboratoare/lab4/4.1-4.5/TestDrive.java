package laborator4;

public class TestDrive {
	private static int NR_TESTE;
	
	public static void testeaza(Autovehicul a) {
		for (int i=0; i<3; i++)
			a.accelerare(30);
		a.accelerare(40);
		for (int i=0; i<2; i++)
			a.decelerare(2);
		a.accelerare(10);
		a.oprire();	
		NR_TESTE++;
	}
	
	public static int getNrTeste() {
		return NR_TESTE;
	}

}