package sec06.ch04;

public class IfMission3 {
	public static void main(String[] args) {
		final int SCORE = (int)(Math.random() * 30) + 71;
		System.out.println("SCORE : " + SCORE);
		//SCORE ���� 81 ~ 100 �� ������ ���� �ȴ�. (����)
		String grade = "D"; // ���� ����
		String p = ""; // ��ȣ ������ ����
		int num = SCORE % 10; // ���� �ڸ� ����
		
		
		//91 ~ 100 A (97�� �̻��� "A+", 96 ~ 94 "A", 93 ~ 91 "A-")
		//81 ~ 90  B (87�� �̻��� "B+", 86 ~ 84 "B", 83 ~ 81 "B-")
		
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
