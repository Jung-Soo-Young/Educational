package sec06.ch04;

public class IfMission2Another2 {
	public static void main(String[] args) {
		//IfMission2Another를 참고하여 해결하시오. (응용하려고 노력하시오)
		//결과에 성별도 나타나도록 하시오.
		
		//남, 174 >>> 남자 평균 미만
		//남, 175 >>> 남자 평균
		//남, 176 >>> 남자 평균 초과
		
		//여, 162 >>> 여자 평균 미만
		//여, 163 >>> 여자 평균
		//여, 164 >>> 여자 평균 초과
		
		String gender = "여"; //"여", "남";
		int height = 162;
		
		String displayGender = "남자", displayResult = "평균";
		//성별 변수 초기값과 평균 변수 초기값을 설정
		
		final int MAN_STAND = 176; // 남성 평균 키 값의 변수 설정
		final int WOMAN_STAND = 163; // 여성 평균 키 값의 변수 설정
		int stand = MAN_STAND; // 키 값의 임의의 변수 선언 = 기본 값 남성 평균 키로 설정
		
		if (gender.equals("여")) {
			stand = WOMAN_STAND; // 성별이 "여"일 경우 기본 값(남성 평균 키)에서 여자 평균 키로 변경
			displayGender = "여자"; // 성별 변수 "여자"로 변경
		}
		
		if(height < stand) { // 주어진 값이 변수(평균 키) 보다 작은가?
			displayResult = "평균 미만"; // 평균 변수 -> "평균 미만" 적용
		} else if (height > stand) { // 주어진 값이 변수(평균 키) 보다 큰가?
			displayResult = "평균 초과"; // 평균 변수 -> "평균 초과" 적용
		} 
		System.out.printf("%s - %dcm : %s\n", displayGender, height, displayResult); // 출력
	}
}
