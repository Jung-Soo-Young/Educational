package sec06.ch06;

public class PolymorMission {
	public static void main(String[] args) {
		Cat cat = new Cat();
		Pig pig = new Pig();
		Hamster hamster = new Hamster();
		
		cry(cat);
		cry(pig);
		cry(hamster);
	}
	
	public static void cry(Animal output) { // ���� �θ� Ŭ������ �ö󰡼� Ŭ���� ��� ���ϸ� ����, ���� ����
		
		output.howling(); // ����.��¸�
		
	}
}

class Pig extends Animal {
	@Override
	void howling() {
		System.out.println("��~ ��~");
	}
}

class Hamster extends Animal {
	@Override
	void howling() {
		System.out.println("��! ��!");
	}
}

