package Test;

public class Test11 {
	public static void main(String[] args) {
		int star = 5;
		
		printStarLine(star);
		System.out.println();
		System.out.println();
		printStarSquare(star);
		System.out.println();
		printStarTri(star);
		
	}
	
	public static void printStarLine(int num) {
		for(int i=1; i<=num; i++) {
			System.out.print("*");
		}  
	}
	
	public static void printStarSquare(int num) {
		for(int i=1; i<=num; i++) {
			printStarLine(num);
			System.out.println();
		}
	}
	
	public static void printStarTri(int num) {
		for(int i=1; i<=num; i++) {
			printStarLine(i);
			System.out.println();
		}
	}
}
