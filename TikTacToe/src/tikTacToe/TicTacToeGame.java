package tikTacToe;
/*
This program is for the final project in COSC 1046
Name: Matthew Espinoza
Accomplishes: computes a TicTacToe Game against a computer
 */

//allows for user input
import java.util.Scanner;

public class TicTacToeGame {
	
	//allows the Scanner class to be used through out methods
	static Scanner scan = new Scanner(System.in);
	
	
	public static void main(String[] args) {
	
	//header to start the game 
	System.out.println("************* "
			+ "\nTic-Tac-Toe! "
			+ "\n*************");
	
	
	char[][] gameBoard = 
		{{' ', '|', ' ', '|', ' '}, 
		{'-', '+', '-', '+', '-'}, 
		{' ', '|', ' ', '|', ' '}, 
		{'-', '+', '-', '+', '-'}, 
		{' ', '|', ' ', '|', ' '}, 
		{'-', '+', '-', '+', '-'}};
	
	//sets boolean statements for later use
	boolean gameOver = false;
	boolean playAgain = true;
	
	//relates the player object to the game
	Player human = new Player(true);
	Player computer = new Player(false);
	
	Board setBoard = new Board();
	setBoard.getNewGameBoard();
	
	//prints the status of the players
	System.out.println(human);
	System.out.println(computer);

	//while loop if player wants to play again and if game is not over
	while(playAgain) {
		System.out.print("Instructions: To win, fully complete a row or a column with X's \n");
		while(!gameOver) {
			System.out.println("Enter your placement (1-9):");
			int yourMove = human.getHumanMove();
			
			//ensure Move is Valid
			boolean yourProperPos = setBoard.isValidMove(yourMove, gameBoard);
		
			
			//ensure move it valid
			while(!yourProperPos) {
				System.out.println("Not a possible move");
				yourMove = human.getHumanMove();
				yourProperPos = setBoard.isValidMove(yourMove, gameBoard);	
				
			}
			
			//places the YOUR Piece on the Board
			placePiece(gameBoard, yourMove, 'X');
			
			//ensure game is not over
			gameOver = setBoard.checkStatus(gameBoard);
			if(gameOver) {
				printGameBoard(gameBoard);
				break;
			}
			else {
			}
			
			int theirMove = computer.getComputerMove();
			
			//ensure Computer Placement is Valid
			boolean theirProperMove = setBoard.isValidMove(theirMove, gameBoard);
			
			while(!theirProperMove) {
				theirMove = computer.getComputerMove();
				theirProperMove = setBoard.isValidMove(theirMove, gameBoard);
			}
			
			placePiece(gameBoard, theirMove, 'O');
			
			//prints the board on the screen
			printGameBoard(gameBoard);
			
			
			System.out.println("You played: " + yourMove);
			
			//ensure game is not over
			gameOver = setBoard.checkStatus(gameBoard);
			if(gameOver) {
				break;
			}
			else {
			}
			
		}
		//asks the user if they would like to continue playing
		System.out.println("Would you like to play again? (Press Y/N)");
		
		String result = scan.nextLine();
		
		//ensures whether the player wants the game to result
		switch (result) {
			case "Y":
				playAgain = true;
				resetGameBoard(gameBoard);
				gameOver = false;
				setBoard.getNewGameBoard();
				System.out.println("Awesome! Game is restarting! You Ready??");
				break;
			case "N":
				playAgain = false;
				gameOver = true;
				System.out.println("That's okay! I'll see you next time!");
				break;
			default:
				break;
			}
		}
	}

//method that reset the Game Board
public static void resetGameBoard(char [][] gameBoard) {
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
		
//method that prints the GameBoard
public static void printGameBoard(char[][] gameBoard) {
		String topBar = "~BOARD~";
		System.out.println(topBar);
		
		for(char[] row : gameBoard) {
			for(char character : row) {
				System.out.print(character);
			}
			System.out.println();
		}
	}

//method that places the Piece on the board
public static void placePiece(char[][] gameBoard,  int position, char user) {
		
	
		//setups up two new objects from the object class
		Player human = new Player(true);
		Player computer = new Player(false);
		
		
		char symbol = ' ';
		
		if(user == 'X') {
			symbol = human.getSymbol();
		} else if (user == 'O') {
			symbol = computer.getSymbol();
		}
		
		if(position == 1) {
			gameBoard[0][0] = symbol;
		}
		else if (position == 2) {
			gameBoard[0][2] = symbol;
		}
		else if (position == 3) {
			gameBoard[0][4] = symbol;
		}
		else if (position == 4) {
			gameBoard[2][0] = symbol;
		}
		else if (position == 5) {
			gameBoard[2][2] = symbol;
		}
		else if (position == 6) {
			gameBoard[2][4] = symbol;
		}
		else if (position == 7) {
			gameBoard[4][0] = symbol;
		}
		else if (position == 8) {
			gameBoard[4][2] = symbol;
		}
		else if (position == 9) {
			gameBoard[4][4] = symbol;
		}
		else {
			System.out.println("Out of Bounds");
		}

}

}
	
