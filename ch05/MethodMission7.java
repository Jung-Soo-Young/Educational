package sec06.ch05;

import java.util.Scanner;

public class MethodMission7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String answer = null;
		do {
			System.out.print("성별 : ");
			String gender = scan.next(); // 남, 여
			
			System.out.print("키 : ");
			int height = scan.nextInt();
			
			String result = chk(gender, height);
			System.out.println(result);
			//"성별 : 남, 키 : 170cm, 평균 미만"
			//"성별 : 여, 키 : 163cm, 평균"
			
			System.out.print("계속 하시겠습니까? (y, n) : ");
			answer = scan.next();
		} while(answer.equals("y")); // y입력시 반복문 종료
		System.out.println("끝");
		scan.close();
	}
	
	// 남자 평균키 : 175, 여자 평균키 : 163
	public static String chk(String gender, int height) {
		int stand = 0; // 임의의 변수 설정 (기본 값 0)
		String result = "평균";
		switch(gender) {
		case "여": case "여자": case "woman": case "girl":
			stand = 163;
			break;
		case "남": case "남자": case "man": case "boy":
			stand = 175;
			break;
		default :
			return "성별을 잘 못 입력하였습니다.";
		}
		
		if(height > stand) {
			result = "평균 초과";
		} else if (height < stand) {
			result = "평균 미만";
		}
		
		return String.format("성별 : %s, 키 : %dcm, %s", gender, height, result); // String.format 문자열을 만들때 사용하기
		// return "성별 : " + gender + ", 키 : " + height + "cm, " + result;
	}
}
