package practice3.controller;

import practice3.model.vo.*;

public class AnimalManager {

	public static void main(String[] args) {

		// Animal 타입의 객체배열 크기 5로 생성  
		Animal[] arr = new Animal[5];
		
		//각 인덱스에 무작위로 Dog객체 또는 Cat객체로 생성 
		// (이때, 매개변수 생성자를 이용하여 생성) 
		arr[0] = new Dog("바둑이","시고르자브종",15);
		arr[1] = new Cat("나비","앙고라","사막","White");
		arr[2] = new Dog("복실이","푸들",13);
		arr[3] = new Cat("먼지","샴","아파트","Black");
		arr[4] = new Dog("초코","웰시코기",20);
		
		// 반복문을 통해서 해당 배열의 0번 인덱스부터 마지막 인덱스까지의  
		// 객체의 speak() 메소드 호출 
		
		for(Animal a : arr ) {
			a.speak();;
		}
			
			
		
			
		
		
		
	}

}
