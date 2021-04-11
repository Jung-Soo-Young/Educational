package Test;

import java.util.Scanner;

public class Test13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String answer = null;
		do {
			System.out.print("���� : ");
			String gender = scan.next(); // ����, ����
			
			System.out.print("Ű : ");
			int height = scan.nextInt();
			
			String result = chk(gender, height);
			System.out.println(result);
			//"���� : ��, Ű : 175cm, ���"
			//"���� : ��, Ű : 163cm, ���"
			
			System.out.print("��� �����Ͻðڽ��ϱ�? (y, n) : ");
			answer = scan.next();
		} while(answer.equals("y"));
		System.out.println("��!");
		scan.close();
	}
	
	public static String chk(String gender, int height) {
		int stand = 0;
		String result = "���";
		
		switch(gender) {
		case "��": case "����": case "woman": case "girl":
			stand = 163;
			break;
		
		case "��": case "����": case "man": case "boy":
			stand = 175;
			break;
			
		default :
			System.out.println("������ �� �� �Է��Ͽ����ϴ�.");
		}
		
		if(stand > height) {
			result = "��� �̸�";
		} else if (stand < height) {
			result = "��� �ʰ�";
		} 
		return String.format("���� : %s Ű : %dcm, %s", gender, height, result);
	}
}
