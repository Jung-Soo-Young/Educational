package sec06.ch04;

public class WhileMission {
	public static void main(String[] args) {
		// 1~100 �հ踦 ���Ͻÿ�. (while������ �ذ�)
		
		int i = 1;
		int sum = 0;
		while(i<101) {
			sum = sum + i;
			i++;
		}
		System.out.println("�հ� : " + sum);
	}
}
