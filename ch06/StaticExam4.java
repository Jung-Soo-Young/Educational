package sec06.ch06;

public class StaticExam4 {
	public static void main(String[] args) {
		CalcInstance ci = new CalcInstance(); 
		int result = ci.sum(10, 20);
		System.out.println("result : " + result);
		
		int result2 = CalcStatic.sum(10, 30); 
		System.out.println("result2 : " + result2);
	}
}

class CalcStatic {
	static int sum(int num1, int num2) {
		return num1 + num2;
	}
}

class CalcInstance {
	int sum(int num1, int num2) {
		return num1 + num2;
	}
}		

