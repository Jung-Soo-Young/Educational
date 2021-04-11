package sec06.ch04;

public class WhileExam3_1 {
	public static void main(String[] args) {
		int val = 0, sum = 0;
		
		while(val != 0) {
			val = (int)(Math.random()*11);
			sum += val;
		} 
		
		System.out.println("dowhile-sum : " + sum);
	}
}
