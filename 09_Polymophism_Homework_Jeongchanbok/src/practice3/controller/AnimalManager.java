package practice3.controller;

import practice3.model.vo.*;

public class AnimalManager {

	public static void main(String[] args) {

		// Animal Ÿ���� ��ü�迭 ũ�� 5�� ����  
		Animal[] arr = new Animal[5];
		
		//�� �ε����� �������� Dog��ü �Ǵ� Cat��ü�� ���� 
		// (�̶�, �Ű����� �����ڸ� �̿��Ͽ� ����) 
		arr[0] = new Dog("�ٵ���","�ð��ں���",15);
		arr[1] = new Cat("����","�Ӱ��","�縷","White");
		arr[2] = new Dog("������","Ǫ��",13);
		arr[3] = new Cat("����","��","����Ʈ","Black");
		arr[4] = new Dog("����","�����ڱ�",20);
		
		// �ݺ����� ���ؼ� �ش� �迭�� 0�� �ε������� ������ �ε���������  
		// ��ü�� speak() �޼ҵ� ȣ�� 
		
		for(Animal a : arr ) {
			a.speak();;
		}
			
			
		
			
		
		
		
	}

}
