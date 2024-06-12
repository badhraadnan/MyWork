package personinfo;

import packej.Country;
import packej.State;


public class Person {
	
	private String pname; 
	private Country c;
	private State s;
	
	public Person(String pname, Country c, State s) {
		
		this.pname = pname;
		this.c = c;
		this.s = s;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Country getC() {
		return c;
	}

	public void setC(Country c) {
		this.c = c;
	}

	public State getS() {
		return s;
	}

	public void setS(State s) {
		this.s = s;
	}

	@Override
	public String toString() {
		return "Person [pname=" + pname + ", c=" + c + ", s=" + s + "]";
	}
	 
	
	
	

}
