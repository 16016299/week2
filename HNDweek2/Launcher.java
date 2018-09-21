package HNDweek2;
import java.util.Scanner;

public class Launcher {

	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		Person p1 = new Person();
		
		p1.forename = "gill";
		p1.surname = "blue";
		p1.email = "g.b@gmail.com";
		p1.age = 22;
		p1.mobile = "0798783022";
		
		
		Person p2 = new Person();
		System.out.println("What is your forename?");
		p2.forename = kboard.next();
		System.out.println("What is your surname?");
		p2.surname = kboard.next();
		
		Person p3 = new Person();
		System.out.println("What is your forename?");
		p3.forename = kboard.next();
		System.out.println("What is your surname?");
		p3.surname = kboard.next();
		System.out.println("What is your age?");
		p3.age = kboard.nextInt();
		
	}
	public String DisplayPerson(String forename){
		
	}

}
