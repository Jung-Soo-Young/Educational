package Test;

public class Test4 {
	public static void main(String[] args) {
		// 1 ~ 10 까지 대입
		
		int[] intArr = new int[10];
		
		for(int i = 0; i < intArr.length; i++) {
			intArr[i] = i+1;
		} for(int i = 0; i< intArr.length; i++) {
			System.out.printf("intArr[%d] : %d", i, intArr[i]);
			System.out.println();
		}
	}
}
