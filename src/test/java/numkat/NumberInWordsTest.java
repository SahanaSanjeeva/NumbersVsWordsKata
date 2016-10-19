package test.java.numkat;

import static org.junit.Assert.*;
import org.junit.Test;

import main.java.numkat.NumberInWords;

public class NumberInWordsTest {

	@Test
	public void testTillTwenties() {
		checkWords("one",1);
		checkWords("two",2);
		checkWords("three",3);
		checkWords("four",4);
		checkWords("five",5);
		checkWords("six",6);
		checkWords("seven",7);
		checkWords("eight",8);
		checkWords("nine",9);
		checkWords("ten",10);
		checkWords("eleven",11);
		checkWords("twelve",12);
		checkWords("thirteen",13);
		checkWords("forteen",14);
		checkWords("fifteen",15);
		checkWords("sixteen",16);
		checkWords("seventeen",17);
		checkWords("eighteen",18);
		checkWords("ninteen",19);
		checkWords("twenty",20);
	}
	
	@Test
	public void testAboveTwentyExceptTens() {
		checkWords("thirty one",31);
		checkWords("forty nine",49);
		checkWords("fifty three",53);
		checkWords("eighty six",86);
		checkWords("ninty nine",99);
	}

	@Test
	public void testTens() {
		checkWords("thirty",30);
		checkWords("forty",40);
		checkWords("sixty",60);
		checkWords("eighty",80);
		checkWords("ninty",90);
		checkWords("hundred",100);
	}
	
	private void checkWords(String word, int num) {
		assertEquals (word, NumberInWords.convertNum(num));
	}

}
