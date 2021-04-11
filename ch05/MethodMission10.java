package sec06.ch05;

import java.util.Scanner;

public class MethodMission10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[] menuNmArr = {"콜라", "사이다", "환타", "스프라이트", "망고주스", "포도주스"};
		int[] menuPriceArr = {1000, 1200, 1300, 1500, 2000, 3000};
		
		
		Drink[] drinkArr = new Drink[menuNmArr.length];
		
		// Drink drink = new Drink(); -> for문 바깥에 있을 경우 마지막 값이 계쏙 저장된다.
		// drink nm, price 새로운 클래스에 선언
		for(int i=0; i<drinkArr.length; i++) {
			Drink drink = new Drink();
			drink.nm = menuNmArr[i];
			drink.price = menuPriceArr[i];
			
			drinkArr[i] = drink;
		}
		
		printMenu3(drinkArr);
	}
	
/*		
		for(int i=0; i<drinkArr.length; i++) {
			Drink drink = drinkArr[i];
			System.out.printf("%d. %s (%,d원)\n", i+1, drink.nm, drink.price);
		}
		
		printMenu(menuNmArr, menuPriceArr);
		boolean run = true;
		while(run) {
			System.out.print("선택 > ");
			int selectedNum = scan.nextInt();			
		}
		System.out.println("끝");
	}
*/	
	
	public static void printMenu3(Drink[] arr) {
		String str = "<메뉴>\n";
		for(int i=0; i<arr.length; i++) {
			Drink item = arr[i];
			str += String.format("%d. %s (%,d원)\n", i+1, item.nm, item.price);
		}
		System.out.println(str);
	}
	
	public static void printMenu2(String[] nmArr, int[] priceArr) { // 방법 2
		String str = "<메뉴>\n";
		for(int i=0; i<nmArr.length; i++) {
			str += String.format("%d. %s (%,d원)\n", i+1, nmArr[i], priceArr[i]);
		}
		System.out.println(str);
	}
	
	public static void printMenu(String[] menuNmArr, int[] menuPriceArr) {
			System.out.println("<메뉴>");
			for(int i=0; i<menuNmArr.length; i++) {
				System.out.printf("%d. %s (%,d원)\n", i+1, menuNmArr[i], menuPriceArr[i]);
			}

	}

}
