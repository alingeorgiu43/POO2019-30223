
public class MyException extends Exception {
	String message;

	public MyException() {
		super("You are in myException dear friend");
	}

	public MyException(String message) {
		super(message);
		this.message = message;
	}
}
