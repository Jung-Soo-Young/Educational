package sec06.ch04;

public class ForMission3 {
	public static void main(String[] args) {
		int star = (int)(Math.random() * 6 + 5);
		// 0 ~ 5 -> 5 ~ 10 으로 변경
		System.out.println("star : " + star);
		
		for(int i=0; i<star; i++) {
			System.out.println("*");
		}
		System.out.println("\n끝");
	}
}
