package javaBegin;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class People {
	ArrayList<Person> person;
	
	@XmlElement
	public void setPerson(ArrayList<Person> person){
		this.person = person;
	}
	
	public ArrayList<Person> getPerson(){
		return this.person;
	}
}
