package Test;

public class Test9 {
	public static void main(String[] args) {
		int mon = (int)(Math.random() * 12) + 1;
		printSeason(mon);
	}
	
	public static void printSeason(int num) {
		System.out.println(num + "��");
		switch(num) {
		case 12: case 1: case 2:
			System.out.println("������ �ܿ��Դϴ�.");
			return;
			
		case 3: case 4: case 5:
			System.out.println("������ ���Դϴ�.");
			return;
			
		case 6: case 7: case 8:
			System.out.println("������ �����Դϴ�.");
			return;
			
		case 9: case 10: case 11:
			System.out.println("������ �����Դϴ�.");
			return;
		default:
			System.out.println("�� �� �Է��Ͽ����ϴ�.");
			return;
		}
		
	}
}
