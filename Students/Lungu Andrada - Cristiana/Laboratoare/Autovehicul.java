package laborator4;

public class Autovehicul {

	
	
	private String marca;
	private String color;
	private int viteza_curenta;
	private int  treapta_viteza_curenta;
	private int viteza_maxima;
	private long an_fabricatie=2010;
	
	Autovehicul(){
		marca=null;
		color=null;
		viteza_curenta=0;
		treapta_viteza_curenta=0;
		viteza_maxima=0;
		an_fabricatie=2010;
	}
	
	Autovehicul(String marca,String color){
		this.marca=marca;
		this.color=color;
	}
		
	Autovehicul(String marca,String color,int viteza_curenta,int treapta_viteza_curenta,int viteza_maxima){
		this.marca=marca;
		this.color=color;
		this.viteza_curenta=viteza_curenta;
		this.treapta_viteza_curenta=treapta_viteza_curenta;
		this.viteza_maxima=viteza_maxima;
	}
	public void accelerare(int viteza_curenta){
		this.viteza_curenta=viteza_curenta+40;
		
	}
	
	public void schimbare_trepte_acc(int treapta_viteza_curenta) {
		this.treapta_viteza_curenta=treapta_viteza_curenta+1;
	}
	
	public void schimbare_trepte_decc(int treapta_viteza_curenta) {
		this.treapta_viteza_curenta=treapta_viteza_curenta-1;
	}
	public void decelerare(int treapta_viteza_curenta) {
		this.viteza_curenta=viteza_curenta-40;
	}
	
	public void oprire() {
		this.viteza_curenta=0;
	}
	
	public void SetVitC(int viteza_curenta) {
		 this.viteza_curenta=viteza_curenta;
		 
	}
	
	public void SetVitMax(int viteza_maxima) {
		this.viteza_maxima=viteza_maxima;
	}
	
	public void SetTreapta(int treapta_viteza_curenta) {
		this.treapta_viteza_curenta=treapta_viteza_curenta;
	}
	
	public void SetMarca(String marca) {
		this.marca=marca;
	}
	
	public void SetColor(String color) {
		this.color=color;
	}
	
	public int GetVitC() {
		return this.viteza_curenta;
	}
	
	public int GetVitMax() {
		return this.viteza_maxima;
	}
	
	public int GetTreapta() {
		return this.treapta_viteza_curenta;
	}
	public long GetAn() {
		return this.an_fabricatie;
	}
	
	public long an(long an_fabricatie) {
		return an_fabricatie;
	}
	public long an(int an_fabricatie) {
		return an_fabricatie;
	}
	
	public String GetMarca() {
		return this.marca;
	}
	
	public String GetColor() {
		return this.color;
	}
	
	public String toString() {
		return "autovehiculul "+ this.marca +" de culoare "+this.color+" avand viteza maxima de "+this.viteza_maxima+" km/h circula cu viteza de "+
	this.viteza_curenta+" km/h fiind in treapta de viteza "+this.treapta_viteza_curenta;
	}
	
	
}
