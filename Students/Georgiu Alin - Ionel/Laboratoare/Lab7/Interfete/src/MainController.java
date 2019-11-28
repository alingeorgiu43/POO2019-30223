import java.awt.Color;

public class MainController {
	public static void main(String args[]) throws CloneNotSupportedException {
		Student studentAlin = new Student("Georgiu", "Alin", new Masina("Volvo V40", Color.DARK_GRAY));
		System.out.println(studentAlin.toString());

		Student shallowClone = studentAlin.shallowClone();
		Student deepClone = studentAlin.deepClone();
		
		studentAlin.getMasina().paintCar(Color.GREEN);

		System.out.println(shallowClone.toString());
		System.out.println(deepClone.toString());
	}
}
