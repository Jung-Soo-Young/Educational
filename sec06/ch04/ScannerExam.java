package sec06.ch04;

import java.util.Scanner;

public class ScannerExam {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = scan.nextInt();
		
		System.out.printf("����� ���̴� %d�� �Դϴ�.", age);
		System.out.println("��!");
	}
}
