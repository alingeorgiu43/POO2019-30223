import java.util.Map;

public class TestPetHotel {

	public static void main(String[] args) {
		PetHotel newPetHotel = new PetHotel();
		Room room1 = new Room(1, "Single", 100);
		Room room2 = new Room(2, "Duplex", 200);
		Dog dog1 = new Dog("Cutu", "german", true);
		Dog dog2 = new Dog("Rex", "ciobanesc", true);
		Dog dog3 = new Dog("Bella", "pudel", false);

		Map<Room, Dog> registru = newPetHotel.getRegister();
		newPetHotel.addRoom(room1, dog2);
		newPetHotel.addRoom(room2, dog3);
		newPetHotel.addRoom(room1, dog1);
		System.out.println("Registru caini in hotel");
		PetHotel.printMap(registru);
		newPetHotel.freeRoom(room1);
		System.out.println("Registru caini in hotel");
		PetHotel.printMap(registru);
		
	}

}
