package sec06.ch06;

public class AccessExam {
	public static void main(String[] args) {
		Access acc = new Access();
		//acc.num = 10;
		acc.printNum(); // void 생성 후 입력 받는다.
		
	}
}

class Access {
	private int num; // private는 같은 클래스에서만 접근 가능
	
	void printNum() {
		System.out.println("num : " + num);
	}
}