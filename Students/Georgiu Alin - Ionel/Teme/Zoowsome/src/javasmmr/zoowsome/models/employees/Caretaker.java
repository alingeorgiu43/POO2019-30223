package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;
import javasmmr.zoowsome.models.animals.Animal;

public class Caretaker extends Employee {
	private double workingHours;

	public Caretaker(String name, BigDecimal salary, boolean isDead, double workingHours) {
		super(name, salary, isDead);
		this.workingHours = workingHours;
	}

	public double getWorkingHours() {
		return this.workingHours;
	}

	public void setWorkingHours(double workingHours) {
		this.workingHours = workingHours;
	}

	public String takeCareOf(Animal animal) {
		if (this.workingHours >= animal.getMaintenanceCost()) {
			animal.setIsTakenCareOf(true);
			this.workingHours = this.workingHours - animal.getMaintenanceCost();
			return "Taken care of the animal with SUCCESS";
		} else {
			if (this.workingHours >= animal.getMaintenanceCost())
				return "Taken care of the animal with SUCCESS";
			else

			if (animal.kill() == true) {
				return "The employee was killed";
			} else
				return "Error while taking care of the aninal";
		}

	}
}
