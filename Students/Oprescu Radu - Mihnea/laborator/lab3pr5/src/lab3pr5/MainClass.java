package lab3pr5;
import java.util.*;



public class MainClass {
	
	
	
	public static void main(String[] args) {
	
		int[] numere= new int[6];
		int val=0;
		for(int i=0;i<6;i++) {
			int rand=(int)(Math.random()*49);
			int j=0;
			while(j<i) {
				if(numere[j]==rand) {
					i--;
					val=1;
				}
				j++;
			}
			if(val==0) {
				numere[i]=rand;
				System.out.println(numere[i] + " ");
			}
		}

	}
	
}
