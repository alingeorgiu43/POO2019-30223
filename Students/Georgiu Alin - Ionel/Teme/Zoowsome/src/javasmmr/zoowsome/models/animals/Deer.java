package javasmmr.zoowsome.models.animals;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javasmmr.zoowsome.services.factories.Constants;

public class Deer extends Mammal {

	public Deer(Integer nrOfLegs, String name, float normalBodyTemp, float percBodyHair, double dangerPerc,
			double maintenanceCost) {
		super(nrOfLegs, name, normalBodyTemp, percBodyHair, dangerPerc, maintenanceCost);
	}

	public Deer() {
		super(4, "Deer", 38, 70, 0.4, 2);
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Mammals.Deer);
	}

	public void decodeFromXml(Element element) {
		super.decodeFromXml(element);
	}
}
