package sec06.ch05;

import java.util.Arrays;

public class BubbleSortMission {
	public static void main(String[] args) {
		int[] arr = {8, 7, 3, 1, 6};
		
		//버블 정렬
		//7, 8, 3, 1, 6
		//7, 3, 8, 1, 6
		//7, 3, 1, 8, 6
		//7, 3, 1, 6, 8
		
		//3, 7, 1, 6, 8
		//3, 1, 7, 6, 8
		//3, 1, 6, 7, 8
		
		//1, 3, 6, 7, 8
		
		System.out.println(Arrays.toString(arr));
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length -i -1; j++) { // arr.length - 1 = 마지막 반복은 돌아갈 필요가 없기 때문
				if(arr[j]>arr[j+1]) {
				int temp = arr[j+1];
				arr[j+1] = arr[j];
				arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr)); // 배열 값 출력
	}
}
