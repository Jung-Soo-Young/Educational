package sec06.ch04;

public class WhileMission2 {
	public static void main(String[] args) {
/*		
		int sum = 0;
		
		// 0�� �ƴϸ� sum�� ��� ���ϱ� (0�� ���ö����� �ݺ��ϱ�)
		
		// 0�� ��쿡�� sum : ���ݱ��� ���� �� ���
		
		while(true) {
			int val = (int)(Math.random() * 11);// 0 ~ 10 ������ �������� �������� �ϱ�
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
		int val = (int)(Math.random() * 11); // 0 ~ 10 ���� �������� �������� �ϱ�
		System.out.println("val : " + val);
		
		while(val != 0) {
			sum = sum + val;
			val = (int)(Math.random() * 11);
			System.out.println("val : " + val);			
		}
		
		System.out.println("sum : " + sum);
	}
}
