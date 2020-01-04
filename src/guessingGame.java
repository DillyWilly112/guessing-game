import java.util.Scanner;

public class guessingGame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Guess a number between 1-10");
		int numG = input.nextInt(); {
		if(numG == 7) {
		System.out.println("You won!");
	    
		}
		else {
			System.out.println("You lost!");
		}
		
		}
		input.close();
}
	}

