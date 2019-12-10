import java.util.HashMap;
import java.util.Map;

public class PetHotel {
	public HashMap<Room,Dog> myMap;
	
	public PetHotel() {
		this.myMap=new HashMap<Room,Dog>();
	}
	
	public void addRoom(Room room,Dog dog) {
		this.myMap.put(room, dog);
	}
	
	public void freeRoom(Room room) {
		this.myMap.remove(room);
	}
	
	public boolean isRoomFree(Room room) {
		if(this.myMap.containsKey(room))
			return false;
		return true;
	}
	
	public HashMap<Room,Dog> getRegister(){
		return this.myMap;
	}
	
	public static void printMap(Map<Room, Dog> registru) {
		for (Map.Entry<Room,Dog> entry : registru.entrySet())  
            System.out.println("Room = " + entry.getKey().getRoomNumber() + 
                             ", Dog = " + entry.getValue().getName()); 
	}
}
