package com.mvc.view;

import java.util.Scanner;
import com.mvc.controller.MemberController;
import com.mvc.model.vo.Member;

public class MemberMenu {

	MemberController mc = new MemberController();
	Scanner sc = new Scanner(System.in);
	
	
	
	public void mainMenu() {
		
		/* 메뉴 출력 >> 반복 실행 처리함
		====== 회원 관리 메뉴 ======
		1. 신규 회원 등록 >> insertMember() 실행
		2. 회원 정보 검색 >> searchMember() 실행
		3. 회원 정보 수정 >> updateMember() 실행
		4. 회원 정보 삭제 >> deleteMember() 실행
		5. 회원 정보 출력 >> printAllMember() 실행
		9. 프로그램 종료
		*/
		while(true) {
			
			System.out.println("\n====== 회원 관리 메뉴 ======");
			System.out.println("1. 신규 회원 등록");
			System.out.println("2. 회원 정보 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 정보 삭제");
			System.out.println("5. 회원 정보 출력");
			System.out.println("9. 프로그램  종료");
			System.out.print("메뉴 선택 : ");
			int num = sc.nextInt();
			
			switch(num) {
			case 1 : insertMember(); break;
			case 2 : break;
			case 3 : break;
			case 4 : break;
			case 5 : break;
			case 9 : System.out.println("프로그램을 종료합니다."); return;
			default : System.out.println("번호를 다시 입력해주세요."); break;	
			}
		}
		
		
		
		
	}

	public void insertMember() {
		// 1. 현재 회원 수(memberCount)가 최대 회원 수(SIZE)를 넘어설 경우 return 처리
		// MemberController의 getMemberCount() 메소드를 통해 현재 회원 수 알아오고
		//최대 회원 수는 상수필드여서 클래스명. 으로 직접 접근 가능
		
		System.out.println("\n == 신규 회원 등록 ==");
		
		
		int count = mc.getMemberCount();
		
		if(count > MemberController.SIZE) {
			return;
		}
		
		// 2. 아이디를 입력 받아 MemberController의 checkId() 메소드로 전달 >> 결과 값 받기
		sc.nextLine();
		System.out.print("아이디 : ");
		String userId = sc.nextLine();
		
	
	}
	
}
