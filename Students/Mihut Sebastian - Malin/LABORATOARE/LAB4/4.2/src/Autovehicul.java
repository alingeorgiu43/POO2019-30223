import java.awt.Color;

public class Autovehicul {
	private String marca;
	private Color culoare;
	private int vitezaCurenta;
	private int treaptaViteza;
	private int vitezaMax;
	private final boolean areMotor=true;
	
	Autovehicul(){
		this.marca="Audi";
		this.culoare=Color.blue;
		this.vitezaCurenta=0;
		this.treaptaViteza=0;
		this.vitezaMax=200;
	}
	Autovehicul(String marca,Color culoare,int vitezaCurenta,int treaptaViteza, int vitezaMax){
		this.marca=marca;
		this.culoare=culoare;
		this.vitezaCurenta=vitezaCurenta;
		this.treaptaViteza=treaptaViteza;
		this.vitezaMax=vitezaMax;
	}
	public void getMarca(){
		System.out.println("Masina este "+this.marca);
	}
	public void setMarca(String s) {
		this.marca=s;
	}
	//Supraincarcare metoda
	public void setMarca() {
		this.marca="Audi";
	}
	public void getColor(){
		System.out.println("Masina are culoarea "+this.culoare.toString());
	}
	public void setColor(Color s) {
		this.culoare=s;
	}
	public void setVitezaMax(int vitezaMax) {
		this.vitezaMax=vitezaMax;
	}
	public void getVitezaMax() {
		System.out.println("Viteza maxima este "+this.vitezaMax +" km/h");
	}
	public void accelerare(int x) {
		this.vitezaCurenta +=x;
	}
	public void decelerare(int x) {
		this.vitezaCurenta -=x;
	}
	public void schimbViteza(int x) {
		this.treaptaViteza=x;
	}
	public void oprire() {
		this.vitezaCurenta=0;
	}
	public void show() {
		System.out.println("Viteza autovehicului este "+this.vitezaCurenta + " km/h");
		System.out.println("treapta de viteza in care se afla autovehiculul este "+this.treaptaViteza);
	}
	public void accelerareApoiOprire() {
		System.out.println("Vehiculul porneste de pe loc in treapta 1");
		this.schimbViteza(1);
		System.out.println("Vehiculul accelereaza");
		this.accelerare(15);
		this.schimbViteza(2);
		this.show();
		this.accelerare(25);
		this.schimbViteza(3);
		this.show();
		this.accelerare(25);
		this.schimbViteza(4);
		this.show();
		this.accelerare(35);
		this.schimbViteza(5);
		this.show();
		System.out.println("Vehiculul decelereaza");
		this.decelerare(35);
		this.schimbViteza(4);
		this.show();
		this.decelerare(25);
		this.schimbViteza(4);
		this.show();
		this.decelerare(25);
		this.schimbViteza(3);
		this.show();
		this.decelerare(5);
		this.schimbViteza(2);
		this.show();
		this.oprire();
		this.schimbViteza(0);
		this.show();
		System.out.println("Vehiculul este oprit");

	}
	public void getAutovehicul() {
		System.out.println("Masina cu care vom pleca la drum are urmatoarele proprietati:");
		this.getMarca();
		this.getColor();
		this.getVitezaMax();
		System.out.println();
	}
}
