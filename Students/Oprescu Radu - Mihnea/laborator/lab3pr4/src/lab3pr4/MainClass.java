package lab3pr4;

public class MainClass {

	
	public static void main(String[] args) {
		double sansa=1.0;
		double numitor,numarator;
		for(int i=0;i<=5;i++) {
			numitor=i+1;
			numarator=49-i;
			sansa=sansa*(numitor/numarator);
		}
		System.out.println("probabilitatea de castig la loto 6/49 este: " + sansa);

	}

}
