package com.tjy.stringalgo;

public class StringReversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * String - Vivek
		 * Output - keviV
		 */
		System.out.println(stringReversal("Vivek is a good boy"));
		System.out.println(stringReversalUsingRecursion("    "));
		
		
	}
	
	public static String stringReversal(String input){
		char[] charArr = new char[input.length()];
		for (int i = 0; i < input.length(); i++) {
			charArr[input.length()-1 - i] = input.charAt(i);
		}
		
		return String.valueOf(charArr);
	}

	public static String stringReversalUsingRecursion(String input){
		
		if(input==null || input.length()<2){
			return input;
		}else{
			return stringReversalUsingRecursion(input.substring(1)) + input.charAt(0);
		}
		
	}
	
}
