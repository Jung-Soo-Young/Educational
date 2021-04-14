package OOP2;

/*
 내부 클래스(Inner Class)
 	-클래스 안에 선언된 클래스
 	-특정 클래스 내에서만 주로 사용되는 클래스
 	-GUI(AWT,SWING)의 이벤트 처리시 사용
 	
 	장점
 		-내부클래스에서 외부클래스의 멤버 쉽게 접근
 		-코드의 복잡성 감소
 		
 	내부 클래스의 종류와 특징
 		-변수 선언위치에 따른 종류와 동일(유효범위와 성질도 유사)
 
 		인스턴스 클래스
 			선언위치 : 외부클래스의 멤버 변수
 			사용 : 외부클래스의 인스턴스 멤버처럼 활용, 외부클래스의 인스턴스 멤버들과 관련된 작업에 사용
 			
 		Static 클래스
 			선언위치 : 외부클래스의 멤버 변수 선언 위치
 			사용 : 외부클래스의 static 멤버처럼 사용, 외부클래스의 static 멤버/메소드에서 사용될 목적
 			
 		Local 클래스
 			선언위치 : 외부클래스의 메소드/초기화 블럭
 			사용 : 선언된 영역 내부에서만 사용 가능
 		
 		익명 클래스
 			-클래스의 선언과 객체의 생성을 동시에 하는 이름 없는 클래스(일회성)
 			
 */

public class InnerEx1 {

	class InstanceInner{
		//인스턴스 내부 클래스
		int iv = 100;
//		static int cv = 100; // 에러!! Instance 클래스에 static 변수를 선언 불가
		final static int CONST = 100; // final static은 상수이므로 허용
	}
	
	static class StaticInner{
		int iv = 200;
		static int cv = 200; // static 멤버를 정의할 수 있다.
	}
	
	void myMethod() {
		class LocalInner{
			int iv = 300;
//			static int cv = 300; // 에러! static 변수 불가
			final static int CONST = 300; // final static은 상수이므로 허용
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println(InstanceInner.CONST);
		
		

	}

}
