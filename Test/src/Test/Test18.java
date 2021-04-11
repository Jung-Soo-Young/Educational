package Test;

public class Test18 {
	public static void main(String[] args) {
		Human h1 = new Human();
		Human h2 = new Human();
		
		h1.setName("홍길동");
		h1.setAge(15);
		h2.setName("신사임당");
		h2.setAge(19);
		
		h1.whoAmI();
		h2.whoAmI();
	}
}

class Human {
	private int age;
	private String name;
	
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
	
	void whoAmI() {
		System.out.printf("내 이름은 %s 나이는 %d살 입니다.\n", name, age);
	}
	
}