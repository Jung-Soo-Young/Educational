package sec06.ch04;

public class WhilekeyControlExam {
	public static void main(String[] args) throws {
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while(run) {
			if(keyCode != 13 && keyCode != 10) {
				System.out.println("----------------");
				System.out.println("1.���� | 2.���� | 3.����");
				System.out.println("----------------");
				System.out.print("���� : ");
			}
			
			keyCode = System.in.read();
			System.out.println("\nkeyCode : " + keyCode);
			
			if(keyCode == 49) { // Ű������ 1�� key
				speed++;
				System.out.println("���� �ӵ� : " + speed);
			} else if(keyCode == 50) { // Ű������ 2�� key
				speed--;
				System.out.println("���� �ӵ� : " + speed);
			} else if(keyCode == 51) { // Ű������ 3�� key
				run = false;
			}
		}
		System.out.println("��!");
	}
}
