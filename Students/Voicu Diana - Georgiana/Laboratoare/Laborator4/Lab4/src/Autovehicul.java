import java.awt.Color;

public class Autovehicul {
	private String marca;
	private Color culoare;
	private int vitezaCurenta;
	private int treaptaViteza;
	private int vitezaMaxima;
	private final int nrTrepte = 6;
	private Sofer sofer;
	
	
	public String getMarca() {
		return this.marca;
	}
	
	public void setMarca(String newMarca) {
		this.marca= newMarca;
	}
	
	public Color getCuloare() {
		return this.culoare;
	}
	
	public void setCuloare(Color newCuloare) {
		this.culoare = newCuloare;
	}
	
	public int getVitezaMaxima() {
		return vitezaMaxima;
	}
	
	public void setVitezaMaxima(int vitezaMaxima) {
		this.vitezaMaxima= vitezaMaxima;
	}
	
	public int getVitezaCurenta() {
		return vitezaCurenta;
	}
	
	public void setVitezaCurenta(int vitezaCurenta) {
		this.vitezaCurenta= vitezaCurenta;
	}
	
	public int getNrTrepte() {
		return nrTrepte;
	}
	
	
	public int getTreaptaViteza() {
		return treaptaViteza;
	}
	
	public Sofer getSofer() {
		return sofer;
	}
	
	public void setSofer(Sofer newSofer) {
		this.sofer = newSofer;
	}
	
	public Autovehicul(String marca, Color culoare,int vitezaMaxima) {
		this.marca = marca;
		this.culoare= culoare;
		this.vitezaMaxima= vitezaMaxima;
	}
	
	public Autovehicul() {
		this.vitezaCurenta = 0;
		this.treaptaViteza = 0;
		this.vitezaMaxima = 360;
	}
	
	
	public void accelereaza(int kmH) {
		vitezaCurenta= vitezaCurenta+kmH;
		if(vitezaCurenta > vitezaMaxima) {
			vitezaCurenta= vitezaMaxima;
		}
	}
	
	public void decelereaza(int kmH) {
		vitezaCurenta= vitezaCurenta-kmH;
		if(vitezaCurenta < 0) {
			vitezaCurenta= 0;
		}
	}
	
	
	public void schimbareTreaptaViteza() {
		if (vitezaCurenta==0)
			treaptaViteza=0;
		else {
			float kmHPerTreapta=vitezaMaxima/(float)nrTrepte;
			treaptaViteza=(int)(vitezaCurenta/kmHPerTreapta)+1;
			if (treaptaViteza>nrTrepte)
				treaptaViteza=nrTrepte;
		}
	}
	
	public void oprire() {
		while (vitezaCurenta >0) {
			decelereaza(1);
		}
	}
	
	
	
private static int NR_TESTE;
	
	public static void testeaza(Autovehicul a) {
		for (int i=0; i<3; i++) {
			a.accelereaza(25);
			a.schimbareTreaptaViteza();
		}
		a.accelereaza(40);
		a.schimbareTreaptaViteza();
		for (int i=0; i<2; i++){
			a.decelereaza(10);
			a.schimbareTreaptaViteza();
		}
		a.accelereaza(10);
		a.schimbareTreaptaViteza();
		a.oprire();	
		NR_TESTE++;
	}
	
	public static int getNrTeste() {
		return NR_TESTE;
	}
	
	public static void deplasare(Autovehicul a,int kmH,char operatie) {
		if(operatie == 'a') {
			a.accelereaza(kmH);
		}
		else if(operatie == 'd') {
			a.decelereaza(kmH);
		}
		else if(operatie == 't') {
			a.schimbareTreaptaViteza();
		}
		else if(operatie == 'o') {
			a.oprire();
		}
		else
		{
			System.out.println("Operatia introdusa nu este valida.");
		}
	}
	
	
	
}
