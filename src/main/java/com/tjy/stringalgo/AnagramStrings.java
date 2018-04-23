package com.tjy.stringalgo;

public class AnagramStrings {

	public static void main(String[] args) {
		String first = "Maryam";
		String anagram = "ramyma";
		System.out.println(checkAnagram(first.toLowerCase(), anagram.toLowerCase()));
		System.out.println(checkAnagramUsingArr(first, anagram));
	}

	public static boolean checkAnagram(String first,String anagram){
		long inTime = System.nanoTime();
		StringBuilder sb = new StringBuilder(anagram);
		
		for (int i = 0; i < first.length(); i++) {
			int index = sb.indexOf(first.charAt(i) + "");
			if(index!=-1){
				sb.deleteCharAt(index);
			}else{
				break;
			}
		}
		System.out.println("Time Taken checkAnagram" + (System.nanoTime()-inTime));
		return sb.length() == 0;
	}
	
	public static boolean checkAnagramUsingArr(String first,String anagram){
		long inTime = System.nanoTime();
		boolean status = true;
		if(first.length()!=anagram.length()){
			status =  false;
		}else{
			int[] chars = new int[256];
			for (int i = 0; i < first.length(); i++) {
				chars[Character.toLowerCase(first.charAt(i))] ++;
				chars[Character.toLowerCase(anagram.charAt(i))] --;
			}
			
			for (int i = 0; i < chars.length; i++) {
				if(chars[i]!=0){
					status = false;
					break;
				}
				
			}
			
		}
		System.out.println("Time Taken checkAnagramUsingArr" + (System.nanoTime()-inTime));
		return status;
	}
	
}
