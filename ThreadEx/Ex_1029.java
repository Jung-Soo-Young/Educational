package ThreadEx;

import java.util.Date;

class PrintTime implements Runnable{
	
	int num;
	Date now;
	
	public PrintTime(int num) {
		this.num = num;
	}

	@Override
	public void run() {
		try {
		for(int i = 0; i < this.num; i++)
		{
			now = new Date();
			
				Thread.sleep(1000);
				System.out.println("순위 : " +Thread.currentThread().getPriority()+" "+now+Thread.currentThread().getName());
		}
	} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}
	

public class Ex_1029 {

	public static void main(String[] args) {
		PrintTime p1 = new PrintTime(3); 
		
		Thread th1 = new Thread(p1, "안녕하세요!"); 
		th1.setPriority(Thread.MAX_PRIORITY-1); // 우선순위 가장 높음-1 
		th1.start(); 
		PrintTime p2 = new PrintTime(6); 
		Thread th2 = new Thread(p2, "반갑습니다."); 
		th2.setPriority(Thread.NORM_PRIORITY-1); // 우선순위 중간-1 
		th2.start();

	}

}
