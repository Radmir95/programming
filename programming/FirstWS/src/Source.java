
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.xml.ws.Endpoint;

public class Source {
	
	public boolean approve(String name){
		return name.equals("Mike");
	}
}
