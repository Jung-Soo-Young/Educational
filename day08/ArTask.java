package day08;

public class ArTask {

	public static void main(String[] args) {
		int [] Data = new int[5];
		int [] Data2 = new int [10];
		
		for(int i = 0; i < Data.length; i++) {
			Data[i] = i+1;
			System.out.println(Data[i]);
	}
		for(int j = 0; j < Data2.length; j++) {
			Data2[j] = 10-j;
			System.out.println(Data2[j]);
		}
	}
}
