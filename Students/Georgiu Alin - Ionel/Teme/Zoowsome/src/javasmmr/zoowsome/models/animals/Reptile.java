package javasmmr.zoowsome.models.animals;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import org.w3c.dom.Element;

public abstract class Reptile extends Animal {
	private boolean laysEggs;

	public Reptile(Integer nrOfLegs, String name, boolean laysEggs, double dangerPerc, double maintenanceCost) {
		super(nrOfLegs, name, dangerPerc, maintenanceCost);
		this.laysEggs = laysEggs;
	}

	public void setLaysEggs(boolean laysEggs) {
		this.laysEggs = laysEggs;
	}

	public boolean getLaysEggs() {
		return laysEggs;
	}

	public String toString() {
		return "Name: " + this.getName() + "\nNr legs: " + this.nrOfLegs + "\nLays Eggs: " + this.laysEggs
				+ "\nDanger Percent: " + this.dangerPerc + "\nMaintenance Cost: " + this.getMaintenanceCost() + "\n";
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "laysEggs", String.valueOf(this.laysEggs));
	}

	public void decodeFromXml(Element element) {
		super.decodeFromXml(element);
		setLaysEggs(Boolean.valueOf(element.getElementsByTagName("laysEggs").item(0).getTextContent()));

	}
}
