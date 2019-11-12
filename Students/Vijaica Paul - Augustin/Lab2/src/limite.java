
public class limite {

	public static void main(String[] args) {
		Byte b = new Byte(Byte.MAX_VALUE);
		Short s = new Short(Short.MAX_VALUE);
		Integer i = new Integer(Integer.MAX_VALUE);
		Long l = new Long(Long.MAX_VALUE);

		System.out.println(b+1);
		System.out.println(s+1);
		System.out.println(i+1);
		System.out.println(l+1);

		System.out.println(b-1);
		System.out.println(s-1);
		System.out.println(i-1);
		System.out.println(l-1);
	}
}