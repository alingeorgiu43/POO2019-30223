
public class NewException extends Exception {
	private String message;

	NewException(String message) {
		super(message);
		this.message = message;
	}
	NewException(){
		
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
