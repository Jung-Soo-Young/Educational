package sec06.ch04;

public class SwitchMission {
	public static void main(String[] args) {
		int time = (int)(Math.random() * 4) + 8;
		
		// 8 ~ 11 ���� �������� time ������ ���Ե˴ϴ�.
		
		System.out.println("time : " + time);
		// time = 8 �̸� "����մϴ�."
		// time = 9 �̸� "ȸ�Ǹ� �մϴ�."
		// time = 10�̸� "������ ���ϴ�."
		// ������ �ð��̸� "�ܱ��� �����ϴ�."
		
		switch(time) {
		case 8 : 
			System.out.println("����մϴ�.");
			break;
		case 9 :
			System.out.println("ȸ�Ǹ� �մϴ�.");
			break;
		case 10 :
			System.out.println("������ ���ϴ�.");
			break;
		default :
			System.out.println("�ܱ��� �����ϴ�.");
		}
	}
}
