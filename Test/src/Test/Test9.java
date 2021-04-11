package Test;

public class Test9 {
	public static void main(String[] args) {
		int mon = (int)(Math.random() * 12) + 1;
		printSeason(mon);
	}
	
	public static void printSeason(int num) {
		System.out.println(num + "월");
		switch(num) {
		case 12: case 1: case 2:
			System.out.println("계절은 겨울입니다.");
			return;
			
		case 3: case 4: case 5:
			System.out.println("계절은 봄입니다.");
			return;
			
		case 6: case 7: case 8:
			System.out.println("계절은 여름입니다.");
			return;
			
		case 9: case 10: case 11:
			System.out.println("계절은 가을입니다.");
			return;
		default:
			System.out.println("잘 못 입력하였습니다.");
			return;
		}
		
	}
}
