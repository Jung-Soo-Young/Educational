package sec06.ch04;

public class WhileMission2 {
	public static void main(String[] args) {
/*		
		int sum = 0;
		
		// 0이 아니면 sum에 계속 더하기 (0이 나올때까지 반복하기)
		
		// 0일 경우에는 sum : 지금까지 더한 값 출력
		
		while(true) {
			int val = (int)(Math.random() * 11);// 0 ~ 10 사이의 랜덤값이 나오도록 하기
			System.out.println("val : " + val);
			
			if(val != 0) {
				sum = sum + val;
			} else {
				break;
			}
			System.out.println("sum : " + sum);
		}
		*/
		
		int sum = 0;
		int val = (int)(Math.random() * 11); // 0 ~ 10 사이 랜덤값이 나오도록 하기
		System.out.println("val : " + val);
		
		while(val != 0) {
			sum = sum + val;
			val = (int)(Math.random() * 11);
			System.out.println("val : " + val);			
		}
		
		System.out.println("sum : " + sum);
	}
}
