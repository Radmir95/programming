package javacodegeeks.com;

import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Main {
	public static void main(String[] args){
		Country countryIndia = new Country();
		countryIndia.setCountryName("India");
		countryIndia.setCountryPopulation(5000000);
		   // Creating listOfStates
		   ArrayList<State> stateList=new ArrayList<State>();
		   State mpState=new State("Madhya Pradesh",1000000);
		   stateList.add(mpState);
		   State maharastraState=new State("Maharastra",2000000);
		   stateList.add(maharastraState);
		   countryIndia.setListOfStates(stateList);
		
		   try{
			   JAXBContext jaxbContext = JAXBContext.newInstance(Country.class);
			   Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			   jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			   File file = new File("C:\\Users\\Radmir\\Dropbox\\workspace\\programming\\JAXB\\country.xml");
			   jaxbMarshaller.marshal(countryIndia, file);
			   
		   }
		   catch(JAXBException e){e.printStackTrace();}
	}
}
