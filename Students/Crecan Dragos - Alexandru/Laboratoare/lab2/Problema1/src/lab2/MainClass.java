package lab2;

public class MainClass {

	public static void main(String[] args) {
		//try 
		//{
		//String value1 = "name";
		//String value2 = "1.456";
		
		//int intNr1 = Integer.parseInt(value1);
		//double doubleNr2 = Double.parseDouble(value2);
		//int intNr2 = Integer.parseInt(value2);
		
		//System.out.println(doubleNr2);
		//System.out.println(intNr2);
		//System.out.println(intNr1);
		//}
		
	//catch(NumberFormatException exception)
	//{
		//System.out.println("Eroare!");
	//}
		
		Integer value1 = new Integer(10);
		Integer value2 = new Integer(10);
		
		if ( value1 == value2 )
			System.out.println("da1");
		else 
			System.out.println("nu1");
		
		if ( value1.equals(value2) )
			System.out.println("da2");
		

	}

}
