package sec06.ch06;

public class StaticExam3 {
	public static void main(String[] args) {
		// CalcInstance2 객체화
		// num1 = 10, num2 = 20;
		// 더한 값을 콘솔에 출력!
		
		CalcInstance2 ci2 = new CalcInstance2(); // 객체화 후 명령 = 주소값.()
		ci2.num1 = 10;
		ci2.num2 = 20;
		int result = ci2.sum();
		System.out.println("result : " + result);
		
		String.format("%d", result);

	}	
}

class CalcStatic2 { // static가 붙은 메소드일 경우 전역변수에도 static 필수
	static int num1;
	static int num2;
	
	static int sum() {
		return num1 + num2;
	}
}

class CalcInstance2 { // static 안 붙어 있을 경우 객체화 필수!
	int num1; // -> 전역변수(인스턴스=객체화) , static가 붙을 경우 클래스 변수
	int num2;
	int sum() { // sum(int num1) 제일 가까운 변수, 위에 선언된 값을 입력 받을 시 this.
		int num = 10; // 메소드 안에 선언된 변수 = 지역변수
		return num1 + num2;
	}
	
	static int sum(int n1, int n2) {
		return n1 + n2;
	}
}
