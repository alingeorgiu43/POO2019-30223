package javasmmr.zoowsome.repositories;

import org.w3c.dom.Element;
import javax.xml.parsers.ParserConfigurationException;
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

public class AnimalRepository extends EntityRepository<Animal> {
	private static final String XML_FILENAME = "Animals.xml";

	public AnimalRepository() throws ParserConfigurationException {
		super(XML_FILENAME, Constants.XML_TAGS.ANIMAL);
	}

	@Override
	protected Animal getEntityFromXmlElement(Element element) {
		String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();
		switch (discriminant) {

		case Constants.Animals.Aquatics.Dolphin:
			Animal newDolphin = new Dolphin();
			newDolphin.decodeFromXml(element);
			return newDolphin;
		case Constants.Animals.Aquatics.Shark:
			Animal newShark = new Shark();
			newShark.decodeFromXml(element);
			return newShark;
		case Constants.Animals.Aquatics.Whale:
			Animal newWhale = new Whale();
			newWhale.decodeFromXml(element);
			return newWhale;

		case Constants.Animals.Birds.Eagle:
			Animal newEagle = new Eagle();
			newEagle.decodeFromXml(element);
			return newEagle;
		case Constants.Animals.Birds.Owl:
			Animal newOwl = new Owl();
			newOwl.decodeFromXml(element);
			return newOwl;
		case Constants.Animals.Birds.Phoenix:
			Animal newPhoenix = new Phoenix();
			newPhoenix.decodeFromXml(element);
			return newPhoenix;

		case Constants.Animals.Insects.Bee:
			Animal newBee = new Bee();
			newBee.decodeFromXml(element);
			return newBee;
		case Constants.Animals.Insects.Spider:
			Animal newSpider = new Spider();
			newSpider.decodeFromXml(element);
			return newSpider;
		case Constants.Animals.Insects.Butterfly:
			Animal newButterfly = new Butterfly();
			newButterfly.decodeFromXml(element);
			return newButterfly;

		case Constants.Animals.Mammals.Deer:
			Animal newDeer = new Deer();
			newDeer.decodeFromXml(element);
			return newDeer;
		case Constants.Animals.Mammals.Lion:
			Animal newLion = new Lion();
			newLion.decodeFromXml(element);
			return newLion;
		case Constants.Animals.Mammals.Wolf:
			Animal newWolf = new Wolf();
			newWolf.decodeFromXml(element);
			return newWolf;

		case Constants.Animals.Reptiles.Turtle:
			Animal newTurtle = new Turtle();
			newTurtle.decodeFromXml(element);
			return newTurtle;
		case Constants.Animals.Reptiles.Snake:
			Animal newSnake = new Snake();
			newSnake.decodeFromXml(element);
			return newSnake;
		case Constants.Animals.Reptiles.Lizard:
			Animal newLizard = new Lizard();
			newLizard.decodeFromXml(element);
			return newLizard;
		default:
			break;
		}
		return null;
	}

}