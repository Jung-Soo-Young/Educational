package OOP2;

public class InnerEx2 {
	class InstanceInner{}
	static class StaticInner{}
	
	InstanceInner iv = new InstanceInner();
	
	static StaticInner cv = new StaticInner();
	
	static void staticMethod() {
//		InstanceInner obj1 = new InstanceInner(); // static 멤버는 인스턴스 멤버에 직접 접근 불가
		
		StaticInner obj2 = new StaticInner();
		
		InnerEx2 outer = new InnerEx2();
		InstanceInner obj1 = outer.new InstanceInner();
		//인스턴스 클래스는 외부클래스를 먼저 생성해야만 생성가능
		
	}
	
	void instanceMethod() {
		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
//		LocalInner lv = new LocalInner(); 에러!
	}
	
	void myMethod() {
		class LocalInner{}
		
		LocalInner lv = new LocalInner();
	}
	
	
	public static void main(String[] args) {
		

	}

}
