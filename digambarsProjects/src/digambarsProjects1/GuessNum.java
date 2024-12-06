package digambarsProjects1;
import java.util.*;

class Game {
	public int ComputerInput, UserGuess, no_of_guess = 0;
	public Game() {
		Random rnd = new Random();
		ComputerInput = rnd.nextInt(50);
	}
	public void UserInput(int num) {
		UserGuess = num;
	}
	public boolean IsCorrect() {
		if (UserGuess < ComputerInput) {
			System.out.println("You have chosen a smaller number");
			no_of_guess = no_of_guess + 1;
			return false;
		}
		else if (UserGuess > ComputerInput) {
			System.out.println("You have chosen a bigger number");
			no_of_guess = no_of_guess + 1;
			return false;
		}
		else {
			System.out.printf("Your guess is correct, it was %d\n", ComputerInput);
			no_of_guess = no_of_guess + 1;
			System.out.println("Number of guess required: " + no_of_guess);
			return true;
		}
	}
}

public class GuessNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("WELCOME TO THE GUESS THE NUMBER GAME!!");
		Game player = new Game();
		System.out.println("Guess the number from 0 to 50: ");
		player.UserInput(sc.nextInt());
		while (!player.IsCorrect()) {                   //Keeps asking to guess until u get it correct!
			System.out.println("Guess the number again.");
			player.UserInput(sc.nextInt());
		}
	}
}