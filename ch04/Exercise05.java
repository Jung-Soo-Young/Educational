package sec06.ch04;

public class Exercise05 {
	public static void main(String[] args) {
		/* 
		 	��ø for���� �̿��Ͽ� ������ 4x + 5y = 60�� ��� �ظ� ���ؼ� (x, y) ���·� ����Ͻÿ�.
		 	��, x�� y�� 10������ �ڿ����Դϴ�. (x, y�� 1 ~ 10 ������ ��)
		 	
		 	(������)
		 	(5, 8)
		 	(10, 4)
		*/
		
		System.out.println("4x + 5y = 60 �� ��� �ش� ?");
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=10; j++) {
				if((4*i + 5*j) == 60) {
					System.out.println("x�� ���� : " + i + " y�� ���� : " + j);
				}
			}
		}
	}
}
