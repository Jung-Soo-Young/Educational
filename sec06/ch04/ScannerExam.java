package sec06.ch04;

import java.util.Scanner;

public class ScannerExam {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요 : ");
		int age = scan.nextInt();
		
		System.out.printf("당신의 나이는 %d살 입니다.", age);
		System.out.println("끝!");
	}
}
