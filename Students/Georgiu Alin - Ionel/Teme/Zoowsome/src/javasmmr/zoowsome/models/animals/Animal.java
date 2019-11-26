package javasmmr.zoowsome.models.animals;

import javasmmr.zoowsome.models.interfaces.XML_Parsable;
import java.util.Random;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import javasmmr.zoowsome.models.interfaces.XML_Parsable;
import org.w3c.dom.Element;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

public abstract class Animal implements Killer, XML_Parsable {
	public Integer nrOfLegs;
	public String name;
	public double maintenanceCost;
	public double dangerPerc;
	private boolean takenCareOf = false;

	public Animal(Integer nrOfLegs, String name, double dangerPerc, double maintenanceCost) {
		this.nrOfLegs = nrOfLegs;
		this.name = name;
		this.dangerPerc = dangerPerc;
		this.maintenanceCost = maintenanceCost;
	}

	public void setNrOfLegs(Integer nrOfLegs) {
		this.nrOfLegs = nrOfLegs;
	}

	public Integer getNrOfLegs() {
		return nrOfLegs;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public double getMaintenanceCost() {
		return this.maintenanceCost;
	}

	public void setMaintenanceCost(double maintenanceCost) {
		this.maintenanceCost = maintenanceCost;
	}

	public void setDangerPerc(double dangerPerc) {
		this.dangerPerc = dangerPerc;
	}

	public double getDangerPerc() {
		return this.dangerPerc;
	}

	public boolean getIsTakenCareOf() {
		return this.takenCareOf;
	}

	public void setIsTakenCareOf(boolean takenCareOf) {
		this.takenCareOf = takenCareOf;
	}

	public boolean kill() {
		Random rand = new Random();
		double interactionDanger = rand.nextDouble() * 1;
		if (interactionDanger < this.dangerPerc)
			return true;
		else
			return false;
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		createNode(eventWriter, "nrOfLegs", String.valueOf(this.nrOfLegs));
		createNode(eventWriter, "name", String.valueOf(this.name));
		createNode(eventWriter, "maintenanceCost", String.valueOf(this.maintenanceCost));
		createNode(eventWriter, "dangerPerc", String.valueOf(this.dangerPerc));
		createNode(eventWriter, "takenCareOf", String.valueOf(this.takenCareOf));
	}

	public void decodeFromXml(Element element) {
		setNrOfLegs(Integer.valueOf(element.getElementsByTagName("nrOfLegs").item(0).getTextContent()));
		setName(element.getElementsByTagName("name").item(0).getTextContent());
		setMaintenanceCost(Double.valueOf(element.getElementsByTagName("maintenanceCost").item(0).getTextContent()));
		setDangerPerc(Double.valueOf(element.getElementsByTagName("dangerPerc").item(0).getTextContent()));
		setIsTakenCareOf(Boolean.valueOf(element.getElementsByTagName("takenCareOf").item(0).getTextContent()));
	}

}
