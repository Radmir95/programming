package javaBegin;

import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Main {

	public static void main(String[] args) {
		
		People people = new People();
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		Person p4 = new Person();
		Person p5 = new Person();
		p1.setId(1);
		p1.setName("Ivan");
		p2.setId(2);
		p2.setName("Nikolay");
		p3.setId(3);
		p3.setName("David");
		p4.setId(4);
		p4.setName("Michele");
		p5.setId(5);
		p5.setName("Katya");

		ArrayList<Person> person = new ArrayList<Person>();
		person.add(p1);
		person.add(p2);
		person.add(p3);
		person.add(p4);
		person.add(p5);
		
		people.setPerson(person);
		
		try{
			JAXBContext jaxbContext = JAXBContext.newInstance(People.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			File file = new File("C:\\Users\\Radmir\\Dropbox\\workspace\\programming\\JAXB\\people.xml");
			jaxbMarshaller.marshal(people, file);
		}
		catch(JAXBException e){e.printStackTrace();}
		
		
	}

}
