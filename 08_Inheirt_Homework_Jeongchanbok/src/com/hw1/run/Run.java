package com.hw1.run;
import java.util.Scanner;
import com.hw1.model.vo.*;

public class Run {

	static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {

		// 3명의 학생 정보를 기록할 수 있게 객체 배열 할당 (Student[])
		Student[] sArr = new Student[3];
		
		// 위의 사용데이터 참고하여 3명의 학생 정보 초기화
		sArr[0] = new Student("홍길동", 20, 178.2,70.0, 1,"정보시스템학과");
		sArr[1] = new Student("김말똥", 21, 187.3,80.0, 2,"경영학과");
		sArr[2] = new Student("강개순", 23, 167.0,45.0, 4,"정보통신공학과");
		
		// 위의 학생 정보 모두 출력 
		for(int i =0; i<sArr.length;i++) {
			
			System.out.println(sArr[i].information());
		}
		
		// 최대 10명의 사원 정보를 기록할 수 있게 배열을 할당 (Employee[])
		Employee[] eArr = new Employee[10];
		// 사원들의 정보를 키보드로 계속 입력 받고 --> while(true) 무한 반복문을 통해
		
		int count = 0;
		
		while(true) {
			
			System.out.print("이름 : ");
			String name = sc.nextLine();
			
			System.out.print("나이 : ");
			int age = sc.nextInt();
			
			sc.nextLine();
			System.out.print("키 : ");
			double height = sc.nextDouble();
			
			sc.nextLine();
			System.out.print("몸무게 : ");
			double weight = sc.nextDouble();
			
			sc.nextLine();
			System.out.print("급여 : ");
			int salary = sc.nextInt();
			
			sc.nextLine();
			System.out.print("부서 : ");
			String dept = sc.nextLine();
			
<<<<<<< HEAD
			
			
			eArr[count] = new Employee(name, age, height, weight, salary, dept);
			
			// �� ���� �߰� �� ������ ī��Ʈ��
			count++;
=======
			// 한 명씩 추가 될 때마다 카운트함
			
			
			count++;
			/*
			for(int i = 0; i<count; i++) {
				// 입력받은 정보들을 가지고 매개변수 생성자를 이용하여 객체배열에 객체 생성
				// 입력된 정보가 없을 때만 값 추가합니다.
				if(eArr[i] == null) {
					
					eArr[i] = new Employee(name, age, height, weight, salary, dept);
				}
	
			}
			*/
			eArr[count] = new Employee(name, age, height, weight, salary, dept);
			// 굳이 for문을 사용할 필요가 없다.
			
			
>>>>>>> 6f2e95cea4a7f43dcbe1c2da24a7686248982398
			
			// 계속 추가할 것인지 물어보고, 대소문자 상관없이 ‘y’이면 계속 객체 추가
			System.out.print("계속 추가하시겠습니까? : ");
			char yn = sc.nextLine().charAt(0);
			
<<<<<<< HEAD
			
			if (yn == 'n') { //�߰����� �ʴ´ٰ� ������� ��
=======
			if(yn == 'y' || yn == 'Y') {
				
				continue;
				
			// ‘n’일 경우 더 이상 그만 입력 받도록..	
			}else if (yn == 'n') {
>>>>>>> 6f2e95cea4a7f43dcbe1c2da24a7686248982398
				for(int i =0; i<count;i++) {
					// 배열에 담긴 사원들의 정보를 모두 출력
					System.out.println(eArr[i].information());
					
				}
				break;
			}

		}

	}

}
