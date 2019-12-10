
public class Room {
	private int roomNumber;
	private String roomType;
	private float price;
	
	public Room(int roomNumber,String roomType,float price) {
		this.roomNumber=roomNumber;
		this.roomType=roomType;
		this.price=price;
	}
	
	public int getRoomNumber() {
		return this.roomNumber;
	}
	
	public String getRoomType() {
		return this.roomType;
	}
	
	public float getPrice() {
		return this.price;
	}
	
}
