
public class Loto {

	public static void main(String[] args) {

		int ales[] = new int[50];
		int num = 0;
		for(num = 0; num < 6; num ++) 
		{
			double y = Math.random() * 100;
			int x = (int) y;
			x = x % 50;
			if (ales[x] == 0) 
			{
				ales[x] = 1;
				System.out.println(x);
			}

		}

	}

}
