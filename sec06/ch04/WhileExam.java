package sec06.ch04;

public class WhileExam {
	public static void main(String[] atgs) {
		// while문은 조건식이 true인 동안 반복
		for(int i=0; i<5; i++) {
			System.out.println("i : " + i);
		}
		
		System.out.println();
		
		int i = 0;
		while(i<5) {
			System.out.println("i : " + i);
			i++;
		}
	}
}
