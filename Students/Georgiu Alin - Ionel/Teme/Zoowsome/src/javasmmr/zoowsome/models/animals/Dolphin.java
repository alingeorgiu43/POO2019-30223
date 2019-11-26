package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.services.factories.Constants;

public class Dolphin extends Aquatic {

	public Dolphin(Integer nrOfLegs, String name, Integer avgSwimDepth, WaterType waterType, double dangerPerc,
			double maintenanceCost) {
		super(nrOfLegs, name, avgSwimDepth, waterType, dangerPerc, maintenanceCost);
	}

	public Dolphin() {
		super(0, "NewDolphin", 6000, WaterType.FRESHWATER, 0.6, 9);
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Aquatics.Dolphin);
	}

	public void decodeFromXml(Element element) {
		super.decodeFromXml(element);
	}
}
