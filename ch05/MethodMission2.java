package sec06.ch05;

public class MethodMission2 {
	public static void main(String[] arg) {
		double result = divide(10, 3);
		System.out.println("result : " + result); // 3.3333333
		
		result = divide(10, 5);
		System.out.println("result : " + result); // 2.0
		
		System.out.println("절대값 : " + abs(10));
		System.out.println("절대값 : " + abs(-10));
		
	}
	
	public static double divide(int num1, int num2) {
		return (double)num1/num2;
	}
	
	public static int abs(int num1) {
		if(num1 < 0) {
			return -num1; // 음수 값에 -를 주어서 양수값 만들기 = 절대값
		} return num1;
	}
}
