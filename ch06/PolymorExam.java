package sec06.ch06;

public class PolymorExam {
	public static void main(String[] args) {
		// ������
		// 1. �θ�Ÿ���� ������ �ڽİ�ü�� ����ų �� �ִ�. (�ּ� �� ���� �� �ִ�)
		// 2. �ڽ�Ÿ���� ������ �θ�ü�� ����ų �� ����.
		// 3. Ÿ���� �ƴ� �޼ҵ常 ȣ���� �� �ִ�. ȣ���� �Ǿ��ٸ� ������ ��ü�̴�.
		
		Animal ani_1 = new Cat(); // InheriExam.java -> Animal(�θ�) = Cat(�ڽ�) �ڽ��� �θ𺸴� �ƴ� ���� ���ų� �� ����.
		Cat cat = (Cat)ani_1; // �θ� ��ü�� �ּҰ� ��� -> ���� �� ��ȯ�� ������
		Animal ani_2 = cat;
		
		// Cat cat1 = new Animal() -> ���� �Ұ���(������ ����)
		
		ani_1.howling();
		cat.howling();
		System.out.println("��!");
		
	}
}
