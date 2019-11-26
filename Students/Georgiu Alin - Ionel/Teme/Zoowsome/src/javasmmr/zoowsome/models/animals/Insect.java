package javasmmr.zoowsome.models.animals;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

public abstract class Insect extends Animal {
	private boolean canFly;
	private boolean isDangerous;

	public Insect(Integer nrOfLegs, String name, boolean canFly, boolean isDangerous, double dangerPerc,
			double maintenanceCost) {
		super(nrOfLegs, name, dangerPerc, maintenanceCost);
		this.canFly = canFly;
		this.isDangerous = isDangerous;
	}

	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}

	public boolean getCanFly() {
		return canFly;
	}

	public void setIsDangerous(boolean isDangerous) {
		this.isDangerous = isDangerous;
	}

	public boolean getIsDangerous() {
		return isDangerous;
	}

	public String toString() {
		return "Name: " + this.getName() + "\nNr legs: " + this.nrOfLegs + "\nCan Fly: " + this.canFly
				+ "\nIs Dangerous: " + this.isDangerous + "\nDanger Percent: " + this.dangerPerc
				+ "\nMaintenance Cost: " + this.getMaintenanceCost() + "\n";
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "canFly", String.valueOf(getCanFly()));
		createNode(eventWriter, "isDangerous", String.valueOf(getIsDangerous()));
	}

	public void decodeFromXml(Element element) {
		super.decodeFromXml(element);
		setCanFly(Boolean.valueOf(element.getElementsByTagName("canFly").item(0).getTextContent()));
		setIsDangerous(Boolean.valueOf(element.getElementsByTagName("isDangerous").item(0).getTextContent()));
	}
	
}
