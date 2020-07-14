package com.hw2.run;

import java.util.Scanner;

import com.hw2.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 최대 10명의 학생 정보를 기록할 수 있게 배열을 할당한다.
		Student[] arr = new Student[10];
		
		int count = 0; // 학생 수를 나타내는 변수 한 명 추가 시 1씩 증가시켜줄꺼임
		
		// while(true)을 사용하여 학생들의 정보를 계속 입력 받고
		while(true) {
			System.out.print("학년을 입력해주세요 : ");
			int grade = sc.nextInt();
			
			System.out.print("반을 입력해주세요 : ");
			int classroom = sc.nextInt();

			sc.nextLine();
			
			System.out.print("이름을 입력하세요 : ");
			String name = sc.nextLine();
			
			System.out.print("국어 점수 : ");
			int kor = sc.nextInt();
			
			System.out.print("영어 점수 : ");
			int eng = sc.nextInt();
			
			System.out.print("수학 점수 : ");
			int math = sc.nextInt();
			
			// 입력 받은 정보들을 가지고 배열의 count 인덱스에 매개변수 생성자를 통해 객체 생성
			for(int i = 0; i<arr.length; i++) {
				
				arr[i] = new Student(grade, classroom, name, kor, eng, math);
				count++;
				
				System.out.print("계속 추가하나요?(y/n) : ");
				char yn = sc.nextLine().charAt(0);
				
				if(yn == 'n') {
					break;
				}
				
				for(Student a : arr) {
					System.out.println(a);
				}
			}
			
			// 한 명씩 추가 되었기 때문에 count 1증가
			
			
			// 계속 추가할 것인지 물어보고, ‘n’ 입력 시 반복문 빠져나감
			
			
			// 현재 배열에 담겨있는 학생들의 정보를 모두 출력
			
		}
		
		
	}

}
