package sec06.ch04;

public class LabelLoopExam {
	public static void main(String[] args) {
		
		OUTER:
		for(int i=0; i<3; i++) {
			
			INNER:
			for(int z=100; z<105; z++) {
				System.out.printf("%d - %d \n", i, z);
				
				if(z == 102) {
					break INNER;
				}
			}
		}
		System.out.println("³¡!");
	}
}
