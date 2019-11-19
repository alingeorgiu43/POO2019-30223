package javasmmr.zoowsome.services.factories;

import java.math.BigDecimal;
import java.util.Random;

import javasmmr.zoowsome.models.employees.Employee;
import javasmmr.zoowsome.models.employees.Caretaker;

public class CaretakerFactory extends EmployeeAbstractFactory{
	@Override
	public Employee getEmployeeFactory(String type){
		
		Random random = new Random();
		String[] caretakers = new String[] { "Emplyee1", "Emplyee2", "Emplyee3", "Emplyee4", "Emplyee5"};
		BigDecimal[] salaries = new BigDecimal[] { new BigDecimal("1500"), new BigDecimal("1200"),new BigDecimal("4000"), new BigDecimal("2450"),new BigDecimal("8000") };
		int newName = random.nextInt(caretakers.length);
		double workingHours = 8 * random.nextDouble();
		int newSalary = random.nextInt(salaries.length);
		
		return new Caretaker(caretakers[newName], salaries[newSalary], false, workingHours);
	}
}
