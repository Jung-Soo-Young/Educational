package sec06.ch05;

public class ArrayExam {
	public static void main(String[] args) {
		// �迭 (���� Ÿ���� ������ ������ ����ϱ� ���ϱ� ���� ����ϴ� ��)
		// 1, 100, 200, 34, 33
		
		int n1, n2, n3, n4, n5, n6, n7;
		
		n2 = 10;
		n3 = n2 + 4;
		
		//byte, short, int, long, boolean, char, float, double
		//���� ũ�� �з� (������(Primitive Type), ������(Reference Type))
		String[] strArr = new String[10];
		System.out.println("strArr[1] : " + strArr[1]);
		int len = 300;
		
		int[] intArr = new int[len];
		System.out.println("intArr[1] : " + intArr[1]);
		
		System.out.println("----------------------");
		int[] intArr2 = {10, 20, 30};
		
		for(int i=0; i<3; i++) {
			System.out.printf("intArr2[%d] : %d\n", i, intArr2[i]);
		}
		
	}
}
