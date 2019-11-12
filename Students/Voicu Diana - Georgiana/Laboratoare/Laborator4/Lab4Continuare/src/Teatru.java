import java.util.Scanner;
public class Teatru {
	public static void main(String[] args) {
		Scanner scaneaza= new Scanner(System.in);
		
		Spectator s1 = new Spectator("Carry","Jim",30,1);
		BileteTeatru b1 = new BileteTeatru("Romeo and Juliet",15,24,30);
		int ct1 = s1.grupeVarsta(s1,b1);
		
		Spectator s2 = new Spectator("Grey","Rose",20,25);
		BileteTeatru b2 = new BileteTeatru("Romeo and Juliet",16,29,30);
		int ct2= s2.grupeVarsta(s2, b2);
		
		Spectator s3 = new Spectator("Carry","Chandler",70,13);
		BileteTeatru b3 = new BileteTeatru("Romeo and Juliet",17,35,30);
		int ct3 = s3.grupeVarsta(s3, b3);
		
		float total = b1.getPret() + b2.getPret() + b3.getPret();
		System.out.println("Totalul pretului inainte de reducere este= " + total);
		total= b1.incasari(b1.getPret(), ct1) + b2.incasari(b2.getPret(), ct2) + b3.incasari(b3.getPret(), ct3) ;
		System.out.println("Totalul incasarilor dupa reducere este = "+ total);
	}
}
