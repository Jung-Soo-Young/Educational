package day08;

import java.util.Scanner;

public class ArTest1 {

	public static void main(String[] args) {
		int [] ho = new int[3];
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		double avg = 0.0;
		
		for(int i=0; i < ho.length; i++) {
			System.out.println((i+1)+"ȣ ������ �Է��ϼ���");
			ho[i] = sc.nextInt();
			sum = sum + ho[i];
			System.out.println(ho[i] + "����");
		}
		System.out.println("1�� �� ���� : " + sum + "����");
		avg = Double.parseDouble(String.format("%.2f", (double)sum / ho.length));
		System.out.println("��� ���� : " + avg + "����");

	}

}
