package sec06.ch06;

public class inheriExam {
	public static void main(String[] args) {
		Cat cat = new Cat(); // Cat�� ��üȭ �Ͽ��� ������ KoShort�� �ҷ��� �� ����
		cat.name = "�����";
		cat.age = 4;
		cat.howling();
		cat.lick();
		// cat.pee();
	}
}

class Animal extends Object {
	String name;
	int age;
	
	/* public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	*/
	
	void howling() {
		System.out.println("���");
	}

}

class Cat extends Animal {
	
	Cat() {
		// super("", 0);
		System.out.println("Cat ������");
	}
	
	void lick() {
		System.out.printf("%s�� �Ӵ�.\n", name);
	}
	
	@Override
	void howling() {
		System.out.println("�߿�");
	}
}

class KoShort extends Cat {
	void pee() {
		System.out.printf("%s�� �Һ��� ����\n", name);
	}
}