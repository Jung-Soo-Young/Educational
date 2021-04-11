package sec06.ch04;

public class SwitchExam2 {
	public static void main(String[] args) {
		String habbit = "수영"; // 문자열일 경우에는 switch문이 더 편리 (if문은 equals를 사용해야 함)
		
		switch(habbit) {
			case "수영": case "등산":
				System.out.println("건강한 취미입니다.");
				break;
			case "술": case "담배":
				System.out.println("비건전한 취미입니다.");
				break;
		}
	}
}
