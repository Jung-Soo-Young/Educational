package sec06.ch04;

public class ForExam4 {
	public static void main(String[] args) {
		String[] strArr = {"A", "B", "C", "D", "E"};
		
		for(int i = strArr.length; i>0; i--) {
			System.out.println(strArr[i-1]);
		}
		System.out.println("-----------");
		
		for(int i = strArr.length-1; i>=0; i--) {
			System.out.println(strArr[i]);
		}
		System.out.println("-----------");
		
		for(String val : strArr) { 
			System.out.println(val);
		}
	}
}
