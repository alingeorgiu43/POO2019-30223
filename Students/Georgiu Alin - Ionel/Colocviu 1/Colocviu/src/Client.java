
public class Client extends Persoana {
	private int roomNr;
	private String checkIn, checkOut;
	private String info;

	Client() {
		this.roomNr = 0;
		this.checkIn = "Check-In Unknown";
		this.checkOut = "Check-OUT Unknown";
		this.info = "No additional info";
	}

	Client(int roomNr, String checkIn, String checkOut, String info) {
		this.roomNr = roomNr;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.info = info;
	}

	public void setRoomNr(int roomNr) {
		this.roomNr = roomNr;
	}

	public int getRoomNr() {
		return this.roomNr;
	}

	public void setCheckIn(String checkIn) {
		this.checkIn = checkIn;
	}

	public String getCheckIn() {
		return this.checkIn;
	}

	public void setCheckOut(String checkOut) {
		this.checkOut = checkOut;
	}

	public String getCheckOut() {
		return this.checkOut;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getInfo() {
		return this.info;
	}

	public String toString() {
		return super.toString() + "Clientul are camera :" + this.roomNr + "\nIncepand cu data de -" + checkIn
				+ " -pana in data de -" + checkOut + "-\n\n";
	}
}
