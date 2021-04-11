package Test;

public class Test14 {
	public static void main(String[] args) {
		gugudan(8);
		System.out.println();
		gugudan(2, 8);
	}
	
	public static void gugudan(int num) {
		for(int i=1; i<=9; i++) {
			System.out.println(num + " * " + i + " = " + (i*num));
		}
	}
	
	public static void gugudan(int num1, int num2) {
		for(int i = num1; i <= num2; i++) {
			gugudan(i);
			System.out.println();
		}
	}
}
