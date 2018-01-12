import java.util.Scanner;

/** 
 *  Play guessing game on the console.
 */
public class GameConsole {
	/** 
	 * the play method plays a game using input from user.
	 * @param create a object called game 
	 * @return guess from user
	 */
	
		/** play the game. */
	public int play(NumberGame game) {
		Scanner console = new Scanner(System.in);
		boolean correct=false;
		int guess=0;
		// describe the game
		System.out.println( game.toString() );
		
		// This is just an example.
		
		System.out.println( game.getMessage() );
		
		while(!correct) {
		System.out.print("Your Guess? ");
		guess = console.nextInt();
		correct = game.guess(guess);
		System.out.println( game.getMessage() );
		}
		return guess;
	}
	
}
