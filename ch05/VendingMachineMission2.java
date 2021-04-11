package sec06.ch05;

import java.util.Scanner;

public class VendingMachineMission2 {
	public static void main(String[] args) {
		
		/* �Ʒ��� �ֿܼ� ����ؾ� �ϴ� ����		  
		
		  <�޴�>
		  0. ����
		  1. �ݶ� (1,000��)
		  2. ���̴� (1,200��)
		  3. ȯŸ (1,300��)
		  ���� > 1
		  �ݶ� �����ϼ̽��ϴ�.
		  
		  ���� > 2
		  ���̴ٸ� �����ϼ̽��ϴ�.
		  
		  ���� > 4
		  �� �� �����ϼ̽��ϴ�.
		  
		  ���� > 0
		  ���� - ����� �ݾ��� : 2,300��
		  
		 */

		Scanner scanner = new Scanner(System.in); // ctrl + shift + o -> ����Ű
		
		int balance = 0;
		
		String[] menuNumArr = {"�ݶ�", "���̴�", "ȯŸ"};
		int[] menuPriceArr = {1000, 1200, 1300};
		
		System.out.println("<�޴�>");
		for(int i=0; i<menuNumArr.length; i++) {
			System.out.printf("%d. %s (%,d��)", (i+1), menuNumArr[i], menuPriceArr[i]);
			System.out.println();
		}
		
		while(true) {
			
			System.out.printf("���� > ");
			
			int num = scanner.nextInt();
			
			if(num == 0) {
				System.out.printf("����! - ����� �ݾ��� : %,d�� �Դϴ�.", balance);
				break;
			} else if (num >= 1 && num <= menuNumArr.length) {
				System.out.printf("%s�� �����ϼ̽��ϴ�.\n", menuNumArr[num-1]); // if���� �迭�� �̿��� ��¹��
				balance = balance + menuPriceArr[num-1];
			} else {
				System.out.println("�� �� �����ϼ̽��ϴ�.\n");
			}
		}
		scanner.close();
	}
}
