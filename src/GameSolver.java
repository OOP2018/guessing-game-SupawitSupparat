		import java.util.Random;
		public class GameSolver {
		
			/** 
			 * the play method plays a game using input from user.
			 * @param game is the NumberGame to get input from user
			 * @return guess from user
			 */
			
				/** play the game. */
			public int play(NumberGame game) {
				System.out.println(game.toString()); 
				boolean correct=false;
				int random=0;
				int Min=0;
				int Max=game.getUpperBound();
				
				// This loop will end when correct is true
				
				while(!correct) {
					random = Min + (Max-Min) / 2;
					correct = game.guess(random);
					if(correct == true){
							break;
						}
					else if(correct==false) {
						if(game.getMessage().toLowerCase().contains("too large")){
							Max = random-1;
							}
						else if(game.getMessage().toLowerCase().contains("too small")){
							Min = random+1;
							}
						}
					}
					return random;
				}	
			}
		