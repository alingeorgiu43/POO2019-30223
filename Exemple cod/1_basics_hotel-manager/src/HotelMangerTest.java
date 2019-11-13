import org.junit.Assert;
import org.junit.Test;


public class HotelMangerTest {

	@Test
	public void testIsClean() {
		Assert.assertTrue(HotelManager.isClean(12));
		Assert.assertFalse(HotelManager.isClean(-10));
	}
}
