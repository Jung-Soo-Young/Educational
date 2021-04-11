package Test;

public class Test6 {
	public static void main(String[] args) {
		int aaa = 10;
		int result = sum(aaa, 10);
		System.out.println("합은 : " + result);
		
		int result1 = minus(aaa, 10);
		System.out.println("합은 : " + result1);
	}
	
	public static int sum(int num1, int num2) {
		return num1 + num2;
	}
	
	public static int minus(int num1, int num2) {
		return num1 - num2;
	}
}
