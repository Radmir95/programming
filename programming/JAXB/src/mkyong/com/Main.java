package mkyong.com;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Main {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setId(100);
		emp.setFirstName("Arkadiy");
		emp.setLastName("Ivanovich");
		emp.setAge(23);
		emp.setExp(2);

		try{
			File file = new File("C:\\Users\\Radmir\\Dropbox\\workspace\\programming\\JAXB\\employee.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Employee.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxbMarshaller.marshal(emp, file);
		}
		catch(JAXBException e){ e.printStackTrace();}
		
	}

}
