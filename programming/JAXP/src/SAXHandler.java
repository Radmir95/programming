import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SAXHandler extends DefaultHandler{
	private StringBuffer result;
	
	public SAXHandler(){
		result = new StringBuffer();
	}
	
	public void startElement(String namespaceURI, String localName,
			String qName, Attributes atts) throws SAXException{
		result.append("Element name =" + qName + "\n");
		for (int i = 0; i < atts.getLength(); i++){
			result.append("Attribute name = " + atts.getQName(i)+
					"; Attribute value = " + atts.getValue(i) + "\n");
		}
	}
	
	public void characters(char[] ch, int start, int length)
	throws SAXException{
		String value = "";
		
		for (int i = start; i < length; i++){
			value+=ch[i];
			result.append("Element content = " + value.trim() + "\n");
		}
	}
	
	public void endElement(String namespaceURI, String localName, String qName)
	throws SAXException{
		result.append("Element closed, name = " + qName + "\n");
	}
	
	public String getResult(){
		return result.toString();
	}
}