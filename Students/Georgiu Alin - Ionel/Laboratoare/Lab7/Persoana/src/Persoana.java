
public class Persoana implements Comparable<Persoana> {
	private String nume;
	private String prenume;
	private int varsta;

	Persoana(String nume, String prenume, int varsta) {
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
	}

	public String getNume() {
		return this.nume;
	}

	public String getPrenume() {
		return this.prenume;
	}

	public int getVarsta() {
		return this.varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public int compareTo(Persoana person1, Persoana person2) {
		int length1 = person1.getNume().length();
		int length2 = person2.getNume().length();
		int lMin = Math.min(length1, length2);

		for (int i = 0; i < lMin; i++) {
			int str1_ch = (int) person1.getNume().charAt(i);
			int str2_ch = (int) person2.getNume().charAt(i);
			if (str1_ch != str2_ch)
				return str1_ch - str2_ch;
		}
		if (length1 != length2)
			return length1 - length2;
		else
			return 0;
	}

	public int compareTo(Persoana person) {
		if (this.varsta == person.getVarsta()) {
			return 0;
		} else {
			if (this.varsta < person.getVarsta())
				return -1;

			else
				return 1;
		}

	}
}
