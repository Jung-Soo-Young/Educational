package sec06.ch05;

public class MethodMission4 {
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
	
	public static int getRandomNum(int min, int max) {
		int result = (int)(Math.random() * (max-min+1)) + min;
		return result;
	}
	
	public static int getRandomNum() {
		int num = (int)(Math.random() * 10);
		return num;
	}
	
	public static int getRandomNum(int num) {
		int result = (int)(Math.random() * num);
		return result;
	}
}
