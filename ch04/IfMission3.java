package sec06.ch04;

public class IfMission3 {
	public static void main(String[] args) {
		final int SCORE = (int)(Math.random() * 30) + 71;
		System.out.println("SCORE : " + SCORE);
		//SCORE 값은 81 ~ 100 점 사이의 값이 된다. (랜덤)
		String grade = "D"; // 성적 변수
		String p = ""; // 기호 저장할 변수
		int num = SCORE % 10; // 일의 자리 변수
		
		
		//91 ~ 100 A (97점 이상은 "A+", 96 ~ 94 "A", 93 ~ 91 "A-")
		//81 ~ 90  B (87점 이상은 "B+", 86 ~ 84 "B", 83 ~ 81 "B-")
		
		if(num >= 7 || num == 0) {
			p = "+";
		} else if (num < 4) {
			p = "-";
		}
		
		if (SCORE > 90) {
			grade = "A";
		} else if (SCORE > 80) {
			grade = "B";
		} else if (SCORE > 70) {
			grade = "C";
		}
		System.out.println(grade + p);
		
/*
		if (SCORE >= 90) {
			grade = "A";
			if(num >= 7 || num == 0) {
				p = "+";
			} else if (num < 4) {
				p = "-";
			}
			System.out.println(grade + p);
		} else if (SCORE >= 80) {
			grade = "B";
			if(num >= 7 || num == 0) {
				p = "+";
			} else if (num < 4) {
				p = "-";
			}
			System.out.println(grade + p);
		}
*/
		
		/*
		if (SCORE <= 90) {
			num = grade2;
			if (SCORE >= 87) {
				System.out.println(num+p);
			} else if (SCORE >= 84) {
				System.out.println(num);
			} else {
				System.out.println(num+m);
			}
		} else {
			if(SCORE >= 97) {
			System.out.println(num+p);
			} else if (SCORE >= 94) {
				System.out.println(num);
			} else {
				System.out.println(num+m);
			}
		}
		*/
	}
}
