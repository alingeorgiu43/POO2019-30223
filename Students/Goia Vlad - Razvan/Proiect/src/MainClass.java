import java.math.BigInteger;

public class MainClass {
	public static void main(String[] args)
	{
		String value = "xxx";
		//int intNr = Integer.parseInt(value);
		double doubleNr;
		//float floatNr = Float.parseFloat(value);
		try
		{	
			doubleNr = Double.parseDouble(value);
			System.out.println(doubleNr);
		}
		catch(NumberFormatException ex)
		{
			System.out.println("Eroare");
		}

		Integer value1 = new Integer(10);
		Integer value2 = new Integer(10);
		if(value1.equals(value2))
			System.out.println("Yes");
		else
			System.out.println("Nem");
		if(value1==value2)
			System.out.println("Yes");
		else
			System.out.println("Nem");
		
		BigInteger bint1 = BigInteger.valueOf(200);
		BigInteger bint2 = BigInteger.valueOf(200);
		BigInteger bint3 = bint1.add(bint2);
		
		System.out.println("Value" + bint3);
		
	}
		
}