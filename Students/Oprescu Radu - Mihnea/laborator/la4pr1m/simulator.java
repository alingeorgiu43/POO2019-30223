package la4pr1m;
import java.awt.Color;
import java.awt.color.*;


// programul nu imi recunoaste constructorul autovhecicul din clasa autovehicul pentru a crea un nou obiect de acest tip

public class simulator {
	
	autovehicul masini[];
	public static int numar_masini=3;
	
	simulator(){
		this(numar_masini);
		
	}

	public simulator(int numar_masini2) {
		if(numar_masini2>0) 
			
			masini= new autovehicul[numar_masini2];
		else
			masini= new autovehicul[numar_masini];
		
	}
	
	public static void main(String []args) {
		
		simulator sim= new simulator();
		simulator.start();
		
		
	}
	
//vom crea 4 masini asupra care vom rula simularile	
	public static void start() {
		//hyundai i30
		autovehicul hyundai= new autovehicul("Hyundai i30",Color.black,120,220,15);
		System.out.println("testare hyundai");
		testM(hyundai);
		
		// toyota ch-r
		autovehicul toyota= new autovehicul("Toyota CH-R",Color.red,130,240,25);
		System.out.println("testare toyota");
		testM(toyota);
		
		//Volkswagen golf
		
		autovehicul volswagen= new autovehicul("Volkswagen golf",Color.BLUE,110,200,30);
		System.out.println("testare volswagen");
		testM(volswagen);
		
	}
	
// functie de creare a obiectului masina	
	private autovehicul createAutovehicul(String nume_masina, Color culoare, int putere, int viteza_max, int acceleratie) {
	
		autovehicul m= new autovehicul(nume_masina,culoare,putere,viteza_max,acceleratie);
		return m;
		
	}
	
	private static void testM(autovehicul m) {
	//se simuleaza accelerarea
		
		for(int i=0;i<5;i++) {
			System.out.println("accelerare" + m.acceleratie());
		}
		
	//se simuleaza franarea	
		for(int i=0;i<5;i++) {
			System.out.println("franare" + m.reducere_v());
		}
		
		System.out.println("viteza finala" + m.getViteza());

	}
	
}

