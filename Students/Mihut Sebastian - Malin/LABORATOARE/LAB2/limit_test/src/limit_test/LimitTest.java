package limit_test;

public class LimitTest {

	public static void main(String[] args) {
		Byte firstByte = new Byte(Byte.MAX_VALUE);
		Short firstShort = new Short(Short.MAX_VALUE);
		Integer firstInteger = new Integer(Integer.MAX_VALUE);
		Long firstLong = new Long(Long.MAX_VALUE);
		
		byte aByte = 1;
		short aShort = 1;
		int aInteger = 1;
		long aLong = 1;
		
		System.out.println(firstByte+aByte);
		System.out.println(firstShort+aShort);
		System.out.println(firstInteger+aInteger);
		System.out.println(firstLong+aLong);

		System.out.println(firstByte-aByte);
		System.out.println(firstShort-aShort);
		System.out.println(firstInteger-aInteger);
		System.out.println(firstLong-aLong);
	}

}
