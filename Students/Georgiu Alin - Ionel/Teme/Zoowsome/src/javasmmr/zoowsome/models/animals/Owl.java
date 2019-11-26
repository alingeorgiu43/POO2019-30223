package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.services.factories.Constants;

public class Owl extends Bird {

	public Owl(Integer nrOfLegs, String name, boolean migrates, Integer avgFlightAltitude, double dangerPerc,
			double maintenanceCost) {
		super(nrOfLegs, name, migrates, avgFlightAltitude, dangerPerc, maintenanceCost);
	}

	public Owl() {
		super(2, "Owl Bird", true, 9000, 0.2, 3);
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Birds.Owl);
	}

	public void decodeFromXml(Element element) {
		super.decodeFromXml(element);
	}
}
