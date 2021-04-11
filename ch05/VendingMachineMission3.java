package sec06.ch05;

import java.util.Scanner;

public class VendingMachineMission3 {
	public static void main(String[] args) {
		
		/* 아래는 콘솔에 출력해야 하는 내용		  
		
		  돈을 주입해 주세요 : 3000
		  
		  <메뉴>
		  0. 종료
		  1. 콜라 (1,000원)
		  2. 사이다 (1,200원)
		  3. 환타 (1,300원)
		  
		  선택 > 1
		  콜라를 선택하셨습니다. (남은 금액 2,000원)
		  
		  선택 > 2
		  사이다를 선택하셨습니다. (남은 금액 700원)
		  
		  선택 > 4
		  잘 못 선택하셨습니다.
		  
		  선택 > ?
		  금액이 부족합니다. (남은 금액 700원)
		  
		  선택 > 0
		  종료 - 남은 금액 : 700원
		  
		 */

		Scanner scanner = new Scanner(System.in); // ctrl + shift + o -> 단축키
		System.out.printf("돈을 주입해주세요 : ");
		int insertMoney = scanner.nextInt();

		String[] menuNumArr = {"콜라", "사이다", "환타"};
		int[] menuPriceArr = {1000, 1200, 1300};

		System.out.println();
		System.out.println("<메뉴>");
		System.out.println("0. 종료");

		for(int i=0; i<menuNumArr.length; i++) {
			System.out.printf("%d. %s (%,d원)", (i+1), menuNumArr[i], menuPriceArr[i]);
			System.out.println();
		}
		
		while(true) {
			System.out.printf("선택 > ");
			
			int num = scanner.nextInt();
			
			if(num < 0 || num > menuNumArr.length) {
				System.out.println("잘 못 선택하였습니다.");
				continue;
			}
			int selectedIdx = num -1; // 배열 값 변수 선언
			if(num == 0) {
				System.out.print("종료 !");
				break;
			} else if (insertMoney < menuPriceArr[selectedIdx]) { // 입력한 값이 배열에 저장된 값보다 작을 때
				System.out.print("금액이 부족합니다.");
			} else {
				System.out.printf("%s를 선택하셨습니다.", menuNumArr[selectedIdx]);
				insertMoney = insertMoney - menuPriceArr[selectedIdx]; // 입력한 값에서 금액을 빼고 저장
			}
			System.out.printf(" (남은 금액 : %,d)\n", insertMoney);
		}
		scanner.close();
	}
}
