package Test;

public class Test8 {
	public static void main(String[] args) {
		whoisBig(10, 20);
		
		whoisBig(30, 15);
	}
	
	public static void whoisBig(int num1, int num2) {
		if(num1 > num2) {
			System.out.println("�� �� �� ū ���� " + num1 + "�Դϴ�.");
		} else
			System.out.println("�� �� �� ū ���� " + num2 + "�Դϴ�.");
	}
}
