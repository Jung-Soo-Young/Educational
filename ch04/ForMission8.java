package sec06.ch04;

public class ForMission8 {
	public static void main(String[] args) {
		int star = (int)(Math.random() * 5) + 3;
		System.out.println("star : " + star);
		
		// star = 4
		
		// ****
		// ***
		// **
		// *
		
		for(int i = 0; i < star; i++) {
			for(int j = star; j > i; j--)
			System.out.printf("*");
			System.out.println();
		}
	}
}
