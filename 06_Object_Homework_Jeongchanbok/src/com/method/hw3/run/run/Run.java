package com.kh.chap03_class.run;
import java.util.Scanner;

import com.kh.chap03_class.model.vo.*;
public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 객체생성을 통해 Heap 영역에 공간을 먼저 확보해둬야됨(할당)		
		Person p = new Person();
		
		p.setId("user");
		p.setPwd("pass01");
		p.setName("홍길동");
		p.setAge(20);
		p.setGender('M');
		p.setPhone("010-1111-2222");
		p.setEmail("hong@naver.com");
		
		//String id = p.getId();
		//System.out.println(id);
		
		//System.out.println(p.getId());
		//System.out.printf("%s의 비밀번호는 %s이며 이름은 %s입니다.\n나이는 %d세이며 %c성입니다.\n전화번호는 %s이고, 이메일은 %s입니다."
						//,p.getId(),p.getPwd(),p.getName(),p.getAge(),p.getGender(),p.getPhone(),p.getEmail());
		/*
		System.out.println("id : " + p.getId() + " pwd : " + p.getPwd() + " name : " + p.getName() + " age : " + p.getAge()
							+ " gender :" + p.getGender() + " phone : " + p.getPhone() + " email : "  + p.getEmail());
	
		//p.setPhone("010-2222-3333");
		
		//System.out.println(p.getPhone());
		*/
		
		//System.out.println(p.information());
		
		//Scanner sc = new Scanner(System.in);
		
		//System.out.print("변경할 이름 : ");
		//String name = sc.nextLine();
		
		//p.setName(name); // 변경 요청
		
		//System.out.println(p.information());
		
		
		
	}
}	
	
