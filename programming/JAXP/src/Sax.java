import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.w3c.dom.Document;


public class Sax {
	private final static String PATH = "C:\\Users\\Radmir\\Desktop\\test.xml";
	public static void main(String args[]){
		File input = new File(PATH);
		/*try{
			SAXHandler handler = new SAXHandler();
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser parser = factory.newSAXParser();
			parser.parse(input, handler);
			System.out.println("SAX parser result:\n" + handler.getResult());
		}
		catch(Exception e){e.printStackTrace();}
	*/
		try {
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory
			.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();  
			Document doc = dBuilder.parse(input);
			doc.getDocumentElement().normalize();
			Dom domParser = new Dom();
			System.out.println("DOM parser result:\n" + domParser.parse(doc));
			} catch (Exception e) {
			e.printStackTrace();
			}
	}
}