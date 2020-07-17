package com.hw2.model.vo;

public class Circle extends Point{

	private int radius; //������
	
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
		
		//���� ����, �ѷ� ���� ����ϴ� �޼ҵ�
		// ���� : PI * ������ * ������
		System.out.printf("���� : %.1f ", area);
		// �ѷ� : PI * ������ * 2
		System.out.printf("\n�ѷ� : %.1f \n", round);

		
	}
}
