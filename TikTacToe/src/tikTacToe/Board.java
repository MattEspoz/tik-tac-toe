package tikTacToe;

/**
 * This class describe a Board Object
 * @author matthewespinoza
 *
 */
public class Board {
	
	// private data fields
	private char[][] gameBoard = new char[][] 
			{{' ', '|', ' ', '|', ' '}, 
			{'-', '+', '-', '+', '-'}, 
			{' ', '|', ' ', '|', ' '}, 
			{'-', '+', '-', '+', '-'}, 
			{' ', '|', ' ', '|', ' '}, 
			{'-', '+', '-', '+', '-'}};
	
	/**
	 Constructs and initializes a blank gameBoard
	*/
	public Board() {
		gameBoard[0][0] = ' ';
		gameBoard[0][2] = ' ';
		gameBoard[0][4] = ' ';
		gameBoard[2][0] = ' ';
		gameBoard[2][2] = ' ';
		gameBoard[2][4] = ' ';
		gameBoard[4][0] = ' ';
		gameBoard[4][2] = ' ';
		gameBoard[4][4] = ' ';
		
	}
	
	/**
	 Returns entire printed gameBoard
	 @return gameBoard 
	*/
	public char[][] getNewGameBoard() {
		String topBar = "~BOARD~";
		System.out.println(topBar);
		
		for(char[] row : gameBoard) {
			for(char c : row) {
				System.out.print(c);
				
			}
			System.out.println();
		}
		return gameBoard;
	}
	
	/**
	 Returns true if player has won the game
	 @return status 
	*/
	public boolean checkStatus(char[][] gameBoard) {
	
	//Vertical Win Scenarios
	if (gameBoard[0][0] == 'X' && gameBoard[0][2] == 'X' && gameBoard[0][4]== 'X' ) {
		System.out.println( "Winner!");
		return true;
	}
	else if (gameBoard[0][0] == 'O' && gameBoard[0][2] == 'O' && gameBoard[0][4]== 'O' ) {
		System.out.println("Computer Wins! Try again?");
		return true;
	}
	else if (gameBoard[2][0] == 'X' && gameBoard[2][2] == 'X' && gameBoard[2][4]== 'X' ) {
		System.out.println( "Winner!");
		return true;
	}
	else if (gameBoard[2][0] == 'O' && gameBoard[2][2] == 'O' && gameBoard[2][4]== 'O' ) {
		System.out.println("Computer Wins! Try again?");
		return true;
	}
	else if (gameBoard[4][0] == 'X' && gameBoard[4][2] == 'X' && gameBoard[4][4]== 'X' ) {
		System.out.println( "Winner!");
		return true;
	}
	else if (gameBoard[4][0] == 'O' && gameBoard[4][2] == 'O' && gameBoard[4][4]== 'O' ) {
		System.out.println("Computer Wins! Try again?");
		return true;
	}
	
	//Horizontal Wins
	else if (gameBoard[0][0] == 'X' && gameBoard[2][0] == 'X' && gameBoard[4][0]== 'X' ) {
		System.out.println( "Winner!");
		return true;
	}	
	else if (gameBoard[0][0] == 'O' && gameBoard[2][0] == 'O' && gameBoard[4][0]== 'O' ) {
		System.out.println("Computer Wins! Try again?");
		return true;
	}
	else if (gameBoard[0][2] == 'X' && gameBoard[2][2] == 'X' && gameBoard[4][2]== 'X' ) {
		System.out.println( "Winner!");
		return true;
	}
	else if (gameBoard[0][2] == 'O' && gameBoard[2][2] == 'O' && gameBoard[4][2] == 'O' ) {
		System.out.println("Computer Wins! Try again?");
		return true;
	}
	else if (gameBoard[0][4] == 'X' && gameBoard[2][4] == 'X' && gameBoard[4][4]== 'X' ) {
		System.out.println( "Winner!");
		return true;
	}
	else if (gameBoard[0][4] == 'O' && gameBoard[2][4] == 'O' && gameBoard[4][4]== 'O' ) {
		System.out.println("Computer Wins! Try again?");
		return true;
	}
	
	//Diagonal Wins
	else if (gameBoard[0][0] == 'X' && gameBoard[2][2] == 'X' && gameBoard[4][4]== 'X' ) {
		System.out.println( "Winner!");
		return true;
	}
	else if (gameBoard[0][0] == 'O' && gameBoard[2][2] == 'O' && gameBoard[4][4]== 'O' ) {
		System.out.println("Computer Wins! Try again?");
		return true;
	}
	else if (gameBoard[0][4] == 'X' && gameBoard[2][2] == 'X' && gameBoard[4][0]== 'X' ) {
		System.out.println( "Winner!");
		return true;
	}
	else if (gameBoard[0][4] == 'O' && gameBoard[2][2] == 'O' && gameBoard[4][0]== 'O' ) {
		System.out.println("Computer Wins! Try again?");
		return true;
	}
	//Tied Scenario
	else if (gameBoard[0][0] != ' ' && gameBoard[0][2] != ' ' && gameBoard[0][4] != ' ' 
			&& gameBoard[2][0] != ' ' && gameBoard[2][2] != ' ' && gameBoard[4][2] != ' '
			&& gameBoard[4][0] != ' ' && gameBoard[4][2] != ' ' && gameBoard[4][4] != ' ') {
		System.out.println("Tied Game. Play Again?");
		return true;
	}
	
	else {
		return false;
	}
}

	/**
	 Returns true if position is possible
	 @return validMove
	*/
	public boolean isValidMove(int position, char[][] gameBoard) {
	
	switch (position) {
		//Box 1
		case 1:
			if (gameBoard[0][0] == ' ') {
				return true;
			}
			else {
				return false;
			}
			
		//Box 2
		case 2:
			if (gameBoard[0][2] == ' ') {
				return true;
			}
			else {
				return false;
			}
		
		//Box 3
		case 3:
			if (gameBoard[0][4] == ' ') {
				return true;
			}
			else {
				return false;
			}
		
			
		//Box 4
		case 4:
			if (gameBoard[2][0] == ' ') {
				return true;
			}
			else {
				return false;
			}
		
		//Box 5
		case 5:
			if (gameBoard[2][2] == ' ') {
				return true;
			}
			else {
				return false;
			}
		
			
		//Box 6
		case 6:
			if (gameBoard[2][4] == ' ') {
				return true;
			}
		
		//Box 7
		case 7:
			if (gameBoard[4][0] == ' ') {
				return true;
			}
			else {
				return false;
			}
		
			
		//Box 8
		case 8:
			if (gameBoard[4][2] == ' ') {
				return true;
			}
			else {
				return false;
			}
		
			
		//Box 9
		case 9:
			if (gameBoard[4][4] == ' ') {
				return true;
			}
			else {
				return false;
			}
			
		default:
			return false;
			
		}
	}
}
