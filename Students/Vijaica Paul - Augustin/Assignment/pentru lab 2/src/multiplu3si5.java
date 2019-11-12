import java.util.*;
public class multiplu3si5 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Introduceti un numar:");
		int a = keyboard.nextInt();
		int s=0;
		for(int i=0;i<a;i++)
		{
			if(i%3==0 || i%5==0)
				s=s+i;
		}
		System.out.println(s);


	}

}
