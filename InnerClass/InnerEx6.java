package OOP2;

public class InnerEx6 {
	Object iv = new Object() {
		void method() {
			
		}
	};//익명클래스
	
	static Object cv = new Object() {
		void method() {
			
		}
	};
	
	void myMethod() {
		Object lv = new Object() {
			void method() {
				
			}
		};
	}
}
