package stringpractice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GetAlternateCharsTest {

	GetAlternateChars obj= new GetAlternateChars();
	@Test
	void test1() {
		 String acresult = obj.trim("hello");
		 assertEquals("hlo", acresult);
	}
	@Test
	void test2() {
		String acresult = obj.trim("");
		 assertEquals("", acresult);
	}
 

}
