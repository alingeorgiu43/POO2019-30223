import java.util.Random;

public class MainController {

	public static void main(String[] args) throws Exception {
		CalendarLucru[] calendare = new CalendarLucru[100];
		Lucrator[] lucratori = new Lucrator[100];
		String[] numeLucratori = new String[] { "Alin", "Goia", "Razvan", "Ionel", "Gigi", "Mihai", "Ioana", "Valentin",
				"Nume", "Catalin" };
		Random random = new Random();
		int contorLucratori = 10;
		for (int i = 0; i < contorLucratori; i++) {
			int indexNume = random.nextInt(10);
			calendare[i] = new CalendarLucru();
			for (int j = 0; j < 7; j++) {
				calendare[i].schimbaTipZi(j, random.nextBoolean());
			}
			lucratori[i] = new Lucrator(numeLucratori[indexNume], calendare[i]);
			lucratori[i].setCalendarLucru(calendare[i]);
		}
		
		Lucrator newLucrator=null;
		try {
			newLucrator.lucreaza("Sambata");
		}catch (Exception e){
			e.printStackTrace();
			String message=e.getMessage();
			System.out.println(message);
		}
		
		
		try {
			lucratori[101].lucreaza("Luni");
			lucratori[1].lucreaza("Luni");
			lucratori[1].lucreaza("Marti");
			lucratori[1].lucreaza("Miercuri");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array lucratori is out of bounds");
		}
		
	}
	
	
}
