package com.method.hw2.run;

import com.method.hw2.controller.NonStaticSample;

public class Run {

	public static void main(String[] args) {

		NonStaticSample s = new NonStaticSample();
		
		
		
		int[] arr = s.intArrayAllocation(5);
		
		System.out.print("크기가 5인 배열의 랜덤 값 : ");
		
		s.display(arr);
				
		
		System.out.print("\n내림차순 출력 : ");
		
		s.sortDescending(arr);
		
		System.out.print("\n오름차순 출력 : ");
		
		s.sortAscending(arr);
		
		System.out.println();
		
		s.countChar("apple", 'p');
		
		s.totalValue(13,7);
		
		s.pCharAt("programming", 3);
		
		s.pConcat("JAVA","programming");
		
		
	}

}
