package javasmmr.zoowsome.models.animals;

import javax.xml.stream.XMLEventWriter;

import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.services.factories.Constants;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;


public class Butterfly extends Insect {

	public Butterfly(Integer nrOfLegs, String name, boolean canFly, boolean isDangerous, double dangerPerc,
			double maintenanceCost) {
		super(nrOfLegs, name, canFly, isDangerous, dangerPerc, maintenanceCost);
	}

	public Butterfly() {
		super(4, "Insect Butterfly", true, true, 0.2, 3);
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Insects.Butterfly);
	}

	public void decodeFromXml(Element element) {
		super.decodeFromXml(element);
	}
}