package sec06.ch04;

public class WhileMission {
	public static void main(String[] args) {
		// 1~100 합계를 구하시오. (while문으로 해결)
		
		int i = 1;
		int sum = 0;
		while(i<101) {
			sum = sum + i;
			i++;
		}
		System.out.println("합계 : " + sum);
	}
}
