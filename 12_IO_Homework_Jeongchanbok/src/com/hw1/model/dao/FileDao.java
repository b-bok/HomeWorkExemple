package com.hw1.model.dao;

import java.io.*;
import java.util.Scanner;

public class FileDao {
	
	Scanner sc = new Scanner(System.in);
	
	public FileDao() {}
	
	public void fileSave() {
		
		StringBuilder sb = new StringBuilder();
		
		
		
		while(true) {
			
			// �����Ͽ� ������ ������ �ݺ��ؼ� �Է��Ͻÿ�("exit"�� �Է��ϸ� ���� �Է� ��) :��
			System.out.print("���Ͽ� ������ ������ �ݺ��ؼ� �Է��Ͻÿ�(\"exit\"�� �Է��ϸ� ���� �Է� ��) : ");
			String text = sc.nextLine();	
			
			// ���� Scanner�� �Է� �ް� �ش� �Է� ���� ��exit���� ��� �ݺ��� ��������			
			if(text.equals("exit")) {
				break;
			}else {
				// �ƴ� ��� sb�� �߰�
				// String text�� �̾ �Է� �޴´�.
				sb.append(text);
				
			}

		}
		
		// �������Ͻðڽ��ϱ�? (y/n)�� 
		System.out.print("�����Ͻðڽ��ϱ�? (y/n) : ");
		//�Է� ���� ��� �ҹ��ڷ� �ٲ۴�.
		String yn = sc.nextLine().toLowerCase();
		
		// �Է� ���� ���� �빮���̵� �ҹ����̵� ������� ��y���̸�, 
		if(yn.equals("y")) {
			// ������ ���ϸ��� �Է� ���� 
			System.out.print("������ ���ϸ� �Է� : ");
			String fileName = sc.nextLine();
			
			// Ȯ���ڸ� �ٿ��ִ� �޼ҵ�

			
			
			 // BufferedWriter�� FileWriter ��Ʈ�� ���
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
				
				// ���Է¹��� ���ϸ�.txt�� ���Ͽ� �ش� sb ���������
				bw.write(sb.toString());
				
				// ���Է¹��� ���ϸ�.txt ���Ͽ� ���������� �����Ͽ����ϴ�.�� �ܼ�â ���
				System.out.println(fileName + ".txt ���Ͽ� ���������� �����Ͽ����ϴ�.");
				
				} catch( IOException e ) {
				e.printStackTrace();
				 }
				
		}else {
			// �Է� ���� ���� y�� �ƴϸ� ���ٽ� �޴��� ���ư��ϴ�.�� ����ϰ� �޴���..
			System.out.println("�ٽø޴��� ���ư��ϴ�."); return;
		}
		
	}
	
	public void fileOpen() {
		
		// ������ �� ���ϸ� : ��
		System.out.print("���� �� ���ϸ� : ");
		String openFileName = sc.nextLine();
		
		// Ȯ���ڸ� �ٿ��ִ� �޼ҵ�

		
		// ���ϸ��� Scanner�� �Է� �޾�, BufferedReader�� FileReader ��Ʈ�� ���
		try(BufferedReader br = new BufferedReader(new FileReader(openFileName))) {
		// try���� �ȿ��� readLine()�޼ҵ带 ���� ���پ� �ַܼ� �Է¹��� �� ���	
		String value = null;
		while((value = br.readLine()) != null) {
			System.out.println(value);
		}
			

		}catch( FileNotFoundException e ) {
		// �������� ���� ���� �� �Է����� �� �ش� ����ó�������� �����
			System.out.println("�����ϴ� ������ �����ϴ�.");
		// �������ϴ� ������ �����ϴ�.��
		}catch( IOException e ) {
		e.printStackTrace();
		}
	}

	
	public void fileEdit() {
		
		StringBuilder sb = new StringBuilder();
		
		// ������ �� ���ϸ� : ��
		System.out.print("���� �� ���ϸ� : ");
		String editFileName = sc.nextLine();
		
		String edit = "";
		
		
		// ���ϸ��� �Է¹޾� BufferedReader�� BufferedWriter, FileReader�� FileWriter
		// ��Ʈ�� ���
		// ���ϸ��� Scanner�� �Է� �޾�, BufferedReader�� FileReader ��Ʈ�� ���
		try(BufferedReader br = new BufferedReader(new FileReader(editFileName))) {
		// try���� �ȿ��� readLine()�޼ҵ带 ���� ���پ� �ַܼ� �Է¹��� �� ���	
		String value = null;
		while((value = br.readLine()) != null) {
			System.out.println(value);
			edit += value;
		}
			

		}catch( FileNotFoundException e ) {
		// �������� ���� ���� �� �Է����� �� �ش� ����ó�������� �����
			System.out.println("�����ϴ� ������ �����ϴ�.");
		// �������ϴ� ������ �����ϴ�.��
			return;
		}catch( IOException e ) {
		e.printStackTrace();
		}
				
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(editFileName))) {
			
			while(true) {
				// �����Ͽ� �߰��� ������ �Է��Ͻÿ� : ��	
				System.out.print("���Ͽ� �߰��� ������ �Է��Ͻÿ�\"exit\"�� �Է��ϸ� �߰� �Է� �� : ");
				String editplus = sc.nextLine();
				edit = edit + editplus;
				// ����ڰ� ��exit���� �Է��ϱ� ������ ������ StringBuilder�� ���
				if(edit.contains("exit")) {
					break;
				}else {
					sb.append(edit);
				}
			}
			
			bw.write(sb.toString());
			
			System.out.println("����� ������ ���Ͽ� �߰��Ͻðڽ��ϱ�? (y/n)");			
			// ������� ������ ���Ͽ� �߰��Ͻðڽ��ϱ�? (y/n)��
			String yn = sc.nextLine().toLowerCase();
			
			// �Է� ���� ���� �빮���̵� �ҹ����̵� ������� ��y���̸�,
			if(yn.equals("y")) {
				
				// ���Է¹��� ���ϸ�.txt �������� ������ ����Ǿ����ϴ�.��
				System.out.println(editFileName + ".txt ������ ������ ����Ǿ����ϴ�.");
			}

		}catch( FileNotFoundException e ) {
		e.printStackTrace();
		}catch( IOException e ) {
		e.printStackTrace();
		}
	}

}
