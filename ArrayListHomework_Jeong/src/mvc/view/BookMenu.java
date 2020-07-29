package mvc.view;

import java.util.ArrayList;
import java.util.Scanner;

import mvc.controller.BookManager;
import mvc.model.vo.Book;

public class BookMenu {

	private Scanner sc = new Scanner(System.in);
	private BookManager bm = new BookManager();
	
	public void mainMenu() {
		
		while(true) {
			
			System.out.println("\n*** ���� ���� ���α׷� ***");
			System.out.println("1. �� ���� �߰�");
			System.out.println("2. ���� ����");
			System.out.println("3. ���� �˻� ���");
			System.out.println("4. ��ü ���");
			System.out.println("0. ������");
			System.out.print("�޴� ��ȣ ���� : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			switch(num) {
			case 1 : insertBook(); break;
			case 2 : deleteBook(); break;
			case 3 : searchBook(); break;
			case 4 : selectList(); break;
			case 0 : System.out.println("���α׷� ����"); return;
				
			}
		}

	}

	private void insertBook() {
	
		System.out.print("���� ����  : ");
		String title = sc.nextLine();
		
		System.out.print("���� �帣 (1:�ι� / 2:�ڿ����� / 3:�Ƿ� / 4:��Ÿ) : ");
		int category = sc.nextInt();
		sc.nextLine();
		
		
		
		System.out.print("���� ���� : ");
		String author = sc.nextLine();
		
		Book book = new Book(title,category,author);
		
		bm.insertBook(book);
		
		
		
	}

	private void deleteBook() {
		
		System.out.print("���� ��ȣ : ");
		int bNo = sc.nextInt();
		
		int result = bm.deleteBook(bNo);
	
		if(result == 1 ) {
			System.out.println("���������� ����");
		}else if (result == 0) {
			System.out.println("������ ������ �������� �ʽ��ϴ�.");
		}
		
		
	}

	private void searchBook() {
		
		System.out.print("���� ���� : ");
		String title = sc.nextLine();
		
		ArrayList<Book> searchList = bm.searchBook(title);
		
		if(searchList.isEmpty()) {
			
			System.out.println("�˻� ����� �������� �ʽ��ϴ�.");
			
		}else {
			for(Book b : searchList) {
				
				System.out.println(b.toString());
			}
		}

		
	}

	private void selectList() {
		ArrayList<Book>bookList = bm.selectList();
		
		if(bookList.isEmpty()) {
			
			System.out.println("��������� �������� �ʽ��ϴ�.");
		}
		
		
		for(Book b : bookList) {
			
			System.out.println(b);
		}
		
	}
	
	
	
}
