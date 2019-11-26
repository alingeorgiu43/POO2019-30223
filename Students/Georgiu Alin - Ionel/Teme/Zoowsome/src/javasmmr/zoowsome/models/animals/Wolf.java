package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.services.factories.Constants;

public class Wolf extends Mammal {

	public Wolf(Integer nrOfLegs, String name, float normalBodyTemp, float percBodyHair, double dangerPerc,
			double maintenanceCost) {
		super(nrOfLegs, name, normalBodyTemp, percBodyHair, dangerPerc, maintenanceCost);
	}

	public Wolf() {
		super(4, "Wolf", 38, 70, 0.4, 2);
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Mammals.Wolf);
	}

	public void decodeFromXml(Element element) {
		super.decodeFromXml(element);
	}

}
