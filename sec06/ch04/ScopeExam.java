package sec06.ch04;

public class ScopeExam {
	public static void main(String[] args) {
		// ������ (���� & ����� ����ִ� ����)
		
		int a = 10;
		int jjj = 11;		
		if(a > 9) {
			System.out.println("a : " + a);
			
			System.out.println("jjj(1) : " + jjj);
		}
		
		System.out.println("jjj(2) : " + jjj);
	}
}
