package la4pr1m;





public class Rezervor {

	private double capacitate;
	private double nivel;
	
	public static final double min_umplere=2; ///minim 2 litri trebuie sa contina pentru a functiona masina
	public static final double max_umplere=100;
	
	public static final double min_nivel=0;
	public static final double max_nivel=1;
	
	public static final double capacitate_fabrica=50;
	
	public Rezervor() {
		this(capacitate_fabrica,1);
		
	}
	
	public Rezervor(double cap, double nivel) {
		capacitate=cap;
		this.nivel=nivel;
		if(cap<min_umplere || cap>max_umplere) {
			System.out.println("eroare rezervor");//vom seta la capacitatea din fabrica
			cap=capacitate_fabrica;
			
		}
		
		if(nivel<min_nivel || nivel>max_nivel) {
			System.out.println("eroare rezervor");//vom seta la capacitatea din fabrica
			this.nivel=0;
			
		}
		
	}
	
	public double umplere1(double cant) {
		
		double rest=0;//cat nu s-a umplut
		nivel=nivel+cant/capacitate;
		if(nivel>=max_nivel) 
			nivel=max_nivel;
		return rest;
		
	}
	
	public boolean elibRezervor(double cant) {
		
		nivel=nivel-cant/capacitate;
		if(nivel<=min_nivel) { ///nu avem destul combustibil sa circulam
			nivel=min_nivel;
			return false;
		}
		return true;

	}
	
	public double getCapacitate() {
		return capacitate;
	}
	
	public double getNivel() {
		
		return nivel;
		
	}

	
}
