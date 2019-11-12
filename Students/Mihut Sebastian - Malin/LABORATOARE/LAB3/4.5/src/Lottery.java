
public class Lottery {

	public static void main(String[] args) {
		int numere[]=new int[6];
		numere=unique(numere);
		for(int i=0;i<6;i++)
			System.out.println(numere[i]);
 

	}
	
	public static int[] randomArray(int numere[]) {
		for(int i=0;i<6;i++)
			numere[i]=(int)Math.round(Math.random()*50);
		return numere;
	}
	
	public static int[] unique(int numere[]) {
		if(numere[0]!=0 && numere[1]!=0 && numere[2]!=0 && numere[3]!=0
			&& numere[4]!=0 && numere[5]!=0
			&& numere[0]!= numere[1] && numere[0]!= numere[2] && numere[0]!= numere[3]
			&& numere[0]!= numere[4] && numere[0]!= numere[5] && numere[1]!= numere[2]
			&& numere[1]!= numere[3] && numere[1]!= numere[4] && numere[1]!= numere[5]
			&& numere[2]!= numere[3] && numere[2]!= numere[4] && numere[2]!= numere[5]
		    && numere[3]!= numere[4] && numere[3]!= numere[5] && numere[4]!= numere[5]) 
			return numere;
		else 
			return unique(randomArray(numere));
	
	}

}
