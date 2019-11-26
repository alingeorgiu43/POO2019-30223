package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public class Bird extends Animal {
	private boolean migrates;
	private Integer avgFlightAltitude;

	public Bird(Integer nrOfLegs, String name, boolean migrates, Integer avgFlightAltitude, double dangerPerc,
			double maintenanceCost) {
		super(nrOfLegs, name, dangerPerc, maintenanceCost);
		this.avgFlightAltitude = avgFlightAltitude;
		this.migrates = migrates;

	}

	public void setMigrates(boolean migrates) {
		this.migrates = migrates;
	}

	public boolean getMigrates() {
		return migrates;
	}

	public void setAvgFlightAltitude(Integer avgFlightAltitude) {
		this.avgFlightAltitude = avgFlightAltitude;
	}

	public Integer getAvgFlightAltitude() {
		return avgFlightAltitude;
	}

	public String toString() {
		return "Name: " + this.getName() + "\nNr legs: " + this.nrOfLegs + "\nMigrates: " + this.migrates
				+ "\nAverage Flight Altitude: " + this.avgFlightAltitude + "\nDanger Percent: " + this.dangerPerc
				+ "\nMaintenance Cost: " + this.getMaintenanceCost() + "\n";
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "migrates", String.valueOf(this.migrates));
		createNode(eventWriter, "avgFlightAltitude", String.valueOf(this.avgFlightAltitude));
	}

	public void decodeFromXml(Element element) {
		super.decodeFromXml(element);
		setMigrates(Boolean.valueOf(element.getElementsByTagName("migrates").item(0).getTextContent()));
		setAvgFlightAltitude(Integer.valueOf(element.getElementsByTagName("avgFlightAltitude").item(0).getTextContent()));
	}
}
