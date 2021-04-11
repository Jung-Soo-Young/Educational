package sec06.ch05;

import java.util.Scanner;

public class MethodMission10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[] menuNmArr = {"�ݶ�", "���̴�", "ȯŸ", "��������Ʈ", "�����ֽ�", "�����ֽ�"};
		int[] menuPriceArr = {1000, 1200, 1300, 1500, 2000, 3000};
		
		
		Drink[] drinkArr = new Drink[menuNmArr.length];
		
		// Drink drink = new Drink(); -> for�� �ٱ��� ���� ��� ������ ���� ��� ����ȴ�.
		// drink nm, price ���ο� Ŭ������ ����
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
			System.out.printf("%d. %s (%,d��)\n", i+1, drink.nm, drink.price);
		}
		
		printMenu(menuNmArr, menuPriceArr);
		boolean run = true;
		while(run) {
			System.out.print("���� > ");
			int selectedNum = scan.nextInt();			
		}
		System.out.println("��");
	}
*/	
	
	public static void printMenu3(Drink[] arr) {
		String str = "<�޴�>\n";
		for(int i=0; i<arr.length; i++) {
			Drink item = arr[i];
			str += String.format("%d. %s (%,d��)\n", i+1, item.nm, item.price);
		}
		System.out.println(str);
	}
	
	public static void printMenu2(String[] nmArr, int[] priceArr) { // ��� 2
		String str = "<�޴�>\n";
		for(int i=0; i<nmArr.length; i++) {
			str += String.format("%d. %s (%,d��)\n", i+1, nmArr[i], priceArr[i]);
		}
		System.out.println(str);
	}
	
	public static void printMenu(String[] menuNmArr, int[] menuPriceArr) {
			System.out.println("<�޴�>");
			for(int i=0; i<menuNmArr.length; i++) {
				System.out.printf("%d. %s (%,d��)\n", i+1, menuNmArr[i], menuPriceArr[i]);
			}

	}

}
