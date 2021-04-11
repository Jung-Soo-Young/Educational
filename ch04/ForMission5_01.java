package sec06.ch04;

public class ForMission5_01 {
	public static void main(String[] args) {
		// \t -> 정렬
		// 세로로 나올때는 원래대로 -> 가로로 나올때는 i와 j의 순서 바뀜
		
	// 2*1=2  3*1=3  4*1=4 .... 9*1=9
	// 2*2=4  3*2=6  4*2=8 .... 9*2=18
	// 2*9=18 3*9=27 4*9=36 .... 9*9=81
	
		for(int i=1; i<10; i++) { // 1 ~ 9 는 변하지 않음
			for(int j=2; j<10; j++) { // 2 ~ 9 단 변함
				System.out.printf("%d * %d = %d\t", j, i, (i*j));
			}
			System.out.println();
		}
		
	}
}
