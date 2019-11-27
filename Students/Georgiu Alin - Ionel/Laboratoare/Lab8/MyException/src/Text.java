
public class Text {
	private String text;

	Text(String text) {
		this.text = text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getText() {
		return this.text;
	}

	public void isAinText() throws CapitalAException {
		for (int i = 0; i < this.text.length(); i++) {
			char ch = text.charAt(i);
			if (ch == 'A') {
				throw new CapitalAException("Am gasit litera A in textul nostru");
			}
		}
		System.out.println("Nu am gasit litera problema");
	}
}
