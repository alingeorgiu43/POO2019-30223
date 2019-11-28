
public class Student implements Cloneable {
	private String nume;
	private String prenume;
	private Masina masina;

	public Student(String nume, String prenume, Masina masina) {
		this.nume = nume;
		this.prenume = prenume;
		this.masina = masina;
	}

	public String getNume() {
		return nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public Masina getMasina() {
		return masina;
	}

	public void setMasina(Masina masina) {
		this.masina = masina;
	}

	public Student shallowClone() throws CloneNotSupportedException {
		return (Student) super.clone();
	}

	public Student deepClone() throws CloneNotSupportedException {
		Student cloneStudent = (Student) super.clone();
		cloneStudent.masina = masina.clone();
		return cloneStudent;
	}

	public String toString() {
		return "Studentul " + this.nume + " " + this.prenume + " este proprietarul unui " + this.masina.getMarca()
				+ " de culoare " + this.masina.getCuloare() + "\n";
	}
}
