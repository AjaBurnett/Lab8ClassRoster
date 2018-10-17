import java.util.Scanner;

public class Lab8 {

	
	public static void main(String[] args) {
	
	
	

		
		Scanner scan = new Scanner (System.in);
				
		String[] studentName = {"Charlotte", "Aja", "Christie", "Imran",  "Carl", "Anthony"};
		String [] favoriteFood = { "Savory Fricassed Crow...or any crow that's not rusted", "anything free", "French Fries. She can smell fried potatoes a mile away.", "chicken, or at least that's what I gathered while evesdropping.", "not chicken. Maybe applesauce", "Pizza stuffed with gravy, or whatever that thing he was eating was" };
		String [] hometown = {"Seameet", "Torrine", "Bardford", "Gramsby", "Bailymena", "Knife's Edge"};
		String prompt;
		
		
		
		
		System.out.println("Welcome to our Java Class. This is our class roster!)");
	
		for (int i = 0; i<studentName.length; i++) {
			System.out.println((i+1) + "." + studentName[i]);
		}
		 
		
		do {
		
		
		int userOption = SampleValidator.getInt(scan, "\nPick a student: ", 1, studentName.length);
	
		System.out.println(studentName[userOption-1] + "'s favorite food is " + favoriteFood[userOption-1] + ". Do you want to know their hometown (Courtesy of FantasyNameGenerators.com)?");
		 
		String answer;
		answer = scan.next();
		if (answer.equalsIgnoreCase("yes")) {
		System.out.println(studentName[userOption-1] + " is from " + hometown[userOption-1] + ".");
		
		}
		System.out.println("Would you like to get to know another Student? (yes/no)");
		Scanner s = new Scanner(System.in);
		prompt = s.next();
	    }while(prompt.equalsIgnoreCase("yes")); 
	     
		if (prompt.equalsIgnoreCase("no"));
		System.out.println("Thanks for visiting!");
		
		
		
	
	
	
	
	}
}


	
		






