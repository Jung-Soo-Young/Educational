package sec06.ch05;

public class MethodMission6 {
	public static void main(String[] args) {
		int score = getRandomScore(50, 100);
		// 50 ~ 100 사이의 랜덤숫자가 나오도록 세팅!!!
		
		char grade = getGrade(score);
		// 90점 이상 'A'
		// 80점 이상 'B'
		// 70점 이상 'C'
		// 60점 이상 'D'
		// 나머지 'E'

		char grade2 = getGradeSign(score);
		// ?8이상 이거나 100점이면 '+'
		// ?3이하이면 '-'
		// 나머지 ' ' 빈칸이 리턴 되도록
		
		System.out.printf("점수 - %d : %c%c\n", score, grade, grade2);
	}
	
	public static int getRandomScore(int min, int max) {
		return (int)(Math.random() * (max - min + 1)) + min;
	}

	public static char getGrade(int score) {
		if(score >= 90) { // 점수를 조건으로 문자를 return 하기
			return 'A';
		} else if (score >= 80) {
			return 'B';
		} else if (score >= 70) {
			return 'C';
		} else if (score >= 60) {
			return 'D';
		} else
			return'E';
	}
	
	public static char getGradeSign(int score) { 
		int mod = score % 10; // 일의 자리는 10을 나누어서 계산
		if(mod >= 8 || score == 100) { // 논리 연산자 OR - ||, AND - &&
			return '+';
		} else if (mod <= 3) {
			return '-';
		} else
			return ' '; // 공백일 경우 리턴 하는 방법
	}

}
