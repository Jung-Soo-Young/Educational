package sec06.ch05;

public class ArrayMission2 {
	public static void main(String[] args) {
		//������ �迭 ���� (10ĭ¥��)
		//1 ~ 10 ���������� ���� (for)
		//�� ���� ���� �ܼ� ��� (for)
		
		int[] intArr = new int[10];
		
		for(int i=0; i<intArr.length; i++) {
			intArr[i] = i+1;
		}
		for(int i=0; i<intArr.length; i++) {
			System.out.printf("intArr[%d] : %d\n", i, intArr[i]);
		}
	}
}
