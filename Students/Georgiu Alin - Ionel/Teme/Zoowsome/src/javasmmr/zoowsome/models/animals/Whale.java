package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.services.factories.Constants;

public class Whale extends Aquatic {

	public Whale(Integer nrOfLegs, String name, Integer avgSwimDepth, WaterType waterType, double dangerPerc,
			double maintenanceCost) {
		super(nrOfLegs, name, avgSwimDepth, waterType, dangerPerc, maintenanceCost);
	}

	public Whale() {
		super(0, "NewWhale", 13000, WaterType.SALTWATER, 0.8, 8);
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Aquatics.Whale);
	}

	public void decodeFromXml(Element element) {
		super.decodeFromXml(element);
	}
}
