package ThreadEx;

/*
 getPriority() : 우선순위를 반환
 setPriority() : 우선순위를 설정
 
 우선순위 : 1~10
 
 주요필드(상수)
 MAX_PRIORITY : 10
 MIN_PRIORITY : 1
 NORM_PRIORITY : 5
 
ex)
test.setPriority(Thread.MAX_
 */

class ThreadEx3 implements Runnable {

	@Override
	public void run() {
		for(int i = 0; i<5; i++) {
			System.out.println("<"+Thread.currentThread().getName()+">");
		}
		for(int i = 0; i < 1000; i++) {
			//시간 지연
		}
		
	}
	
}
public class ThreadTest2 {

	public static void main(String[] args) {
		Runnable t = new ThreadEx2();
		Thread t1 = new Thread(t);
		t1.setPriority(Thread.MIN_PRIORITY);
		System.out.println("t1의 우선 순위는 : " +t1.getPriority());
		
		Thread t2 = new Thread(t,"Thread2");
		t2.setPriority(Thread.NORM_PRIORITY);
		System.out.println("t2의 우선 순위는 : "+t2.getPriority());
		
		Thread t3 = new Thread(t, "Thread3");
		t3.setPriority(Thread.MAX_PRIORITY);
		System.out.println("t3의 우선 순위는 : "+t3.getPriority());
		
		t1.start();
		t2.start();
		
//		Thread th = new Thread(new ThreadEx3());
		

	}

}
