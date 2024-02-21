package club;


public class Printer {
	
	private Manager clubManager;

	public Printer(Manager clubManager) {
		this.clubManager = clubManager;
	}

	public String printClubList() {
		
		String print = "Club Members\n\nName\t\tAge\n";
		print += "---------------------------\n";
		
		for(Person p : clubManager.getClub()) {
			print += p.getName() + "\t\t" + p.getAge() + "\n";
		}
		
		return print;
	}
	
	public String printOldestPerson() {
		return "Oldest Person in the club is: " + clubManager.getOldestPerson().getName() + ".";
	}
	
	public String printYoungestPerson() {
		return "Youngest Person in the club is: " + clubManager.getYoungestPerson().getName() + ".";
	}
	
	public String printAverageAge() {
		return "The average age of the persons in the club is: " + clubManager.getAverageAge() + ".";
	}
	
	
	public String printPerson(Person person) {
		return "Name: " + person.getName() + ", Age: " + person.getAge();
	}
	
	public String printMainPage() {
		return printClubList() + "\n" + printOldestPerson() + "\n" + printYoungestPerson() + "\n" + printAverageAge();
	}
}
