package sec06.ch04;

public class ForExam3 {

	public static void main(String[] args) {
		int[] arr = {2, 5, 9, 10, 56};
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("------------");
		
		for(int var : arr) { // Ÿ�� ��ġ�����ְ� name�� �ƹ��ų� : ������
			System.out.println(var); // name ���
		}
	}
}
