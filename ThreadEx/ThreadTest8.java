package ThreadEx;

//wait() : 스레드 대기
//wait(long timeout) : 지정한 시간만큼 기다린다.
//notify() : 대기중인 스레드를 깨움
//notifyAll() : 대기중인 모든 스레드를 깨움

class Account {
	int money = 0;
	//입금, 출금
	public int showMoney() {
		return money;
	}
	public synchronized void setMoney() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.money += 2000;
		
		System.out.println("어머니가 용돈을 입금했습니다. 현재 잔액 "+this.showMoney());
		
		this.notify();
	}
	
	public synchronized void getMoney() {
		while(money <= 0) {
			System.out.println("통장잔고가 없어서 아들 대기 중...");
		try {
			this.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	this.money -= 2000;
	System.out.println("아들이 용돈을 출금했습니다. 현재 잔액 "+this.showMoney());
}
}

class Son extends Thread {
	Account account;
	
	public Son(Account account) {
		this.account = account;
	}
	
	public void run() {
		for(int i = 0; i < 10; i++) {
			account.getMoney();
		}
	}
}

class Mom extends Thread {
	Account account;
	
	public Mom(Account account) {
		this.account = account;
	}
	
	public void run() {
		for(int i = 0; i < 10; i++) {
			account.setMoney();
		}
	}
}

public class ThreadTest8 {

	public static void main(String[] args) {
		Account account = new Account();
		
		Son son = new Son(account);
		Mom mom = new Mom(account);
		
		son.start();
		mom.start();
		
		/*
		 멀티 스레드
		 	-여러 개의 스레드가 동시에 수행되면서 공유할 수 있을 때
		 	-공유되는 부분은 상호 배타적으로 사용되어야 합니다.
		 	
		 	Dead Lock 문제
		 		-멀티 스레드를 사용 시 주의할 점 중 하나로 프로그램에서 스레드를 잘못 만들면 프로그램의 수행이
		 		이루어지지 않고 무한 수행하는 Dead Lock을 만들 수 있다.(교착상태)
		 	
		 	임계 영역(critical section)
		 		-공유 자원을 사용하는 코드 영역을 임계영역
		 		-이 부분에서는 공유 자원을 동시에 수정할 수 없도록 상호 배타적으로 실행될 수 있도록 작성
		 		-자바는 한 순간에 하나의 스레드만 실행할 수 있는 synchronized method 제공
		 		
		 	처리방법
		 		-공유 자원에 접근하는 메소드의 앞에 synchronized 메소드로 지정
		 		-공유 자원을 사용하는 영역을 synchronized(객체명)의 블럭으로 지정
		 		
		 		
		 */

	}

}
