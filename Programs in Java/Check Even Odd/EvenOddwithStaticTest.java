import org.junit.jupiter.api.Test;
import org.junit.Assert;


class EvenOddwithStaticTest {

	@Test
	void testEvenodd() {
		EvenOdd ob = new EvenOdd();	
		Assert.assertEquals("Even", ob.evenodd(10));
	}

}
