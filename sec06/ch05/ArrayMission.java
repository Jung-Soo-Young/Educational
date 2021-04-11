package sec06.ch05;

public class ArrayMission {
	public static void main(String[] args) {
		//정수형 배열 생성 (10칸짜리)
		//모든 방에 정수값 20을 세팅해 주세요.
		
		int num = 10;
		int[] intArr = new int[10];
		
//		intArr[0] = 20;
//		intArr[1] = 20;	
//		intArr[2] = 20;	
//		intArr[3] = 20;	
//		intArr[4] = 20;
//		intArr[5] = 20;	
		
		for(int i=0; i<intArr.length; i++) {
			intArr[i] = 20;
		}
		for(int i=0; i<10; i++) {
			System.out.printf("intArr[%d] : %d\n", i, intArr[i]);
		}
	}
}
