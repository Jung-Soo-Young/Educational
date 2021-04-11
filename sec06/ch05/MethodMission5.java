package sec06.ch05;

public class MethodMission5 {
	
	// �ߺ��� �ҽ� �ִ��� ����
	// �޼ҵ� ��Ȱ��!!!
	public static void main(String[] args) {
		int star = 5;
		printStarLine(star); // *****
		System.out.println();
		System.out.println();
		printStarSqure(star);
		// *****
		// *****
		// *****
		// *****
		// *****
		System.out.println();
		printStarTri(star);
		// *
		// **
		// ***
		// ****
		// *****
		System.out.println();
		
		
		star = 3;
		printStarLine(star); // ***
		System.out.println();
		System.out.println();
		printStarSqure(star);
		// ***
		// ***
		// ***
		System.out.println();
		printStarTri(star);
		// *
		// **
		// ***
		System.out.println();
	}
	
	
	public static void printStarLine(int num) {
		for(int i=1; i<=num; i++) {
			System.out.print("*");
		}
	}
	
	public static void printStarSqure(int num) {
		for(int i=1; i<=num; i++) {
			printStarLine(num);
			System.out.println();
		}
	}
	
	public static void printStarTri(int num) {
		for(int i=1; i<=num; i++) {
			printStarLine(i); // i���� printStarLine �޼ҵ�� = 1, 2, 3, 4, 5
			System.out.println();
		}
	}
}
