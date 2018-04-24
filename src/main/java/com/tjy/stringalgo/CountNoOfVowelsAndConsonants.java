package com.tjy.stringalgo;

public class CountNoOfVowelsAndConsonants {

	private static char[] vowels = {'a','e','i','o','u'};
	
	public static void main(String[] args) {
		printNoOfVowelsAndConsonants("vIvek kumar singh | My age is 35.");

	}
	
	private static void printNoOfVowelsAndConsonants(final String data){
		int vowelCount = 0;
		int consonantCount = 0;
		boolean isVowel = false;
		for (char c : data.toCharArray()) {
			if(Character.isLetter(c)){
				for(char ch: vowels){
					if(Character.toLowerCase(c) == ch){
						isVowel = true;
						break;
					}
				}
				if(isVowel){
					vowelCount ++;
					isVowel = false;
				}else{
					consonantCount ++;
				}
			}
		}
		
		
		System.out.println( "Vowels Count: "+vowelCount + " | Consonants Count:" + consonantCount);
	}

}
