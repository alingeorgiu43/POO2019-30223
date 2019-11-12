package pr3;

public class MainClass {

	public static void main(String[] args) {
	int nr = 1;
	int palindrom = 0;
	for(int i = 1000; i<10000; i++)
	{
		for(int j = 1000; j<10000; j++)
		{
			nr = i * j;
			int pal = 0;
			while(nr != 0)
			{
			    int c = nr % 10;
				pal = pal * 10 + c;
				nr = nr / 10;
			}
			nr = i * j;
			if(pal == nr)
				palindrom = pal;
		}
	}
		System.out.println(palindrom);
	}
}
