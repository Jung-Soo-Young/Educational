package sec06.ch06;

public class OverloadingExam {
	public static void main(String[] args) {
		//Calc 객체화
		//sum메소드 호출 아규먼츠는 5, 10
		
		Calc calc = new Calc();
		calc.sum(5, 10);
		calc.sum(5, 10, 11);
		calc.sum(10, 20, "30");
	}
}

class Calc {
	void sum(int n1, int n2) {
		System.out.println(n1 + n2);
	}
	
	void sum(int n1, int n2, int n3) {
		System.out.println(n1 + n2 + n3);
	}
	
	int sum(int n1, int n2, String n3) {
		System.out.println(n1 + n2 + n3);
		return 0;
	}
}