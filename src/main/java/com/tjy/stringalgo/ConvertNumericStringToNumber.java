package com.tjy.stringalgo;

public class ConvertNumericStringToNumber {

	public static void main(String[] args) {
		char c= 'c';
		String input = "HeClo Hatch char hacr";
		
		
		System.out.println(countSpecificCharFromStringJDK8Way(c, input));
	}
	
	
	public static long countSpecificCharFromStringJDK8Way(char c, String data){
		long count = data.toLowerCase().chars().filter(c1 -> c1 == (int)c).count();
		return count;
	}

}
