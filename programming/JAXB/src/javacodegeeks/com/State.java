package javacodegeeks.com;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(namespace = "javacodegeeks.com.Country")
public class State {
	private String stateName;
	private long statePopulation;
	
	public State(){}
	
	public State(String stateName, long statePopulation){
		this.stateName = stateName;
		this.statePopulation = statePopulation;
	}
	
	 public void setStateName(String stateName) {
		   this.stateName = stateName;
		  }
	 
	 public String getStateName(){
		 return this.stateName;
	 }
		 
	 public long getStatePopulation() {
		   return statePopulation;
		  }
		 
	 public void setStatePopulation(long statePopulation) {
		   this.statePopulation = statePopulation;
		  }
}
