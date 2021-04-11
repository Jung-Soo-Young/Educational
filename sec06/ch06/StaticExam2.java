package sec06.ch06;

public class StaticExam2 {
	public static void main(String[] args) {
		
		Toy2 t1 = new Toy2();
		Toy2 t2 = new Toy2();
		
		System.out.println("�峭�� ���� ���� : " + t1.makeCount);
		System.out.println("�峭�� ���� ���� : " + t2.makeCount);
		System.out.println("�峭�� ���� ���� : " + Toy2.makeCount); // static ���� ���
		System.out.println("Toy3.makeCount : " + Toy3.makeCount);
		
		Toy2.makeCount = 10; // �ܺο��� ������ ��� (Ŭ������.����)
		
		System.out.println(Toy2.makeCount);
		System.out.println(Toy3.makeCount);
	}
}

class Toy3 {
	static int makeCount = 0; // static�� ������ 1��
}

class Toy2 {
	static int makeCount;
	
	Toy2() {
		makeCount++; // ���� �Ҽ��� ��쿡�� �ƹ��͵� ���� ��� ����
		Toy3.makeCount++;
	}
}
