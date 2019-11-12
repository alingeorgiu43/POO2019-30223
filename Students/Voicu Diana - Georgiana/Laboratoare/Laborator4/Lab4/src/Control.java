import java.util.Scanner;
import java.awt.Color;
public class Control extends Autovehicul {
	public static void main(String[] args) {
		Scanner scaneaza= new Scanner(System.in);
		Autovehicul x = new Autovehicul();
		
		System.out.println("Dati marca masinii= ");
		String marca= scaneaza.nextLine();
		x.setMarca(marca);
		System.out.println("Marca masinii este: " + x.getMarca());
		
		System.out.println("Dati culoarea masinii= ");
		x.setCuloare(Color.WHITE);
		System.out.println("Masina are culoarea "+x.getCuloare());
		
		System.out.println("Viteza maxima este = " +x.getVitezaMaxima());
		System.out.println("Viteza curenta este = " +x.getVitezaCurenta());
		System.out.println("Treapta de viteza este = " +x.getTreaptaViteza());
		
		
		System.out.println("a = acceleratie, d = deceleratie, t= schimbare treapta, o = oprire");
		char operatie = 'a';
		deplasare(x,30,operatie);
		System.out.println("Viteza curenta dupa accelerare este = " + x.getVitezaCurenta());
		operatie = 't';
		deplasare(x,0,operatie);
		System.out.println("Treapta curenta dupa accelerare este = " + x.getTreaptaViteza());
		operatie = 'a';
		deplasare(x,370,operatie);
		System.out.println("Viteza curenta dupa accelerare este = " + x.getVitezaCurenta());
		operatie = 't';
		deplasare(x,0,operatie);
		System.out.println("Treapta curenta dupa accelerare este = " + x.getTreaptaViteza());
		operatie = 'd';
		deplasare(x,100,operatie);
		System.out.println("Viteza curenta dupa decelerare este = " + x.getVitezaCurenta());
		operatie = 't';
		deplasare(x,0,operatie);
		System.out.println("Treapta curenta dupa decelerare este = " + x.getTreaptaViteza());
		operatie = 'o';
		deplasare(x,0,operatie);
		System.out.println("Viteza curenta dupa oprire este = " + x.getVitezaCurenta());
		
		Sofer sofer = new Sofer("Grey","Owen",23,69);
		testeaza(x);
		
		System.out.println("Dati numele soferului:");
		String nume = scaneaza.nextLine();
		sofer.setNume(nume);
		System.out.println("Dati penumele soferului:");
		String prenume = scaneaza.nextLine();
		sofer.setPreume(prenume);
		System.out.println("Dati varsta soferului:");
		int varsta = scaneaza.nextInt();
		sofer.setVarsta(varsta);
		System.out.println("Dati nr. de permis al soferului:");
		int nr = scaneaza.nextInt();
		sofer.setNrPermis(nr);
		
		System.out.println("Numele noului sofer este: " + sofer.getNume() + " "+ sofer.getPrenume()+" " + sofer.getVarsta()+" " + sofer.getNrPermis());
		
		Rezervor rezervor = new Rezervor(0,30);
		rezervor.rezervorGol(0);
		rezervor.alimentare(10);
		rezervor.alimentare(10);
		rezervor.alimentare(5);
		rezervor.alimentare(5);
		rezervor.alimentare(5);
		rezervor.rezervorGol(30);
		
		Senzori senzori = new Senzori(0,0,0);
		senzori.verificare(0,0,0);
		System.out.println(" ");
		senzori.verificare(1,0,1);
		System.out.println(" ");
		senzori.verificare(1,1,1);
		
		
		Autovehicul y = new Autovehicul("BMW",Color.RED,300);
		testeaza(y);
		System.out.println(" ");
		System.out.println("Au fost testate "+ Autovehicul.getNrTeste()+" masini.");
		
		
		
		
		
		
	
		
		//System.out.println(sof);
}
}
