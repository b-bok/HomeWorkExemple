package mvc.controller;

import java.util.*;

import mvc.model.vo.Book;

public class BookManager {

	ArrayList<Book> bookList = new ArrayList<Book>();
	
	public void insertBook(Book book) {
		
		
		
		int lastNo = 0;
		
		try {
			
			
			lastNo = bookList.get(bookList.size() -1).getbNo() +1;
			// 마지막 도서 번호 +1;
				
		} catch(ArrayIndexOutOfBoundsException e) {
			
			lastNo =1;
		
				}
		
		book.setbNo(lastNo);
		bookList.add(book);
		
	}
			
			
			

			
			
			

	
		
		
		
	
	
	public int deleteBook(int bNo) {
		
		int result = 0;
		
		for(int i = 0; i<bookList.size(); i++ ) {
			
			if(bookList.get(i).getbNo() == bNo) {
				
				bookList.remove(i);
				
				result = 1;
			}
			
		}
		
		return result;
	}
	
	public ArrayList<Book> searchBook(String title) {
		
		
		ArrayList<Book> searchList = new ArrayList<Book>();
		
		for(int i = 0; i<bookList.size(); i++) {
			
			if(bookList.get(i).getTitle().contains(title)) {
				
				searchList.add(bookList.get(i));
				
				
			}
			
		}
		
		return searchList;
		
	}
	
	public ArrayList<Book> selectList() {
		
		return bookList;
		
		
	}
	
}
