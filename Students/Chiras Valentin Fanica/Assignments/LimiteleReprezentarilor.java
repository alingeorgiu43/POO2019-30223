
public class LimiteleReprezentarilor {
		public static void main(String arg[]) {
			
		byte ByteNumber=Byte.MAX_VALUE; 
		short ShortNumber=Short.MAX_VALUE;
		int Number=Integer.MAX_VALUE;
		long LongNumber=Long.MAX_VALUE;
			ByteNumber++;
			ShortNumber++;
			Number++;
			LongNumber++;
		System.out.println("Byte Max + 1 = " + ByteNumber + "\n" +  "Short Max + 1 = " + ShortNumber + "\n"+ "Int Max + 1 = " + Number
				+"\n" + "Long Max + 1 = " + LongNumber + "\n" );
		
		 ByteNumber=Byte.MIN_VALUE; 
		 ShortNumber=Short.MIN_VALUE;
		 Number=Integer.MIN_VALUE;
		 LongNumber=Long.MIN_VALUE;
		 	ByteNumber--;
			ShortNumber--;
			Number--;
			LongNumber--;
		System.out.println("Byte Max + 1 = " + ByteNumber + "\n" +  "Short Max + 1 = " + ShortNumber + "\n"+ "Int Max + 1 = " + Number
					+"\n" + "Long Max + 1 = " + LongNumber+"\n");
		 
		Float FloatNumber=2.71828182845904523536f;
		Double DoubleNumber=2.71828182845904523536;
		System.out.println(FloatNumber + "\n" + DoubleNumber + "\n");
		
		}
}
