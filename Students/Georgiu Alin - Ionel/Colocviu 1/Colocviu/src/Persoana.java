import java.math.BigInteger;

public class Persoana {
	private int personId;
	private BigInteger nrTelefon;
	private String name;
	private String info;
	private boolean singleRoom;

	Persoana() {
		this.singleRoom = false;
		this.personId = 0;
		this.nrTelefon = BigInteger.valueOf(0000000000);
		this.name = "Unknown name";
		this.info = "No additional info";
	}

	Persoana(int personId, BigInteger nrTelefon, String name, String info, boolean singleRoom) {
		this.personId = personId;
		this.nrTelefon = nrTelefon;
		this.name = name;
		this.singleRoom = singleRoom;
		this.info = info;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public int getPersonId() {
		return this.personId;
	}

	public void setNrTelefon(BigInteger nrTelefon) {
		this.nrTelefon = nrTelefon;
	}

	public BigInteger getNrTelefon() {
		return this.nrTelefon;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getInfo() {
		return this.info;
	}

	public void setSingleRoom(boolean singleRoom) {
		this.singleRoom = singleRoom;
	}

	public boolean getSingleRoom() {
		return this.singleRoom;
	}

	public String toString() {
		return "Nume :" + this.name + "\nPeronal ID: " + this.personId + "\nNumar de telefon: " + this.nrTelefon
				+ "\nInformatii aditionale: " + this.info + "\n---------\n";
	}
}
