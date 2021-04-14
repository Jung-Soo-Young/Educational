package ThreadEx;

import java.util.Random;

class User extends Thread{
	int result;
	
	public User(String str) {
		setName(str);
	}
	public void run() {
		result = 0;
		for(int i = 1; i <= 100; i++)
		{
			Random r = new Random();
			int x = r.nextInt(20)+1;
			
			System.out.println(getName()+" : "+x);
			
			result += x;
		}
	}
}

public class Ex_1029_2 {

	public static void main(String[] args) {
		
		User u1 = new User("User1");
		User u2 = new User("User2");
		
		u1.start();
		u2.start();
		
		System.out.println("User1의 값 : " + u1.result);
		System.out.println("User2의 값 : " + u2.result);
		
		if(u1.result > u2.result)
			System.out.println("User1이 크다");
		else if (u1.result < u2.result)
			System.out.println("User2이 크다.");
		else
			System.out.println("두 수가 같다.");

	}

}
