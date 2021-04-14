package ThreadEx;

import java.util.Timer;
import java.util.TimerTask;

class MyTask extends TimerTask{

	@Override
	public void run() {
		System.out.println("타이머 호출");
		
	}
	
}

public class ThreadTimer {

	public static void main(String[] args) {
		MyTask task = new MyTask();
		
		Timer timer = new Timer();

		timer.schedule(task, 1000, 2000);
		//1초후에 시작해서 2초간격으로
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		timer.cancel();
		System.out.println("타이머가 종료되었습니다.");
	}

}
