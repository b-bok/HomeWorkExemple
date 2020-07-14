package com.hw1.run;

import com.hw1.model.vo.*;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Book b1 = new Book();
		Book b2 = new Book("자바의정석", 20000, 0.2, "윤상섭");
		
		
		System.out.println(b1.information());
		System.out.println(b2.information());
		System.out.println("=============================");
		
		b1.setTitle("C언어");
		b1.setPrice(30000);
		b1.setDiscountRate(0.1);
		b1.setAuthor("홍길동");
		
		System.out.println("수정된 결과 확인\n" + b1.information());
		System.out.println("=============================");
		
		int b1Rprice = b1.discountPrice(b1.getPrice(), b1.getDiscountRate());
		int b2Rprice = b2.discountPrice(b2.getPrice(), b2.getDiscountRate());
		
		System.out.println("도서명 = " + b1.getTitle() + "\n할인된 가격  = " + b1Rprice + "원");
		System.out.println("도서명 = " + b2.getTitle() + "\n할인된 포함 가격  = " + b2Rprice + "원");
		
	}

}
