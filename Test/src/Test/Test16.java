package Test;

import java.util.Scanner;

public class Test16 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		String[] menuNmArr = {"�ݶ�", "���̴�", "ȯŸ", "��������Ʈ", "�����ֽ�", "�����ֽ�"};
		int[] menuPriceArr = {1000, 1200, 1300, 1500, 2000, 3000};
		
		Eat[] eatArr = new Eat[menuNmArr.length];
		
		for(int i=0; i<menuNmArr.length; i++) {
			Eat eat = new Eat();
			eat.nm = menuNmArr[i];
			eat.price = menuPriceArr[i];
			
			eatArr[i] = eat;
		}
		printMenu(eatArr);
	}
	
	public static void printMenu(Eat[] eatArr) {
		String str = "0. �޴� \n";
		for(int i=0; i<eatArr.length; i++) {
			Eat item = eatArr[i];
			str += String.format("%d. %s (%,d��)\n", i+1, item.nm, item.price);
		}
		System.out.println(str);
	}
}
