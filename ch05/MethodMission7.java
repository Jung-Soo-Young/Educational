package sec06.ch05;

import java.util.Scanner;

public class MethodMission7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String answer = null;
		do {
			System.out.print("���� : ");
			String gender = scan.next(); // ��, ��
			
			System.out.print("Ű : ");
			int height = scan.nextInt();
			
			String result = chk(gender, height);
			System.out.println(result);
			//"���� : ��, Ű : 170cm, ��� �̸�"
			//"���� : ��, Ű : 163cm, ���"
			
			System.out.print("��� �Ͻðڽ��ϱ�? (y, n) : ");
			answer = scan.next();
		} while(answer.equals("y")); // y�Է½� �ݺ��� ����
		System.out.println("��");
		scan.close();
	}
	
	// ���� ���Ű : 175, ���� ���Ű : 163
	public static String chk(String gender, int height) {
		int stand = 0; // ������ ���� ���� (�⺻ �� 0)
		String result = "���";
		switch(gender) {
		case "��": case "����": case "woman": case "girl":
			stand = 163;
			break;
		case "��": case "����": case "man": case "boy":
			stand = 175;
			break;
		default :
			return "������ �� �� �Է��Ͽ����ϴ�.";
		}
		
		if(height > stand) {
			result = "��� �ʰ�";
		} else if (height < stand) {
			result = "��� �̸�";
		}
		
		return String.format("���� : %s, Ű : %dcm, %s", gender, height, result); // String.format ���ڿ��� ���鶧 ����ϱ�
		// return "���� : " + gender + ", Ű : " + height + "cm, " + result;
	}
}
