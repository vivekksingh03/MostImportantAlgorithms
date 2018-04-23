/**
 * 
 */
package com.tjy.stringalgo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author vivekk.singh03
 *
 */
public class PrintDuplicateCharsFromString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String givenStr1="JavaJProgAramming";
		printDuplicateChars(givenStr1);
		printDuplicateCharsUsingJavaMap(givenStr1);
	}

	public static void printDuplicateChars(final String str){
		long inTime = System.nanoTime();
		int[] chars = new int[256];
		for(int i=0;i<str.length();i++){
			chars[str.charAt(i)]++;
		}
		
		for (int i = 0; i < chars.length; i++) {
			if(chars[i]>1){
				System.out.println((char)i + " count:"+chars[i]);
				//System.out.printf("%c,  count = %d \n", i,  chars[i]);
			}
			
		}
		
		System.out.println("Total Time printDuplicateChars:" + (System.nanoTime() - inTime));
		
	}
	
	public static void printDuplicateCharsUsingJavaMap(final String str){
		long inTime = System.nanoTime();
		Map<Character, Integer> map = new HashMap<>();
		char[] charArr = str.toCharArray();
		Integer value = null;
		for (int i = 0; i < charArr.length; i++) {
			if(map.containsKey(charArr[i])){
				value = map.get(charArr[i]);
				value = value + 1;
				map.replace(charArr[i], value);
			}else{
				map.put(charArr[i], 1);
			}
		}
		
		for (Entry<Character, Integer> c : map.entrySet()) {
			if(c.getValue()>1){
				System.out.println(c.getKey() + " count:"+c.getValue());
			}
		}
		
		System.out.println("Total Time printDuplicateCharsUsingJavaMap:" + (System.nanoTime() - inTime));
	}
	
}
