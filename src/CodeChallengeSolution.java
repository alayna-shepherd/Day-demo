import java.util.Scanner;

/*
 * Your goal: Determine what a user should wear based on the 
 * type of event they're attending and the temperature outside.
 * 
 * Options: 
 * eventType should be used as a condition for eventClothing
 *  casual = something comfy
 *  semi-formal = business casual or a polo
 *  formal = a suit
 *  
 * temperature should be used as a condition for tempClothing 
 *  temperature < 54 = a coat
 *  temperature > 74 = no jacket
 *  temperature between 54 and 74 = a jacket
 */
public class CodeChallengeSolution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What kind of event?");
		String eventType = scan.next();
		System.out.println("What's the temperature?");
		int temperature = scan.nextInt();

		String eventClothing = "", tempClothing = "hi";

		// Write your code here
		switch (eventType.toLowerCase) {
		case "casual": 
			eventClothing = "Something comfy";
			break;
		case "semi-formal":
			eventClothing = "business casual or a polo";
			break;
		case "formal":
			eventClothing = "a suit or gown";
			break;
		default:
			System.out.println("You didnt read directions...");
		}

		// Your code should end here!
		System.out.println("Because it's " + temperature + " degrees and you're going to a " + eventType
				+ " event, you should wear " + eventClothing + " and " + tempClothing + ".");

		scan.close();
	}
}