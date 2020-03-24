package lib;

/**
 * A Cell is a unit in a Grid.
 *
 * Cells know their own position via a {@link Coordinate} object. The
 * x and y values in the Cells Coordinate property represent its
 * position in the Grid.
 *
 */
public class Cell
{
	private Coordinate coord;

	/**
	 * Instantiates a new Cell based on a {@link Coordinate} object.
	 *
	 * @param coord the coordinate of the new Cell
	 */
	public Cell (Coordinate coord)
	{
		this.coord = coord;
	}

	/**
	 * Instantiates a new Cell based on an X and Y position, creating
	 * a new Coordinate object for the Cell.
	 *
	 * @param x the x position
	 * @param y the y position
	 */
	public Cell (int x, int y)
	{
		this.coord = new Coordinate(x, y);
	}

	/**
	 * Gets the Cells Coordinate object
	 *
	 * @return the coordinate
	 */
	public Coordinate getCoordinate ()
	{
		return this.coord;
	}
}
