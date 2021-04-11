package sec06.ch05;

import java.util.Arrays;

public class ArraySortExam {
	public static void main(String[] args) {
		int[] arr = {88, 65, 23, 1, 900, 42, 95};
		
		System.out.println(Arrays.toString(arr));
		
		int temp = arr[1]; // 배열 변환 구조 - 임의의 변수 생성 - 후순위 배열 입력
		arr[1] = arr[0];  // 후 순위 배열 = 전 순위 배열 (스위칭)
		arr[0] = temp; // 전 순위 배열 = 임의의 변수에 삽입
	}
}
