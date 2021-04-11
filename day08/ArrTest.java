package day08;

public class ArrTest {

	public static void main(String[] args) {
		for(int i=1; i<90; i++) {
			if(i%10 ==0) {
				i++;
				System.out.println();
			}
			System.out.printf("%d*%d=%d\n", (i/10)+1, i%10, ((i/10)+1)*(i%10));
		}
	}

}
