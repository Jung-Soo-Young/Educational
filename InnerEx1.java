package OOP2;

/*
 ���� Ŭ����(Inner Class)
 	-Ŭ���� �ȿ� ����� Ŭ����
 	-Ư�� Ŭ���� �������� �ַ� ���Ǵ� Ŭ����
 	-GUI(AWT,SWING)�� �̺�Ʈ ó���� ���
 	
 	����
 		-����Ŭ�������� �ܺ�Ŭ������ ��� ���� ����
 		-�ڵ��� ���⼺ ����
 		
 	���� Ŭ������ ������ Ư¡
 		-���� ������ġ�� ���� ������ ����(��ȿ������ ������ ����)
 
 		�ν��Ͻ� Ŭ����
 			������ġ : �ܺ�Ŭ������ ��� ����
 			��� : �ܺ�Ŭ������ �ν��Ͻ� ���ó�� Ȱ��, �ܺ�Ŭ������ �ν��Ͻ� ������ ���õ� �۾��� ���
 			
 		Static Ŭ����
 			������ġ : �ܺ�Ŭ������ ��� ���� ���� ��ġ
 			��� : �ܺ�Ŭ������ static ���ó�� ���, �ܺ�Ŭ������ static ���/�޼ҵ忡�� ���� ����
 			
 		Local Ŭ����
 			������ġ : �ܺ�Ŭ������ �޼ҵ�/�ʱ�ȭ ��
 			��� : ����� ���� ���ο����� ��� ����
 		
 		�͸� Ŭ����
 			-Ŭ������ ����� ��ü�� ������ ���ÿ� �ϴ� �̸� ���� Ŭ����(��ȸ��)
 			
 */

public class InnerEx1 {

	class InstanceInner{
		//�ν��Ͻ� ���� Ŭ����
		int iv = 100;
//		static int cv = 100; // ����!! Instance Ŭ������ static ������ ���� �Ұ�
		final static int CONST = 100; // final static�� ����̹Ƿ� ���
	}
	
	static class StaticInner{
		int iv = 200;
		static int cv = 200; // static ����� ������ �� �ִ�.
	}
	
	void myMethod() {
		class LocalInner{
			int iv = 300;
//			static int cv = 300; // ����! static ���� �Ұ�
			final static int CONST = 300; // final static�� ����̹Ƿ� ���
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println(InstanceInner.CONST);
		
		

	}

}
