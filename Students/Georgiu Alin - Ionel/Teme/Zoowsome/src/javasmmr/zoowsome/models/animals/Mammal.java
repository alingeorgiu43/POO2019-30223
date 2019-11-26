package javasmmr.zoowsome.models.animals;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import org.w3c.dom.Element;

public abstract class Mammal extends Animal {
	private float normalBodyTemp;
	private float percBodyHair;

	public Mammal(Integer nrOfLegs, String name, float normalBodyTemp, float percBodyHair, double dangerPerc,
			double maintenanceCost) {
		super(nrOfLegs, name, dangerPerc, maintenanceCost);
		this.normalBodyTemp = normalBodyTemp;
		this.percBodyHair = percBodyHair;
	}

	public float getNormalBodyTemp() {
		return normalBodyTemp;
	}

	public void setNormalBodyTemp(float normalBodyTemp) {
		this.normalBodyTemp = normalBodyTemp;
	}

	public float getPercBodyHair() {
		return percBodyHair;
	}

	public void setPercBodyHair(float percBodyHair) {
		this.percBodyHair = percBodyHair;
	}

	public String toString() {
		return "Name: " + this.getName() + "\nNr legs: " + this.nrOfLegs + "\nNormal Body Tempreture: "
				+ this.normalBodyTemp + "\nPercent Of Hair: " + this.percBodyHair + "\nDanger Percent: "
				+ this.dangerPerc + "\nMaintenance Cost: " + this.getMaintenanceCost() + "\n";
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "normalBodyTemp", String.valueOf(this.normalBodyTemp));
		createNode(eventWriter, "percBodyHair", String.valueOf(this.percBodyHair));
	}

	public void decodeFromXml(Element element) {
		super.decodeFromXml(element);
		setNormalBodyTemp(Float.valueOf(element.getElementsByTagName("normalBodyTemp").item(0).getTextContent()));
		setPercBodyHair(Float.valueOf(element.getElementsByTagName("percBodyHair").item(0).getTextContent()));
	}
}
