package personinfo;

import packej.Country;
import packej.State;

public class demo {

	public static void main(String[] args) {
		Country c=new Country("India");
		State s=new State("Gujarat");
		Person p=new Person("Adnan",c,s);
		
		System.out.println(p);
	}

}
