
public class Masa {
	Carti carteDealer=new Carti();
	Carti carteTrasa=new Carti();
	public void joacaBlackjack() {
		this.carteDealer.getRandomCarte();
		System.out.println("Dealerul a tras:");
		System.out.println(this.carteDealer.getNumar()+" "+this.carteDealer.getTip());
		this.carteTrasa.getRandomCarte();
		System.out.println("Tu ai tras:");
		System.out.println(this.carteTrasa.getNumar()+" "+this.carteTrasa.getTip());
		System.out.println();
		if(this.carteTrasa.getNumar()>this.carteDealer.getNumar())
			System.out.println("Ai castigat");
		else if(this.carteTrasa.getNumar()==this.carteDealer.getNumar())
			System.out.println("Egalitate");
		else
			System.out.println("Ai pierdut");
	}
}
