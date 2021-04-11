package sec06.ch06;

public class VariadicArgumentsExam {
	public static void main(String[] args) {
		Calc2 cal = new Calc2();
		
		int result = cal.sum(10, 20);
		System.out.println("result : " + result);
		
		result = cal.sum(10, 20, 30);
		System.out.println("result : " + result);
		
		result = cal.sum(10, 20, 30, 40);
		System.out.println("result : " + result);
		
	}
}

class Calc2 {
	int sum(int... vals) {
		int sum = 0;
		for(int i=0; i<vals.length; i++) {
			sum += vals[i];
		}
		return sum;
	}
}
