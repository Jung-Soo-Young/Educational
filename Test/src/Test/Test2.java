package Test;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		boolean run = true;
		
		int balance = 0;
		
		Scanner scan = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------------");
			System.out.println("1.�Ա� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("---------------------------");
			System.out.printf("���� > ");
			
			int num = scan.nextInt();
			
			if (num == 1) {
				System.out.printf("���ݾ� > ");
				int input = scan.nextInt();
				balance += input;
			} else if (num == 2) {
				System.out.printf("��ݾ� > ");
				int output = scan.nextInt();
				balance -= output;
			} else if (num == 3) {
				System.out.printf("�ܰ� : %d", balance);
				System.out.println();
			} else if (num == 4) {
				System.out.println("���� !");
				break;
			} else {
				System.out.println("�߸� �Է��Ͽ����ϴ�.");
			}
		}
	}
}
