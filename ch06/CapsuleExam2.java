package sec06.ch06;

public class CapsuleExam2 {
	public static void main(String[] args) {
		Human h1 = new Human(); // name : 미상, age : 10
		Human h2 = new Human("평강공주"); // name : 평강공주, age : 10
		Human h3 = new Human(30); // name : 미상, age : 30
		Human h4 = new Human("이순신", 20); // name : 이순신, age : 20
		// 생성자 호출하기!!
		
		h1.whoAmI();
		h2.whoAmI();
		h3.whoAmI();
		h4.whoAmI();
	}
}
