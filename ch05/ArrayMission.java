package sec06.ch05;

public class ArrayMission {
	public static void main(String[] args) {
		//������ �迭 ���� (10ĭ¥��)
		//��� �濡 ������ 20�� ������ �ּ���.
		
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
