package sec06.ch04;

public class WhileExam3 {
	public static void main(String[] args) {
		int val = 0, sum = 0;
		do {
			val = (int)(Math.random()*11);
			sum += val;
		} while(val != 0);
		
		System.out.println("dowhile-sum : " + sum);
	}
}
