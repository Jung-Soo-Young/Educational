package sec06.ch04;

public class ForMission4 {
	public static void main(String[] args) {
		int dan = (int)(Math.random() * 8 + 2);
		System.out.println("dan : " + dan);
		
		for(int i=1; i<=9; i++) { // for �ݺ��� = �ٲ�� ���� ��Ģ�� ��������!
			System.out.printf(dan + " * " + i + " = " + (dan*i));
			System.out.println();
		}
	}
}
