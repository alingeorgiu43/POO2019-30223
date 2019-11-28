
public class CatchException {
	public static void main(String argv[]) {
		Text text = new Text("Alin rezolva problema!");
		try {
			text.isAinText();
		} catch (CapitalAException exception) {
			System.out.println(exception.getMessage());
		} finally {
			System.out.println("yeah, we got here ...");
		}
	}
}
