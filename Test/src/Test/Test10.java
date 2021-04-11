package Test;

public class Test10 {
	public static void main(String[] args) {
		int rNum = getRandomNum(); // 0~9
		System.out.println("rNum : " + rNum);
		
		rNum = getRandomNum(20); // 0~19
		System.out.println("rNum : " + rNum);		
		
		rNum = getRandomNum(5); // 0~4
		System.out.println("rNum : " + rNum);
		
		rNum = getRandomNum(5, 10); // 5 ~ 10
		System.out.println("rNum : " + rNum);
		
		rNum = getRandomNum(10, 20); // 10 ~ 20
		System.out.println("rNum : " + rNum);
	}
	
	public static int getRandomNum() {
		return (int)(Math.random() * 10);
	}
	
	public static int getRandomNum(int num) {
		return (int)(Math.random() * num);
	}
	
	
	public static int getRandomNum(int num1, int num2) {
		return (int)(Math.random() * (num2 - num1)) + num1;
	}
}
