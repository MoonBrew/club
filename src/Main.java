import java.util.Scanner;

import club.Manager;
import club.Person;
import club.Printer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m = new Manager();
		
		m.registerPerson("Alice", 20);
		m.registerPerson("Bob", 25);
		m.registerPerson("Carol", 30);
		m.registerPerson("Dave", 35);
		
		Printer p = new Printer(m);
		
		while(true) {
			String input;
			Scanner sc = new Scanner(System.in);
			System.out.println(p.printMainPage());
			System.out.println("-------------------------------------\n\n");
			System.out.println("Select one of the following:\n"
					+ "\tPress 1 to see a club member's details.\n"
					+ "\tPress 2 to see add a club member.\n"
					+ "\tPress q to exit.");
			input = sc.nextLine();
			if (input.equals("q")){
				System.exit(0);
			}
			else if(input.equals("1")) {
				System.out.println("-------------------------------------");
				System.out.println("Type name of club member: ");
				input = sc.nextLine();
				Person result = m.getPerson(input);
				if(result == null) {
					System.out.println("No person by that name!\n");
				}
				else {
					System.out.println(p.printPerson(result));
				}
				System.out.println("-------------------------------------\n\n");
			}
			else if(input.equals("2")) {
				System.out.println("-------------------------------------");
				System.out.println("Type name of new club member: ");
				input = sc.nextLine();
				System.out.println("Type age of new club member: ");
				String age = sc.nextLine();
				try {
					m.registerPerson(input, Integer.parseInt(age));
				}
				catch(NumberFormatException e) {
					System.err.println("Please enter an Integer for age! ");
				}
				finally {
					System.out.println("-------------------------------------\n\n");
				}
			}
		}
	}

}
