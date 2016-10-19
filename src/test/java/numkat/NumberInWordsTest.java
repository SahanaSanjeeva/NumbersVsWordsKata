package test.java.numkat;

import static org.junit.Assert.*;
import org.junit.Test;

import main.java.numkat.NumberInWords;

public class NumberInWordsTest {

	@Test
	public void test() {
		assertEquals ("ninty nine", NumberInWords.convertNum(99));
	}

}
