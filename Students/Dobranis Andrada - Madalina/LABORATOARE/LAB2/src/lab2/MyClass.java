package lab2;

public class MyClass {
	public static void main(String[] args) {
		try 
		{
			String value = "name";
			int intNr = Integer.parseInt(value);
			double doubleNr = Double.parseDouble(value);
		}
		catch(NumberFormatException exception)
		{
			System.out.println("exception");
		}
	
	Integer value1 = new Integer(10);
	Integer value2 = new Integer(2);
	if(value1.equals(value2))
		System.out.println("true");
	else
		System.out.println("false");
	}

}
