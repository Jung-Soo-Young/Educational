package sec06.ch06;

public class PolymorExam {
	public static void main(String[] args) {
		// 다형성
		// 1. 부모타입의 변수는 자식객체를 가리킬 수 있다. (주소 값 담을 수 있다)
		// 2. 자식타입의 변수는 부모객체를 가리킬 수 없다.
		// 3. 타입은 아는 메소드만 호출할 수 있다. 호출이 되었다면 기준은 객체이다.
		
		Animal ani_1 = new Cat(); // InheriExam.java -> Animal(부모) = Cat(자식) 자식이 부모보다 아는 것이 같거나 더 많다.
		Cat cat = (Cat)ani_1; // 부모 객체의 주소값 우려 -> 강제 형 변환을 시켜줌
		Animal ani_2 = cat;
		
		// Cat cat1 = new Animal() -> 실행 불가능(컴파일 에러)
		
		ani_1.howling();
		cat.howling();
		System.out.println("끝!");
		
	}
}
