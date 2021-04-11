package Test;

public class Test15 {
	public static void main(String[] args) {
		int[] arr = {4, 8, 16, 21, 32};
		
		String result = toString(arr);
		System.out.println(result);
	}
	
	public static String toString(int[] arr) {
		String str = "";
		
		for(int i=0; i<arr.length-1; i++) {
			str += arr[i] + ", ";
		}
		str += arr[arr.length-1];
		return str;
	}
}
