package sec06.ch06;

public class InstanceExam4 {
	public static void main(String[] args) {
		//Car ��üȭ 2��
		//ù ��° ���� name�� "�ҳ�Ÿ", cc�� 2000
		//�� ��° ���� name�� "911", cc�� 5000
		//ù ��° ���� drive�Ѵ�.
		//ù ��° ���� stop�Ѵ�.
		
		Car c1 = new Car();
		Car c2 = new Car();
		
		c1.name = "�ҳ�Ÿ";
		c1.cc = 2000;
		
		c2.name = "911";
		c2.cc = 5000;
		
		c1.drive();
		c1.stop();
	}
}

class Car {
	String name;
	int cc;
	
	void drive() {
		System.out.printf("%s�� �޸���.\n", name);
	}
	
	void stop() {
		System.out.printf("%s�� �����.\n", name);
	}
}
