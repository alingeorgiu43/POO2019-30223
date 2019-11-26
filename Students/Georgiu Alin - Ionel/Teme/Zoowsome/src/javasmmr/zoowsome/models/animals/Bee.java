package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.services.factories.Constants;

public class Bee extends Insect {

	public Bee(Integer nrOfLegs, String name, boolean canFly, boolean isDangerous, double dangerPerc,
			double maintenanceCost) {
		super(nrOfLegs, name, canFly, isDangerous, dangerPerc, maintenanceCost);
	}

	public Bee() {
		super(6, "Insect Bee", true, true, 0.2, 3);
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Insects.Bee);
	}

	public void decodeFromXml(Element element) {
		super.decodeFromXml(element);
	}
}