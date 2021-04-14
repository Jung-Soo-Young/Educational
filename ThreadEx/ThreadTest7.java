package ThreadEx;

class ThreadEx10 implements Runnable {
	
	Ticketing ticket = new Ticketing();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}

class Ticketing{
	int ticketNumber = 1;
	
	public synchronized void ticketing() { //synchronized 동기화 기능 제거
		if(ticketNumber > 0) {
			System.out.println(Thread.currentThread().getName()+"가 티켓팅 성공");
			ticketNumber = -1;
	}
	else
		System.out.println(Thread.currentThread().getName()+"가 티켓팅 실패");
	
	System.out.println(Thread.currentThread().getName()+"가 티켓팅 시도 후 티켓 수 : " +ticketNumber);
	}
}

public class ThreadTest7 {

	public static void main(String[] args) {
		ThreadEx10 s1 = new ThreadEx10();
		
		Thread t1 = new Thread(s1,"A");
		Thread t2 = new Thread(s1,"B");
		Thread t3 = new Thread(s1,"C");

		t1.start();
		t2.start();
		t3.start();
	}

}
