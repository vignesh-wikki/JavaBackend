package Day14.XML_Parsing;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class XML_Parsing extends DefaultHandler {
    private boolean id = false;
    private boolean name = false;
    private boolean department = false;
    private boolean grade = false;

    public static void main(String[] args) {
        // Sax parsing

        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser parser = factory.newSAXParser();
            parser.parse(new File("/home/vignesh/Downloads/JavaBackend/Day14/XML_Parsing/studentsList.xml"),
                    new XML_Parsing());

        } catch (IOException | ParserConfigurationException | SAXException e) {
            System.err.println(e);
        }

        // dom parsing

        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            Document document = builder
                    .parse(new File("/home/vignesh/Downloads/JavaBackend/Day14/XML_Parsing/studentsList.xml"));
            document.getDocumentElement().normalize();

            Element element = document.getDocumentElement();

            System.out.println("Node name" + " " + element.getNodeName());

            NodeList student = document.getElementsByTagName("student");

            System.out.println("Number of students: " + student.getLength());

            for (int i = 0; i < student.getLength(); i++) {

                Node node = student.item(i);

                System.out.println(i + " node: " + node.getNodeName());

                if (node.getNodeType() == Node.ELEMENT_NODE) {

                    Element elements = (Element) node;

                    System.out.println(
                            "Id: " + elements.getElementsByTagName("id").item(0).getTextContent());
                    System.out.println(
                            "Name: " + elements.getElementsByTagName("name").item(0).getTextContent());
                    System.out.println(
                            "Department: " + elements.getElementsByTagName("department").item(0)
                                    .getTextContent());
                    System.out.println(
                            "Grade: " + elements.getElementsByTagName("grade").item(0).getTextContent());

                }
            }

        } catch (IOException | ParserConfigurationException | SAXException e) {
            System.err.println(e);
        }

        // jaxb parsing

    }

    @Override
    public void startElement(String uri, String localName, String qName,
            Attributes attributes) {
        switch (qName) {
            case "id" -> id = true;
            case "name" -> name = true;
            case "department" -> department = true;
            case "grade" -> grade = true;

        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) {
        switch (qName) {
            case "id" -> id = false;
            case "name" -> name = false;
            case "department" -> department = false;
            case "grade" -> grade = false;

        }
    }

    @Override
    public void characters(char[] ch, int start, int length) {
        if (id) {
            System.out.println("ID: " + new String(ch, start, length));
        } else if (name) {
            System.out.println("Name: " + new String(ch, start, length));
        } else if (department) {
            System.out.println("Department: " + new String(ch, start, length));
        } else if (grade) {
            System.out.println("Grade: " + new String(ch, start, length));
        }
    }

}
