public class GoldBach {

	public static void main(String[] args) {
		int n = 4, m = 10;
		for (int i = n; i <= m; i++) {
			System.out.println(i + " se poate scrie ca suma: ");
			GoldbachClass.goldbach(i);
		}
	}
}