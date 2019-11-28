import java.util.Random;

public class Functions {
	public void g(int number, int x, int y) throws NewException, StrangeNumberException {
		if (number >= x && number <= y) {
			throw new NewException("G function is alright");
		} else {
			throw new NewException("Strange input number ");
		}

	}

	public void f() throws Exception {
		try {
			Random random = new Random();
			int x, y, number;
			x = random.nextInt(40);
			y = random.nextInt(40);
			number = random.nextInt(30);
			this.g(number, x, y);
		} catch (StrangeNumberException e) {
			throw new StrangeNumberException();
		}
	}
}
