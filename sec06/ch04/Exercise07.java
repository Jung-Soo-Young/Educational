package sec06.ch04;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
		boolean run = true;
		
		int balance = 0; // 잔고 변수 = 0 으로 시작
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------");
			System.out.print("선택> ");
			
			int num = scanner.nextInt();
			
			if(num == 1) {
				System.out.print("예금액> ");
				int in = scanner.nextInt();
				balance = balance + in; // 잔고변수에 예금액 저장
			} else if (num == 2) {
				System.out.print("출금액> ");
				int out = scanner.nextInt();
				balance = balance - out; // 잔고변수에 출금액 저장
			} else if (num == 3) {
				System.out.print("잔고> ");
				System.out.println(balance); // 잔고변수 출력
			} else if (num == 4) {
				break;
			} else {
				System.out.println("1 ~ 4 까지의 번호를 입력해주세요.");
			}
		}
		System.out.println("프로그램 종료!");
	}
}
