package club;

import java.util.ArrayList;
import java.util.List;

public class Manager {
	
	private List<Person> clubPersons = new ArrayList<>();
	
	public Manager() {
		
	}
	
	public void registerPerson (String name, int age) {
		Person newPerson = new Person(name, age);
		clubPersons.add(newPerson);
	}
	
	public Person getOldestPerson() {
		if(clubPersons.isEmpty())
			return null;
		Person oldest = clubPersons.get(1);
		for(Person p : clubPersons) {
			if (p.getAge() > oldest.getAge()) {
				oldest = p;
			}
		}
		
		return oldest;
		
	}
	
	public Person getYoungestPerson() {
		if(clubPersons.isEmpty())
			return null;
		Person yougest = clubPersons.get(1);
		for(Person p : clubPersons) {
			if (p.getAge() < yougest.getAge()) {
				yougest = p;
			}
		}
		
		return yougest;
	}
	
	public float getAverageAge() {
		float totalAge = 0;
		for(Person p : clubPersons) {
			totalAge += p.getAge();
		}
		return totalAge/clubPersons.size();
	}

	public List<Person> getClub() {
		return clubPersons;
		
	}
	public Person getPerson(String name) {
		for(Person p : clubPersons) {
			if(p.getName().equals(name)) {
				return p;
			}
		}
		return null;
	}
}
