package ThreadEx;

class ThreadEx9 extends Thread{
	public ThreadEx9(String name) {
		super(name);
	}
	
	public void run() {
			try {
				for(int i = 0; i < 10; i++) {
				Thread.sleep(1000);
				System.out.println(getName()+i+"번째 수행");
				}
			}catch (Exception e) {
				System.out.println("Thread 강제 종료");
				return;
			}
		
	}
}

public class ThreadTest6 {

	public static void main(String[] args) {
		/*
		 Thread 종료
		 	-스스로 종료
		 		>run() 메소드에 예외처리에 return을 넣어 스스로 종료
		 	-타 스레드에서 강제종료
		 		>interrupt() 메소드 호출(예외발생)
		 */

		ThreadEx9 th = new ThreadEx9("Thread");
		
		th.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		th.interrupt();
	}

}
