package sec06.ch04;

public class ForMission6 {
	public static void main(String[] args) {
		int star = (int)(Math.random() * 5) + 3;
		System.out.println("���� : " + star);
		
		for(int i=1; i<=star; i++) { // �� : 1 ~ star ���� +1 �����ϸ鼭
			for(int j=1; j<=star; j++) { // �� : 1 ~ star ���� +1 �����ϸ鼭
				System.out.printf("*");
			}
			System.out.println();
		}
	}
}
