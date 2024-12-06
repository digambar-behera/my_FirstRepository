package digambarsProjects1;
import java.util.Scanner;

public class PrimeNo {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter a number: ");
	     int num = scanner.nextInt();
	     if (isPrime(num)) {
	            System.out.println("The number is a Prime number");
	        } 
	     else {
	            System.out.println("The number is not a Prime Number");
	        }
	    }
	    public static boolean isPrime(int n) {
	        if (n <= 1) {
	            return false;
	        }
	        for (int i = 2; i * i <= n; i++) {
	            if (n % i == 0) {
	                return false;
	            }
	        }
	        return true;
	}
}
