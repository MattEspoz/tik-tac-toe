package tikTacToe;

import java.util.Random;
import java.util.Scanner;


public class Player {
	
	
	//private data fields
	private char symbol;
	private boolean isHuman;
	
	/**
	 Argumented constructor.
	 @param youHuman incoming variable 
	*/
	public Player(boolean youHuman) {
		isHuman = youHuman;
		if (isHuman == true) {
			symbol = 'X';
		}
		else {
			symbol = 'O';
		}
		
	}
	
	/**
	 Returns the symbol
	 @return symbol 
	*/
	public char getSymbol() {
		return symbol;
	}
	
	/**
	 Returns the Faced Up Side (value)
	 @return facingUpSide 
	*/
	public boolean getIsHuman() {
		return isHuman;
	}
	
	/**
	 Returns the position of the human player
	 @return getHumanMove 
	*/
	public int getHumanMove() {
		
		Scanner scan = new Scanner(System.in);
		int playerPosition = scan.nextInt();
		
		return playerPosition;
	}
	
	/**
	 Returns the position of the computer player
	 @return computerPosition 
	*/
	public int getComputerMove() {
		Random rand = new Random();
		int computerPosition = rand.nextInt(9) + 1;
		
		return computerPosition;
	}
	
	/**
	Returns a string representation of an object
	*/
	public String toString() {
		return ("Player[" +  symbol + " symbol, isHuman = " + isHuman + "]");
	}
	
}
