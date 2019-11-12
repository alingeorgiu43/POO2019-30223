public class extragere {

	public static void main(String[] args) {

		int numere[] = new int[50];
		int index = 0;
		for(index = 0; index < 6; index ++) 
		{
			double y = Math.random() * 100;
			int x = (int) y;
			x = x % 50;
			if (numere[x] == 0) 
			{
				numere[x] = 1;
				System.out.println(x);
			}

		}
	}
}