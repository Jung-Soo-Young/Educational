package Test;

public class Test19 {
	public static void main(String[] args) {
		Toy t1 = new Toy();
		Toy t2 = new Toy();
		
		t1.name = "�峭��";
		System.out.println("t1.name : " + t1.name);
		t2.name = "�����";
		
		Toy.name = "�Ｚ";
		System.out.println("t2.name : " + t2.name);
		System.out.println("Toy.name : " + Toy.name);
	}
}

class Toy {
	static String name;
}