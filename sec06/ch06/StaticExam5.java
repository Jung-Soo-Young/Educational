package sec06.ch06;

public class StaticExam5 {
	public static void main(String[] args) {
		StaticExam5 se5 = new StaticExam5();
		se5.n1 = 10;
		se5.n2 = 20;
		int result = se5.sum();
		System.out.println("result : " + result);
	}
	
	int n1;
	int n2;
	public int sum() {
		return n1 + n2;
	}
}

class Test {
	int n1;
	int n2;
	public int sum() {
		return n1 + n2;
	}
}
