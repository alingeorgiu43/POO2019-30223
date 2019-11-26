package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.services.factories.Constants;

public class Shark extends Aquatic {

	public Shark(Integer nrOfLegs, String name, Integer avgSwimDepth, WaterType waterType, double dangerPerc,
			double maintenanceCost) {
		super(nrOfLegs, name, avgSwimDepth, waterType, dangerPerc, maintenanceCost);
	}

	public Shark() {
		super(0, "NewShark", 9000, WaterType.SALTWATER, 0.9, 6);
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Aquatics.Shark);
	}

	public void decodeFromXml(Element element) {
		super.decodeFromXml(element);
	}
}
