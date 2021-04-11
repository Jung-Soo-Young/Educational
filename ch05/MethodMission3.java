package sec06.ch05;

public class MethodMission3 {
	public static void main(String[] args) {
		sumAllFromTo(5, 10); // sum : 45
		
		sumAllFromTo(2, 4); // sum : 9
		sumAllFromTo(4, 2);
		sumAllFromTo(1, 100);
	}
	
	public static void sumAllFromTo(int num1, int num2) {
		int sum = 0;
		if(num1 > num2) {
			int temp = num2; // 임의의 저장 변수 temp 생성
			num2 = num1;
			num1 = temp;
		}
		for(int i=num1; i<=num2; i++) {
			sum += i;
		}
		System.out.println("sum : " + sum);
	}
}
