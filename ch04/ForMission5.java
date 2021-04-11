package sec06.ch04;

public class ForMission5 {
	public static void main(String[] args) {
		int dan = (int)(Math.random() * 8) + 2;
		// 0~7 -> 2~9
		System.out.println("dan : " + dan);
		
		for(int i=6; i<15; i++) {
			System.out.printf("%d * %d = %d\n", dan, i-5, (dan*(i-5)));
		}
	}
}
