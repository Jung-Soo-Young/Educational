package sec06.ch04;

public class Exercise04 {
	public static void main(String[] args) {
		/*
		 while���� Math.random() �޼ҵ带 �̿��ؼ� �� ���� �ֻ����� ������ ��
		 ������ ���� (��1, ��2) ���·� ����ϰ�, ���� ���� 5�� �ƴϸ� ��� �ֻ����� ������,
		 ���� ���� 5�̸� ������ ���ߴ� �ڵ带 �ۼ��غ�����.
		 ���� ���� 5�� �Ǵ� ������ (1,4), (4,1), (2,3), (3,2)�Դϴ�.
		 
		 #������ ������ 1~6���� �մϴ�.
		 
		 (������)
		 (6, 4)
		 (3, 6)
		 (3, 2)
		  ��!
		 */
		
		int count = 1;
		while(true) {
			int random1 = (int)(Math.random()*6) + 1;
			int random2 = (int)(Math.random()*6) + 1;
			int sum = random1 + random2;
			
			System.out.println("�ݺ�Ƚ�� : " + count + " 1��° �� : " + random1 + " 2��° �� : " + random2);
			
		if(sum == 5) {
			System.out.println();
			System.out.println("1��° : " + random1 + " 2��° : " + random2);
			System.out.println("�� �ݺ� Ƚ�� : " + count + " ���� : " + sum + "�Դϴ�.");
			break;
			}
		count++;
		}
		System.out.println();
		System.out.println("����!");
	}
}
