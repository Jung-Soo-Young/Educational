package sec06.ch06;

public class CapsuleExam {
	public static void main(String[] args) {
		Human h1 = new Human();
		Human h2 = new Human();

		
		// 나이는 12, 이름은 "홍길동"
		h1.setAge(12);
		h1.setName("홍길동");
		h2.setAge(20);
		h2.setName("신사임당");
		
		System.out.printf("My name is %s, age is %d.\n", h1.getName(), h1.getAge());
		System.out.printf("My name is %s, age is %d.\n", h2.getName(), h2.getAge());
		
		h1.whoAmI(); // 내 이름은 홍길동 나이는 12살 입니다.
		h2.whoAmI(); // 내 이름은 신사임당 나이는 20살 입니다.
		
	}
}

class Human {
	private int age; // private 제한시키기
	private String name;
	
	// 생성자!!!
	// 메소드!!! = setter, getter
	// (쓰기) setter / (읽기) getter
	// 1. 생성자 이름은 클래스 이름과 같아야 함
	// 리턴 타입이 없다.
	
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
	
	// 단축키 ctrl + 3 -> getter -> Enter
	
	void whoAmI() {
		System.out.printf("내 이름은 %s 나이는 %d살 입니다.\n", name, age);
	}
	
	Human() { // -> 생성자  = 클래스 명
		this(10);
	}
	
	Human(int age) {
		this("미상", age);
	}
	
	Human(String name) {
		this(name, 10);
	}
	Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
}



