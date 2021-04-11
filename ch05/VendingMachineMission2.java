package sec06.ch05;

import java.util.Scanner;

public class VendingMachineMission2 {
	public static void main(String[] args) {
		
		/* 아래는 콘솔에 출력해야 하는 내용		  
		
		  <메뉴>
		  0. 종료
		  1. 콜라 (1,000원)
		  2. 사이다 (1,200원)
		  3. 환타 (1,300원)
		  선택 > 1
		  콜라를 선택하셨습니다.
		  
		  선택 > 2
		  사이다를 선택하셨습니다.
		  
		  선택 > 4
		  잘 못 선택하셨습니다.
		  
		  선택 > 0
		  종료 - 사용한 금액은 : 2,300원
		  
		 */

		Scanner scanner = new Scanner(System.in); // ctrl + shift + o -> 단축키
		
		int balance = 0;
		
		String[] menuNumArr = {"콜라", "사이다", "환타"};
		int[] menuPriceArr = {1000, 1200, 1300};
		
		System.out.println("<메뉴>");
		for(int i=0; i<menuNumArr.length; i++) {
			System.out.printf("%d. %s (%,d원)", (i+1), menuNumArr[i], menuPriceArr[i]);
			System.out.println();
		}
		
		while(true) {
			
			System.out.printf("선택 > ");
			
			int num = scanner.nextInt();
			
			if(num == 0) {
				System.out.printf("종료! - 사용한 금액은 : %,d원 입니다.", balance);
				break;
			} else if (num >= 1 && num <= menuNumArr.length) {
				System.out.printf("%s를 선택하셨습니다.\n", menuNumArr[num-1]); // if문과 배열을 이용한 출력방법
				balance = balance + menuPriceArr[num-1];
			} else {
				System.out.println("잘 못 선택하셨습니다.\n");
			}
		}
		scanner.close();
	}
}
