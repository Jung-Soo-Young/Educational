package Test;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		boolean run = true;
		
		int balance = 0;
		
		Scanner scan = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------------");
			System.out.println("1.입금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------");
			System.out.printf("선택 > ");
			
			int num = scan.nextInt();
			
			if (num == 1) {
				System.out.printf("예금액 > ");
				int input = scan.nextInt();
				balance += input;
			} else if (num == 2) {
				System.out.printf("출금액 > ");
				int output = scan.nextInt();
				balance -= output;
			} else if (num == 3) {
				System.out.printf("잔고 : %d", balance);
				System.out.println();
			} else if (num == 4) {
				System.out.println("종료 !");
				break;
			} else {
				System.out.println("잘못 입력하였습니다.");
			}
		}
	}
}
