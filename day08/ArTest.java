package day08;

/*
 배열 - 같은 타입의 값들을 한 번에 저장하기 위함
            같은 타입의 변수들이 여러번 선언 되었을 때 배열이 생각나야 한다.
     
           배열의 선언
     1. 자료형 [] 배열명 = new 자료형[길이];
     2. 자료형 배열명 [] = {값1, 값2, ....};
     3. 자료형 [] 배열명;
 */

public class ArTest {

	public static void main(String[] args) {
		int [] arData = new int[4];
		int arData2[] = {1000, 2000, 3250};
		System.out.println(arData);
		arData[0] = 10;
		System.out.println(arData[0]);
		System.out.println(arData.length);
		
//		System.out.println(arData2[0]);
//		System.out.println(arData2[1]);
//		System.out.println(arData2[2]);
		
		for(int i=0; i < arData2.length; i++) {
			if(arData2[i] == 2000)
			System.out.println("콜라가 있습니다.");
		}
	}

}
