package mkyong.com;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {
	
	String firstName;
	String lastName;
	int age;
	int exp;
	int id;
	
	Employee(){
		this.firstName = "ABC";
		this.lastName = "123";
		this.age = 18;
		this.exp = 0;
	}
	
	@XmlElement
	void setFirstName(String name){
		this.firstName = name;
	}
	
	@XmlElement
	void setLastName(String name){
		this.lastName = name;
	}
	
	@XmlElement
	void setAge(int age){
		this.age = age;
	}
	
	@XmlElement
	void setExp(int exp){
		this.exp = exp;
	}
	
	String getFirstName(){
		return this.firstName;
	}
	
	String getLastName(){
		return this.lastName;
	}
	
	int getAge(){
		return age;
	}
	
	int getExp(){
		return exp;
	}
	
	@XmlAttribute
	void setId(int id){
		this.id = id;
	}
	
	int getId(){
		return this.id;
	}
	
}
