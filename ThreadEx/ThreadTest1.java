package ThreadEx;

/*
 ���μ���
 	-cpu�� ���� �������� ���α׷�
 	-������� ���ҽ��� ����
 	
 	������
 		-���μ��� ������ ���� �۾��� ����
 		
 	��� ���μ����� �ϳ� �̻��� �����带 ������ �ִ�.
 	�� ���μ��� ������ ���������� �����ϴ� �޼ҵ带 �ǹ�
 	
 	��Ƽ������
 		-���ÿ� �� �� �̻��� �޼ҵ尡 �����ϴ� ���� �ǹ�
 		-��Ȯ���� cpu�� ���ÿ� ���� �ϴ� �� ó�� ����� �ִ� ��(�ú���)
 		
 	�������� ������ ����
 		1. Thread Ŭ���� ��� - Thread Ŭ���� run()�� �������̵�
 		2. runnable �������̽��� ���� - Runnable �������̽��� �߻󿡼��� run()�� ����
 			-�ڹٴ� ���� ��� �Ұ��� / �̹� ��ӹ��� Ŭ������ ���� ������ Ŭ���� ��� �Ұ�
 */

class ThreadEx1 extends Thread{
	
	public ThreadEx1(String name) {
		super(name);
		//setName() : �������� �̸��� ������
	}
	@Override
	public void run() {
		for(int i = 1; i <= 10; i++) {
			//getName() : �������� �̸�
			System.out.println(getName()+ "=> " +i+", Priority = "+getPriority());
			//getPriority() : ���� �켱 ���� ��ȯ
			System.out.println(i);
		}
		System.out.println(getName()+"=> END");
	}
}

class ThreadEx2 implements Runnable{
	@Override
	public void run() {
	for(int i = 1; i <= 10; i++) {
		System.out.println("���ʺ� ������.....");
	}
}
}

public class ThreadTest1 {

	public static void main(String[] args) {
		System.out.println("==========Thread �����ϱ�==========");
		ThreadEx1 th = new ThreadEx1("ù��° ������");
//		ThreadEx1 th2 = new ThreadEx1("�ι�° ������");
		Runnable th2 = new ThreadEx2();
		
		Thread t = new Thread(th2);

		th.start();
//		th2.start();
		t.start();
		System.out.println("==========Main �Ϸ�==========");
		
	}

}
