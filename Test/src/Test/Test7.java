package Test;

public class Test7 {
	public static void main(String[] args) {
		int n1 = 10, n2 = 20;
		
		voidSum(n1, n2);
		voidSum(1, 5);
		int result = intsum(n1, n2);
		System.out.printf("%d + %d = %d\n", n1, n2, result);
		
		result = intsum(1, 5);
		System.out.printf("%d + %d = %d\n", n1, n2, result);
	}
	
	public static void voidSum(int num1, int num2) {
		System.out.printf("%d + %d = %d\n", num1, num2, (num1+num2));
	}
	
	public static int intsum(int n1, int n2) {
		return n1 + n2;
	}
}
