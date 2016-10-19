package com.main.test;

import static org.junit.Assert.*;

import java.util.Comparator;

import org.junit.Test;

import com.main.java.NumberInWords;

public class NumberInWordsTest {

	@Test
	public void test() {
		assertEquals ("ninty nine", NumberInWords.convertNum(99));
	}

}
