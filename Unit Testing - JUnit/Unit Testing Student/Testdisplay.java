import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Testdisplay {

	@Test
	void test() {
		Student student = new Student("Sri", "ranjani");
		assertEquals("Sriranjani", student.display());
	}

}
