package sec06.ch06;

public class InstanceExam {
	public static void main(String[] args) {
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		
		d1.name = "�ǻ�";
		d1.bark();
		
		d2.name = "�߻�";
		d2.bark();
	}
}

// ��� �ʵ� (���� ������ �� �ִ� ��) - ��� ���
// ��� �޼ҵ� (���� ������ �� �ִ� ��) - ���� ���

class Dog {
	String name;
	String jong;
	int age;
	
	void bark() {
		System.out.printf("%s�� �۸�\n", name);
	}
}