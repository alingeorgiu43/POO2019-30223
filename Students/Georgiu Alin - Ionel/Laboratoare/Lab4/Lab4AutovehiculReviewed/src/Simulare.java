
public class Simulare {
	
	public static void testDrive(Autovehicul masina)
	{
		System.out.printf("Masina aleasa este %s si are viteza maxima de %d km/h \n",masina.getMarca(), masina.getVitezaMaxima());
		if(masina.getVitezaCurenta() == 0)
		System.out.printf("Masina este oprita\n");
		masina.accelerare(40);
		System.out.printf("Viteza : %d km/h - treapta: %d\n", masina.getVitezaCurenta(), masina.getTreaptaCurenta());
		masina.decelerare(50);
		System.out.printf("Viteza : %d km/h - treapta: %d\n", masina.getVitezaCurenta(), masina.getTreaptaCurenta());
	}

	public static void main(String[] args) {
		Autovehicul volvo = new Autovehicul();
		Sofer newDriver = new Sofer("Georgiu","Alexandru",18,1999052);
		System.out.println(volvo.toString());
		System.out.println(newDriver.toString());
		
		testDrive(volvo);
		
	}

}
