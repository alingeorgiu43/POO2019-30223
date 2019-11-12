package lab4;


public class Autovehicul {

	private String marca;
	private String culoare;
	private int vitezaCurenta;
	private int treaptaViteza;
	private int vitezaMax; 
	private int nrRoti = 4; 
	private Sofer sofer;
	Autovehicul(){
		
	}
	
	Autovehicul(String marca, String culoare, int vitezaCurenta, int treaptaViteza,
			int vitezaMax){
		
		this.marca=marca;
		this.culoare=culoare;
		this.vitezaCurenta=vitezaCurenta;
		this.treaptaViteza=treaptaViteza;
		this.vitezaMax=vitezaMax;
		
	}
	
	public void setMarca (String marca) {
		this.marca=marca;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setCuloare(String culoare) {
		this.culoare=culoare;
	}
	
	public String getCuloare() {
		return culoare;
	}
	
	public void setVitezaCurenta(int vitezaCurenta) {
		
		if(vitezaCurenta <= 0)
			this.vitezaCurenta=0;
		if(vitezaCurenta >= vitezaMax)
			this.vitezaCurenta=vitezaMax;
		else
		    this.vitezaCurenta=vitezaCurenta;
	}
	
	public int getVitezaCurenta() {
		return vitezaCurenta;
	}
	
	public void setTreaptaViteza(int treaptaViteza) {
		this.treaptaViteza=treaptaViteza;
	}
	
	public int getTreaptaViteza () {
		return treaptaViteza; 
	}
	
	public void setVitezaMax (int vitezaMax) {
		this.vitezaMax=vitezaMax;
	}
	
	public int getVitezaMax () {
		return vitezaMax;
	}
	
	public void accelereaza(int km) {
		this.setVitezaCurenta(vitezaCurenta+km);
	}
	
	public void decelereaza(int km) {
		this.setVitezaCurenta(vitezaCurenta-km);
		if(vitezaCurenta <= 20)
			this.setTreaptaViteza(1);
		if(vitezaCurenta <= 40)
			this.setTreaptaViteza(2);
		if(vitezaCurenta <= 60)
			this.setTreaptaViteza(3);
		if(vitezaCurenta <= 90)
			this.setTreaptaViteza(4);
		if(vitezaCurenta <= 120)
			this.setTreaptaViteza(5);
		if(vitezaCurenta > 120)
			this.setTreaptaViteza(6);
	}
	
	public void oprire(Autovehicul auto) {
		auto.vitezaCurenta=0;
	}
	
	public void schimbareTreapta(int treapta) {
		this.setTreaptaViteza(treapta);
	}
	
	public static void parcurge (Autovehicul auto) {
		auto.accelereaza(30);
        System.out.println(auto.getVitezaCurenta());
        auto.decelereaza(20);
        System.out.println(auto.getVitezaCurenta());
        auto.oprire(auto);
        System.out.println(auto.getVitezaCurenta());
	}
	
	public static void main(String args[]) 
    { 
        Autovehicul auto = new Autovehicul ("VW Golf", "negru", 70, 4, 200);
        System.out.println(auto.getMarca());
        System.out.println(auto.getCuloare());
        System.out.println(auto.getTreaptaViteza());
        System.out.println(auto.getVitezaCurenta());
        System.out.println(auto.getVitezaMax());
        
        parcurge(auto);
        
    } 
}
