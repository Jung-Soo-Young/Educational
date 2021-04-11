package sec06.ch06;

public class StaticExam3 {
	public static void main(String[] args) {
		// CalcInstance2 ��üȭ
		// num1 = 10, num2 = 20;
		// ���� ���� �ֿܼ� ���!
		
		CalcInstance2 ci2 = new CalcInstance2(); // ��üȭ �� ��� = �ּҰ�.()
		ci2.num1 = 10;
		ci2.num2 = 20;
		int result = ci2.sum();
		System.out.println("result : " + result);
		
		String.format("%d", result);

	}	
}

class CalcStatic2 { // static�� ���� �޼ҵ��� ��� ������������ static �ʼ�
	static int num1;
	static int num2;
	
	static int sum() {
		return num1 + num2;
	}
}

class CalcInstance2 { // static �� �پ� ���� ��� ��üȭ �ʼ�!
	int num1; // -> ��������(�ν��Ͻ�=��üȭ) , static�� ���� ��� Ŭ���� ����
	int num2;
	int sum() { // sum(int num1) ���� ����� ����, ���� ����� ���� �Է� ���� �� this.
		int num = 10; // �޼ҵ� �ȿ� ����� ���� = ��������
		return num1 + num2;
	}
	
	static int sum(int n1, int n2) {
		return n1 + n2;
	}
}
