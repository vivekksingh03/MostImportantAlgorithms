package com.tjy.stringalgo;

import java.util.regex.Pattern;

public class StringContainsOnlyDigit {

	private static Pattern oneOrMoreDigitPattern = Pattern.compile("\\d+");
	
	private static Pattern sixDigitPattern = Pattern.compile("\\d{6}");
	
	public static void main(String[] args) {
		System.out.println("-----------------containsOnlyDigitUsingRegex------------------------");
		System.out.println(containsOnlyDigitUsingRegex("345322"));
		System.out.println(containsOnlyDigitUsingRegex("3453dc22"));
		System.out.println(containsOnlyDigitUsingRegex("3453.22"));
		
		System.out.println("-----------------containsOnlyDigit------------------------");
		
		System.out.println(containsOnlyDigit("345322"));
		System.out.println(containsOnlyDigit("3453dc22"));
		System.out.println(containsOnlyDigit("3453.22"));
		
		System.out.println("------------------containsOnlySixDigitUsingRegex-----------------------");
		
		System.out.println(containsOnlySixDigitUsingRegex("345322"));
		System.out.println(containsOnlySixDigitUsingRegex("123"));
		System.out.println(containsOnlySixDigitUsingRegex("23456789"));
		System.out.println(containsOnlySixDigitUsingRegex("12345c"));
	}
	
	public static boolean containsOnlyDigitUsingRegex(final String data){
		
		return oneOrMoreDigitPattern.matcher(data).matches();
	}
	
	public static boolean containsOnlySixDigitUsingRegex(final String data){
		
		return sixDigitPattern.matcher(data).matches();
	}
	
	public static boolean containsOnlyDigit(final String data){
		if(data ==null || data.equals("")){
			return false;
		}else{
			for (char char1 : data.toCharArray()) {
				if(!Character.isDigit(char1)){
					return false;
				}
			}
		}
		return true;
	}
	
	

}
