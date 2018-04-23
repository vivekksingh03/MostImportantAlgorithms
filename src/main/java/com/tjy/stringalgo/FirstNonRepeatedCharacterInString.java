package com.tjy.stringalgo;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeatedCharacterInString {

	public static void main(String[] args) {
		String data = "Mormning";
		printFirstNonRepeatedCharacterInString(data.toLowerCase());
	}
	
	public static void printFirstNonRepeatedCharacterInString(final String data){
		Map<Character,Integer> map = new LinkedHashMap<>();
		
		char[] dataArr = data.toCharArray();
		for (char c : dataArr) {
			map.put(c, map.containsKey(c)?map.get(c) + 1 : 1);
		}
		
		for (Entry<Character,Integer> c : map.entrySet()) {
			if(c.getValue()==1){
				System.out.println("Char:"+c.getKey());
				break;
			}
		}
	}

}
