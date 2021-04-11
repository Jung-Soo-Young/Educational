package sec06.ch04;

public class ForMission9 {
	public static void main(String[] args) {
		int star = (int)(Math.random() * 5) + 3;
		System.out.println("star : " + star);
		
		// ____*
		// ___**
		// __***
		// _****
		// *****
		
		for(int i = 1; i <= star; i++) {
			for(int j = star; j>0; j--) {
				if(i<j) {
					System.out.print(" ");
				} else
					System.out.print("*");
			}
			System.out.println();
		}
	}
}
