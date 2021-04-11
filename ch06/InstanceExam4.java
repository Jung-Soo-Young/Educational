package sec06.ch06;

public class InstanceExam4 {
	public static void main(String[] args) {
		//Car 객체화 2개
		//첫 번째 차는 name은 "소나타", cc는 2000
		//두 번째 차는 name은 "911", cc는 5000
		//첫 번째 차량 drive한다.
		//첫 번째 차량 stop한다.
		
		Car c1 = new Car();
		Car c2 = new Car();
		
		c1.name = "소나타";
		c1.cc = 2000;
		
		c2.name = "911";
		c2.cc = 5000;
		
		c1.drive();
		c1.stop();
	}
}

class Car {
	String name;
	int cc;
	
	void drive() {
		System.out.printf("%s는 달린다.\n", name);
	}
	
	void stop() {
		System.out.printf("%s는 멈춘다.\n", name);
	}
}
