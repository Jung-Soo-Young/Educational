package sec06.ch04;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
		boolean run = true;
		
		int balance = 0; // �ܰ� ���� = 0 ���� ����
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("-----------------------");
			System.out.print("����> ");
			
			int num = scanner.nextInt();
			
			if(num == 1) {
				System.out.print("���ݾ�> ");
				int in = scanner.nextInt();
				balance = balance + in; // �ܰ����� ���ݾ� ����
			} else if (num == 2) {
				System.out.print("��ݾ�> ");
				int out = scanner.nextInt();
				balance = balance - out; // �ܰ����� ��ݾ� ����
			} else if (num == 3) {
				System.out.print("�ܰ�> ");
				System.out.println(balance); // �ܰ��� ���
			} else if (num == 4) {
				break;
			} else {
				System.out.println("1 ~ 4 ������ ��ȣ�� �Է����ּ���.");
			}
		}
		System.out.println("���α׷� ����!");
	}
}
