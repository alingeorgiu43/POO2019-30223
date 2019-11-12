package restaurant;

public class Meniu {

	private String felPrincipal;
	private String supa;
	private String desert;
	private String gustare;
	private String bautura;
	
	
	Meniu(){
		
	}
	
    public void setFel (String felPrincipal) {
    	this.felPrincipal=felPrincipal;
    }
    
    public void setSupa (String supa) {
    	this.supa=supa;
    }
    
    public void setDesert (String desert) {
    	this.desert=desert;
    }
    
    public void setGustare (String gustare) {
	 this.gustare=gustare;
    }
 
    public void setBautura (String bautura) {
	 this.bautura=bautura; 
    }
    
    
    
    public static void main (String args[]) {
    	
    	Meniu m = new Meniu();
    	m.desert="Tiramisu";
    	m.felPrincipal="Pizza";
    	m.supa="Ciorba a la grec";
    	m.bautura="apa";
    	
    	System.out.println("Bautura: " + m.bautura);
    	System.out.println("Desertul: " +m.desert);
    	System.out.println("Felul principal" + m.felPrincipal);
    	System.out.println("Gustare: " +m.gustare);
    	System.out.println("Supa: " +m.supa);
    	
    }
}


