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
	
	public static void cry(Animal output) { // 최종 부모 클래스로 올라가서 클래스 명과 동일명 선언, 변수 선언
		
		output.howling(); // 변수.출력명
		
	}
}

class Pig extends Animal {
	@Override
	void howling() {
		System.out.println("꿀~ 꿀~");
	}
}

class Hamster extends Animal {
	@Override
	void howling() {
		System.out.println("찍! 찍!");
	}
}

