package sec06.ch06;

public class CapsuleExam {
	public static void main(String[] args) {
		Human h1 = new Human();
		Human h2 = new Human();

		
		// ���̴� 12, �̸��� "ȫ�浿"
		h1.setAge(12);
		h1.setName("ȫ�浿");
		h2.setAge(20);
		h2.setName("�Ż��Ӵ�");
		
		System.out.printf("My name is %s, age is %d.\n", h1.getName(), h1.getAge());
		System.out.printf("My name is %s, age is %d.\n", h2.getName(), h2.getAge());
		
		h1.whoAmI(); // �� �̸��� ȫ�浿 ���̴� 12�� �Դϴ�.
		h2.whoAmI(); // �� �̸��� �Ż��Ӵ� ���̴� 20�� �Դϴ�.
		
	}
}

class Human {
	private int age; // private ���ѽ�Ű��
	private String name;
	
	// ������!!!
	// �޼ҵ�!!! = setter, getter
	// (����) setter / (�б�) getter
	// 1. ������ �̸��� Ŭ���� �̸��� ���ƾ� ��
	// ���� Ÿ���� ����.
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	// ����Ű ctrl + 3 -> getter -> Enter
	
	void whoAmI() {
		System.out.printf("�� �̸��� %s ���̴� %d�� �Դϴ�.\n", name, age);
	}
	
	Human() { // -> ������  = Ŭ���� ��
		this(10);
	}
	
	Human(int age) {
		this("�̻�", age);
	}
	
	Human(String name) {
		this(name, 10);
	}
	Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
}



