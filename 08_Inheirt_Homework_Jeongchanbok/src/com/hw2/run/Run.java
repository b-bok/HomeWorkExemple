package com.hw2.run;
import com.hw2.model.vo.*;
public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ũ�Ⱑ 2�� Circle, Rectangle ���� ��ü �迭 �Ҵ�
		Circle[] cArr = new Circle[2];
		Rectangle[] rArr = new Rectangle[2];
		
		
		// ���� ��� �����͸� �����Ͽ� ���� �ʱ�ȭ
		cArr[0] = new Circle(1,2,3);
		cArr[1] = new Circle(3,3,4);
		
		rArr[0] = new Rectangle(-1,-2,5,2);
		rArr[1] = new Rectangle(-2,5,2,8);
		
		// �� ������ draw �޼ҵ� ���� --> ���� for�� �̿��ؼ�
		System.out.println("===== circle =====");
		for(Circle a : cArr) {
			a.draw();
		
		}
		
		// �� ������ draw �޼ҵ� ���� --> ���� for�� �̿��ؼ�
		System.out.println("===== rectangle =====");
		for(Rectangle a : rArr) {
			a.draw();
		
		}
		
	}

}
