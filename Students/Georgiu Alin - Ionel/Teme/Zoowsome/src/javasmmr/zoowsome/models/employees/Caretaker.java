package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.Constants;

public class Caretaker extends Employee {
	private double workingHours;

	public Caretaker() {
		super("Georgiu Alin", new BigDecimal("1500"), false);
		this.workingHours = 6;
	}

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
		if (animal.kill() == true)
			return "The employee was killed";
		if (this.workingHours >= animal.getMaintenanceCost()) {
			animal.setIsTakenCareOf(true);
			this.workingHours = this.workingHours - animal.getMaintenanceCost();
			return "Taken care of the animal with SUCCESS";
		} else {
			if (this.workingHours < animal.getMaintenanceCost())
				return "No time to take care of the animal";
			else
				return "Error while taking care of the aninal";
		}
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "workingHours", String.valueOf(this.workingHours));
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.EmployeeTypes.Caretaker);
	}
}
