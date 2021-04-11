package Test;

public class Test8 {
	public static void main(String[] args) {
		whoisBig(10, 20);
		
		whoisBig(30, 15);
	}
	
	public static void whoisBig(int num1, int num2) {
		if(num1 > num2) {
			System.out.println("두 수 중 큰 값은 " + num1 + "입니다.");
		} else
			System.out.println("두 수 중 큰 값은 " + num2 + "입니다.");
	}
}
