package javasmmr.zoowsome.repositories;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import java.io.File;
import java.io.IOException;
import org.w3c.dom.Node;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import javax.xml.parsers.ParserConfigurationException;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.models.employees.Employee;

public class EmployeeRepository extends EntityRepository<Employee> {
	private static final String XML_FILENAME = "Employees.xml";

	public EmployeeRepository() throws ParserConfigurationException {
		super(XML_FILENAME, Constants.XML_TAGS.EMPLOYEE);
	}

	public ArrayList<Employee> load() throws ParserConfigurationException, SAXException, IOException {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		File fXMLFile = new File(XML_FILENAME);

		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(fXMLFile);
		doc.getDocumentElement().normalize();

		NodeList nodeList = doc.getElementsByTagName(Constants.XML_TAGS.EMPLOYEE);

		for (int i = 0; i < nodeList.getLength(); i++) {
			Node node = nodeList.item(i);
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) node;
				String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0)
						.getTextContent();

				switch (discriminant) {
				case Constants.EmployeeTypes.Caretaker:
					Employee newCaretaker = new Caretaker();
					newCaretaker.decodeFromXml(element);
					employees.add(newCaretaker);
					break;
				default:
					break;
				}
			}
		}
		System.out.println(employees.size());
		return employees;
	}

	@Override
	protected Employee getEntityFromXmlElement(Element element) {
		String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();

		switch (discriminant) {
		case Constants.EmployeeTypes.Caretaker:
			Employee newCaretaker = new Caretaker();
			newCaretaker.decodeFromXml(element);
			return newCaretaker;
		default:
			break;
		}
		return null;
	}
}
