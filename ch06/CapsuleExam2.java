package sec06.ch06;

public class CapsuleExam2 {
	public static void main(String[] args) {
		Human h1 = new Human(); // name : �̻�, age : 10
		Human h2 = new Human("�򰭰���"); // name : �򰭰���, age : 10
		Human h3 = new Human(30); // name : �̻�, age : 30
		Human h4 = new Human("�̼���", 20); // name : �̼���, age : 20
		// ������ ȣ���ϱ�!!
		
		h1.whoAmI();
		h2.whoAmI();
		h3.whoAmI();
		h4.whoAmI();
	}
}
