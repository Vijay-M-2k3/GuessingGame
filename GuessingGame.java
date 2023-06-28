
import java.util.Scanner;
public class GuessingGame {
public static void guessingNumberGame()
	{
		Scanner sc = new Scanner(System.in);
		int number = 1 + (int)(100* Math.random());
           int K;
		   int key=0;
           int i, numberguessed;
           System.out.println("In how many rounds can you guess the number? : ");
           K=sc.nextInt();
           System.out.println("\nA number is chosen"+ " between 1 to 100."+ "\nGuess the number"+ " within "+K+" trials.");
		for (i = 0; i < K; i++) {
           key=i+1;
           System.out.println("Guess the number:");
           numberguessed = sc.nextInt();
           if (number == numberguessed) {
		System.out.println("Congratulations!"+ " You guessed the number.");
		break;
		}
		else if (number > numberguessed && i != K - 1) {
		System.out.println("The number is "+ "greater than " + numberguessed);
		}
		else if (number < numberguessed && i != K - 1) {
		System.out.println("The number is"+ " less than " + numberguessed);
		}
		}
		if (i == K) {
		System.out.println("You have used all "+K+ " guesses.");
           System.out.println("The number was " + number);
		   System.out.println("Your Score is :0.0");
		}

	}

	public static void main(String arg[])
	{
		guessingNumberGame();
	}
}
