import java.util.Random;

public class Lottery 
{
	int balls[] = new int[7]; 
	int a[] = new int[50]; 
	
	public void Simulate()
	{
		for(int i=1; i<=49; i++)
			this.a[i] = 0;
		
		Random x = new Random();
		
		for(int i=1; i<=6; i++)
	  {
		this.balls[i] = x.nextInt(48)+1;
		if(this.a[this.balls[i]] == 1)
			while(this.a[this.balls[i]] == 1)
				this.balls[i] = x.nextInt(48)+1; 
		this.a[this.balls[i]] = this.a[this.balls[i]] + 1;
		System.out.print(this.balls[i] + "\t");
	  }
	}
	
	public static void main(String[] args)
	{
		System.out.println("Nume\tBila1\tBila2\tBila3\tBila4\tBila5\tBila6");
		for(int i=0; i<10; i++)
		{
			Player lucker = new Player();
			Lottery test = new Lottery();
			System.out.print(lucker.name + "\t");
			test.Simulate();
			System.out.println();
		}
	}
}
