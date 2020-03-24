package lib;

/**
 * A Coordinate is a convenient way of representing a {@link Cell}s
 * position in a Grid.
 */
public class Coordinate
{
	private int x;
	private int y;

	/**
	 * Instantiates a new Coordinate with default X and Y positions of 0.
	 */
	public Coordinate ()
	{
		this.x = 0;
		this.y = 0;
	}

	/**
	 * Instantiates a new Coordinate.
	 *
	 * @param x the x position
	 * @param y the y position
	 */
	public Coordinate (int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	/**
	 * The horizontal position of the Coordinate.
	 *
	 * @return the horizontal position
	 */
	public int x ()
	{
		return this.x;
	}

	/**
	 * The vertical position of the Coordinate.
	 *
	 * @return the vertical position
	 */
	public int y ()
	{
		return this.y;
	}
}
