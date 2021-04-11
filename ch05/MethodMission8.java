package sec06.ch05;

public class MethodMission8 {
	public static void main(String[] args) {
		gugudan(8);
		System.out.println();
		gugudan(2, 8); // 단 바뀔때 구분자 사용
	}
	
	public static void gugudan(int num) {
		for(int i=1; i<=9; i++) {
			System.out.println(num + " * " + i + " = " + (num*i));
		}
	}
	
	public static void gugudan(int num, int num2) {
		for(int i=num; i<=num2; i++) {
			gugudan(i);
			System.out.println();
		}
	}
}
