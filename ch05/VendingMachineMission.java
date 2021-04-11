package sec06.ch05;

import java.util.Scanner;

public class VendingMachineMission {
	public static void main(String[] args) {
		
		/* �Ʒ��� �ֿܼ� ����ؾ� �ϴ� ����		  
		
		  <�޴�>
		  0. ����
		  1. �ݶ� (1,000��)
		  2. ���̴� (1,200��)
		  3. ȯŸ (1,300��)
		  ���� > 1
		  �ݶ� �����ϼ̽��ϴ�.
		  
		 */

		Scanner scanner = new Scanner(System.in); // ctrl + shift + o -> ����Ű
		
		String[] menuNumArr = {"�ݶ�", "���̴�", "ȯŸ"};
		int[] menuPriceArr = {1000, 1200, 1300};
		
		while(true) {
			System.out.println("<�޴�>");
			for(int i=0; i<menuNumArr.length; i++) {
				System.out.printf("%d. %s (%,d��)", (i+1), menuNumArr[i], menuPriceArr[i]);
				System.out.println();
			}
			System.out.printf("���� > ");
	
			int num = scanner.nextInt();
			
			if(num == 0) {
				System.out.println("����");
				break;
			} else if (num >= 1 && num <= menuNumArr.length) {
				System.out.printf("%s�� �����ϼ̽��ϴ�.\n", menuNumArr[num-1]); // if���� �迭�� �̿��� ��¹��
				System.out.println();
			} else {
				System.out.println("�� �� �����ϼ̽��ϴ�.\n");
			}
		}
		scanner.close();
	}
}
