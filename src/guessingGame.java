import java.util.Random;
import java.util.Scanner;

public class guessingGame {



	public static void main(String[] args) {
		
        Random rand = new Random();
        int numG = rand.nextInt(11);
        int numT = 0;
        Scanner input = new Scanner(System.in); {
		int guesS;
		System.out.println("Welcome to who wants to be a trillionaire!");
		System.out.println("What's your name player?");
		String name = input.nextLine();
		System.out.println("Welcome " + name);
		System.out.println("And where are you from " + name + "?");
		String from = input.nextLine();
		System.out.println("Wow! " + from + " is a great place to live!");

		boolean win = false;
		
		while(win == false) {
	
		System.out.println("Guess a number between 1 and 10: "); {
		    guesS = input.nextInt();
		    numT++;
			if (guesS == numG) {
				win = true;
				System.out.println("Winner winner chicken dinner! ");
				System.out.println("The winning Lotto number was " + numG);
				System.out.println("Congragulations! " + name + " You're a trillionaire!");
				System.out.println("It took you " + numT + " tries.");
			System.exit(0);
			}
			if(guesS == -1) {
				System.out.println("Goodbye " + name + "!");
				System.exit(0);
			}
			if (guesS < numG) {
				System.out.println("Your guess is too low!");
			}
			if (guesS > numG) {
				System.out.println("Your guess is too high!");
			}
			if(guesS == 0) {
				numT--;
				System.out.println("Guess a number between 1,2,3,4,5,6,7,8,9,10.");
			}
			if (numT > 2) {
				win = false;
				System.out.println(".....GAMEOVER.....");
				System.out.println("Wow " + name + "! You suck!");
				System.out.println("The winning Lotto number was: " + numG);
				System.out.println("It took you " + numT + " tries.");
				System.exit(0);
			}
				}
			}
		input.close();
				}
			}
		}
		







