package Test;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int speed = 0;
		
		System.out.println("---------------------");
		System.out.println("1.����  | 2.���� | 3.����");
		System.out.println("---------------------");
		
		while(true) {
			System.out.print("���� : ");
			int inputVal = scan.nextInt();
			
			if(inputVal == 1) {
				speed++;
			} else if (inputVal == 2) {
				speed--;
			} else if (inputVal == 3) {
				break;
			} else {
				System.out.println("1, 2, 3���� �Է����ּ���!");
				continue;
			}
			System.out.println("���� �ӵ� : " + speed);
		}
		System.out.println("��!");
		scan.close();
	}
}
