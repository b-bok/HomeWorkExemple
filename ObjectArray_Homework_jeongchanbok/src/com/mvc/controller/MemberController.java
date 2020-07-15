package com.mvc.controller;

import com.mvc.model.vo.Member;

public class MemberController {

	
	public static final int SIZE = 10; // 최대 회원 수 상수필드로 10 초기화
	private int memberCount;			// 현재 회원 수 필드
	private Member[] mem = new Member[SIZE];  //회원들의 정보를 담는 객체 배열
	
	
	// 초기화 블럭을 이용하여 기본적인 회원 5명의 정보 초기화, memberCount 수 5 초기화
	{
		mem[0] = new Member("user01", "pass01", "김유신", 20, 'M', "kim12@naver.com");
		mem[1] = new Member("user02", "pass02", "이순신", 60, 'M', "lee2@naver.com");
		mem[2] = new Member("user03", "pass03", "유관순", 17, 'F', "yo5@hanmail.net");
		mem[3] = new Member("user04", "pass04", "연개소문", 57, 'M', "yeon@gmail.com");
		mem[4] = new Member("user05", "pass05", "신사임당", 45, 'F', "shin@naver.com");
		memberCount = 5;
	}
	
	public int getMemberCount() {
		
		// memberCount 리턴
		return memberCount;
		}

	public Member[] getMem() {
		// mem 주소 값 리턴
		return mem;
		}

	public Member checkId(String userId) {
		Member m = null; // 아이디로 검색된 결과를 담을 변수 초기화
		
		// mem 에서 매개변수로 전달받은 userId와 동일한 아이디를 가지고 있는 회원을 m에 대입
		for(int i = 0; i<memberCount; i++) {
			
			if(mem[i].getUserId().equals(userId)) {
				m = mem[i];
			}
		}
		
		// m 리턴
		return m;
		
		}
		
	public void insertMember(Member m) {
		// 매개변수로 전달받은 회원객체를 mem 배열에 추가
		mem[memberCount++] = m;
		// memberCount 1 증가
		}
	
	public Member searchMember(int menu, String search) {
		Member searchMember = null; // 검색된 회원 정보를 담을 변수 초기화
		// 매개변수로 전달받은 search 문자열을 menu 번호에 따라
		for(int i = 0; i<memberCount;i++) {
			// 1 인 경우 아이디로 검색 후 결과를 searchMember에 대입하고
			if(menu == 1 && mem[i].getUserId().equals(search)) {
				searchMember = mem[i];
			// 2 인 경우 이름으로 검색 후 결과를 searchMember에 대입하고
			}else if(menu == 2 && mem[i].getName().equals(search)) {
				searchMember = mem[i];
			// 3 인 경우 이메일로 검색 후 결과를 searchMember에 대입하고	
			}else if(menu == 3 && mem[i].getEmail().equals(search)) {
				searchMember = mem[i];
			}
			
		}
		// searchMember 주소 값 리턴
		return searchMember;
	
		}

	public void updateMember(Member m, int menu, String update) {
		
		// 매개변수로 전달받은 m 회원과 변경 내용인 update 문자열을 menu에 따라
		for(int i =0; i<memberCount; i++) {
			// 1 인 경우 setter 메소드를 이용하여 m의 비밀번호를 update 문자열로 변경
			if(menu == 1) {
				m.setUserPwd(update);
			// 2 인 경우 setter 메소드를 이용하여 m의 이름을 update 문자열로 변경	
			}else if(menu == 2) {
				m.setName(update);
			// 3 인 경우 setter 메소드를 이용하여 m의 이메일을 update 문자열로 변경	
			}else if(menu == 3) {
				m.setEmail(update);
			}
			
			
		}
	
	}
	
	
	// 매개변수로 전달받은 userId가 mem에 존재하는 경우 해당 회원 삭제 후
	// 다음 인덱스 객체들의 정보를 한 칸씩 앞으로 이동 시킴
	// memberCount 1 감소

	public void deleteMember(String userId) {
		
		for(int i =0; i<memberCount; i++) {
			for(int j = 0; j<i; j++) {
				
				if(mem[j].getUserId().equals(userId)) {
					
					Member temp = mem[i];
					mem[i] = mem[j];
					mem[j] = temp;

				}	
			}
			
		}
		mem[memberCount-1] = null; //mem[memberCount-1] 위치에 삭제하려는 객체가 들어있으므로 지워주자! 안지워도 프로그램은 정상동작하지만, 메모리엔 남아있으니까 :)
		memberCount--;
	}
}	

