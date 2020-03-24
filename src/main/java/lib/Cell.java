package lib;

public class Cell
{
	private Coordinate coord;

	public Cell (Coordinate coord)
	{
		this.coord = coord;
	}

	public Cell (int x, int y)
	{
		this.coord = new Coordinate(x, y);
	}

	public Coordinate getCoordinate ()
	{
		return this.coord;
	}
}
