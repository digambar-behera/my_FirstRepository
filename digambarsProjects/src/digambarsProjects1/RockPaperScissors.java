package digambarsProjects1;
import java.util.*;

public class RockPaperScissors {
	public static void main(String[] args) {
		
		// 0 for Rock
		// 1 for Paper
		// 2 for Scissor
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter '0' for Rock, '1' for Paper, '2' for Scissors!");
		int userInput = sc.nextInt();
		Random random = new Random();
		int computerInput = random.nextInt(3);
		if (userInput == computerInput) {
			System.out.println("Draw!");
		}
		else if (userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0 || userInput == 2 && computerInput == 1) {
			System.out.println("You Win!");
		}
		else {
			System.out.println("Computer Wins!");
		}
		if (userInput == 0) {
			System.out.println("You chose Rock!");
		}
		else if (userInput == 1) {
			System.out.println("You chose Paper!");
		}
		else if (userInput == 2) {
			System.out.println("You chose Scissor!");
		}
		if (computerInput == 0) {
			System.out.println("Computer chose Rock!");
		}
		else if (computerInput == 1) {
			System.out.println("Computer chose Paper!");
		}
		else if (computerInput == 2) {
			System.out.println("Computer chose Scissor!");
		}
	}
}