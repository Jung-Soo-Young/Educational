package Test;

import java.util.Scanner;

public class Test13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String answer = null;
		do {
			System.out.print("성별 : ");
			String gender = scan.next(); // 남자, 여자
			
			System.out.print("키 : ");
			int height = scan.nextInt();
			
			String result = chk(gender, height);
			System.out.println(result);
			//"성별 : 남, 키 : 175cm, 평균"
			//"성별 : 여, 키 : 163cm, 평균"
			
			System.out.print("계속 진행하시겠습니까? (y, n) : ");
			answer = scan.next();
		} while(answer.equals("y"));
		System.out.println("끝!");
		scan.close();
	}
	
	public static String chk(String gender, int height) {
		int stand = 0;
		String result = "평균";
		
		switch(gender) {
		case "여": case "여자": case "woman": case "girl":
			stand = 163;
			break;
		
		case "남": case "남자": case "man": case "boy":
			stand = 175;
			break;
			
		default :
			System.out.println("성별을 잘 못 입력하였습니다.");
		}
		
		if(stand > height) {
			result = "평균 미만";
		} else if (stand < height) {
			result = "평균 초과";
		} 
		return String.format("성별 : %s 키 : %dcm, %s", gender, height, result);
	}
}
