package com.method.hw3.run;

import com.method.hw3.controller.StaticSample;

public class Run {

	public static void main(String[] args) {

		// StaticSample 클래스 변수인 value를 “Java”로 초기화 후 출력
		StaticSample s = new StaticSample();
		
		s.setValue("Java");
		
		System.out.println("value : " + s.getValue());
		
		
		// toUpper 메소드 실행을 통해 대문자로 변경 후 출력
		StaticSample.toUpper();
		
		System.out.println("대문자로 : " + s.getValue());
		
		
		// valueLength 메소드 실행을 통해 길이 출력
		
		System.out.println("길이 : " + StaticSample.valueLength());
		
		
		// valueConcat 메소드 실행을 통해 “PROGRAMMING” 문자열 합친 후 출력
		String input = "PROGRAMMING";
		
		String output = StaticSample.valueConcat(input);
		
		System.out.println(input + "붙여서 : " + output);
		// setChar 메소드 실행을 통해 “J”를 “C”로 변경 후 출력
		
		StaticSample.setChar(0, 'C');
		
		System.out.println("J => C : " + s.getValue() );
	}

}
