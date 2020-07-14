package com.method.hw1.run;

import com.method.hw1.controller.*;

public class Run {
	public static void main (String[] args) {
		
		NonStaticSample a = new NonStaticSample();

		a.printLottoNumbers();
		
		a.outputChar(5, 'a');
		
		
		
		a.alphabette();
		
		a.mySubstring("apple", 2, 4);
		
	}
}
