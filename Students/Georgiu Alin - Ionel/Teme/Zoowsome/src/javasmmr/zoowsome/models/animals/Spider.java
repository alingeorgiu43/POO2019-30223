package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.services.factories.Constants;

public class Spider extends Insect {

	public Spider(Integer nrOfLegs, String name, boolean canFly, boolean isDangerous, double dangerPerc,
			double maintenanceCost) {
		super(nrOfLegs, name, canFly, isDangerous, dangerPerc, maintenanceCost);
	}

	public Spider() {
		super(8, "Spidy", false, true, 0.1, 0);
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Insects.Spider);
	}

	public void decodeFromXml(Element element) {
		super.decodeFromXml(element);
	}
}