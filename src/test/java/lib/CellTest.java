package lib;

import org.junit.Assert;
import org.junit.Test;

public class CellTest
{
	private Cell cellUnderTest;
	private Coordinate coordinate;

	@Test
	public void testGetCoordinate ()
	{
		int expected = 0;

		cellUnderTest = new Cell(expected, expected);
		coordinate = new Coordinate(cellUnderTest.getCoordinate().x(), cellUnderTest.getCoordinate().y());

		int actualX = coordinate.x();
		int actualY = coordinate.y();

		Assert.assertEquals("Returned X value should equal expected test value", expected, actualX);
		Assert.assertEquals("Returned Y value should equal expected test value", expected, actualY);
	}
}
