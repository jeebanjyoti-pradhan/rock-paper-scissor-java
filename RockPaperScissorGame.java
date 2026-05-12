import java.util.Random;
import java.util.*;

public class RockPaperScissorGame {
	public static void main(String[] args) {
		// 0 for ROCK
		// 1 for PAPER
		// 2 for SCISSOR
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 0 for Rock, 1 for Paper and 2 for Scissor");
		int userInput = sc.nextInt();
		
		// Apply to generate random number 
		Random random = new Random();
		int compInput = random.nextInt(3);

		//condition 
		if (userInput == compInput) {
			System.out.println("Game draw");
		} else if (userInput == 0 && compInput == 2 || userInput == 1 && compInput == 0
				|| userInput == 2 && compInput == 1) {
			System.out.println("YOU WIN!");
		} else {
			System.out.println("COMPUTER WIN!");
		}
		System.out.println("Computer input: " + compInput);
	}

}
