package com.hw2.model.vo;

public class Rectangle extends Point {

	private int width;
	private int height;
	
	
	public Rectangle() {};
	
	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public void draw() {
		
		double area = width * height;
		double round = 2 * (width + height);
		
		
		super.draw();
		
		// ���� : �ʺ� * ����
		System.out.printf("���� : %.1f ", area);
		// �ѷ� : 2 * (�ʺ� + ����)
		System.out.printf("\n�ѷ� : %.1f \n", round);
		
		
	}
	
}
