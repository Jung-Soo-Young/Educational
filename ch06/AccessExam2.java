package sec06.ch06;

import sec06.ch06.acc.Access2;

public class AccessExam2 {
	public static void main(String[] args) {
		Access acc = new Access();
		//acc.num = 10; -> private라서 입력받을 수 없음
		
		acc.printNum();
		
		Access2 acc2 = new Access2();
	}
}
