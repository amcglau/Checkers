package gui;

/**
 *  Tile class creates an tile instance for the board
 * Has properties defining the size of the tile to be painted
 * Has property team to define which of two colors it is
 * Knows location on board
 * Author: amshore
 */
public class Tile {

	//If an invalid length is entered for tile length, this is used instead
	private final static int DEFAULT_LENGTH = 50;
	
	// Member variables defining size, color, and location of tile
	private int length, team, loc_x, loc_y;
	
	// Member variable to tell if piece is currently on tile
	private boolean onTile;
	
	/**
	 * Creates a checker tile object for the GUI
	 * Length determine dimensions of the tile (it is a square)
	 * Team determines the color of the tile 
	 *   0 is for black 
	 *   1 is for red
	 * Loc_x and Loc_y determine location of piece from top left corner with 0-indexing
	 */
	public Tile(int length, int team, int loc_x, int loc_y)
	{
		//Set length of board if positive integer, else use default value
		if(length > 0)
			this.length = length;
		else
			this.length = DEFAULT_LENGTH;
		
		// Set team of piece to 1 or 0
		if(team == 0)
			this.team = 0;
		else
			this.team = 1;
		
		//Pieces must have non-negative integer locations
		if(loc_x >= 0)
			this.loc_x = loc_x;
		else
			throw new IndexOutOfBoundsException();
		
		if(loc_y >= 0)
			this.loc_y = loc_y;
		else
			throw new IndexOutOfBoundsException();
		
		// All tiles initialized with no pieces
		onTile = false;
	}
	
	//Getters
	
	/** 
	 * @return length of tile
	 */

	public int getLength()
	{
		return length;
	}
	
	/** 
	 * @return team of tile
	 */
	public int getTeam()
	{
		return team;
	}
	
	/**
	 * @return if piece is currently on the tile
	 */
	public boolean pieceOnTile()
	{
		return onTile;
	}
	
	/** 
	 * @returns location of tile
	 * Value returned as array {x-location, y-location}
	 */
	public int[] getLocation()
	{
		int[] location_array = {loc_x, loc_y};
		return location_array;
	}
	
	//Setters
	
	/** 
	 * Sets length of tile to input value
	 *  If the input value is not a positive integer, 
	 *   the length is set to the default length of 50px
	 *   
	 *  @param length is the new length of the tile
	 */
	public void setLength(int length)
	{
		if(length > 0)
			this.length = length;
		else
			this.length = DEFAULT_LENGTH;
	}
	
	/**
	 * Call if piece on tile is moved to a new location
	 *    or if a piece moves to the tile
	 * 
	 * Logically negates value of onTile
	 *    if onTile == false, it now equals true and vice versa
	 */
	public void tilePieceMoved()
	{
		onTile = !onTile;
	}
	
	/**
	 * Paints the tile
	 */
	public void paint()
	{
		//TODO
	}
	
}
