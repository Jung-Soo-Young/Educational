package day08;

/*
 �迭 - ���� Ÿ���� ������ �� ���� �����ϱ� ����
            ���� Ÿ���� �������� ������ ���� �Ǿ��� �� �迭�� �������� �Ѵ�.
     
           �迭�� ����
     1. �ڷ��� [] �迭�� = new �ڷ���[����];
     2. �ڷ��� �迭�� [] = {��1, ��2, ....};
     3. �ڷ��� [] �迭��;
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
			System.out.println("�ݶ� �ֽ��ϴ�.");
		}
	}

}
