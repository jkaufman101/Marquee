import cmscMarqueeLib.Alphabet;
import cmscMarqueeLib.Cell;
import cmscMarqueeLib.ConfigValues;
import cmscMarqueeLib.DataManager;

import cmscMarqueeLib.MarqueeDisplay;

public class MarqueeDataManager implements DataManager{

	private String message;
	private int animationPattern;
	//cell[][]
	
	public MarqueeDataManager(String message, int animationPattern) {
		this.message = message;
		this.animationPattern = 0;
		
	}
	public Cell[][] step() {
		int [][] display = messageToCharArray(message);
		Cell[][] toReturn = intArrayToCellArray(display);
		
		
		//char [][] display = new char [ConfigValues.MARQUEE_HEIGHT][ConfigValues.MARQUEE_WIDTH];
		//Cell[][] toReturn = new Cell [MarqueeDisplay.HEIGHT][ConfigValues.CHARACTER_WIDTH * message.length() + (message.length()-1)];

		
	/*	for (int row = 0; row < MarqueeDisplay.HEIGHT; row++) {
			for (int col = 0; col < MarqueeDisplay.WIDTH; col++) {
				if (display[row][col] == 1) {
					toReturn[row][col] = new Cell(ConfigValues.FOREGROUND_COLOR);
				}
				else {
					toReturn[row][col] = new Cell(ConfigValues.BACKGROUND_COLOR);
				}
			}
		} */
		return toReturn;
	}
	
	private int[][] messageToCharArray(String message) {
		int[][] messageArray = null;
	    
		
		return messageArray;
		
	}
	
	private Cell[][] intArrayToCellArray(int[][] messageArray) {
		Cell[][] cellArray = null;
		
		return cellArray;
	}
			
    public static void main(String [] args) {
    	MarqueeDataManager mdm = new MarqueeDataManager("Hello World", 0);
	}

}
