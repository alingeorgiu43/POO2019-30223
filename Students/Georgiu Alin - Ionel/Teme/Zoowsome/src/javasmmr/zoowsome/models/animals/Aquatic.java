package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Aquatic extends Animal {
	private Integer avgSwimDepth;
	private WaterType waterType;

	public Aquatic(Integer nrOfLegs, String name, Integer avgSwimDepth, WaterType waterType, double dangerPerc,
			double maintenanceCost) {
		super(nrOfLegs, name, dangerPerc, maintenanceCost);
		this.avgSwimDepth = avgSwimDepth;
		this.waterType = waterType;
	}

	public void setAvgSwimDepth(Integer avgSwimDepth) {
		this.avgSwimDepth = avgSwimDepth;
	}

	public Integer getAvgSwimDepth() {
		return avgSwimDepth;
	}

	public void setWaterType(WaterType waterType) {
		this.waterType = waterType;
	}

	public WaterType getWaterType() {
		return waterType;
	}

	public String toString() {
		return "Name: " + this.getName() + "\nNr legs: " + this.nrOfLegs + "\nNormal Average Swim Depth: "
				+ this.avgSwimDepth + "\nWaterType: " + this.waterType + "\nDanger Percent: " + this.dangerPerc
				+ "\nMaintenance Cost: " + this.getMaintenanceCost() + "\n";
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "avgSwimDepth", String.valueOf(this.avgSwimDepth));
		createNode(eventWriter, "waterType", String.valueOf(this.waterType));
	}

	public void decodeFromXml(Element element) {
		super.decodeFromXml(element);
		setAvgSwimDepth(Integer.valueOf(element.getElementsByTagName("avgSwimDepth").item(0).getTextContent()));
		setWaterType(WaterType.valueOf(element.getElementsByTagName("waterType").item(0).getTextContent()));
	}
}
