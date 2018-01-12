/**
 * A main class for the GuessingGame.
 * It is responsible for creating objects, 
 * connecting objects, and running the game UI.
 */
public class Main {
	public static void main(String[] args) {
		// upper limit for secret number in guessing game
		int upperBound = 100;
		NumberGame game = new SupGame(upperBound);
		GameSolver ui = new GameSolver( );
		int solution = ui.play( game );
		//TODO display the answer returned by play
		System.out.println("Solution is "+ solution);
		//TODO display how many guesses the user made
		int guesses = game.getCount();
		System.out.println("Number of guess is " + guesses);
		
	}
}
