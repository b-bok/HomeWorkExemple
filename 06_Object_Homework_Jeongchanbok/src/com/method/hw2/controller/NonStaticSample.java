package com.method.hw2.controller;

public class NonStaticSample {
	
	
	public int[] intArrayAllocation(int length) {
		
		// 전달받은 정수 (length) 만큼 int 배열을 할당
		int[] arr = new int[length];
		
		// 임의의 1부터 100까지의 값으로 값을 기록하고 배열 주소 리턴
		for(int i = 0; i<arr.length; i++) {
			arr[i] = (int) (Math.random()*100 +1);
			
		}
		
		return arr;
		
	}
	
	
	public void display(int[] arr) {
		
		for(int i = 0; i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void swap(int[] arr, int idx1, int idx2) {
		// 전달받은 배열의 각각의 인덱스 값을 교환
		
		int temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
		
	}
	
	public void sortDescending(int[] arr) {
		
		// 위의 swap 메소드를 이용하여 전달받은 배열을 내림차순 적용
		for(int i = 0; i<arr.length;i++ ) {
			for(int j =0; j<i; j++) {
				
				if(arr[j] < arr[i]) {
					this.swap(arr, i, j);
				}	
			}
		}
		
		// 위의 display 메소드를 이용하여 출력
		this.display(arr);
		
	}
	
	public void sortAscending(int[] arr) {
		
		// 위의 swap 메소드를 이용하여 전달받은 배열을 오름차순 적용
				for(int i = 0; i<arr.length;i++ ) {
					for(int j =0; j<i; j++) {
						
						if(arr[j] > arr[i]) {
							this.swap(arr, i, j);
						}	
					}
				}
				
				// 위의 display 메소드를 이용하여 출력
				this.display(arr);
	}
	
	public int countChar(String str, char c) {
		
		// 문자열과 문자 하나를 전달받아 문자열에 포함된 문자의 갯수 리턴
		char[] ch = new char[str.length()];
		
		int count =0;
		
		for(int i = 0; i<ch.length;i++ ) {
			
			ch[i] = str.charAt(i);
			
			if(ch[i] == c) {
				count++;
			}
		}
		
		
		 System.out.printf("%s문자열에 %c의 갯수 : %d\n", str, c, count);
		
		 return count;
		
	}
	
	public int totalValue(int num1, int num2) {
		
		
		// 정수 두 개를 전달받아 두 수 중 작은 값에서 큰 값 사이의 정수들의 합계를 리턴
		int min = Math.min(num1, num2);
		int max = Math.max(num1, num2);
		int sum = 0;
		
		for(int i = min+1; i<max; i++) {
			
			sum += i;
			
		}
		// (단, 전달받은 두 정수는 포함되지 않아야된다.)
		System.out.printf("%d과 %d사이 정수들의 합계 : %d\n",max,min,sum);
		
		return sum;
		
		}
	
	public char pCharAt(String str, int index) {
		
		char[] ch = new char[str.length()];
		// 전달받은 문자열의 인덱스를 통해 해당 인덱스의 문자 리턴
		
		
		for(int i = 0; i<str.length();i++) {
			
			
			ch[i] = str.charAt(i);
			
			if(i == index) {
				
				System.out.printf("%s문자열의 %d번 인덱스 문자 : %c",str,index,ch[index]);
				break;
			}
			
			}
		
			return ch[index];
		
		}
	
	public String pConcat(String str1, String str2) {
		
		String fin = str1 + str2;
		
		// 두 개의 문자열을 전달 받아 하나의 문자열로 합쳐서 리턴
		
		System.out.printf("\n%s와 %s을 합친 문자열  : %s",str1,str2,fin);
		
		return fin;
		
		
		}
	
	
}
