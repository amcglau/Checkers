package game;

/** 
 * Abstract super class for a piece.
 * Sub-classes are to include CheckerPiece and the chess pieces
 * @author amcglau
 */
public abstract class Piece {
	/**
	 * Indicates the "team" of this piece.
	 * 
	 * Does not necessarily indicate color.  Merely
	 * stores whether this piece is on the "black" team,
	 * or not on the "black" team.
	 * Do <b>NOT</b> use this variable for graphic color storage.
	 */
	private boolean teamIsBlack;
	
	
	/**
	 * Constructor for the Piece superclass.
	 * 
	 * Abstract classes are never instantiated.  Piece's constructor
	 * is called at the start of every subclass constructor.
	 */
	public Piece()
	{
		this.teamIsBlack = true;
	}
	
	
	/**
	 * Location of piece, -1 means not on board, 0-63 indicates 
	 * array position on the board
	 */
	private int location = -1;
	
	
	/**
	 * Edits location of the piece
	 * 
	 *  <dt><b>Precondition:</b><dd>
	 *  The given location results in a valid move for
	 *  the corresponding piece and game mode
	 *  
	 * @param endingLocation
	 * The location that piece's location will be set to
	 */
	public void move(int endingLocation)
	{
		this.location = endingLocation;
	}
	
	
	/**
	 * Set the team of this piece to the black or not-black team.
	 * 
	 * @param blackTeamState
	 * Sets the teamIsBlack variable to this parameter.
	 */
	public void setTeam(boolean blackTeamState)
	{
		this.teamIsBlack = blackTeamState;
	}
	
	
	/**
	 * Returns the location of the piece
	 * 
	 * @return
	 * Returns the location variable
	 */
	public int getLocation()
	{
		return this.location;
	}
	
	
	/**
	 * Returns a boolean indicating if this piece is on the black "Team"
	 * 
	 * @return
	 * Returns the teamIsBlack variable.
	 */
	public boolean getTeam()
	{
		return this.teamIsBlack;
	}
}
