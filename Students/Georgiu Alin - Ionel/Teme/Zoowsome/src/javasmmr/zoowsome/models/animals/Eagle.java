package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.services.factories.Constants;

public class Eagle extends Bird {

	public Eagle(Integer nrOfLegs, String name, boolean migrates, Integer avgFlightAltitude, double dangerPerc,
			double maintenanceCost) {
		super(nrOfLegs, name, migrates, avgFlightAltitude, dangerPerc, maintenanceCost);
	}

	public Eagle() {
		super(2, "Eagle Bird", true, 9000, 0.1, 2);
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Birds.Eagle);
	}

	public void decodeFromXml(Element element) {
		super.decodeFromXml(element);
	}
}
