package sec06.ch04;

public class SwitchExam2 {
	public static void main(String[] args) {
		String habbit = "����"; // ���ڿ��� ��쿡�� switch���� �� �� (if���� equals�� ����ؾ� ��)
		
		switch(habbit) {
			case "����": case "���":
				System.out.println("�ǰ��� ����Դϴ�.");
				break;
			case "��": case "���":
				System.out.println("������� ����Դϴ�.");
				break;
		}
	}
}
