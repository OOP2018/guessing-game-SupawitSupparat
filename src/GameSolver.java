		import java.util.Random;
		import java.util.Scanner;
		public class GameSolver {
		
			/** 
			 * the play method plays a game using input from user.
			 * @param game is the NumberGame to get input from user
			 * @return guess from user
			 */
			
				/** play the game. */
			public int play(NumberGame game) {
				
				boolean correct=false;
				int random=0,Min=0,Max=game.getUpperBound();
				
				// describe the game
				System.out.println( game.toString() );
				
				// This is just an example.
				System.out.println( game.getMessage() );
				
				// This loop will end when correct is true
				while(!correct) {
					Random rand = new Random();
					random = rand.nextInt(Max) + 1;
					correct = game.guess(random);
					if(game.getMessage().equals("Your answer is WAY too large.")||game.getMessage().equals("Your answer is too large.")){
							 Max = random;
						}
				}
					return random;
			}	
		}
