package la4pr1m;
import java.awt.Color;
import java.util.*;






public class autovehicul  {
	
	private String nume_masina;
	private Color culoare;
	private int putere_m; //puterea motorului
	private int viteza=0; 
	private int viteza_max; //viteza maxima pe care o poate atinge o masina
	private int acceleratie;
	private int treapta_vit; /// treapta de viteza in care se afla masina
	public static final int viteza_minima=0;
	public static final int  viteza_maxima=260;
	public static final int putere_min=4;
	public static final int putere_max=500;
	public static final int acceleratie_min=1; ///viteza creste cu 1 km/h pe secunda
	public static final int acceleraetie_max=40; ///viteza creste cu maxim 40 km/h pe secunda
	private static final int[] schimbare_trepte= {0,
			(int) (0.1 * viteza_maxima),
			(int) (0.3 * viteza_maxima),
			(int) (0.5 * viteza_maxima),
			(int) (0.8 * viteza_maxima),
			(int) (0.9 * viteza_maxima)};
	private static final int nr_trepte=5;
	private Rezervor rezervor;
	
	
	
	public void Autovehicul(String nume_masina, Color culoare, int putere, int viteza_max, int acceleratie) {
		
		this.nume_masina=nume_masina;
		this.culoare=culoare;
		this.rezervor=new Rezervor();
		if(putere>putere_min)
			this.putere_m=putere;
		else
			this.putere_m=putere_max;
		if(viteza_max<0)
			this.viteza_max=viteza_minima;
		else
			if(viteza_max<viteza_maxima)
				viteza_max=viteza_maxima;
			else
				viteza_max=viteza_maxima;
		
		if(putere<putere_min)
			this.putere_m=putere;
		else
			if(putere>putere_max)
				this.putere_m=putere_max;
		if(acceleratie<acceleratie_min)
			this.acceleratie=acceleratie_min;
		else
			if(acceleratie>acceleraetie_max)
				this.acceleratie=acceleratie_min;
			else
				this.acceleratie=acceleratie;
		this.treapta_vit=0;

	}
		
	
	public void schimbare_viteza(int viteza) {
		
// verificam daca nu trebuie schimbata superior viteza
		while(treapta_vit< nr_trepte && schimbare_trepte[treapta_vit]<viteza) {
			treapta_vit++;
			System.out.println("schimbare viteza noua treapta de viteza: " + treapta_vit);
		}
		while(treapta_vit!=0 && schimbare_trepte[treapta_vit-1]>viteza) {
			treapta_vit--;
			System.out.println("schimbare viteza noua treapta de viteza: " + treapta_vit);
			
		}
		
	}
	
	
///simulam folosire combustibilului
	
	public boolean combustibil() {
		double combustibil_f= (double) (treapta_vit * 0.1);
		return rezervor.elibRezervor(combustibil_f);
	}
	
	
	
	
//simulam acceleratie unei masini
	public int acceleratie() {
		
		int viteza2=viteza+acceleratie;
		if(!combustibil()) 
			System.out.println("masina a ramas fara combustibil");
		else {
			schimbare_viteza(viteza2);
			if(viteza2<=viteza_maxima)
				viteza=viteza2;
			else
				viteza=viteza_maxima;
			
		}
		return viteza;
		
	}
	
	int reducere_v() {
	
		if(viteza>viteza_minima) {
			schimbare_viteza(viteza-acceleratie);
			viteza=viteza-acceleratie;
			if(viteza<=0)
				viteza=0;
			
		}
		
		return viteza;
		
	}
	
	public double alimentare(double cant) {
		return rezervor.umplere(cant);
		
	}

	
	
	public int getViteza() {
		return viteza;
		
	}
	
	public int getVitMax() {
		return viteza_maxima;
		
	}
	
	public Color culoare() {
		return culoare;
		
	}
	
	public String getNumeMasina() {
		return nume_masina;
		
	}
	
	public int getAccelerare() {
		return acceleratie;
	}
	
	public int getPutere() {
		return putere_m;
	}
	
	public int getTreapta() {
		return treapta_vit;
	}
	

	public String toString() {
		String toReturnString = new String();	//string care primeste toate info despre o masina 
		toReturnString += "Car is a " + this.getNumeMasina();
		toReturnString += " colored  " + this.culoare();
		toReturnString += " engine power is " + this.getPutere();
		toReturnString += " speeding step is " + this.getAccelerare() + "\n";
		return toReturnString;
	}
		
		
	
}
