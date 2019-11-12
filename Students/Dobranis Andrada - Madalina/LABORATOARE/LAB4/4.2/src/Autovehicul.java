import java.awt.Color;

public class Autovehicul {
	private String marca;
	private Color culoare;
	private int vitezaCurenta;
	private int treaptaCurenta;
	private int vitezaMaxima;
	private int anFabricatie = 2003;
	private Sofer s = new Sofer();
	private Motor m = new Motor();
	private Traseu t = new Traseu();
	
	Autovehicul(){	
	}
	
	Autovehicul(String m, Color c, int v, int t, int vmax, int a) {
		this.marca = m;
		this.culoare = c;
		this.vitezaCurenta = v;
		this.treaptaCurenta = t;
		this.vitezaMaxima = vmax;
		this.anFabricatie = a;
	}
	
	public void setMarca(String marca) {this.marca = marca; }
	public void setCuloare(Color culoare) {this.culoare = culoare; }
	public void setVitezaCurenta(int vitezaCurenta ) { this.vitezaCurenta = vitezaCurenta ; }
	public void setTreaptaCurenta(int treaptaCurenta) {
		if(treaptaCurenta >=1 && treaptaCurenta <= 5)
			this.treaptaCurenta = treaptaCurenta; 
		else
			System.out.println("Aceasta treapta nu exista");
		}
	public void setVitezaMaxima(int vitezaMaxima) { this.vitezaMaxima = vitezaMaxima; }
	public void setAnFabricatie(int anFabricatie ) { this.anFabricatie = anFabricatie; }
	
	
	public String getMarca() { return marca; }
	public Color getCuloare() { return culoare; }
	public int getVitezaCurenta() { return vitezaCurenta; }
	public int getTreaptaCurenta() { return treaptaCurenta; }
	public int getVitezaMaxima() { return vitezaMaxima; }
	public int getAnFabricatie() { return anFabricatie; }
	
	public int getAn() { return this.anFabricatie; }
	public int supra(int anFabricatie) {return anFabricatie;}
	public int supra(short anFabricatie) {return anFabricatie;} 
	
	public Sofer getSofer() { return s; }
	public void setSofer(Sofer s) { this.s = s; }
	
	public Motor getMotor() { return m; }
	public void setMotor(Motor m) { this.m = m; }
	
	public Traseu getTraseu() { return t; }
	public void setTraseu(Traseu t) { this.t = t; }
	
	public void accelereaza(int vitezaCurenta) {
		this.vitezaCurenta = vitezaCurenta + 50;
	}

	public void decelereaza(int vitezaCurenta) {
		this.vitezaCurenta = vitezaCurenta - 20;
	}

	public void schimbaTraptaViteza(int treaptaCurenta) {
		this.treaptaCurenta = treaptaCurenta + 1;
	}

	public void opreste() {
		setVitezaCurenta(0);
		setTreaptaCurenta(1);
		System.out.println("Oprire masina");
	}

	
	
	public static void deplasare(Autovehicul auto) {
		System.out.println(auto.getVitezaCurenta());
		auto.accelereaza(100);
		System.out.println(auto.getVitezaCurenta());
		auto.decelereaza(50);
		System.out.println(auto.getVitezaCurenta());
		auto.opreste();
		System.out.println(auto.getVitezaCurenta());
	
	}
	public static void main(String[] args) {
		Autovehicul auto = new Autovehicul("Toyota", Color.GREEN, 80, 2, 200, 2003 );
		deplasare(auto);
		auto.supra(2003);
		Sofer sofer = new Sofer();
		sofer.setNume("Diaconu");
		sofer.setPrenume("Alex");
		sofer.setVarsta(25);
		sofer.setNrPermisConducere(435345355);
		System.out.println(auto.getAn());
		System.out.println("Soferul " + sofer.getNume() + " " + sofer.getPrenume() + " are " + sofer.getVarsta() + " ani si nr permisului de conducere " + sofer.getNrPermisConducere());
		
	}

}
