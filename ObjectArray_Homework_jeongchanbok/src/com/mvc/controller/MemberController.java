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

	
		
	
}
