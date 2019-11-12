
public class TestLimits {

	public static void main(String[] args) {
		int maxIntValue = Integer.MAX_VALUE;
		System.out.println("Max int value:" + maxIntValue);
		int minIntValue = Integer.MIN_VALUE;
		System.out.println("Min int value:" + minIntValue);
		float maxFloatValue = Float.MAX_VALUE;
		System.out.println("Max float value:" + maxFloatValue);
		float minFloatValue = Float.MIN_VALUE;
		System.out.println("Min float value:" + minFloatValue);
		maxIntValue = maxIntValue + 1;
		System.out.println(maxIntValue);
		minIntValue = minIntValue - 1;
		System.out.println(minIntValue);
	}
}
