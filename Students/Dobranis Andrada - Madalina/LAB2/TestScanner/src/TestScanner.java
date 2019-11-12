import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		int value = scanner.nextInt();
		
		System.out.println("name=" + name + "\nvalue=" + value);

	}

}
