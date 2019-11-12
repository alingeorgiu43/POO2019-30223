//pentru int: 95935 se apropie de maximul de reprezentare pentru int si are valoarea 2147472998
//35000000000 => 9132172198523392428
package suma_multiplii;

import java.util.Scanner;

public class SumMultiples {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int nr = in.nextInt();
		int sum=0;
		for(int i=3;i<nr;i++) {
			if(i%3==0 || i%5==0)
				sum=sum+i;
		}
		System.out.println(sum);
	}

}