package sec06.ch05;

import java.util.Scanner;

public class VendingMachineMission3 {
	public static void main(String[] args) {
		
		/* �Ʒ��� �ֿܼ� ����ؾ� �ϴ� ����		  
		
		  ���� ������ �ּ��� : 3000
		  
		  <�޴�>
		  0. ����
		  1. �ݶ� (1,000��)
		  2. ���̴� (1,200��)
		  3. ȯŸ (1,300��)
		  
		  ���� > 1
		  �ݶ� �����ϼ̽��ϴ�. (���� �ݾ� 2,000��)
		  
		  ���� > 2
		  ���̴ٸ� �����ϼ̽��ϴ�. (���� �ݾ� 700��)
		  
		  ���� > 4
		  �� �� �����ϼ̽��ϴ�.
		  
		  ���� > ?
		  �ݾ��� �����մϴ�. (���� �ݾ� 700��)
		  
		  ���� > 0
		  ���� - ���� �ݾ� : 700��
		  
		 */

		Scanner scanner = new Scanner(System.in); // ctrl + shift + o -> ����Ű
		System.out.printf("���� �������ּ��� : ");
		int insertMoney = scanner.nextInt();

		String[] menuNumArr = {"�ݶ�", "���̴�", "ȯŸ"};
		int[] menuPriceArr = {1000, 1200, 1300};

		System.out.println();
		System.out.println("<�޴�>");
		System.out.println("0. ����");

		for(int i=0; i<menuNumArr.length; i++) {
			System.out.printf("%d. %s (%,d��)", (i+1), menuNumArr[i], menuPriceArr[i]);
			System.out.println();
		}
		
		while(true) {
			System.out.printf("���� > ");
			
			int num = scanner.nextInt();
			
			if(num < 0 || num > menuNumArr.length) {
				System.out.println("�� �� �����Ͽ����ϴ�.");
				continue;
			}
			int selectedIdx = num -1; // �迭 �� ���� ����
			if(num == 0) {
				System.out.print("���� !");
				break;
			} else if (insertMoney < menuPriceArr[selectedIdx]) { // �Է��� ���� �迭�� ����� ������ ���� ��
				System.out.print("�ݾ��� �����մϴ�.");
			} else {
				System.out.printf("%s�� �����ϼ̽��ϴ�.", menuNumArr[selectedIdx]);
				insertMoney = insertMoney - menuPriceArr[selectedIdx]; // �Է��� ������ �ݾ��� ���� ����
			}
			System.out.printf(" (���� �ݾ� : %,d)\n", insertMoney);
		}
		scanner.close();
	}
}
