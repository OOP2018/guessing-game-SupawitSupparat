import java.util.Random; 
/**
 * Example guessing game.
 * 
 * @author Supawit Supparat
 * @version 2018.01.11
 */
public class SupGame extends NumberGame{
	private int count = 0 ;
	 /** upper bound for secret number */
    private int upperBound;
    /** the solution to the game */
    private int secret;
    
	/** count guesses */
//TODO add an attribute to count guesses

    /** Initialize a new default game. */
    public SupGame()
    {
		this(100);		
    }

	public SupGame(int upperbound) {
		this.upperBound = upperbound;
		// create the secret number
		long seed = System.nanoTime(); 
		Random rand = new Random(seed);
		// don't just copy this.
		// random.nextInt(n) returns a random integer between 0 and n-1, inclusive.
		this.secret = rand.nextInt(upperbound);
		super.setMessage("I'm thinking of a number between 1 and 100");
	}

    /**
     * Evaluate a user's guess. 
     * @param number is the user's guess
     * @return true if guess is correct, false otherwise
     */
	
    public boolean guess(int number) {
    	getCount();
    	if (number == secret) {
    		setMessage("Right! The secret number is "+secret);
    		return true;
    	}
    	if (number < 3*secret/4) {
    		setMessage("Your answer is WAY too small.");
    	}
    	else if (number < secret) {
    		setMessage("Your answer is too small.");
    	}
    	else if (number > secret*4/3) {
    		setMessage("Your answer is WAY too large.");
    	}
    	else /* if (number > secret) */ {
    		setMessage("Your answer is too large.");
    	}
    	return false;
    }
	
	/** Get the game upper bound. */
	public int getUpperBound() {
		return upperBound;
	}
    
	/** Get count of user guesses*/
	public int getCount() {
		return count++;
	}
	
    @Override
    public String toString() {
    	return "Guess a secrret number.";
    }
	
	
	
	
	
	
	
	
}
