package com.main.java;

import java.util.*;

public class NumberInWords {

	static Map<Integer,String> numInWordMap = new LinkedHashMap<Integer,String>(){{
		put(1,"one");
		put(2,"two");
		put(3,"three");
		put(4,"four");
		put(5,"five");
		put(6,"six");
		put(7,"seven");
		put(8,"eight");
		put(9,"nine");
		put(10,"ten");
		put(11,"eleven");
		put(12,"twelve");
		put(13,"thirteen");
		put(14,"forteen");
		put(15,"fifteen");
		put(16,"sixteen");
		put(17,"seventeen");
		put(18,"eighteen");
		put(19,"ninteen");
		put(20,"twenty");
		put(30,"thirty");
		put(40,"forty");
		put(50,"fifty");
		put(60,"sixty");
		put(70,"seventy");
		put(80,"eighty");
		put(90,"ninty");
		put(100,"hundred");
	}};
	
	public static String convertNum(int numToConvert) {
		if(numToConvert <= 20) {
			return numInWordMap.get(numToConvert);
		} else if(numToConvert > 20 && numToConvert <= 29){
			return "twenty "+ numInWordMap.get(numToConvert%20);
		} else if(numToConvert > 30 && numToConvert <= 39){
			return "thirty "+ numInWordMap.get(numToConvert%30);
		} else if(numToConvert > 40 && numToConvert <= 49){
			return "forty "+ numInWordMap.get(numToConvert%40);
		} else if(numToConvert > 50 && numToConvert <= 59){
			return "fifty "+ numInWordMap.get(numToConvert%50);
		} else if(numToConvert > 60 && numToConvert <= 69){
			return "sixty "+ numInWordMap.get(numToConvert%60);
		} else if(numToConvert > 70 && numToConvert <= 79){
			return "seventy "+ numInWordMap.get(numToConvert%70);
		} else if(numToConvert > 80 && numToConvert <= 89){
			return "eighty "+ numInWordMap.get(numToConvert%80);
		} else if(numToConvert > 90 && numToConvert <= 99){
			return "ninty "+ numInWordMap.get(numToConvert%90);
		} else if(numToConvert <= 100){
			return numInWordMap.get(numToConvert);
		} else {
			return null;
		}
	}
	
}
