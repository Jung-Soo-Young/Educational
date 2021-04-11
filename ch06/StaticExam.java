package sec06.ch06;

public class StaticExam {
	public static void main(String[] args) {
		Toy t1 = new Toy();
		Toy t2 = new Toy();
		
		t1.name = "디즈니";
		System.out.println("t1.name : " + t1.name);
		
		t2.name = "롯데";
		
		Toy.name = "SOC";
		System.out.println("t2.name : " + t2.name);
		System.out.println("t1.name : " + t1.name);
		System.out.println("Toy.name : " + Toy.name);
	}
}

class Toy {
	static String name;
}