package com.hw1.model.dao;

import java.io.*;
import java.util.Scanner;

public class FileDao {
	
	Scanner sc = new Scanner(System.in);
	
	public FileDao() {}
	
	public void fileSave() {
		
		StringBuilder sb = new StringBuilder();
		
		
		
		while(true) {
			
			// “파일에 저장할 내용을 반복해서 입력하시오("exit"을 입력하면 내용 입력 끝) :”
			System.out.print("파일에 저장할 내용을 반복해서 입력하시오(\"exit\"을 입력하면 내용 입력 끝) : ");
			String text = sc.nextLine();	
			
			// 값을 Scanner로 입력 받고 해당 입력 값이 “exit”일 경우 반복문 빠져나감			
			if(text.equals("exit")) {
				break;
			}else {
				// 아닐 경우 sb에 추가
				// String text에 이어서 입력 받는다.
				sb.append(text);
				
			}

		}
		
		// “저장하시겠습니까? (y/n)” 
		System.out.print("저장하시겠습니까? (y/n) : ");
		//입력 값을 모두 소문자로 바꾼다.
		String yn = sc.nextLine().toLowerCase();
		
		// 입력 받은 값이 대문자이든 소문자이든 상관없이 “y”이면, 
		if(yn.equals("y")) {
			// 저장할 파일명을 입력 받음 
			System.out.print("저장할 파일명 입력 : ");
			String fileName = sc.nextLine();
			
			// 확장자를 붙여주는 메소드

			
			
			 // BufferedWriter와 FileWriter 스트림 사용
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
				
				// “입력받은 파일명.txt” 파일에 해당 sb 데이터출력
				bw.write(sb.toString());
				
				// “입력받은 파일명.txt 파일에 성공적으로 저장하였습니다.” 콘솔창 출력
				System.out.println(fileName + ".txt 파일에 성공적으로 저장하였습니다.");
				
				} catch( IOException e ) {
				e.printStackTrace();
				 }
				
		}else {
			// 입력 받은 값이 y가 아니면 “다시 메뉴로 돌아갑니다.” 출력하고 메뉴로..
			System.out.println("다시메뉴로 돌아갑니다."); return;
		}
		
	}
	
	public void fileOpen() {
		
		// “열기 할 파일명 : “
		System.out.print("열기 할 파일명 : ");
		String openFileName = sc.nextLine();
		
		// 확장자를 붙여주는 메소드

		
		// 파일명을 Scanner로 입력 받아, BufferedReader와 FileReader 스트림 사용
		try(BufferedReader br = new BufferedReader(new FileReader(openFileName))) {
		// try구문 안에서 readLine()메소드를 통해 한줄씩 콘솔로 입력받은 값 출력	
		String value = null;
		while((value = br.readLine()) != null) {
			System.out.println(value);
		}
			

		}catch( FileNotFoundException e ) {
		// 존재하지 않은 파일 명 입력했을 때 해당 예외처리구문이 실행됨
			System.out.println("존재하는 파일이 없습니다.");
		// “존재하는 파일이 없습니다.”
		}catch( IOException e ) {
		e.printStackTrace();
		}
	}

	
	public void fileEdit() {
		
		StringBuilder sb = new StringBuilder();
		
		// “수정 할 파일명 : “
		System.out.print("수정 할 파일명 : ");
		String editFileName = sc.nextLine();
		
		String edit = "";
		
		
		// 파일명을 입력받아 BufferedReader와 BufferedWriter, FileReader와 FileWriter
		// 스트림 사용
		// 파일명을 Scanner로 입력 받아, BufferedReader와 FileReader 스트림 사용
		try(BufferedReader br = new BufferedReader(new FileReader(editFileName))) {
		// try구문 안에서 readLine()메소드를 통해 한줄씩 콘솔로 입력받은 값 출력	
		String value = null;
		while((value = br.readLine()) != null) {
			System.out.println(value);
			edit += value;
		}
			

		}catch( FileNotFoundException e ) {
		// 존재하지 않은 파일 명 입력했을 때 해당 예외처리구문이 실행됨
			System.out.println("존재하는 파일이 없습니다.");
		// “존재하는 파일이 없습니다.”
			return;
		}catch( IOException e ) {
		e.printStackTrace();
		}
				
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(editFileName))) {
			
			while(true) {
				// “파일에 추가할 내용을 입력하시오 : “	
				System.out.print("파일에 추가할 내용을 입력하시오\"exit\"를 입력하면 추가 입력 끝 : ");
				String editplus = sc.nextLine();
				edit = edit + editplus;
				// 사용자가 “exit”을 입력하기 전까지 내용을 StringBuilder에 담기
				if(edit.contains("exit")) {
					break;
				}else {
					sb.append(edit);
				}
			}
			
			bw.write(sb.toString());
			
			System.out.println("변경된 내용을 파일에 추가하시겠습니까? (y/n)");			
			// “변경된 내용을 파일에 추가하시겠습니까? (y/n)”
			String yn = sc.nextLine().toLowerCase();
			
			// 입력 받은 값이 대문자이든 소문자이든 상관없이 “y”이면,
			if(yn.equals("y")) {
				
				// “입력받은 파일명.txt 파일의의 내용이 변경되었습니다.”
				System.out.println(editFileName + ".txt 파일의 내용이 변경되었습니다.");
			}

		}catch( FileNotFoundException e ) {
		e.printStackTrace();
		}catch( IOException e ) {
		e.printStackTrace();
		}
	}

}
