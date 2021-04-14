package ThreadEx;

/*
 프로세스
 	-cpu에 의해 실행중인 프로그램
 	-쓰레드와 리소스로 구성
 	
 	쓰레드
 		-프로세스 내에서 실제 작업을 수행
 		
 	모든 프로세스는 하나 이상의 쓰레드를 가지고 있다.
 	한 프로세스 내에서 독립적으로 수행하는 메소드를 의미
 	
 	멀티쓰레드
 		-동시에 두 개 이상의 메소드가 동작하는 것을 의미
 		-정확히는 cpu가 동시에 일을 하는 것 처럼 만들어 주는 것(시분할)
 		
 	쓰레드의 구현과 실행
 		1. Thread 클래스 상속 - Thread 클래스 run()을 오버라이딩
 		2. runnable 인터페이스를 구현 - Runnable 인터페이스의 추상에서도 run()을 구현
 			-자바는 다중 상속 불가능 / 이미 상속받은 클래스의 경우는 쓰레드 클래스 상속 불가
 */

class ThreadEx1 extends Thread{
	
	public ThreadEx1(String name) {
		super(name);
		//setName() : 쓰레드의 이름을 설정함
	}
	@Override
	public void run() {
		for(int i = 1; i <= 10; i++) {
			//getName() : 쓰레드의 이름
			System.out.println(getName()+ "=> " +i+", Priority = "+getPriority());
			//getPriority() : 현재 우선 순위 반환
			System.out.println(i);
		}
		System.out.println(getName()+"=> END");
	}
}

class ThreadEx2 implements Runnable{
	@Override
	public void run() {
	for(int i = 1; i <= 10; i++) {
		System.out.println("러너블 진행중.....");
	}
}
}

public class ThreadTest1 {

	public static void main(String[] args) {
		System.out.println("==========Thread 시작하기==========");
		ThreadEx1 th = new ThreadEx1("첫번째 쓰레드");
//		ThreadEx1 th2 = new ThreadEx1("두번째 쓰레드");
		Runnable th2 = new ThreadEx2();
		
		Thread t = new Thread(th2);

		th.start();
//		th2.start();
		t.start();
		System.out.println("==========Main 완료==========");
		
	}

}
