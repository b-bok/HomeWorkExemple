package com.hw1.model.dao;

import java.util.Scanner;

public class FileDao {
	
	Scanner sc = new Scanner(System.in);
	
	public FileDao() {}
	
	public void fileSave() {
		
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			
			// “파일에 저장할 내용을 반복해서 입력하시오("exit"을 입력하면 내용 입력 끝) :”
			System.out.print("파일에 저장할 내용을 반복해서 입력하시오(\"exit\"을 입력하면 내용 입력 끝) : ");
			
			String exit = sc.nextLine();
			
			if(exit.equals(exit)) {
				break;
			}else {
				
			}
			
			
			
			
			
			
			// 값을 Scanner로 입력 받고 해당 입력 값이 “exit”일 경우 반복문 빠져나감
			// 아닐 경우 sb에 추가
		}
	}

}
