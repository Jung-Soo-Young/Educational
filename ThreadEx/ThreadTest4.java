package ThreadEx;

//yield() : 자신을 양보하는 메소드, 스레드가 작업을 수행하던 중에 메소드를 만나게 되면 실행 시간을 다음 차례에게 양보

class ThreadEx5 implements Runnable{

	@Override
	public void run() {
		for(int i = 0; i < 30; i++)
		{
			System.out.print("★");
			Thread.yield();//자신에게 주어진 시간을 양보
		}
		
	}
	
}

class ThreadEx6 implements Runnable{

	@Override
	public void run() {
		for(int i = 0; i < 30; i++)
		{
			System.out.print("☆");
		}
		
	}
	
}


public class ThreadTest4 {

	public static void main(String[] args) {
		ThreadEx5 s1 = new ThreadEx5();
		Thread t1 = new Thread(s1);
		
		Thread t2 = new Thread(new ThreadEx6());
		
		
	}

}
