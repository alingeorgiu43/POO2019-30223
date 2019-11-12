
public class MinMax {
	public static void main(String argv[]) {
		Byte byte_max=new Byte(Byte.MAX_VALUE);
		byte_max++;
		System.out.println(byte_max);
		
		Byte byte_max2=new Byte(Byte.MAX_VALUE);
		byte_max2--;
		System.out.println(byte_max2);
		
		Short short_max=new Short(Short.MAX_VALUE);
		short_max++;
		System.out.println(short_max);
		
		Short short_max2=new Short(Short.MAX_VALUE);
		short_max2--;
		System.out.println(short_max2);
		
		Integer int_max=new Integer(Integer.MAX_VALUE);
		int_max++;
		System.out.println(int_max);
		
		Integer int_max2=new Integer(Integer.MAX_VALUE);
		int_max2--;
		System.out.println(int_max2);
		
		Long long_max= new Long(Long.MAX_VALUE);
		long_max++;
		System.out.println(long_max);
		
		Long long_max2= new Long(Long.MAX_VALUE);
		long_max2--;
		System.out.println(long_max2);
		
		Double virgulaMobila=new Double(1.9999999999999999998);
		System.out.println(virgulaMobila);
		
		virgulaMobila +=  0.01;
		System.out.println(virgulaMobila);
		
		virgulaMobila -= 0.01;
		System.out.println(virgulaMobila);
		
	}
	
}
