package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.*;

public class Run2 {

		public static void main(String[] args) {
			// 객체 생성
			Product goods1 = new Product();
			
			System.out.println(goods1.hashCode());
			
			System.out.println(goods1.information());
			
			System.out.println("===== 입력 후 =====");
			
			goods1.setpName("버블");
			goods1.setPrice(200_000);
			goods1.setBrand("LG");
			
			System.out.println(goods1.information());

			
			Product goods2 = new Product();
			
			goods2.setpName("사과폰");
			goods2.setPrice(1_000_000);
			goods2.setBrand("애플");
			
			System.out.println(goods2.information());
			
		}
}
	