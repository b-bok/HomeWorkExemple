package com.hw2.model.vo;

public class Circle extends Point{

	private int radius; //반지름
	
	public Circle() {};
	
	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
		
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	@Override
	public void draw () {
		
		
		double area = Math.PI*radius*radius;
		double round = Math.PI*radius*2;
		
		
		super.draw();
		
		//원의 면적, 둘레 값을 출력하는 메소드
		// 면적 : PI * 반지름 * 반지름
		System.out.printf("면적 : %.1f ", area);
		// 둘레 : PI * 반지름 * 2
		System.out.printf("\n둘레 : %.1f \n", round);

		
	}
}
