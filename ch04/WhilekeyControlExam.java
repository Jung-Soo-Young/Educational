package sec06.ch04;

public class WhilekeyControlExam {
	public static void main(String[] args) throws {
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while(run) {
			if(keyCode != 13 && keyCode != 10) {
				System.out.println("----------------");
				System.out.println("1.증속 | 2.감속 | 3.중지");
				System.out.println("----------------");
				System.out.print("선택 : ");
			}
			
			keyCode = System.in.read();
			System.out.println("\nkeyCode : " + keyCode);
			
			if(keyCode == 49) { // 키보드의 1번 key
				speed++;
				System.out.println("현재 속도 : " + speed);
			} else if(keyCode == 50) { // 키보드의 2번 key
				speed--;
				System.out.println("현재 속도 : " + speed);
			} else if(keyCode == 51) { // 키보드의 3번 key
				run = false;
			}
		}
		System.out.println("끝!");
	}
}
