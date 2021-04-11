package sec06.ch04;

public class IfExam4 {
	public static void main(String[] args) {
		// »ïÇ×½Ä
		System.out.println(abs(-10));
		System.out.println(abs(7));
	}
	
	public static int abs(int val) {
		return val < 0 ? -val : val;
	}
}
