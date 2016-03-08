package javacodegeeks.com;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder = {"countryName", "countryPopulation",
		"listOfStates"})
public class Country {
	private String countryName;
	private double countryPopulation;
	private ArrayList<State> listOfStates;
	
	public Country(){}
	
	public String getCountryName(){
		return this.countryName;
	}
	
	@XmlElement
	public void setCountryName(String name){
		this.countryName = name;
	}
	
	public double getCountryPopulation(){
		return this.countryPopulation;
	}
	@XmlElement
	public void setCountryPopulation(double num){
		this.countryPopulation = num;
	}
	
	public ArrayList<State> getListOfStates(){
		return this.listOfStates;
	}
	
	@XmlElementWrapper(name = "stateList")
	@XmlElement
	public void setListOfStates(ArrayList<State> list){
		this.listOfStates = list;
	}
}
