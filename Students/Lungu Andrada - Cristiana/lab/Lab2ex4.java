package lab;

import java.math.BigInteger;

public class Lab2ex4 {
	public static void main(String[] args) {
		BigInteger nr1,nr2;
		nr1=BigInteger.valueOf(0);
		nr2=BigInteger.valueOf(1);
		nr1=nr1.add(nr2);
		int i;
		for(i=2;i<=64;i++)
		{
			nr2=nr2.add(nr2);
			nr1=nr1.add(nr2);
			i++;
		}
		System.out.println("nr de boabe= "+ nr1);
	}

}
