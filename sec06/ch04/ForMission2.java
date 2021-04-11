package sec06.ch04;

public class ForMission2 {
	public static void main(String[] args) {
		int star = (int)(Math.random() * 5) + 5;
		System.out.println("star : " + star);
		
		switch(star) {
		case 5:
			System.out.println("*****");
			break;
		case 6:
			System.out.println("******");
			break;
		case 7:
			System.out.println("*******");
			break;
		case 8:
			System.out.println("********");
			break;
		case 9:
			System.out.println("*********");
			break;
		case 10:
			System.out.println("**********");
			break;
		}
	}
}
