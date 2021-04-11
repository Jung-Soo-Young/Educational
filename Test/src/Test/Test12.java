package Test;

public class Test12 {
	public static void main(String[] args) {
		int score = getRandomScore(50, 100);
		// 50 ~ 100 ������ �������ڰ� �������� ����!!!
		
		char grade = getGrade(score);
		// 90�� �̻� 'A'
		// 80�� �̻� 'B'
		// 70�� �̻� 'C'
		// 60�� �̻� 'D'
		// ������ 'E'

		char grade2 = getGradeSign(score);
		// ?8�̻� �̰ų� 100���̸� '+'
		// ?3�����̸� '-'
		// ������ ' ' ��ĭ�� ���� �ǵ���
		
		System.out.printf("���� - %d : %c%c\n", score, grade, grade2);
	}
	
	public static int getRandomScore(int min, int max) {
		return (int)(Math.random() * (max - min)) + min;
	}
	
	public static char getGrade(int score) {
		if(score >= 90) {
			return 'A';
		} else if (score >= 80) {
			return 'B';
		} else if (score >= 70) {
			return 'C';
		} else if (score >= 60) {
			return 'D';
		} else
			return 'E';
	}
	
	public static char getGradeSign(int score) {
		int mod = score % 10;
		if(mod >= 8 || score == 100) {
			return '+';
		} else if (mod <= 3) {
			return '-';
		} else 
			return ' ';
	}
}
