package com.hw1.model.dao;

import java.util.Scanner;

public class FileDao {
	
	Scanner sc = new Scanner(System.in);
	
	public FileDao() {}
	
	public void fileSave() {
		
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			
			// �����Ͽ� ������ ������ �ݺ��ؼ� �Է��Ͻÿ�("exit"�� �Է��ϸ� ���� �Է� ��) :��
			System.out.print("���Ͽ� ������ ������ �ݺ��ؼ� �Է��Ͻÿ�(\"exit\"�� �Է��ϸ� ���� �Է� ��) : ");
			
			String exit = sc.nextLine();
			
			if(exit.equals(exit)) {
				break;
			}else {
				
			}
			
			
			
			
			
			
			// ���� Scanner�� �Է� �ް� �ش� �Է� ���� ��exit���� ��� �ݺ��� ��������
			// �ƴ� ��� sb�� �߰�
		}
	}

}
