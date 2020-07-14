package com.hw1.model.vo;

public class Book {
	//鞘靛何
		private String title; 
		private int price;
		private double discountRate;
		private String author;
		
		//积己磊何
		
		public Book() {}
		
		public Book(String title,int price,double discountRate,String author) {
			this.title = title;
			this.price = price;
			this.discountRate = discountRate;
			this.author = author;
			
		}

		
		// getter setter 皋家靛
		
		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		public double getDiscountRate() {
			return discountRate;
		}

		public void setDiscountRate(double discountRate) {
			this.discountRate = discountRate;
		}

		public String getAuthor() {
			return author;
		}

		public void setAuthor(String author) {
			this.author = author;
		}
		
		
		//皋家靛 何
		
		public String information() {
			return title + " 	" + price + " 	" + discountRate + " 	" + author; 
		}
		
		
		public int discountPrice(int price,double discountRate) {
			
			return price - (int)(price * discountRate);
			
		}
}
