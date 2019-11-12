
public class Main {

	long longNumere = 0;

	public void simulareLoterie() {
		for(int i=0; i<6; i++) {
			int intNumar = (int)(Math.random()*49)+1;
			if( ( (longNumere>>intNumar)&1) == 1)
				i--;
			else
			{ longNumere= 1L <<intNumar;
			System.out.println(intNumar);
			}
	}
		System.out.println("Sortate");
		for(int i=0;i<49;i++)
		{int nr = (int) (longNumere>>i) &1;
		if((nr&1)==1)
			System.out.println(i);
		}

	public static void main(String[] args) {

	}

}
