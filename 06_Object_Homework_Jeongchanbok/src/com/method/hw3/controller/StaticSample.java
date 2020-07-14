package com.method.hw3.controller;

public class StaticSample {

	private static String value;
	
	public void setValue(String value) {
		this.value = value;
		
	}
	
	public String getValue() {
		return value;
	}
	
	
	
	public static void toUpper() {
		// value 필드 값을 모두 대문자로 변경 --> char 배열 응용
		char[] ch = new char[value.length()];  // value = java
		
		String str = "";
		
		
		for(int i =0; i<value.length(); i++) {	// ch[] ={j,a,v,a}
			
			
			
			ch[i] = value.charAt(i);
			
			if(97<=ch[i] && ch[i] <= 122) {
				
				ch[i] -= 32;
				
				
			}
			
			str += ch[i];
			
		}
		
		value = str;
		
		}
	
	public static int valueLength() {
		int count = 0;
		char[] arr = new char[value.length()];
		// value 필드 값에 기록되어 있는 문자 갯수 리턴
		for(int i = 0; i<arr.length; i++) {
			
			count++;
		}
			
			return count;
		}

	public static String valueConcat(String str) {
		
		String mix = value + str;
		
		// 문자열 값을 전달받아 value 필드 값과 하나로 합쳐서 리턴
		
		return mix;
		}
	
	public static void setChar(int index, char c) {
		
		char[] ch = new char[value.length()];
		String output = "";
		
		for(int i = 0; i<ch.length; i++) {
			
			ch[i] = value.charAt(i);
				
			if(ch[i] == ch[index]) {
				ch[i] = c;
				
			}
			
			output += ch[i];
		}
		
		value = output;
		// 전달받은 인덱스 위치의 value 값을 전달받은 문자로 변경하는 static 메소드
	}

}
