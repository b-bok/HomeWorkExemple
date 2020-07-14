package com.method.hw1.controller;

import java.util.Arrays;

public class NonStaticSample {
	
	public void printLottoNumbers() {
		
		int[] arr = new int[6];
		
		int temp = 0;
		
		System.out.print("랜덤 값 : ");
		
		for(int i = 0; i<arr.length; i++) {
			
			arr[i] = (int) (Math.random()*45 +1);
			
			
			for(int j = 0; j<i ; j++) {
				
				if(arr[i] == arr[j]) {

					i--;
					
					continue;
				}
				
				if(arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
					
				}
			
				
			}
			
			
			
		}
		
		System.out.println(Arrays.toString(arr));
		
		
	}
	
	
	public void outputChar(int num, char c) {
		
		String str = "";
		
		for(int i = 0; i<num; i++) {
			str += c + " ";
		}
		
		System.out.printf("%c문자 %d개 출력 : %s\n", c, num, str);
	}
	
	public char alphabette() {
		
		int alpha = 0;
		
		while(true) {
			alpha = (char) (Math.random()*58 + 65);
			
			if(90 < alpha && alpha < 97) {
				continue;
			}
		
			System.out.println("랜덤 영문자 출력 : " + (char) alpha);	
			
			return (char) alpha;		
		}
	
	}
	
	public String mySubstring(String str, int index1, int index2) {
		
		char[] first = new char[str.length()];
		String sec = "";
		
		for(int i = 0; i<str.length(); i++) {
			first[i] = str.charAt(i);
		}
		
		for(int i = index1; i<index2; i++) {
			
			sec +=  first[i];
		}
		
		System.out.printf("%s의 %d번 %d번 사이의 값 출력 : %s",str,index1,index2,sec);
		
		return sec;
		
	}
	
}
