package sec06.ch04;

public class Exercise05 {
	public static void main(String[] args) {
		/* 
		 	중첩 for문을 이용하여 방정식 4x + 5y = 60의 모든 해를 구해서 (x, y) 형태로 출력하시오.
		 	단, x와 y는 10이하의 자연수입니다. (x, y는 1 ~ 10 사이의 값)
		 	
		 	(실행결과)
		 	(5, 8)
		 	(10, 4)
		*/
		
		System.out.println("4x + 5y = 60 의 모든 해는 ?");
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=10; j++) {
				if((4*i + 5*j) == 60) {
					System.out.println("x의 값은 : " + i + " y의 값은 : " + j);
				}
			}
		}
	}
}
