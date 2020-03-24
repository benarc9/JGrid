import lib.Cell;

/**
 * A basic square Grid.
 *
 * A Grid is made up of individual {@link Cell} objects. A Grid
 * can be instantiated by providing the horizontal and vertical
 * Cell count.
 *
 * It can also be instantiated with a default 40 x 40 Grid via
 * the default constructor.
 */
public class Grid
{
	private Cell[][] cells;

	/**
	 * Instantiates a new Grid. User must supply the 2D array
	 * dimensions
	 *
	 * @param horzCount the horizontal {@link Cell} count
	 * @param vertCount the vertical {@link Cell} count
	 */
	public Grid (int horzCount, int vertCount)
	{
		this.cells = new Cell[horzCount][vertCount];

		for (int x = 0; x < horzCount; x++)
		{
			for (int y = 0; y < vertCount; y++)
			{
				this.cells[x][y] = new Cell(x, y);
			}
		}
	}

	/**
	 * Instantiates a new Grid. Initializes a 40 x 40 default 2D
	 * array of {@link Cell}s
	 */
	public Grid ()
	{
		this.cells = new Cell[40][40];
	}

	/**
	 * Gets a {@link Cell} from the Grid by the {@link lib.Coordinate}
	 *
	 * @param x the x position of the {@link Cell}
	 * @param y the y position of the {@link Cell}
	 *
	 * @return the {@link Cell}
	 */
	public Cell getCell (int x, int y)
	{
		return this.cells[x][y];
	}

	/**
	 * Get all {@link Cell}s in the Grid.
	 *
	 * @return the 2D array of {@link Cell}s
	 */
	public Cell[][] getCells ()
	{
		return this.cells;
	}
}
