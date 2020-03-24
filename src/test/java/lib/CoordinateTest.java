package lib;

import org.junit.Assert;
import org.junit.Test;

public class CoordinateTest
{
	private Coordinate coordinateUnderTest;

	@Test
	public void testGetX ()
	{
		int expected = 0;
		int actual;

		coordinateUnderTest = new Coordinate(expected, expected);
		actual = coordinateUnderTest.x();

		Assert.assertEquals("Returned X value from coordinate should match expected value!", expected, actual);
	}

	@Test
	public void testGetY ()
	{
		int expected = 0;
		int actual;

		coordinateUnderTest = new Coordinate(expected, expected);
		actual = coordinateUnderTest.y();

		Assert.assertEquals("Returned Y value from coordinate should match expected value!", expected, actual);
	}
}
