package com.hw1.run;

import com.hw1.model.vo.Product;

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product ssn = new Product("ssgnote9","갤럭시노트9","경기도 수원", 960_000, 10.0);
		Product lgn = new Product("lgxnote5","LG스마트폰5","경기도 평택", 780_000, 0.7);
		Product ktn = new Product("ktsnote3","KT스마트폰3","서울시 강남", 250_000, 0.3);
		
		System.out.println(ssn.information());
		System.out.println(lgn.information());
		System.out.println(ktn.information());
		
		System.out.println("=====================================================");
		
		ssn.setPrice(1_200_000);
		lgn.setPrice(1_200_000);
		ktn.setPrice(1_200_000);
		
		ssn.setTax(0.05);
		lgn.setTax(0.05);
		ktn.setTax(0.05);
		
		System.out.println(ssn.information());
		System.out.println(lgn.information());
		System.out.println(ktn.information());
		
		System.out.println("=====================================================");
		
		int ssnRprice = ssn.realPrice(ssn.getPrice(), ssn.getTax());
		int lgnRprice = lgn.realPrice(lgn.getPrice(), lgn.getTax());
		int ktnRprice = ktn.realPrice(ktn.getPrice(), ktn.getTax());
		
		System.out.println("상품명 = " + ssn.getProductname() + "\n부가세 포함 가격  = " + ssnRprice + "원");
		System.out.println("상품명 = " + lgn.getProductname() + "\n부가세 포함 가격  = " + lgnRprice + "원");
		System.out.println("상품명 = " + ktn.getProductname() + "\n부가세 포함 가격  = " + ktnRprice + "원");
		
		
	}

}
