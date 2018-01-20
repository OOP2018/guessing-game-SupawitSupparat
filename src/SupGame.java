import java.util.Random; 
/**
 * 
 * @author SupawitSupparat
 * @version 2018.01.20
 */
public class SupGame extends NumberGame{
	private int count = 0 ;
	
	/** upper bound for secret number */
    private int upperBound;
   
    /** the solution to the game */
    private int secret;

	public SupGame(int upperbound) {
		this.upperBound = upperbound;
		// create the secret number
		Random rand = new Random();
		// random.nextInt(n) returns a random integer between 0 and n-1, inclusive.
		this.secret = rand.nextInt(upperbound)+1;
	}

    /**
     * Evaluate a user's guess. 
     * @param number is the user's guess
     * @return true if guess is correct, false otherwise
     */
    public boolean guess(int number) {
    	count++;
    	if (number == secret) {
    		setMessage("Right! The secret number is "+secret);
    		return true;
    	}
    	if (number < secret) {
    		setMessage("Your answer is too small.");
    	}
    	else {
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
		return count;
	}
	
    @Override
    public String toString() {
    	return "Guess a secret number.";
    }
	
}
