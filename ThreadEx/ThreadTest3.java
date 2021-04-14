package ThreadEx;

/*
 -run() �޼ҵ尡 �����ϸ� ������ ����
 	-�����带 ��� ���� ��ų���� run() �޼ҵ带 ���� ���� �ӿ� ����
 	
 	�� �� ����� ������� �ٽ� ���� �Ұ�
 	������ ��ü�� �ٽ� �����ؾ� ����
 	
 	�� �����忡�� �ٸ� �����带 ���� ���� ����
 	
 	�������� ���� 6����
 	
 	1.NEW : �����尡 �����Ǿ����� �����尡 ���� ������ �غ� ���� �ʾ���
 	2.RUNNABLE : �����尡 ����ǰ� �ְų� �����غ�Ǿ� �����ٸ��� ��ٸ��� ����
 	3.WAITING : �ٸ� �����尡 notify(), notifyAll()�� �ҷ��ֱ⸦ ��ٸ��� �ִ� ����
 	4.TIMED_WAITING : �����尡 sleep() ȣ��� ���� n �и��ʵ��� ���� �ڰ� �ִ� ����
 	5.BLOCK : �����尡 I/O �۾��� ��û�ϸ� �ڵ����� �����带 BLOCK ���·� �����.
 	6.TERMINATED : �����尡 ������ ����
 	
 	-JVM ������ ���´� ��� ����
 	
 	JVM�� �����ٸ� ��Ģ
 		-ö���� �켱 ���� ���
 		-���� ���� �켱 ������ �����尡 �켱������ �����ٸ�
 		-������ �켱 ������ ������� ���ư��鼭 �����ٸ�(RR : ���� �κ�)
 	
 */

class ThreadEx4 extends Thread{
	public void run() {
		System.out.println("ī��Ʈ �ٿ� 5��");
		for(int i = 5; i >= 0; i--) {
			
			System.out.println(i+"��");
			
			if(i != 0)
			{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				System.out.println(e.toString());
			}
			}
		}
		
		System.out.println("����");
	}
}

public class ThreadTest3 {

	public static void main(String[] args) {
		ThreadEx4 t = new ThreadEx4();
		t.start();

	}

}
