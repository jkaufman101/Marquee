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
		int [][] display = new int [MarqueeDisplay.HEIGHT][MarqueeDisplay.WIDTH];
		Cell[][] toReturn = new Cell [MarqueeDisplay.HEIGHT][ConfigValues.CHARACTER_WIDTH * message.length() + (message.length()-1)];
		char want = message.charAt(0);
		display = Alphabet.toIntArray(want);
		
		for (int row = 0; row < MarqueeDisplay.HEIGHT; row++) {
			for (int col = 0; col < MarqueeDisplay.WIDTH; col++) {
				if (display[row][col] == 1) {
					toReturn[row][col] = new Cell(ConfigValues.FOREGROUND_COLOR);
				}
				else {
					toReturn[row][col] = new Cell(ConfigValues.BACKGROUND_COLOR);
				}
			}
		}
		return toReturn;
	}
	

}
