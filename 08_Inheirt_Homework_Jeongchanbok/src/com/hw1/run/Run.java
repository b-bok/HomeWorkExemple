package com.hw1.run;
import java.util.Scanner;
import com.hw1.model.vo.*;

public class Run {

	static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[] args) {

		// 3���� �л� ������ ����� �� �ְ� ��ü �迭 �Ҵ� (Student[])
		Student[] sArr = new Student[3];
		
		// ���� ��뵥���� �����Ͽ� 3���� �л� ���� �ʱ�ȭ
		sArr[0] = new Student("ȫ�浿", 20, 178.2,70.0, 1,"�����ý����а�");
		sArr[1] = new Student("�踻��", 21, 187.3,80.0, 2,"�濵�а�");
		sArr[2] = new Student("������", 23, 167.0,45.0, 4,"������Ű��а�");
		
		// ���� �л� ���� ��� ��� 
		for(int i =0; i<sArr.length;i++) {
			
			System.out.println(sArr[i].information());
		}
		
		// �ִ� 10���� ��� ������ ����� �� �ְ� �迭�� �Ҵ� (Employee[])
		Employee[] eArr = new Employee[10];
		// ������� ������ Ű����� ��� �Է� �ް� --> while(true) ���� �ݺ����� ����
		
		int count = 0;
		
		while(true) {
			
			System.out.print("�̸� : ");
			String name = sc.nextLine();
			
			System.out.print("���� : ");
			int age = sc.nextInt();
			
			sc.nextLine();
			System.out.print("Ű : ");
			double height = sc.nextDouble();
			
			sc.nextLine();
			System.out.print("������ : ");
			double weight = sc.nextDouble();
			
			sc.nextLine();
			System.out.print("�޿� : ");
			int salary = sc.nextInt();
			
			sc.nextLine();
			System.out.print("�μ� : ");
			String dept = sc.nextLine();
			
			// �� �� �߰� �� ������ ī��Ʈ��
			
			
			count++;
			
			for(int i = 0; i<count; i++) {
				// �Է¹��� �������� ������ �Ű����� �����ڸ� �̿��Ͽ� ��ü�迭�� ��ü ����
				// �Էµ� ������ ���� ���� �� �߰��մϴ�.
				if(eArr[i] == null) {
					
					eArr[i] = new Employee(name, age, height, weight, salary, dept);
				}
	
			}
			
			// ��� �߰��� ������ �����, ��ҹ��� ������� ��y���̸� ��� ��ü �߰�
			System.out.print("��� �߰��Ͻðڽ��ϱ�? : ");
			char yn = sc.nextLine().charAt(0);
			
			if(yn == 'y' || yn == 'Y') {
				
				continue;
				
			// ��n���� ��� �� �̻� �׸� �Է� �޵���..	
			}else if (yn == 'n') {
				for(int i =0; i<count;i++) {
					// �迭�� ��� ������� ������ ��� ���
					System.out.println(eArr[i].information());
					
				}
				break;
			}

		}

	}

}
