package sec06.ch05;

public class MethodMission {
	public static void main(String[] args) {
		whoIsBig(10, 30, 23); // 콘솔 > 100이 가장 큽니다.
		
		whoIsBig(10, 9, 21); // 콘솔 > 10이 가장 큽니다.
		
		whoIsBig(11, 25, 17); //콘솔 > 25이 가장 큽니다.
		
		int big = getBigNum(10, 30);
		System.out.println("big : " + big); // big : 30
		
		big = getBigNum(10, 9);
		System.out.println("big : " + big); // big : 10
		
	}
	
	public static int getBigNum(int num1, int num2) { // 메인 메소드에 변수 = 메소드값이 주어지면 변수 메소드로 선언 (int, string 등)
		if(num1 > num2) {
			return num1;
		} 
		return num2;
	}
	
	public static void whoIsBig(int num1, int num2, int num3) { // 메인 메소드에 변수 없이 출력문만 있으면 void
		int big = num1; // 임의의 변수 생성해서 첫 값을 주어놓고 비교
		if (num2 > num1 && num2 > num3) {
			big = num2;
		} else if (num3 > num1 && num3 > num2) {
			big = num3;
		}
		System.out.printf("%d이 가장 큽니다.\n", big);
		
	/*
	public static void whoIsBig(int num1,int num2) {
		if (num1 > num2) {
			System.out.println("콘솔 > " + num1 + "이 가장 큽니다.");
		} else {
			System.out.println("콘솔 > " + num2 + "이 가장 큽니다.");
		} 
	 */
	}
}
