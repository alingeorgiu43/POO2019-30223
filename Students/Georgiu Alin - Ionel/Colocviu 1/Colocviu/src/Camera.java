
public class Camera {
	private Client[] listaOaspeti;
	private int nrNopti, roomId, capacitateCamera;
	private double roomPrice, singleRoomPrice;
	private boolean fullRoom, singleRoom, ocupata;

	// poate calcula roomPrice pe nr de noptu cu discount
	Camera() {
		this.ocupata = false;
		this.singleRoom = false;
		this.nrNopti = 0;
		this.listaOaspeti = new Client[10];
		this.roomId = 0;
		this.roomPrice = (double) (200.50);
		this.singleRoomPrice = (double) (280.90);
		this.fullRoom = false;
	}

	Camera(int roomId, int capacitate, int nrNopti, double roomPrice, int capacitateCamera, double singleRoomPrice,
			boolean singleRoom, boolean fullRoom, boolean ocupata, Client[] listaOaspeti) {
		this.ocupata = ocupata;
		this.singleRoom = singleRoom;
		this.nrNopti = nrNopti;
		this.roomId = roomId;
		this.roomPrice = roomPrice;
		this.capacitateCamera = capacitateCamera;
		this.singleRoomPrice = singleRoomPrice;
		this.fullRoom = fullRoom;
		this.listaOaspeti = listaOaspeti;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public int getRoomId() {
		return this.roomId;
	}

	public void setCapacitateCamera(int capacitateCamera) {
		this.capacitateCamera = capacitateCamera;
	}

	public double getRoomPrice() {
		return this.roomPrice;
	}

	public void setRoomPrice(double roomPrice) {
		this.roomPrice = roomPrice;
	}

	public double getSingleRoomPrice() {
		return this.singleRoomPrice;
	}

	public void setSingleRoomPrice(double singleRoomPrice) {
		this.singleRoomPrice = singleRoomPrice;
	}

	public void isFullRoom() {
		if (listaOaspeti.length == capacitateCamera) {
			this.fullRoom = true;
		} else {
			this.fullRoom = false;
		}
	}

	public double getTotalPrice() {
		double totalPrice = 0;
		if (this.nrNopti >= 3 && this.singleRoom == false) {
			totalPrice = this.nrNopti * getSingleRoomPrice() - ((double) (3.0 / 100) * getSingleRoomPrice());
		} else if (this.nrNopti >= 3 && this.singleRoom == true) {
			totalPrice = this.nrNopti * getRoomPrice() - ((double) (5.0 / 100) * getRoomPrice());
		} else {
			totalPrice = this.nrNopti * getRoomPrice();
		}
		return totalPrice;
	}
	
	public boolean isFree() {
		return this.ocupata;
	}

	public String toString() {
		return "Camera cu numarul " + roomId + " este ocupata de " + capacitateCamera + " persoane pentru un numar de "
				+ nrNopti + " nopti" + " si factura pentru camera este in valoare de " + getTotalPrice() + "\n\n";
	}
}
