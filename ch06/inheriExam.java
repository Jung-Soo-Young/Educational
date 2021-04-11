package sec06.ch06;

public class inheriExam {
	public static void main(String[] args) {
		Cat cat = new Cat(); // Cat을 객체화 하였기 때문에 KoShort는 불러올 수 없음
		cat.name = "고양이";
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
		System.out.println("운다");
	}

}

class Cat extends Animal {
	
	Cat() {
		// super("", 0);
		System.out.println("Cat 생성자");
	}
	
	void lick() {
		System.out.printf("%s가 핥다.\n", name);
	}
	
	@Override
	void howling() {
		System.out.println("야옹");
	}
}

class KoShort extends Cat {
	void pee() {
		System.out.printf("%s가 소변을 본다\n", name);
	}
}