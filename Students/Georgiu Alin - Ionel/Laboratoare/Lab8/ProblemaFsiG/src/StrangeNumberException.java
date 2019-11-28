
public class StrangeNumberException extends Exception {
	private String message;

	public StrangeNumberException(String message) {
		super("This is a strange number ...");
		this.message = message;
	}

	StrangeNumberException() {

	}
}
