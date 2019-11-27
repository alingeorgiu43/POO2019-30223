
public class CapitalAException extends Exception {
	private String message;

	public CapitalAException(String message) {
		super(message);

		this.message = message;
	}

	public CapitalAException() {
		super("Exista A in String");
	}
}
