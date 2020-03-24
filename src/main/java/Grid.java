import lib.Cell;

public class Grid
{
	private Cell[][] cells;

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

	public Grid ()
	{
		this.cells = new Cell[40][40];
	}

	public Cell getCell (int x, int y)
	{
		return this.cells[x][y];
	}
}
