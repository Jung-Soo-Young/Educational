package sec06.ch04;

public class ForExam2 {
	public static void main(String[] args) {
		// 2~9단 구구단 출력!!
		for(int i = 2; i < 10; i ++) {
			for(int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i*j);
			}
			System.out.println();
		}
	}
}
