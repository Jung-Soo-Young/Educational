package sec06.ch06;

public class AccessExam {
	public static void main(String[] args) {
		Access acc = new Access();
		//acc.num = 10;
		acc.printNum(); // void ���� �� �Է� �޴´�.
		
	}
}

class Access {
	private int num; // private�� ���� Ŭ���������� ���� ����
	
	void printNum() {
		System.out.println("num : " + num);
	}
}