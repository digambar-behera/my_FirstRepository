package digambarsProjects1;
import java.util.Scanner;

public class IdentifyMe {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		String str = sc.nextLine();
		if (str.equalsIgnoreCase("Digambar")) {
			System.out.println("Hello Digambar! How are you?");
		}
		else {
			System.out.println("Sorry! I don't know you");
		}
	}
}