package sec06.ch05;

import java.util.Arrays;

public class MethodMission9 {
	public static void main(String[] args) {
		int[] arr = {4, 8, 10, 11, 45};
		
		// System.out.println(Arrays.toString(arr));
		String result = toString(arr);
		System.out.println(result);
	}
	
	public static String toString(int[] arr) {
		// return Arrays.toString(arr); // int 배열 -> 문자열 변환 = Arrays.toString(배열명);
		String str = ""; // str 변수 공백 선언
		for(int i=0; i<arr.length-1; i++) {
			str += arr[i] +", "; 
		} 
		str += arr[arr.length-1];
		
		return str;
		
		/*
		 String str = "";
		 for(int i=0; i<arr.length; i++) {
		 	if(i != 0) {
		 		str += ", ";
		 	}
		 	str += arr[i];
		 }
		 return String.format("[%s]", str);
		 */
	}
}
