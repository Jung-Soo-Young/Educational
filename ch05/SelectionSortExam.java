package sec06.ch05;

import java.util.Arrays;

public class SelectionSortExam {
	public static void main(String[] args) {
		int[] arr = {8, 7, 3, 1, 6, 0};
		
		//선택정렬
		for(int i=0; i<arr.length-1; i++) {
			int minIdx = i; //임의의 변수 minIdx에 i값 입력
			for(int z=i+1; z<arr.length; z++) {
				if(arr[minIdx] > arr[z]) { // a[0]를 끝까지 비교
					minIdx = z;
				}
			}
			int temp = arr[minIdx];
			arr[minIdx] = arr[i];
			arr[i] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}
