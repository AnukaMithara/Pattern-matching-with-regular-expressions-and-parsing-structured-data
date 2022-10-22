import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;


public class ReadXMLFile{
    public static void main(String args[]) {
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            try{
                File file = new File("people.xml");
                DocumentBuilder db = dbFactory.newDocumentBuilder();
                Document doc = db.parse(file);

                NodeList nodeList = doc.getElementsByTagName("person");
                    
                for(int itr = 0; itr < nodeList.getLength(); itr++){
                    Node node = nodeList.item(itr);
                
                    if (node.getNodeType() == Node.ELEMENT_NODE)
                    {
                    Element eElement = (Element) node;

                    System.out.println("Person ID : " + eElement.getAttribute("id"));
                    System.out.println("First Name : " + eElement.getElementsByTagName("firstname").item(0).getTextContent());
                    System.out.println("Last Name : " + eElement.getElementsByTagName("lastname").item(0).getTextContent());
                    }
                    System.out.println("");            
                }

                }catch (ParserConfigurationException | SAXException | IOException e) {
                    e.printStackTrace();
                }
        }
    }