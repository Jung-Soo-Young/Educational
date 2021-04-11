package sec06.ch04;

public class ForMission6 {
	public static void main(String[] args) {
		int star = (int)(Math.random() * 5) + 3;
		System.out.println("값은 : " + star);
		
		for(int i=1; i<=star; i++) { // 열 : 1 ~ star 까지 +1 증가하면서
			for(int j=1; j<=star; j++) { // 행 : 1 ~ star 까지 +1 증가하면서
				System.out.printf("*");
			}
			System.out.println();
		}
	}
}
