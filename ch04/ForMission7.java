package sec06.ch04;

public class ForMission7 {
	public static void main(String[] args) {
		int star = (int)(Math.random() * 5 +3); // 3~7 ·£´ý°ª
		System.out.println("star : " + star);

		// star = 3			star = 5
		// *				*
		// **				**
		// ***				***
		//					****
		//					*****
	
		for(int i=0; i<=star; i++) {
			for(int j=0; j<i; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}
}
