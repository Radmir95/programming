package javaBegin;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class Person {
	private int id;
	private String name;
	
	@XmlAttribute
	public void setId(int id){
		this.id = id;
	}
	
	@XmlElement
	public void setName(String name){
		this.name = name;
	}
	
	public int getId(){
		return this.id;
	}
	
	public String getName(){
		return this.name;
	}
}
