package javasmmr.zoowsome.repositories;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.w3c.dom.Node;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartDocument;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javasmmr.zoowsome.models.interfaces.XML_Parsable;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Bee;
import javasmmr.zoowsome.models.animals.Butterfly;
import javasmmr.zoowsome.models.animals.Deer;
import javasmmr.zoowsome.models.animals.Dolphin;
import javasmmr.zoowsome.models.animals.Eagle;
import javasmmr.zoowsome.models.animals.Lion;
import javasmmr.zoowsome.models.animals.Lizard;
import javasmmr.zoowsome.models.animals.Owl;
import javasmmr.zoowsome.models.animals.Phoenix;
import javasmmr.zoowsome.models.animals.Shark;
import javasmmr.zoowsome.models.animals.Snake;
import javasmmr.zoowsome.models.animals.Spider;
import javasmmr.zoowsome.models.animals.Turtle;
import javasmmr.zoowsome.models.animals.Whale;
import javasmmr.zoowsome.models.animals.Wolf;
import javasmmr.zoowsome.services.factories.Constants;

public class AnimalRepository {
	private static final String XML_FILENAME = "Animals.xml";

	public AnimalRepository() {
	}

	public void save(ArrayList<Animal> animals) throws FileNotFoundException, XMLStreamException {
		XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
		// Create XMLEventWriter
		XMLEventWriter eventWriter = outputFactory.createXMLEventWriter(new FileOutputStream(XML_FILENAME));
		// Create a EventF actory
		XMLEventFactory eventFactory = XMLEventFactory.newInstance();
		XMLEvent end = eventFactory.createDTD("\n");
		// Create and writ e Start Tag
		StartDocument startDocument = eventFactory.createStartDocument();
		eventWriter.add(startDocument);
		// Create content open tag
		StartElement configStartElement = eventFactory.createStartElement("", "", "content");
		eventWriter.add(configStartElement);
		eventWriter.add(end);
		for (XML_Parsable animal : animals) {
			StartElement sElement = eventFactory.createStartElement("", "", Constants.XML_TAGS.ANIMAL);
			eventWriter.add(sElement);
			eventWriter.add(end);

			animal.encodeToXml(eventWriter);
			EndElement eElement = eventFactory.createEndElement("", "", Constants.XML_TAGS.ANIMAL);
			eventWriter.add(eElement);
			eventWriter.add(end);
		}
		eventWriter.add(eventFactory.createEndElement("", "", Constants.XML_TAGS.ANIMAL));
		eventWriter.add(eventFactory.createEndDocument());
		eventWriter.close();
	}

	public ArrayList<Animal> load() throws ParserConfigurationException, SAXException, IOException {
		ArrayList<Animal> animals = new ArrayList<Animal>();
		File fXMLFile = new File(XML_FILENAME);

		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(fXMLFile);

		doc.getDocumentElement().normalize();

		NodeList nodeList = doc.getElementsByTagName(Constants.XML_TAGS.ANIMAL);

		for (int i = 0; i < nodeList.getLength(); i++) {
			Node node = nodeList.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) node;
				String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0)
						.getTextContent();

				switch (discriminant) {
				case Constants.Animals.Insects.Butterfly:
					Animal newButterfly = new Butterfly();
					newButterfly.decodeFromXml(element);
					animals.add(newButterfly);
					break;
				case Constants.Animals.Insects.Bee:
					Animal newBee = new Bee();
					newBee.decodeFromXml(element);
					animals.add(newBee);
					break;
				case Constants.Animals.Insects.Spider:
					Animal newSpider = new Spider();
					newSpider.decodeFromXml(element);
					animals.add(newSpider);
					break;

				case Constants.Animals.Aquatics.Dolphin:
					Animal newDolphin = new Dolphin();
					newDolphin.decodeFromXml(element);
					animals.add(newDolphin);
					break;
				case Constants.Animals.Aquatics.Shark:
					Animal newShark = new Shark();
					newShark.decodeFromXml(element);
					animals.add(newShark);
					break;
				case Constants.Animals.Aquatics.Whale:
					Animal newWhale = new Whale();
					newWhale.decodeFromXml(element);
					animals.add(newWhale);
					break;

				case Constants.Animals.Birds.Eagle:
					Animal newEagle = new Eagle();
					newEagle.decodeFromXml(element);
					animals.add(newEagle);
					break;
				case Constants.Animals.Birds.Owl:
					Animal newOwl = new Owl();
					newOwl.decodeFromXml(element);
					animals.add(newOwl);
					break;
				case Constants.Animals.Birds.Phoenix:
					Animal newPhoenix = new Phoenix();
					newPhoenix.decodeFromXml(element);
					animals.add(newPhoenix);
					break;

				case Constants.Animals.Mammals.Lion:
					Animal newLion = new Lion();
					newLion.decodeFromXml(element);
					animals.add(newLion);
					break;
				case Constants.Animals.Mammals.Deer:
					Animal newDeer = new Deer();
					newDeer.decodeFromXml(element);
					animals.add(newDeer);
					break;
				case Constants.Animals.Mammals.Wolf:
					Animal newWolf = new Wolf();
					newWolf.decodeFromXml(element);
					animals.add(newWolf);
					break;

				case Constants.Animals.Reptiles.Lizard:
					Animal newLizard = new Lizard();
					newLizard.decodeFromXml(element);
					animals.add(newLizard);
					break;
				case Constants.Animals.Reptiles.Turtle:
					Animal newTurtle = new Turtle();
					newTurtle.decodeFromXml(element);
					animals.add(newTurtle);
					break;
				case Constants.Animals.Reptiles.Snake:
					Animal newSnake = new Snake();
					newSnake.decodeFromXml(element);
					animals.add(newSnake);
					break;
				default:
					break;
				}
			}
		}
		return animals;
	}

	public static void createNode(XMLEventWriter eventWriter, String name, String value) throws XMLStreamException {
		XMLEventFactory eventFactory = XMLEventFactory.newInstance();
		XMLEvent end = eventFactory.createDTD("\n");
		XMLEvent tab = eventFactory.createDTD("\t");
		// Create Start node
		StartElement sElement = eventFactory.createStartElement("", "", name);
		eventWriter.add(tab);
		eventWriter.add(sElement);
		// Create Content
		Characters characters = eventFactory.createCharacters(value);
		eventWriter.add(characters);
		// Create End node
		EndElement eElement = eventFactory.createEndElement("", "", name);
		eventWriter.add(eElement);
		eventWriter.add(end);
	}

}