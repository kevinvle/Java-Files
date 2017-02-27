// ------------------------ apples.java ------------------------
import java.util.Scanner;
public class apples {
	public static void main(String args[]) {
	
		Scanner input = new Scanner(System.in);
		
		tuna tunaObject = new tuna ();
		
		System.out.println("Enter name of first gf here: ");
		
		String temp = input.nextLine();
		
		tunaObject.setName(temp);
		
		tunaObject.saying();
	}
}


// ------------------------ Tuna.java ------------------------
public class tuna {
	private String girlName; // public var - any class can use it private var- only methods within class can use it
	
	public void setName(String name) { // does not return
		girlName = name;
	}
	
	public String getName() { // return string
		return girlName;
	}
	
	public void saying() {
		System.out.printf("Your first gf was %s", getName());
	}
}
