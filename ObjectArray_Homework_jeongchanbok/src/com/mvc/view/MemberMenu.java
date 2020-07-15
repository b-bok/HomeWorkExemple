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
			case 2 : searchMember(); break;
			case 3 : updateMember(); break;
			case 4 : deleteMember(); break;
			case 5 : printAllMember(); break;
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
		
		Member m = mc.checkId(userId);
		
		
		if(m != null) {
			System.out.println("동일한 아이디가 존재합니다. 회원등록 실패 ");
		}else {
			System.out.print("비밀 번호 : ");
			String userPwd = sc.nextLine();
			
			System.out.print("이름 : ");
			String name = sc.nextLine();
			
			System.out.print("나이 : ");
			int age = sc.nextInt();
			
			sc.nextLine();
			System.out.print("성별  : ");
			char gender = sc.nextLine().charAt(0);
			
			System.out.print("이메일 : ");
			String email = sc.nextLine();
			
			m = new Member(userId, userPwd, name, age, gender, email);
			
			mc.insertMember(m);
			
			System.out.println("성공적으로 회원 등록이 되었습니다.");
		}
		
	
	}
	
	public void searchMember() {
		while(true) {
			System.out.println("====== 회원 정보 검색 ======");
			System.out.println("1. 아이디로 검색하기");
			System.out.println("2. 이름으로 검색하기");
			System.out.println("3. 이메일로 검색하기");
			System.out.println("9. 이전 메뉴로 ");
			
			sc.nextLine();
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			
			if(menu == 9) { // 이 메소드 탈출!
				return;
			}
			
			sc.nextLine();
			System.out.print("검색 내용 : ");
			String search = sc.nextLine();
			// 1. MemberController의 searchMember() 메소드로 menu와 search 문자열 전달 >> 결과 값
			Member searchMember = mc.searchMember(menu, search);
			// 1_1. 결과 값이 null인 경우 즉, 검색 결과가 없는 경우 >> “검색된 결과가 없습니다.” 출력
			if(searchMember == null) {
				System.out.println("검색된 결과가 없습니다.");
			// 1_2. 결과 값이 null이 아닌 경우 즉, 검색 결과가 존재하는 경우 >> 회원 정보 출력	
			}else {
				System.out.println(searchMember.information());
			}
			
		}
	}
	
	public void updateMember() {
		while(true) {
			System.out.println("====== 회원 정보 수정 ======");
			System.out.println("1. 비밀번호 수정");
			System.out.println("2. 이름 수정");
			System.out.println("3. 이메일 수정");
			System.out.println("9. 이전 메뉴로");
			
			sc.nextLine();
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			
			if(menu == 9) { // 이 메소드 탈출!
				return;
			}
			
			sc.nextLine();
			System.out.print("변경할 회원 아이디 : ");
			String userId = sc.nextLine();
			
			Member m = mc.checkId(userId);
			
			if(m == null) {
				System.out.println("변경할 회원이 존재하지 않습니다.");
			}else {
				
				System.out.print("변경 내용 : ");
				String update = sc.nextLine();
				
				mc.updateMember(m,menu,update);
				
				System.out.println("회원 정보가 변경되었습니다.");
			}
			
		}
	}
	
	public void deleteMember() {
		sc.nextLine();
		System.out.print("삭제할 회원 아이디 : ");
		String userId = sc.nextLine();
		
		Member m = mc.checkId(userId);
		
		if(m == null) {
			sc.nextLine();
			System.out.println("삭제할 회원이 존재하지 않습니다.");
		}else {
			
			System.out.print("정말 삭제 하시겠습니까?(y/n) : ");
			char yn = sc.nextLine().charAt(0);
			
			if(yn == 'y' || yn == 'Y') {
				mc.deleteMember(userId);
				System.out.println("회원 정보가 삭제되었습니다.");
			}else {
				return;
			}
			
		}
		
	}
	
	public void printAllMember() {
		
		Member[] mem = mc.getMem();
		
		for(int i = 0; i<mc.getMemberCount();i++) {
		
			System.out.println(mem[i].information());
			
		}
		
		System.out.println(mc.getMemberCount());
	}
	
}
