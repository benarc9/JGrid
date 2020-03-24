import lib.Cell;
import org.junit.Assert;
import org.junit.Test;

public class GridTest
{
	private Grid gridUnderTest;

	@Test
	public void testGetCellReturnsNull ()
	{
		Cell expected = null;
		Cell actual;

		gridUnderTest = new Grid ();
		actual = gridUnderTest.getCell(0,0);

		Assert.assertNull("Cell should be null when not set.", actual);
	}

	@Test
	public void testGetCellReturnsCell ()
	{
		Cell expected = null;
		Cell actual;

		gridUnderTest = new Grid (10, 10);
		actual = gridUnderTest.getCell(0,0);

		Assert.assertNotNull("Returned cell should not be null.", actual);
	}

	@Test
	public void testGetCellsReturnsAllCells ()
	{
		Cell[][] cells = null;
		Cell[][] actual;

		gridUnderTest = new Grid (10, 10);
		actual = gridUnderTest.getCells();

		for (int x = 0; x < 10; x++)
		{
			for (int y = 0; y < 10; y++)
			{
				Assert.assertNotNull("Returned cell should not be null.", actual[x][y]);
			}
		}
	}

	@Test
	public void testGetCellsReturnsNull ()
	{
		Cell[][] cells = null;
		Cell[][] actual;

		gridUnderTest = new Grid ();
		actual = gridUnderTest.getCells();

		for (int x = 0; x < 40; x++)
		{
			for (int y = 0; y < 40; y++)
			{
				Assert.assertNull("Returned cell should be null.", actual[x][y]);
			}
		}
	}
}
