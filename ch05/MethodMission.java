package sec06.ch05;

public class MethodMission {
	public static void main(String[] args) {
		whoIsBig(10, 30, 23); // �ܼ� > 100�� ���� Ů�ϴ�.
		
		whoIsBig(10, 9, 21); // �ܼ� > 10�� ���� Ů�ϴ�.
		
		whoIsBig(11, 25, 17); //�ܼ� > 25�� ���� Ů�ϴ�.
		
		int big = getBigNum(10, 30);
		System.out.println("big : " + big); // big : 30
		
		big = getBigNum(10, 9);
		System.out.println("big : " + big); // big : 10
		
	}
	
	public static int getBigNum(int num1, int num2) { // ���� �޼ҵ忡 ���� = �޼ҵ尪�� �־����� ���� �޼ҵ�� ���� (int, string ��)
		if(num1 > num2) {
			return num1;
		} 
		return num2;
	}
	
	public static void whoIsBig(int num1, int num2, int num3) { // ���� �޼ҵ忡 ���� ���� ��¹��� ������ void
		int big = num1; // ������ ���� �����ؼ� ù ���� �־���� ��
		if (num2 > num1 && num2 > num3) {
			big = num2;
		} else if (num3 > num1 && num3 > num2) {
			big = num3;
		}
		System.out.printf("%d�� ���� Ů�ϴ�.\n", big);
		
	/*
	public static void whoIsBig(int num1,int num2) {
		if (num1 > num2) {
			System.out.println("�ܼ� > " + num1 + "�� ���� Ů�ϴ�.");
		} else {
			System.out.println("�ܼ� > " + num2 + "�� ���� Ů�ϴ�.");
		} 
	 */
	}
}
