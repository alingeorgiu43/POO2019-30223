import java.awt.Color;
import masini.Autocar;
import masini.Sofer_Prof;
import masini.autovehicul;

public class MainClass {

	public static void main(String[] args) {
		autovehicul a = new autovehicul();
		
		//creare 
		a.setFct("RENAULT", Color.red, 15, 1, 100);
		System.out.println(a.getVit());
		System.out.println(a.getTr());
	    //accelerare
		a.accelerare(a.getVit(), 20, a.getTr());
		System.out.println(a.getVit());
		System.out.println(a.getTr());
		//decelerare
		a.decelerare(a.getVit(), 20, a.getTr());
		System.out.println(a.getVit());
		System.out.println(a.getTr());
		//oprire motor 
		a.oprire(a.getVit(), a.getTr());
		System.out.println(a.getVit());
		System.out.println(a.getTr());
		//accelerare
		a.accelerare(a.getVit(), 110, a.getTr());
		System.out.println(a.getVit());
		System.out.println(a.getTr());
		
		
		//cele doua clase de la punctul 4.5
		Autocar a1 = new Autocar();
		Sofer_Prof s = new Sofer_Prof();	
		a1.nrLocuri = 25;
		a1.nrSoferi = 2;
		a1.presiuneRoti = 23.5F;
		s.aniExp = 7;
		a1.newSofer(a1.nrSoferi, s.aniExp);
		System.out.println(a1.nrSoferi);
	}
}
