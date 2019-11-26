package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Phoenix extends Bird {

	public Phoenix(Integer nrOfLegs, String name, boolean migrates, Integer avgFlightAltitude, double dangerPerc,
			double maintenanceCost) {
		super(nrOfLegs, name, migrates, avgFlightAltitude, dangerPerc, maintenanceCost);
	}

	public Phoenix() {
		super(2, "Fire Bird", true, 9000, 0.1, 2);
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Birds.Phoenix);
	}

	public void decodeFromXml(Element element) {
		super.decodeFromXml(element);
	}
}
