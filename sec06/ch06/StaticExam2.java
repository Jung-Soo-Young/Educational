package sec06.ch06;

public class StaticExam2 {
	public static void main(String[] args) {
		
		Toy2 t1 = new Toy2();
		Toy2 t2 = new Toy2();
		
		System.out.println("장난감 생산 갯수 : " + t1.makeCount);
		System.out.println("장난감 생산 갯수 : " + t2.makeCount);
		System.out.println("장난감 생산 갯수 : " + Toy2.makeCount); // static 접근 방식
		System.out.println("Toy3.makeCount : " + Toy3.makeCount);
		
		Toy2.makeCount = 10; // 외부에서 접근할 경우 (클래스명.변수)
		
		System.out.println(Toy2.makeCount);
		System.out.println(Toy3.makeCount);
	}
}

class Toy3 {
	static int makeCount = 0; // static는 오로지 1개
}

class Toy2 {
	static int makeCount;
	
	Toy2() {
		makeCount++; // 같은 소속일 경우에는 아무것도 없이 사용 가능
		Toy3.makeCount++;
	}
}
